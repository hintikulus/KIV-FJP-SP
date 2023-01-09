package compilator.error;

import compilator.enums.EErrorCode;

public class ErrorArithmetic extends Error
{
    public ErrorArithmetic(String operator, int line)
    {
        super("Neplatne pouziti operatoru: " + operator + ". Nemuze byt vice stejnych operatoru v jednom radku.", line, EErrorCode.ERROR_ARITHMETIC);
    }
}
