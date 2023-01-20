package compilator.model;

import compilator.model.method.Method;

import java.util.List;

/**
 * Reprezentace bloku prikazu pro reprezentaci vnitrni struktury
 */
public class BlockStatement {

    /**
     * Data prikazu
     */
    private StatementData statementData;

    /**
     * Seznam deklarovanych metod
     */
    private List<Method> methods;

    public BlockStatement(StatementData statementData, List<Method> methods) {
        this.statementData = statementData;
        this.methods = methods;
    }

    public StatementData getStatementData() {
        return statementData;
    }

    public List<Method> getMethods() {
        return methods;
    }
}
