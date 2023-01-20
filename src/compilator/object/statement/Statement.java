package compilator.object.statement;

import compilator.enums.EStatementType;

/**
 * Zakladni trida pro prikazy
 */
public class Statement {

    /**
     * Typ prikazu
     */
    private EStatementType type;

    /**
     * Radka deklaritivniho prikazu
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
