package compilator.object;

import compilator.object.method.Method;
import java.util.List;

/**
 * Represent of BlockStatement in internal structure
 */
public class BlockStatement {

    /**
     * Statement data
     */
    private StatementData statementData;

    /**
     * List of declared methods
     */
    private List<Method> methods;

    public BlockStatement(StatementData statementData, List<Method> methods)
    {
        this.statementData = statementData;
        this.methods = methods;
    }

    public StatementData getStatementData()
    {
        return statementData;
    }

    public List<Method> getMethods()
    {
        return methods;
    }
}
