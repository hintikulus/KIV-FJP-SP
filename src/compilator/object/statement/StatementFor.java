package compilator.object.statement;

import compilator.enums.EStatementType;
import compilator.object.BlockStatement;
import compilator.object.control.ControlFor;

public class StatementFor extends Statement {
    /**
     * For loop head
     */
    private final ControlFor controlFor;

    /**
     * For loop body
     */
    private final BlockStatement body;

    public StatementFor(ControlFor controlFor, BlockStatement body, int line) {
        super(EStatementType.FOR, line);
        this.controlFor = controlFor;
        this.body = body;
    }

    public BlockStatement getBody() {
        return body;
    }

    public ControlFor getControlFor() {
        return controlFor;
    }
}
