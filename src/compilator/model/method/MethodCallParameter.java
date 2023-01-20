package compilator.model.method;

import compilator.enums.EVariableType;
import compilator.model.expression.Expression;

public class MethodCallParameter {
    /**
     * Hodnota parametru
     */
    private Expression expression;

    /**
     * Typ parametru
     */
    private EVariableType variableType;

    public MethodCallParameter(Expression expression) {
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    public EVariableType getVariableType() {
        return variableType;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public void setVariableType(EVariableType variableType) {
        this.variableType = variableType;
    }
}
