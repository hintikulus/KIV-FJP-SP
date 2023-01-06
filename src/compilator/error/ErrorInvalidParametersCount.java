package compilator.error;

import compilator.enums.EErrorCode;

public class ErrorInvalidParametersCount extends Error
{
    public ErrorInvalidParametersCount(String name, int count, int line)
    {
        super("Invalid call of method \"" + name + "\". Mismatch parameters count. Method has " + count + " parameters.", line, EErrorCode.ERROR_INVALID_PARAMETERS_COUNT);
    }
}
