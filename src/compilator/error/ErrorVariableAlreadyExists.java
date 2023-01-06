package compilator.error;

import compilator.enums.EErrorCode;

public class ErrorVariableAlreadyExists extends Error
{
    public ErrorVariableAlreadyExists(String identifier, int line)
    {
        super("Variable \"" + identifier + "\" already exists", line, EErrorCode.ERROR_VARIABLE_ALREADY_EXISTS);
    }
}
