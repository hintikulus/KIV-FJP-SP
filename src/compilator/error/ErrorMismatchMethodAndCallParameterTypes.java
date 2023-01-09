package compilator.error;

import compilator.enums.EErrorCode;
import compilator.enums.EVariableType;

public class ErrorMismatchMethodAndCallParameterTypes extends Error
{
    public ErrorMismatchMethodAndCallParameterTypes(String name, EVariableType need, EVariableType got, int index, int line)
    {
        super("Neshoda pri volani spagety s identifikatorem \"" + name + "\". " + index + ". parametr ma byt " + need.getTranslation() + ", ale je " + got.getTranslation() + ".", line, EErrorCode.ERROR_MISMATCH_METHOD_AND_CALL_PARAMETER_RETURN_TYPE);
    }
}
