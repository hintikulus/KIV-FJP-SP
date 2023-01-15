package compilator.object;

/**
 * Represent of block in internal structure
 */
public class Block {

    /**
     * BlockStatement data
     */
    private BlockStatement blockStatement;

    public Block(BlockStatement blockStatement) {

        this.blockStatement = blockStatement;
    }

    public BlockStatement getBlockStatement() {
        return blockStatement;
    }
}
