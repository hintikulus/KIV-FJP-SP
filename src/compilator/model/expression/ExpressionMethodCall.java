package compilator.model.expression;

import compilator.enums.EExpressionType;
import compilator.model.method.MethodCall;

public class ExpressionMethodCall extends Expression {
    private MethodCall methodCall;

    public ExpressionMethodCall(MethodCall methodCall, int line) {
        super(EExpressionType.METHOD_CALL, line);
        this.methodCall = methodCall;
    }

    public MethodCall getMethodCall() {
        return methodCall;
    }
}
