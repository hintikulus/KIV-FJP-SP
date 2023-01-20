package compilator.model.statement;

import compilator.enums.EStatementType;
import compilator.model.BlockStatement;
import compilator.model.expression.Expression;

public class StatementDo extends Statement {
    /**
     * Vyrok vykklu
     */
    private final Expression expression;

    /**
     * Telo cyklu
     */
    private final BlockStatement body;

    public StatementDo(Expression expression, BlockStatement body, int line) {
        super(EStatementType.DO_WHILE, line);
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
