package compilator.model.expression;

import compilator.enums.EExpressionType;
import compilator.enums.EVariableType;

/**
 * Trida pro zpracovani zakladniho vyrazu
 */
public class Expression {

    /**
     * Typ vyrazu
     */
    private EExpressionType type;

    /**
     * Vyraz deklarativni radky
     */
    private int line;

    /**
     * Vyraz navratoveho typu
     */
    private EVariableType expectedReturnType;

    public Expression(EExpressionType type, int line) {
        this.type = type;
        this.line = line;
    }

    public EExpressionType getType() {
        return type;
    }

    public void setType(EExpressionType type) {
        this.type = type;
    }


    public EVariableType getExpectedReturnType() {
        return expectedReturnType;
    }

    public void setExpectedReturnType(EVariableType expectedReturnType) {
        this.expectedReturnType = expectedReturnType;
    }

    public int getLine() {
        return line;
    }
}
