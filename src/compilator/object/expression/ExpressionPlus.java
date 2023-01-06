package compilator.object.expression;

import compilator.enums.EExpressionType;

public class ExpressionPlus extends Expression
{
    private final Expression expression;
    private int line;

    public ExpressionPlus(Expression expression, int line)
    {
        super(EExpressionType.PLUS, line);
        this.expression = expression;
        this.line = line;
    }

    public Expression getExpression()
    {
        return expression;
    }

    @Override
    public int getLine()
    {
        return line;
    }

    public void setLine(int line)
    {
        this.line = line;
    }
}
