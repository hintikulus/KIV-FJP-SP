package compilator.object.statement;

import compilator.enums.EStatementType;

/**
 * Base statement class
 */
public class Statement {

    /**
     * Statement type
     */
    private EStatementType type;

    /**
     * Statement declaration line
     */
    private int line;

    public Statement(EStatementType type, int line) {
        this.type = type;
        this.line = line;
    }

    public EStatementType getType() {
        return type;
    }

    public void setType(EStatementType type) {
        this.type = type;
    }

    public int getLine() {
        return line;
    }
}
