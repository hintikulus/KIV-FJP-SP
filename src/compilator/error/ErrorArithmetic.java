package compilator.error;

import compilator.enums.EErrorCode;

public class ErrorArithmetic extends Error
{
    public ErrorArithmetic(String operator, int line)
    {
        super("Invalid use of operator: " + operator + ". Multiple symbols can not be in row.", line, EErrorCode.ERROR_ARITHMETIC);
    }
}
