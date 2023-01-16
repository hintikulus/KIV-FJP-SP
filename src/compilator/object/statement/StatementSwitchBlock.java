package compilator.object.statement;

import compilator.object.BlockStatement;

public class StatementSwitchBlock {
    /**
     * Switch block identifier
     */
    private int identifier;

    /**
     * Switch block body
     */
    private final BlockStatement body;

    /**
     * Switch block declared line
     */
    private int line;

    /**
     * Is set default block indication
     */
    private boolean isSetDefault = false;

    public StatementSwitchBlock(BlockStatement body, int line) {
        this.body = body;
        this.line = line;
    }

    public StatementSwitchBlock(int identifier, BlockStatement body) {
        this.identifier = identifier;
        this.body = body;
    }

    public int getIdentifier() {
        return identifier;
    }

    public BlockStatement getBody() {
        return body;
    }

    public boolean isSetDefault() {
        return isSetDefault;
    }

    public void setSetDefault(boolean setDefault) {
        isSetDefault = setDefault;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }
}
