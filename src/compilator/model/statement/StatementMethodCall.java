package compilator.model.statement;

import compilator.enums.EStatementType;
import compilator.model.method.MethodCall;

public class StatementMethodCall extends Statement {
    /**
     * Objekt volani metody
     */
    private MethodCall methodCall;

    public StatementMethodCall(MethodCall methodCall, int line) {
        super(EStatementType.METHOD_CALL, line);
        this.methodCall = methodCall;
    }

    public MethodCall getMethodCall() {
        return methodCall;
    }

    public void setMethodCall(MethodCall methodCall) {
        this.methodCall = methodCall;
    }
}
