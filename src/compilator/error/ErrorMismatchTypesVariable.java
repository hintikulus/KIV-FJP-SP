package compilator.error;

import compilator.enums.EErrorCode;
import compilator.enums.EVariableType;

public class ErrorMismatchTypesVariable extends Error
{
    public ErrorMismatchTypesVariable(String variableName, EVariableType variableTypeOriginal, EVariableType variableTypeAssign, int line)
    {
        super("Neshoda pri typech promenych. Snaha o prirazeni typu " + variableTypeAssign.getTranslation() + " do promenne " + variableName + " ktera je " + variableTypeOriginal.getTranslation(), line, EErrorCode.ERROR_MISMATCH_TYPES_VARIABLE);
    }
}
