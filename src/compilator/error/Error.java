package compilator.error;

import compilator.enums.EErrorCode;

public class Error
{
    private String message;
    private int line;
    private EErrorCode errorCode;

    public Error(String message, int line, EErrorCode errorCode)
    {
        this.message = message;
        this.line = line;
        this.errorCode = errorCode;
    }

    public int getErrorCode()
    {
        return this.errorCode.getCode();
    }

    @Override
    public String toString()
    {
        return "Line: " + line + " : " + message;
    }
}
