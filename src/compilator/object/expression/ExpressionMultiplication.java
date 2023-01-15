package compilator.object.expression;

import compilator.enums.EExpressionType;
import compilator.enums.EInstruction;
import compilator.enums.EInstructionOperation;
import compilator.enums.EOperatorMultiplication;

public class ExpressionMultiplication extends Expression implements IExpression{

    private Expression leftExpression;

    private Expression rightExpression;
    private EOperatorMultiplication operatorMultiplication;

    public ExpressionMultiplication(Expression leftExpression, Expression rightExpression, EOperatorMultiplication operatorMultiplication, int line)
    {
        super(EExpressionType.MULTIPLICATION, line);
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operatorMultiplication = operatorMultiplication;
    }

    public EOperatorMultiplication getOperatorMultiplication() {
        return operatorMultiplication;
    }

    public void setOperatorMultiplication(EOperatorMultiplication operatorMultiplication) {
        this.operatorMultiplication = operatorMultiplication;
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

    public int getOperatorCode()
    {
        switch (this.getOperatorMultiplication())
        {
            case MULTIPLY:
                return EInstructionOperation.MULTIPLY.getCode();
            case DIVIDE:
                return EInstructionOperation.DIVIDE.getCode();
            case MOD:
                return EInstructionOperation.MODULO.getCode();
        }

        return -1;
    }
}
