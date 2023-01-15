package compilator.object.statement;

import compilator.enums.EStatementType;
import compilator.object.method.MethodCall;

public class StatementMethodCall extends Statement {
    /**
     * Method call object
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
