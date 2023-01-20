package compilator.object.statement;

import compilator.enums.EStatementType;
import compilator.object.BlockStatement;
import compilator.object.expression.Expression;

public class StatementRepeat extends Statement {
    /**
     * Podminka cyklu
     */
    private final Expression expression;

    /**
     * Telo cyklu
     */
    private final BlockStatement body;

    public StatementRepeat(Expression expression, BlockStatement body, int line) {
        super(EStatementType.REPEAT_UNTIL, line);
        this.expression = expression;
        this.body = body;
    }

    public BlockStatement getBody() {
        return body;
    }

    public Expression getExpression() {
        return expression;
    }
}
