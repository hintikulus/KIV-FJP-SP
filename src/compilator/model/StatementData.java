package compilator.model;

import compilator.enums.EStatementType;
import compilator.model.statement.Statement;
import compilator.model.statement.StatementDeclaration;

import java.util.ArrayList;
import java.util.List;

/**
 * Data prikazu
 */
public class StatementData {
    /**
     * Seznam deklarovanych konstrukci
     */
    private List<Statement> statements;

    /**
     * Seznam s nazvy deklarovanych promennych
     */
    private List<String> variableNames;

    /**
     * Pocet for cyklu v konstrukcich
     */
    private int forStatementCount = 0;

    public StatementData(List<Statement> statements) {
        this.statements = statements;
        this.variableNames = this.createVariableNamesList();
    }

    /**
     * Pocet paralelne vytvorenych promennych
     *
     * @return
     */
    public int getVariableDeclarationCount() {
        return this.variableNames.size();
    }

    /**
     * Vytvori seznam jmen deklarovanych promennych
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
