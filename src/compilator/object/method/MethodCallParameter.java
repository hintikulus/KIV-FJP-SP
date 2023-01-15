package compilator.object.method;

import compilator.enums.EVariableType;
import compilator.object.expression.Expression;

public class MethodCallParameter
{
    /**
     * Parameter value
     */
    private Expression expression;

    /**
     * Type of parameter
     */
    private EVariableType variableType;

    public MethodCallParameter(Expression expression)
    {
        this.expression = expression;
    }

    public Expression getExpression()
    {
        return expression;
    }

    public EVariableType getVariableType()
    {
        return variableType;
    }

    public void setExpression(Expression expression)
    {
        this.expression = expression;
    }

    public void setVariableType(EVariableType variableType)
    {
        this.variableType = variableType;
    }
}
