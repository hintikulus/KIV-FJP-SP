package compilator.object.expression;

import compilator.enums.EExpressionType;
import compilator.enums.EOperatorLogical;

public class ExpressionLogical extends Expression {

    private Expression leftExpression;

    private Expression rightExpression;
    private EOperatorLogical operatorLogical;

    public ExpressionLogical(Expression leftExpression, Expression rightExpression, EOperatorLogical operatorLogical, int line) {
        super(EExpressionType.LOGICAL, line);
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operatorLogical = operatorLogical;
    }

    public EOperatorLogical getOperatorLogical() {
        return operatorLogical;
    }

    public void setOperatorLogical(EOperatorLogical operatorLogical) {
        this.operatorLogical = operatorLogical;
    }

    public Expression getRightExpression() {
        return rightExpression;
    }

    public void setRightExpression(Expression rightExpression) {
        this.rightExpression = rightExpression;
    }

    public Expression getLeftExpression() {
        return leftExpression;
    }

    public void setLeftExpression(Expression leftExpression) {
        this.leftExpression = leftExpression;
    }
}
