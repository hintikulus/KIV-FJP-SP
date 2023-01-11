package compilator.visitor;

import compilator.enums.EVariableType;
import compilator.object.control.ControlFor;
import compilator.object.expression.Expression;
import parser.CzechGrammarBaseVisitor;
import parser.CzechGrammarParser;

public class ForControlVisitor extends CzechGrammarBaseVisitor<ControlFor>
{
    /**
     * Visitor for ForControl()
     * @param ctx forControl context
     * @return
     */
    @Override
    public ControlFor visitForControl(CzechGrammarParser.ForControlContext ctx)
    {
        String identifier = ctx.identifier().getText();

        Expression from = new ExpressionBodyVisitor().visit(ctx.expressionBody(0));
        from.setExpectedReturnType(EVariableType.INT);

        Expression to = new ExpressionBodyVisitor().visit(ctx.expressionBody(1));
        to.setExpectedReturnType(EVariableType.INT);

        return new ControlFor(identifier, from, to);
    }
}
