package compilator.visitor;

import compilator.enums.EVariableType;
import compilator.model.control.ControlFor;
import compilator.model.expression.Expression;
import parser.CzechGrammarBaseVisitor;
import parser.CzechGrammarParser;

public class ForControlVisitor extends CzechGrammarBaseVisitor<ControlFor> {
    /**
     * Visitor pro ForControl()
     *
     * @param ctx forControl context
     * @return
     */
    @Override
    public ControlFor visitForControl(CzechGrammarParser.ForControlContext ctx) {
        String identifier = ctx.identifier().getText();

        Expression from = new ExpressionBodyVisitor().visit(ctx.expressionBody(0));
        from.setExpectedReturnType(EVariableType.INT);

        Expression to = new ExpressionBodyVisitor().visit(ctx.expressionBody(1));
        to.setExpectedReturnType(EVariableType.INT);

        return new ControlFor(identifier, from, to);
    }
}
