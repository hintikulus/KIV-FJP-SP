package compilator.visitor;

import compilator.object.Block;
import compilator.object.BlockStatement;
import generate.CzechGrammarBaseVisitor;
import generate.CzechGrammarParser;

public class BlockVisitor extends CzechGrammarBaseVisitor<Block> {

    /**
     * Visitor for Block
     * @param ctx Block context
     * @return internal structure of Block
     */
    @Override
    public Block visitBlock(CzechGrammarParser.BlockContext ctx) {

        BlockStatement blockStatement = new BlockStatementVisitor().visit(ctx.blockStatement());

        return new Block(blockStatement);
    }
}
