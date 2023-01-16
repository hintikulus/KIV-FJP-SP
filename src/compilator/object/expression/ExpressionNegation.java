package compilator.object.expression;

import compilator.enums.EExpressionType;

public class ExpressionNegation extends Expression {

    private Expression expression;

    public ExpressionNegation(Expression expression, int line) {
        super(EExpressionType.NEGATION, line);
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }
}
