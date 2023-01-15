package compilator.object.statement;

import compilator.enums.EStatementType;
import compilator.object.Variable;

public class StatementDeclaration extends Statement {
    /**
     * Declared variable
     */
    private final Variable variable;

    public StatementDeclaration(Variable variable, int line) {
        super(EStatementType.DECLARATION, line);
        this.variable = variable;
    }

    public Variable getVariable() {
        return variable;
    }
}
