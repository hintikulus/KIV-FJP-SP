package compilator.object.expression;

import compilator.enums.EExpressionType;
import compilator.enums.EVariableType;

/**
 * Base expression class
 */
public class Expression {

    /**
     * Type of expression
     */
    private EExpressionType type;

    /**
     * Expression declaration line
     */
    private int line;

    /**
     * Expression return type
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
