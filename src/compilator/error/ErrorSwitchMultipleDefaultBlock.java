package compilator.error;

import compilator.enums.EErrorCode;

public class ErrorSwitchMultipleDefaultBlock extends Error
{
    public ErrorSwitchMultipleDefaultBlock(int line)
    {
        super("Prepinac muze mit pouze jeden 'v jinem pripade' blok.", line, EErrorCode.ERROR_SWITCH_MULTIPLE_DEFAULT_BLOCK);
    }
}
