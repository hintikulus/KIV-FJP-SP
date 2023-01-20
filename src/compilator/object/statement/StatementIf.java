package compilator.object.statement;

import compilator.enums.EStatementType;
import compilator.object.BlockStatement;
import compilator.object.expression.Expression;

public class StatementIf extends Statement {
    /**
     * Podminkovy vyraz
     */
    private final Expression expression;

    /**
     * Blok podminky
     */
    private final BlockStatement bodyIf;

    /**
     * Blok podminkove negativni vetve
     */
    private final BlockStatement bodyElse;

    public StatementIf(Expression expression, BlockStatement bodyIf, BlockStatement bodyElse, int line) {
        super(EStatementType.IF, line);
        this.expression = expression;
        this.bodyIf = bodyIf;
        this.bodyElse = bodyElse;
    }

    public Boolean hasElse() {
        return this.getBodyElse() != null;
    }

    public BlockStatement getBodyElse() {
        return bodyElse;
    }

    public BlockStatement getBodyIf() {
        return bodyIf;
    }

    public Expression getExpression() {
        return expression;
    }
}
