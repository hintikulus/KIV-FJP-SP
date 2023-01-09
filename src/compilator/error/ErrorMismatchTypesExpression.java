package compilator.error;

import compilator.enums.EErrorCode;
import compilator.enums.EVariableType;

public class ErrorMismatchTypesExpression extends Error {
    public ErrorMismatchTypesExpression(String expectedType, EVariableType type1, EVariableType type2, int line) {
        super("Neshoda navratovych typu vyrazu. Zadan " + type1.getTranslation() + " a " + type2.getTranslation() + ". Oba vysledky mohou byt " + expectedType, line, EErrorCode.ERROR_MISMATCH_TYPES_EXPRESSION);
    }

    public ErrorMismatchTypesExpression(EVariableType expectedType, EVariableType type, int line) {
        super("Neshoda navratovych typu vyrazu. Zadan " + type.getTranslation() + ". Ocekavany typ " + expectedType + ".", line, EErrorCode.ERROR_MISMATCH_TYPES_EXPRESSION);
    }
}
