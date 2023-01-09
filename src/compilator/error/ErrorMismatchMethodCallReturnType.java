package compilator.error;

import compilator.enums.EErrorCode;
import compilator.enums.EMethodReturnType;

public class ErrorMismatchMethodCallReturnType extends Error
{
    public ErrorMismatchMethodCallReturnType(String name, EMethodReturnType expectedType, EMethodReturnType type, int line)
    {
        super("Neshoda pri volani spagety s identifikatorem " + name + ". Snaha o prirazeni " + type.getTranslation() + " do " + expectedType.getTranslation() + ".", line, EErrorCode.ERROR_MISMATCH_METHOD_CALL_RETURN);
    }
}
