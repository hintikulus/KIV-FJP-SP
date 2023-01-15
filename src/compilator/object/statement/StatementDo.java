package compilator.object.statement;

import compilator.enums.EStatementType;
import compilator.object.BlockStatement;
import compilator.object.expression.Expression;

public class StatementDo extends Statement {
    /**
     * Loop expression
     */
    private final Expression expression;

    /**
     * Loop body
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
