package compilator;

import compilator.enums.EErrorCode;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class LexerParserErrorListener extends BaseErrorListener {
    private static final LexerParserErrorListener instance = new LexerParserErrorListener();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
            throws ParseCancellationException {
        ErrorController.getInstance().throwError("chyba pri zpracovani radky. " + msg, line, EErrorCode.ERROR_ANTLR_PROCESS);
    }

    public static LexerParserErrorListener getInstance() {
        return instance;
    }

}
