package compilator.model;

/**
 * Reprezentace bloku v interni strukture
 */
public class Block {

    /**
     * Blok prikazu
     */
    private BlockStatement blockStatement;

    public Block(BlockStatement blockStatement) {

        this.blockStatement = blockStatement;
    }

    public BlockStatement getBlockStatement() {
        return blockStatement;
    }
}
