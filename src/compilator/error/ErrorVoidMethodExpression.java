package compilator.error;

import compilator.enums.EErrorCode;

public class ErrorVoidMethodExpression extends Error
{
    public ErrorVoidMethodExpression(String name, int line)
    {
        super("Void method \"" + name + "\" can not be used in expression.", line, EErrorCode.ERROR_VOID_METHOD_EXPRESSION);
    }
}
