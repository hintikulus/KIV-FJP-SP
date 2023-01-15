package compilator.visitor;


import compilator.ErrorHandler;
import compilator.enums.EMethodReturnType;
import compilator.enums.EVariableType;
import compilator.object.BlockStatement;
import compilator.object.control.ControlFor;
import compilator.object.method.MethodCall;
import compilator.object.Variable;
import compilator.object.expression.Expression;
import compilator.object.statement.*;
import generate.CzechGrammarBaseVisitor;
import generate.CzechGrammarParser;

import java.util.HashMap;
import java.util.List;


public class StatementVisitor extends CzechGrammarBaseVisitor<Statement>
{

    /**
     * Visitor for StatementIf()
     * @param ctx StatementIf context
     * @return
     */
    @Override
    public StatementIf visitStatementIf(CzechGrammarParser.StatementIfContext ctx)
    {
        Expression expression = new ExpressionVisitor().visit(ctx.expression());
        expression.setExpectedReturnType(EVariableType.BOOLEAN);

        BlockStatement bodyIf = ctx.body(0).blockBody() != null ? new BlockBodyVisitor().visit(ctx.body(0).blockBody()) : null;

        BlockStatement bodyElse = null;

        // else part
        if (ctx.body(1) != null)
        {
            bodyElse = ctx.body(1).blockBody() != null ? new BlockBodyVisitor().visit(ctx.body(1).blockBody()) : null;
        }

        return new StatementIf(expression, bodyIf, bodyElse, ctx.start.getLine());
    }

    /**
     * visitor for StatementFor()
     * @param ctx StatementFor context
     * @return
     */
    @Override
    public StatementFor visitStatementFor(CzechGrammarParser.StatementForContext ctx)
    {
        ControlFor controlFor = new ForControlVisitor().visit(ctx.forControl());

        BlockStatement body;

        if (ctx.body().blockBody() == null)
        {
            body = null;
        }
        else
        {
            body = new BlockBodyVisitor().visit(ctx.body().blockBody());
        }

        return new StatementFor(controlFor, body, ctx.start.getLine());
    }

    /**
     * Visitor for StatementWhile()
     * @param ctx StatementWhile context
     * @return
     */
    @Override
    public StatementWhile visitStatementWhile(CzechGrammarParser.StatementWhileContext ctx)
    {
        Expression expression = new ExpressionVisitor().visit(ctx.expression());
        BlockStatement body = ctx.body().blockBody() != null ? new BlockBodyVisitor().visit(ctx.body().blockBody()) : null;

        return new StatementWhile(expression, body, ctx.start.getLine());
    }

    @Override
    public StatementDo visitStatementDo(CzechGrammarParser.StatementDoContext ctx)
    {
        Expression expression = new ExpressionVisitor().visit(ctx.expression());
        BlockStatement body = ctx.body().blockBody() != null ? new BlockBodyVisitor().visit(ctx.body().blockBody()) : null;

        return new StatementDo(expression, body, ctx.start.getLine());
    }

    @Override
    public StatementSwitch visitStatementSwitch(CzechGrammarParser.StatementSwitchContext ctx)
    {
        List<CzechGrammarParser.SwitchBlockStatementContext> switchBlocks = ctx.switchBlockStatement();

        HashMap<Integer, StatementSwitchBlock> switchBlockHashMap = new HashMap<>();

        StatementSwitchBlock defaultBlock = null;

        Expression expression = new ExpressionVisitor().visit(ctx.expression());

        for (CzechGrammarParser.SwitchBlockStatementContext switchBlockStatement : switchBlocks)
        {
            // case block
            if (switchBlockStatement.CASE() != null)
            {
                int identifier = Integer.parseInt(switchBlockStatement.DECIMAL().getText());
                BlockStatement body = switchBlockStatement.body().blockBody() != null ? new BlockBodyVisitor().visit(switchBlockStatement.body().blockBody()) : null;
                StatementSwitchBlock stmtSwitchBlock = new StatementSwitchBlock(identifier, body);
                switchBlockHashMap.put(identifier, stmtSwitchBlock);
            }
            // default block
            else
            {
                if (defaultBlock != null)
                {
                    ErrorHandler.getInstance().throwErrorSwitchMultipleDefaultBlock(switchBlockStatement.start.getLine());
                }

                BlockStatement body = switchBlockStatement.body().blockBody() != null ? new BlockBodyVisitor().visit(switchBlockStatement.body().blockBody()) : null;
                defaultBlock = new StatementSwitchBlock(body, switchBlockStatement.body().blockBody().start.getLine());
            }
        }

        return new StatementSwitch(expression, switchBlockHashMap, defaultBlock, ctx.start.getLine());
    }

    /**
     * Visitor for StatementRepeat()
     * @param ctx StatementRepeat context
     * @return
     */
    @Override
    public StatementRepeat visitStatementRepeat(CzechGrammarParser.StatementRepeatContext ctx)
    {
        Expression expression = new ExpressionVisitor().visit(ctx.expression());
        BlockStatement body = ctx.body().blockBody() != null ? new BlockBodyVisitor().visit(ctx.body().blockBody()) : null;

        return new StatementRepeat(expression, body, ctx.start.getLine());
    }

    /**
     * Visitor for StatementMethodCall()
     * @param ctx StatementMethodCall context
     * @return
     */
    @Override
    public Statement visitStatementMethodCall(CzechGrammarParser.StatementMethodCallContext ctx)
    {
        MethodCall methodCall = new MethodCallVisitor().visit(ctx.methodCall());
        methodCall.setExpectedReturnType(EMethodReturnType.VOID);


        return new StatementMethodCall(methodCall, ctx.start.getLine());
    }

    /**
     * Visitor for StatementAssigment()
     * @param ctx StatementAssigment
     * @return
     */
    @Override
    public Statement visitStatementAssigment(CzechGrammarParser.StatementAssigmentContext ctx)
    {
        String identifier = ctx.variableAssigment().identifier().getText();
        Expression expression = new ExpressionBodyVisitor().visit(ctx.variableAssigment().expressionBody());

        return new StatementAssigment(identifier, expression, ctx.start.getLine());
    }

    /**
     * Visitor for StatementVariableDeclaration
     * @param ctx StatementVariableDeclaration context
     * @return
     */
    @Override
    public Statement visitStatementVariableDeclaration(CzechGrammarParser.StatementVariableDeclarationContext ctx)
    {
        Variable variable = new VariableVisitor().visit(ctx.variableDeclaration());
        variable.setLine(ctx.start.getLine());

        return new StatementDeclaration(variable, ctx.start.getLine());
    }
}
