package compilator;

import compilator.enums.EErrorCode;
import compilator.object.Program;
import compilator.object.instruction.Instruction;
import compilator.visitor.ProgramVisitor;
import parser.CzechGrammarLexer;
import parser.CzechGrammarParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.PrintWriter;
import java.util.List;

public class Compilator
{
    private static final Compilator instance = new Compilator();

    private Compilator(){};

    public static Compilator getInstance()
    {
        return instance;
    }

    /**
     * Main body of compiler. Process input and create file with PL/0 instructions
     * @param input input file
     * @param output output file
     */
    public void run(CharStream input, String output)
    {
        CzechGrammarLexer lexer = new CzechGrammarLexer(input);
        lexer.removeErrorListeners();
        lexer.addErrorListener(LexerParserErrorListener.getInstance());

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        CzechGrammarParser parser = new CzechGrammarParser(tokens);

        parser.setBuildParseTree(true);
        parser.removeErrorListeners();
        parser.addErrorListener(LexerParserErrorListener.getInstance());

        ParseTree parseTree = parser.program();

        Program program = null;
        try
        {
            // processes tree into internal structure
            program = new ProgramVisitor().visit(parseTree);
        }
        catch (Exception e)
        {
            System.out.println("Something goes wrong while parsing tree. " + e.toString());
            System.exit(EErrorCode.ERROR_UNKNOWN.getCode());
        }

        try
        {
            // processes internal structure into instructions
            InstructionGenerator instructionGenerator = new InstructionGenerator(program);
            List<Instruction> instructions = instructionGenerator.generateInstructions();

            // write instructions into file
            this.writeInstructions(output, instructions);
        }
        catch (Exception e)
        {
            System.out.println("Something goes wrong while generating instructions. " + e.toString());
            System.exit(EErrorCode.ERROR_UNKNOWN.getCode());
        }
    }

    /**
     * Handles writing to file
     * @param outputFile output file
     * @param instructions instructions list
     */
    private void writeInstructions(String outputFile, List<Instruction> instructions)
    {
        PrintWriter writer = null;
        try
        {
            writer = new PrintWriter(outputFile, "UTF-8");

            for (Instruction instruction: instructions)
            {
                writer.write(instruction.toString());
            }

            writer.close();
        }
        catch (Exception e)
        {
            System.out.println("Path to output file not exists!");
            System.exit(EErrorCode.ERROR_INVALID_OUTPUT_FILE.getCode());
        }
    }
}
