package compilator.model.expression;

import compilator.enums.EExpressionType;
import compilator.enums.EInstructionOperation;
import compilator.enums.EOperatorRelational;

public class ExpressionRelational extends Expression implements IExpression {
    private Expression leftExpression;

    private Expression rightExpression;

    private EOperatorRelational operatorRelational;

    public ExpressionRelational(Expression leftExpression, Expression rightExpression, EOperatorRelational operatorRelational, int line) {
        super(EExpressionType.RELATIONAL, line);
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operatorRelational = operatorRelational;
    }

    public Expression getLeftExpression() {
        return leftExpression;
    }

    public void setLeftExpression(Expression leftExpression) {
        this.leftExpression = leftExpression;
    }

    public Expression getRightExpression() {
        return rightExpression;
    }

    public void setRightExpression(Expression rightExpression) {
        this.rightExpression = rightExpression;
    }

    public EOperatorRelational getOperatorRelational() {
        return operatorRelational;
    }

    public void setOperatorRelational(EOperatorRelational operatorRelational) {
        this.operatorRelational = operatorRelational;
    }

    @Override
    public int getOperatorCode() {
        switch (this.operatorRelational) {

            case EQUAL:
                return EInstructionOperation.EQ.getCode();
            case NOT_EQUAL:
                return EInstructionOperation.NOT_EQ.getCode();
            case LT:
                return EInstructionOperation.LESS.getCode();
            case LE:
                return EInstructionOperation.LESS_EQ.getCode();
            case GE:
                return EInstructionOperation.GREATER_EQ.getCode();
            case GT:
                return EInstructionOperation.GREATER.getCode();
        }

        return -1;
    }
}
