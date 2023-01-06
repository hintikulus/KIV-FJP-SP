package compilator.error;

import compilator.enums.EErrorCode;
import compilator.enums.EMethodReturnType;

public class ErrorMismatchMethodCallReturnType extends Error
{
    public ErrorMismatchMethodCallReturnType(String name, EMethodReturnType expectedType, EMethodReturnType type, int line)
    {
        super("Invalid call of method " + name + ". You are trying assign " + type.toString() + " to " + expectedType.toString() + ".", line, EErrorCode.ERROR_MISMATCH_METHOD_CALL_RETURN);
    }
}
