package compilator.object.statement;

import compilator.enums.EStatementType;
import compilator.object.expression.Expression;

import java.util.HashMap;

public class StatementSwitch extends Statement {
    /**
     * Switch condition
     */
    private Expression expression;

    /**
     * Switch blocks
     */
    private HashMap<Integer, StatementSwitchBlock> caseBlocks;

    /**
     * Switch default block
     */
    private final StatementSwitchBlock defaultBlock;

    public StatementSwitch(Expression expression, HashMap<Integer, StatementSwitchBlock> blocks, StatementSwitchBlock defaultBlock, int line) {
        super(EStatementType.SWITCH, line);
        this.expression = expression;
        this.caseBlocks = blocks;
        this.defaultBlock = defaultBlock;
    }

    public StatementSwitchBlock getDefaultBlock() {
        return defaultBlock;
    }

    public HashMap<Integer, StatementSwitchBlock> getBlocks() {
        return caseBlocks;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }
}
