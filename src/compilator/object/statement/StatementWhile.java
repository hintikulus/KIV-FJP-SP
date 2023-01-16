package compilator.object.statement;

import compilator.enums.EStatementType;
import compilator.object.BlockStatement;
import compilator.object.expression.Expression;

public class StatementWhile extends Statement {
    /**
     * Loop condition
     */
    private final Expression expression;

    /**
     * Loop body
     */
    private final BlockStatement body;

    public StatementWhile(Expression expression, BlockStatement body, int line) {
        super(EStatementType.WHILE, line);
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
