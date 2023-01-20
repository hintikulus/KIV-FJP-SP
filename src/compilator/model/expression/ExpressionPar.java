package compilator.model.expression;

import compilator.enums.EExpressionType;

public class ExpressionPar extends Expression {
    private Expression expression;

    public ExpressionPar(Expression expression, int line) {
        super(EExpressionType.PAR, line);
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }
}
