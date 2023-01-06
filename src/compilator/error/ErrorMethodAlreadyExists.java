package compilator.error;

import compilator.enums.EErrorCode;

public class ErrorMethodAlreadyExists extends Error
{
    public ErrorMethodAlreadyExists(String name, int line)
    {
        super("Method with name " + name + " already exists.", line, EErrorCode.ERROR_METHOD_ALREADY_EXISTS);
    }
}
