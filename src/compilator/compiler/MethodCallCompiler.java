package compilator.compiler;

import compilator.enums.EInstruction;
import compilator.enums.EMethodReturnType;
import compilator.enums.EVariableType;
import compilator.object.method.MethodCall;
import compilator.object.method.MethodCallParameter;

public class MethodCallCompiler extends BaseCompiler {
    /**
     * Method call object
     */
    private MethodCall methodCall;

    /**
     * level of call
     */
    private int level;

    public MethodCallCompiler(MethodCall methodCall, int level) {
        this.methodCall = methodCall;
        this.level = level;
    }

    /**
     * Processes method call to instructions
     */
    public void run() {
        if (methodCall.getExpectedReturnType() != EMethodReturnType.VOID) {
            // pridej misto pro navratovou hodnotu
            this.addInstruction(EInstruction.INT, 0, 1);
        }

        // pridej parametry na vrchol zasobniku
        for (int i = 0; i < this.methodCall.getParameters().size(); i++) {
            MethodCallParameter parameter = this.methodCall.getParameters().get(i);
            EVariableType returnType = new ExpressionCompiler(parameter.getExpression(), this.level).runReturnType();
            this.methodCall.getParameters().get(i).setVariableType(returnType);

        }

        // pridej volani metody
        this.addMethodCallInstruction(EInstruction.CAL, this.level, methodCall);

        // odstran parametry z vrcholu zasobniku
        for (int i = 0; i < this.methodCall.getParameters().size(); i++) {
            this.addInstruction(EInstruction.STO, 0, -1);
        }
    }
}
