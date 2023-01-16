package compilator.visitor;

import compilator.object.Program;
import parser.CzechGrammarBaseVisitor;
import parser.CzechGrammarParser;

public class ProgramVisitor extends CzechGrammarBaseVisitor<Program> {

    /**
     * Visitor for Program()
     *
     * @param ctx Program context
     * @return
     */
    @Override
    public Program visitProgram(CzechGrammarParser.ProgramContext ctx) {
        return new Program(new BlockVisitor().visit(ctx.block()));
    }
}
