package compilator.object.statement;

import compilator.enums.EStatementType;
import compilator.object.expression.Expression;

public class StatementAssigment extends Statement
{
    /**
     * Statement identifier
     */
    private final String identifier;

    /**
     * Assigned value
     */
    private final Expression expression;

    public StatementAssigment(String identifier, Expression expression, int line)
    {
        super(EStatementType.ASSIGMENT, line);
        this.identifier = identifier;
        this.expression = expression;
    }

    public String getIdentifier()
    {
        return identifier;
    }

    public Expression getExpression()
    {
        return expression;
    }
}
