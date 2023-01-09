package compilator.error;

import compilator.enums.EErrorCode;

public class ErrorMethodNotExists extends Error
{
    public ErrorMethodNotExists(String method, int line)
    {
        super("Spageta s identifikatorem " + method + " neexistuje.", line, EErrorCode.ERROR_METHOD_NOT_EXISTS);
    }
}
