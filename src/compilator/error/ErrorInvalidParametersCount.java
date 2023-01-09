package compilator.error;

import compilator.enums.EErrorCode;

public class ErrorInvalidParametersCount extends Error
{
    public ErrorInvalidParametersCount(String name, int count, int line)
    {
        super("Neplatne volani spagety s identifikatorem \"" + name + "\". Spatny pocet parametru. Spageta ma " + count + " parametru.", line, EErrorCode.ERROR_INVALID_PARAMETERS_COUNT);
    }
}
