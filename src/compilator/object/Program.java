package compilator.object;

/**
 * Reprezentace programu ve vnitrtni strukture
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
