package compilator.model.statement;

import compilator.enums.EStatementType;
import compilator.model.Variable;

public class StatementDeclaration extends Statement {
    /**
     * Deklarace promenne
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
