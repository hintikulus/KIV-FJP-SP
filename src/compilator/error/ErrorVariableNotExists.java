package compilator.error;

import compilator.enums.EErrorCode;

public class ErrorVariableNotExists extends Error
{
    public ErrorVariableNotExists(String value, int line)
    {
        super("Variable " + value + " not exists", line, EErrorCode.ERROR_VARIABLE_NOT_EXISTS);
    }
}
