package compilator.model.statement;

import compilator.model.BlockStatement;

public class StatementSwitchBlock {
    /**
     * Identifikator bloku vetvene podminky
     */
    private int identifier;

    /**
     * Telo vetvene podminky
     */
    private final BlockStatement body;

    /**
     * Radka bloku deklarace vetvene podminky
     */
    private int line;

    /**
     * Jedna se o vychozi blok?
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
