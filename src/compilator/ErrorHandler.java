package compilator;

import compilator.error.Error;

public class ErrorHandler
{
    private static final ErrorHandler instance = new ErrorHandler();

    private ErrorHandler(){};

    public static ErrorHandler getInstance()
    {
        return instance;
    }

    /**
     * Print error message and ends program
     * @param error instance of Error
     */
    public void throwError(Error error)
    {
        System.out.println(error);
        System.exit(error.getErrorCode());
    }

}
