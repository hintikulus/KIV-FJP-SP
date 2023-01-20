package compilator.model.expression;

import compilator.enums.EExpressionType;
import compilator.enums.EVariableType;
import compilator.model.Value;

public class ExpressionValue extends Expression {

    private Value value;
    private EVariableType type;

    public ExpressionValue(Value value, EVariableType type, int line) {
        super(EExpressionType.VALUE, line);
        this.value = value;
        this.type = type;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public EVariableType getVariableType() {
        return type;
    }

    public void setVariableType(EVariableType type) {
        this.type = type;
    }
}
