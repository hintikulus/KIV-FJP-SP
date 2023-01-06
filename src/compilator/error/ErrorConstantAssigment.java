package compilator.error;

import compilator.enums.EErrorCode;

public class ErrorConstantAssigment extends Error
{
    public ErrorConstantAssigment(String variable, int line)
    {
        super("Variable \""+ variable +"\" is constant. Value can not be changed.", line, EErrorCode.ERROR_CONSTANT_ASSIGMENT);
    }
}
