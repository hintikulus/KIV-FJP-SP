package compilator.model.expression;

import compilator.enums.EExpressionType;
import compilator.enums.EInstructionOperation;
import compilator.enums.EOperatorAdditive;

public class ExpressionAdditive extends Expression implements IExpression {

    private Expression leftExpression;

    private Expression rightExpression;

    private EOperatorAdditive operatorAdditive;

    public ExpressionAdditive(Expression leftExpression, Expression rightExpression, EOperatorAdditive operatorAdditive, int line) {
        super(EExpressionType.ADDITIVE, line);
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operatorAdditive = operatorAdditive;
    }

    public EOperatorAdditive getOperatorAdditive() {
        return operatorAdditive;
    }

    public void setOperatorAdditive(EOperatorAdditive operatorAdditive) {
        this.operatorAdditive = operatorAdditive;
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

    @Override
    public int getOperatorCode() {
        switch (this.getOperatorAdditive()) {
            case PLUS:
                return EInstructionOperation.PLUS.getCode();
            case MINUS:
                return EInstructionOperation.MINUS.getCode();
        }

        return -1;
    }
}
