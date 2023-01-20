package compilator.model;

/**
 * Reprezentace programu v pameti
 */
public class Program {

    private Block block;

    public Program(Block block) {
        this.block = block;
    }

    public Block getBlock() {
        return block;
    }
}
