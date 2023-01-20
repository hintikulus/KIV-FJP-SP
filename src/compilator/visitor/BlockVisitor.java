package compilator.visitor;

import compilator.model.Block;
import compilator.model.BlockStatement;
import parser.CzechGrammarBaseVisitor;
import parser.CzechGrammarParser;

public class BlockVisitor extends CzechGrammarBaseVisitor<Block> {

    /**
     * Visitor pro Block
     *
     * @param ctx Block context
     * @return interni struktura Block
     */
    @Override
    public Block visitBlock(CzechGrammarParser.BlockContext ctx) {

        BlockStatement blockStatement = new BlockStatementVisitor().visit(ctx.blockStatement());

        return new Block(blockStatement);
    }
}
