package compilator.visitor;

import compilator.object.expression.Expression;
import generate.CzechGrammarBaseVisitor;
import generate.CzechGrammarParser;

public class ExpressionVisitor extends CzechGrammarBaseVisitor<Expression> {

    /**
     * Visitor for Expression()
     * @param ctx Expression context
     * @return
     */
    @Override
    public Expression visitExpression(CzechGrammarParser.ExpressionContext ctx)
    {
        Expression expression = new ExpressionBodyVisitor().visit(ctx.expressionBody());

        return expression;
    }
}
