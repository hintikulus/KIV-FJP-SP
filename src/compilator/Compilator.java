package compilator;

import compilator.enums.EErrorCode;
import compilator.object.Program;
import compilator.object.instruction.Instruction;
import compilator.visitor.ProgramVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.CzechGrammarLexer;
import parser.CzechGrammarParser;

import java.io.PrintWriter;
import java.util.List;

public class Compilator {
    private static final Compilator instance = new Compilator();

    private Compilator() {
    }

    ;

    public static Compilator getInstance() {
        return instance;
    }

    /**
     * Hlavni telo kompilatoru. Zpracovava vstup a vytvari soubor obsahujici PL/0 instrukce
     *
     * @param input vstupni soubor
     * @param output vystupni soubor
     */
    public void run(CharStream input, String output) {
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
        try {
            // zpracuje strom do dale zpracovatelne struktury
            program = new ProgramVisitor().visit(parseTree);
        } catch (Exception e) {
            System.out.println("Something goes wrong while parsing tree. " + e.toString());
            System.exit(EErrorCode.ERROR_UNKNOWN.getCode());
        }

        try {
            // vygeneruje instrukce z zpracovaneho stromu
            InstructionGenerator instructionGenerator = new InstructionGenerator(program);
            List<Instruction> instructions = instructionGenerator.generateInstructions();

            // zapise instrukce do souboru
            this.writeInstructions(output, instructions);
        } catch (Exception e) {
            System.out.println("Something goes wrong while generating instructions. " + e.toString());
            System.exit(EErrorCode.ERROR_UNKNOWN.getCode());
        }
    }

    /**
     * Zpracovava zapis do souboru
     *
     * @param outputFile   vystupni soubor
     * @param instructions seznam instrukci
     */
    private void writeInstructions(String outputFile, List<Instruction> instructions) {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(outputFile, "UTF-8");

            for (Instruction instruction : instructions) {
                writer.write(instruction.toString());
            }

            writer.close();
        } catch (Exception e) {
            System.out.println("Path to output file not exists!");
            System.exit(EErrorCode.ERROR_INVALID_OUTPUT_FILE.getCode());
        }
    }
}
