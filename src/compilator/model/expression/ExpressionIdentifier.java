package compilator.model.expression;

import compilator.enums.EExpressionType;
import compilator.model.Value;

public class ExpressionIdentifier extends Expression {

    private Value value;

    public ExpressionIdentifier(Value value, int line) {
        super(EExpressionType.IDENTIFIER, line);
        this.value = value;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
}
