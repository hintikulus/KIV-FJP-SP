package compilator;

import compilator.enums.EErrorCode;
import compilator.enums.EMethodReturnType;
import compilator.enums.EVariableType;

public class ErrorController {
    private static final ErrorController instance = new ErrorController();

    private ErrorController() {
    }

    ;

    public static ErrorController getInstance() {
        return instance;
    }

    /**
     * Vypis chyby a ukonceni programu
     */
    public void throwError(String message, int line, EErrorCode errorCode) {
        System.out.println("Radka: " + line + " : " + message);
        System.exit(errorCode.getCode());
    }

    public void throwArithmeticError(String operator, int line) {
        String message = "Neplatne pouziti operatoru: " + operator + ". Nemuze byt vice stejnych operatoru v jednom radku.";
        throwError(message, line, EErrorCode.ERROR_ARITHMETIC);
    }

    public void throwAssignedVariableNotExistError(String identifier, int line) {
        String message = "Pouzita promena " + identifier + " neexistuje.";
        throwError(message, line, EErrorCode.ERROR_ASSIGMENT_VARIABLE_NOT_EXISTS);
    }

    public void throwErrorConstantAssigmentError(String variable, int line) {
        String message = "Promenna \"" + variable + "\" je konstanta, a jeji hodnota nemuze byt menena.";
        throwError(message, line, EErrorCode.ERROR_CONSTANT_ASSIGMENT);
    }

    public void throwErrorInvalidParametersCountError(String name, int count, int line) {
        String message = "Neplatne volani spagety s identifikatorem \"" + name + "\". Spatny pocet parametru. Spageta ma " + count + " parametru.";
        throwError(message, line, EErrorCode.ERROR_INVALID_PARAMETERS_COUNT);
    }

    public void throwErrorMethodAlreadyExistsError(String name, int line) {
        String message = "Spageta s identifikatorem " + name + " uz existuje.";
        throwError(message, line, EErrorCode.ERROR_METHOD_ALREADY_EXISTS);
    }

    public void throwErrorMethodNotExists(String method, int line) {
        String message = "Spageta s identifikatorem " + method + " neexistuje.";
        throwError(message, line, EErrorCode.ERROR_METHOD_NOT_EXISTS);
    }

    public void throwErrorMismatchExpressionResult(String expected, String type, int line) {
        String message = "Typ vysledku vyrazu neodpovida predpokladanemu typu. Predpokladano: " + expected + " Typ vysledku vyrazu: " + type;
        throwError(message, line, EErrorCode.ERROR_MISMATCH_EXPRESSION_RESULT);
    }

    public void throwErrorMismatchMethodAndCallParameterTypes(String name, EVariableType need, EVariableType got, int index, int line) {
        String message = "Neshoda pri volani spagety s identifikatorem \"" + name + "\". " + index + ". parametr ma byt " + need.getTranslation() + ", ale je " + got.getTranslation() + ".";
        throwError(message, line, EErrorCode.ERROR_MISMATCH_METHOD_AND_CALL_PARAMETER_RETURN_TYPE);
    }

    public void throwErrorMismatchMethodCallReturnType(String name, EMethodReturnType expectedType, EMethodReturnType type, int line) {
        String message = "Neshoda pri volani spagety s identifikatorem " + name + ". Snaha o prirazeni " + type.getTranslation() + " do " + expectedType.getTranslation() + ".";
        throwError(message, line, EErrorCode.ERROR_MISMATCH_METHOD_CALL_RETURN);
    }

    public void throwErrorMismatchTypesExpression(String expectedType, EVariableType type1, EVariableType type2, int line) {
        String message = "Neshoda navratovych typu vyrazu. Zadan " + type1.getTranslation() + " a " + type2.getTranslation() + ". Oba vysledky mohou byt " + expectedType;
        throwError(message, line, EErrorCode.ERROR_MISMATCH_TYPES_EXPRESSION);
    }

    public void throwErrorMismatchTypesExpression(EVariableType expectedType, EVariableType type, int line) {
        String message = "Neshoda navratovych typu vyrazu. Zadan " + type.getTranslation() + ". Ocekavany typ " + expectedType + ".";
        throwError(message, line, EErrorCode.ERROR_MISMATCH_TYPES_EXPRESSION);
    }

    public void throwErrorMismatchTypesVariable(String variableName, EVariableType variableTypeOriginal, EVariableType variableTypeAssign, int line) {
        String message = "Neshoda pri typech promenych. Snaha o prirazeni typu " + variableTypeAssign.getTranslation() + " do promenne " + variableName + " ktera je " + variableTypeOriginal.getTranslation();
        throwError(message, line, EErrorCode.ERROR_MISMATCH_TYPES_VARIABLE);
    }

    public void throwErrorSwitchMultipleDefaultBlock(int line) {
        String message = "Prepinac muze mit pouze jeden 'v jinem pripade' blok.";
        throwError(message, line, EErrorCode.ERROR_SWITCH_MULTIPLE_DEFAULT_BLOCK);
    }

    public void throwErrorVariableAlreadyExists(String identifier, int line) {
        String message = "Promenna \"" + identifier + "\" už existuje.";
        throwError(message, line, EErrorCode.ERROR_VARIABLE_ALREADY_EXISTS);
    }

    public void throwVariableNotExistsError(String value, int line) {
        String message = "Promenna " + value + " neexistuje";
        throwError(message, line, EErrorCode.ERROR_VARIABLE_NOT_EXISTS);
    }

    public void throwVoidMethodExpressionError(String name, int line) {
        String message = "Spageta vracejici nic \"" + name + "\" nemuze byt pouzita ve vyrazu.";
        throwError(message, line, EErrorCode.ERROR_VOID_METHOD_EXPRESSION);
    }


}
