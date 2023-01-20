package compilator;

import compilator.enums.EErrorCode;
import compilator.model.Program;
import compilator.model.instruction.Instruction;
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
        }
        catch (NullPointerException e) {
            System.out.println("Prazdny program nelze prelozit. Preklad konci.");
            System.exit(EErrorCode.ERROR_UNKNOWN.getCode());
        }
        catch (Exception e) {
            System.out.println("Neco se nepovedlo pri zpracovani vstupu. Zde je text vyjimky: " + e.toString());
            System.exit(EErrorCode.ERROR_UNKNOWN.getCode());
        }

        try {
            // vygeneruje instrukce z zpracovaneho stromu
            PL0Generator PL0Generator = new PL0Generator(program);
            List<Instruction> instructions = PL0Generator.generateInstructions();

            // zapise instrukce do souboru
            this.writeInstructions(output, instructions);
        } catch (Exception e) {
            System.out.println("Neco se nepovedlo pri generovani instrukci. Zde je text vyjimky: " + e.toString());
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
            System.out.println("Chyba pri vypisu instrukci do souboru!");
            System.exit(EErrorCode.ERROR_IO.getCode());
        }
    }
}
