package compilator.object.expression;

import compilator.enums.EExpressionType;

public class ExpressionMinus extends Expression {
    private final Expression expression;

    private final int line;

    public ExpressionMinus(Expression expression, int line) {
        super(EExpressionType.MINUS, line);
        this.expression = expression;
        this.line = line;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public int getLine() {
        return line;
    }
}
