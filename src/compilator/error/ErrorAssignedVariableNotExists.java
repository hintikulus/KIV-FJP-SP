package compilator.error;

import compilator.enums.EErrorCode;

public class ErrorAssignedVariableNotExists extends Error
{
    public ErrorAssignedVariableNotExists(String identifier, int line)
    {
        super("Assigned variable " + identifier + " not exists.", line, EErrorCode.ERROR_ASSIGMENT_VARIABLE_NOT_EXISTS);
    }
}
