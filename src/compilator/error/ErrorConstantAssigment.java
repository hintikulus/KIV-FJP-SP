package compilator.error;

import compilator.enums.EErrorCode;

public class ErrorConstantAssigment extends Error
{
    public ErrorConstantAssigment(String variable, int line)
    {
        super("Promenna \""+ variable +"\" je konstanta, a jeji hodnota nemuze byt menena.", line, EErrorCode.ERROR_CONSTANT_ASSIGMENT);
    }
}
