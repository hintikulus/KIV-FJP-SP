package compilator.error;

import compilator.enums.EErrorCode;

public class ErrorVoidMethodExpression extends Error
{
    public ErrorVoidMethodExpression(String name, int line)
    {
        super("Spageta vracejici nic \"" + name + "\" nemuze byt pouzita ve vyrazu.", line, EErrorCode.ERROR_VOID_METHOD_EXPRESSION);
    }
}
