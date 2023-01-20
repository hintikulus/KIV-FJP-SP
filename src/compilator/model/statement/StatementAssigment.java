package compilator.model.statement;

import compilator.enums.EStatementType;
import compilator.model.expression.Expression;

public class StatementAssigment extends Statement {
    /**
     * Identifikator prikazu
     */
    private final String identifier;

    /**
     * Prirazovana hodnota
     */
    private final Expression expression;

    public StatementAssigment(String identifier, Expression expression, int line) {
        super(EStatementType.ASSIGMENT, line);
        this.identifier = identifier;
        this.expression = expression;
    }

    public String getIdentifier() {
        return identifier;
    }

    public Expression getExpression() {
        return expression;
    }
}
