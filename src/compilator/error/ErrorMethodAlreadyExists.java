package compilator.error;

import compilator.enums.EErrorCode;

public class ErrorMethodAlreadyExists extends Error
{
    public ErrorMethodAlreadyExists(String name, int line)
    {
        super("Spageta s identifikatorem " + name + " uz existuje.", line, EErrorCode.ERROR_METHOD_ALREADY_EXISTS);
    }
}
