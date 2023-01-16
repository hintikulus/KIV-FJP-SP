package compilator.object;

import compilator.enums.EStatementType;
import compilator.object.statement.Statement;
import compilator.object.statement.StatementDeclaration;

import java.util.ArrayList;
import java.util.List;

/**
 * Holds data of Statement
 */
public class StatementData {
    /**
     * List of declared statements
     */
    private List<Statement> statements;

    /**
     * List with names of declared variables
     */
    private List<String> variableNames;

    /**
     * Number of for cycles in statements
     */
    private int forStatementCount = 0;

    public StatementData(List<Statement> statements) {
        this.statements = statements;
        this.variableNames = this.createVariableNamesList();
    }

    /**
     * Number of parallel declared variables
     *
     * @return
     */
    public int getVariableDeclarationCount() {
        return this.variableNames.size();
    }

    /**
     * Creates list with names of declared variables
     *
     * @return
     */
    private List<String> createVariableNamesList() {
        List<String> list = new ArrayList<>();
        for (Statement statement : statements) {
            if (statement.getType() == EStatementType.DECLARATION) {
                StatementDeclaration statementDeclaration = (StatementDeclaration) statement;
                Variable variable = statementDeclaration.getVariable();

                list.add(variable.getName());

                if (variable.existsParallel()) {
                    list.addAll(variable.getParallelArray());
                }
            } else if (statement.getType() == EStatementType.FOR) {
                this.forStatementCount++;
            }
        }

        return list;
    }

    public List<String> getVariableNames() {
        return variableNames;
    }

    public List<Statement> getStatements() {
        return this.statements;
    }

    public int getForStatementCount() {
        return forStatementCount;
    }
}
