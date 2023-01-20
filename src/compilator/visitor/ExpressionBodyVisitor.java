package compilator.visitor;

import compilator.enums.*;
import compilator.model.Value;
import compilator.model.expression.*;
import compilator.model.method.MethodCall;
import parser.CzechGrammarBaseVisitor;
import parser.CzechGrammarParser;

public class ExpressionBodyVisitor extends CzechGrammarBaseVisitor<Expression> {
    /**
     * Visitor for ExprNeg()
     *
     * @param ctx ExprNeg context
     * @return Expression
     */
    @Override
    public Expression visitExprNeg(CzechGrammarParser.ExprNegContext ctx) {
        return new ExpressionNegation(this.visit(ctx.expressionBody()), ctx.start.getLine());
    }

    /**
     * Visitor for ExprMinus()
     *
     * @param ctx ExprMinus context
     * @return Expression
     */
    @Override
    public Expression visitExprMinus(CzechGrammarParser.ExprMinusContext ctx) {
        return new ExpressionMinus(this.visit(ctx.expressionBody()), ctx.start.getLine());
    }

    /**
     * Visitor for ExprPlus()
     * useless, but we want to allow write for example method(+(1+1))
     *
     * @param ctx ExprMinus context
     * @return Expression
     */
    @Override
    public Expression visitExprPlus(CzechGrammarParser.ExprPlusContext ctx) {
        return new ExpressionPlus(this.visit(ctx.expressionBody()), ctx.start.getLine());
    }

    /**
     * Visitor for ExprAdditive()
     *
     * @param ctx ExprAdditive context
     * @return Expression
     */
    @Override
    public Expression visitExprAdditive(CzechGrammarParser.ExprAdditiveContext ctx) {
        Expression left = this.visit(ctx.expressionBody(0));
        Expression right = this.visit(ctx.expressionBody(1));
        EOperatorAdditive operator = EOperatorAdditive.getSymbol(ctx.op.getText());

        return new ExpressionAdditive(left, right, operator, ctx.start.getLine());
    }

    /**
     * Visitor for ExprPar()
     *
     * @param ctx ExprPar context
     * @return Expression
     */
    @Override
    public Expression visitExprPar(CzechGrammarParser.ExprParContext ctx) {
        return new ExpressionPar(this.visit(ctx.expressionBody()), ctx.start.getLine());
    }

    /**
     * Visitor for ExprRelational()
     *
     * @param ctx ExprRelational context
     * @return Expression
     */
    @Override
    public Expression visitExprRelational(CzechGrammarParser.ExprRelationalContext ctx) {
        Expression left = this.visit(ctx.expressionBody(0));
        Expression right = this.visit(ctx.expressionBody(1));
        EOperatorRelational operator = EOperatorRelational.getSymbol(ctx.op.getText());

        return new ExpressionRelational(left, right, operator, ctx.start.getLine());
    }

    /**
     * Visitor for ExprIdentifier()
     *
     * @param ctx ExprIdentifier context
     * @return Expression
     */
    @Override
    public Expression visitExprIdentifier(CzechGrammarParser.ExprIdentifierContext ctx) {
        return new ExpressionIdentifier(new Value(ctx.identifier().getText()), ctx.start.getLine());
    }

    /**
     * Visitor for ExprPossibleValue()
     *
     * @param ctx ExprPossibleValue context
     * @return Expression
     */
    @Override
    public Expression visitExprPossibleValue(CzechGrammarParser.ExprPossibleValueContext ctx) {
        EVariableType type = null;
        Value value = null;

        if (ctx.possibleValues().DECIMAL() != null) {
            int dimension = 1;
            if (ctx.possibleValues().decimalSymbol() != null && ctx.possibleValues().decimalSymbol().getText().equals("-")) {
                dimension = -1;
            }
            int val = Integer.parseInt(ctx.possibleValues().DECIMAL().getText());
            value = new Value(val * dimension);
            type = EVariableType.INT;
        } else if (ctx.possibleValues().booleanValue() != null) {
            value = new Value(ctx.possibleValues().booleanValue().getText());
            type = EVariableType.BOOLEAN;
        }

        return new ExpressionValue(value, type, ctx.start.getLine());
    }

    /**
     * visitor for ExprLogical()
     *
     * @param ctx ExprLogical context
     * @return Expression
     */
    @Override
    public Expression visitExprLogical(CzechGrammarParser.ExprLogicalContext ctx) {
        Expression left = this.visit(ctx.expressionBody(0));
        Expression right = this.visit(ctx.expressionBody(1));
        EOperatorLogical operator = EOperatorLogical.getSymbol(ctx.op.getText());

        return new ExpressionLogical(left, right, operator, ctx.start.getLine());
    }

    /**
     * Visitor for ExprMultipli()
     *
     * @param ctx ExprMultipli context
     * @return Expression
     */
    @Override
    public Expression visitExprMultipli(CzechGrammarParser.ExprMultipliContext ctx) {
        Expression left = this.visit(ctx.expressionBody(0));
        Expression right = this.visit(ctx.expressionBody(1));
        EOperatorMultiplication operator = EOperatorMultiplication.getSymbol(ctx.op.getText());

        return new ExpressionMultiplication(left, right, operator, ctx.start.getLine());
    }

    /**
     * Visitor for ExprMethodCall()
     *
     * @param ctx ExprMethodCall context
     * @return Expression
     */
    @Override
    public Expression visitExprMethodCall(CzechGrammarParser.ExprMethodCallContext ctx) {
        MethodCall methodCall = new MethodCallVisitor().visit(ctx.methodCall());

        return new ExpressionMethodCall(methodCall, ctx.start.getLine());
    }
}
