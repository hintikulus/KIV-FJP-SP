package compilator.error;

import compilator.enums.EErrorCode;
import compilator.enums.EVariableType;

public class ErrorMismatchMethodAndCallParameterTypes extends Error
{
    public ErrorMismatchMethodAndCallParameterTypes(String name, EVariableType need, EVariableType got, int index, int line)
    {
        super("Invalid call of method \"" + name + "\". " + index + ". parameter should be " + need + ", got " + got + ".", line, EErrorCode.ERROR_MISMATCH_METHOD_AND_CALL_PARAMETER_RETURN_TYPE);
    }
}
