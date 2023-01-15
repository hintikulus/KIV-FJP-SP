package compilator.visitor;

import compilator.enums.EMethodReturnType;
import compilator.enums.EOperatorAdditive;
import compilator.enums.EVariableDeclaration;
import compilator.enums.EVariableType;
import compilator.object.Variable;
import compilator.object.expression.Expression;
import compilator.object.method.MethodCall;
import compilator.object.Value;
import parser.*;
import java.util.ArrayList;
import java.util.List;

public class VariableVisitor extends CzechGrammarBaseVisitor<Variable> {

    /**
     * Visitor for VariableDeclaration ()
     * @param ctx VariableDeclaration context
     * @return
     */
    @Override
    public Variable visitVariableDeclaration(CzechGrammarParser.VariableDeclarationContext ctx)
    {
        // create decimal variable
        if (ctx.localVariableDeclaration() != null)
        {
            return this.createVariable(ctx.localVariableDeclaration());
        }
        // create constant variable
        else if (ctx.constVariableDeclaration() != null)
        {
            return this.createConstantVariable(ctx.constVariableDeclaration());
        }

        return null;
    }

    /**
     * Creates constant variable
     * @param ctx ConstVariableDeclaration context
     * @return
     */
    private Variable createConstantVariable(CzechGrammarParser.ConstVariableDeclarationContext ctx)
    {
        Variable variable = this.createVariable(ctx.localVariableDeclaration());
        variable.setConstant(true);

        return variable;
    }

    /**
     * Creates variable
     * @param ctx LocalVariableDeclaration context
     * @return
     */
    private Variable createVariable(CzechGrammarParser.LocalVariableDeclarationContext ctx)
    {
        Variable variable = null;

        // decimal
        if (ctx.decimalVariable() != null)
        {
            variable = this.createDecimal(ctx.decimalVariable());
        }
        // boolean
        else if (ctx.boolVariable() != null)
        {
            variable = this.createBoolean(ctx.boolVariable());
        }

        return  variable;
    }

    /**
     * Creates decimal variable
     * @param ctx DecimalVariable context
     * @return
     */
    private Variable createDecimal(CzechGrammarParser.DecimalVariableContext ctx)
    {
        Variable variable = null;

        String name = ctx.identifier().getText();

        // int a = 1;
        if (ctx.decimalValue().DECIMAL() != null)
        {
            String val = ctx.decimalValue().getText();

            variable = new Variable(name, new Value(val), EVariableType.INT);
            variable.setVariableDeclaration(EVariableDeclaration.DECIMAL);
            variable.setDeclaredWithMinus(this.isMinusValue(ctx));

        }
        // int a = b;
        else if (ctx.decimalValue().identifier() != null)
        {
            String val = ctx.decimalValue().identifier().getText();

            variable = new Variable(name, new Value(val), EVariableType.INT);
            variable.setVariableDeclaration(EVariableDeclaration.IDENTIFIER);
            variable.setDeclaredWithMinus(this.isMinusValue(ctx));

        }
        // int a = declare();
        else if (ctx.decimalValue().methodCall() != null)
        {
            MethodCall methodCall = new MethodCallVisitor().visit(ctx.decimalValue().methodCall());
            methodCall.setExpectedReturnType(EMethodReturnType.INT);

            variable = new Variable(name,methodCall, EVariableType.INT);
            variable.setVariableDeclaration(EVariableDeclaration.METHOD_CALL);
            variable.setDeclaredWithMinus(this.isMinusValue(ctx));

        }
        // int a = 1 + 2 + a;
        else if (ctx.decimalValue().expressionBody() != null)
        {
            Expression expression = new ExpressionBodyVisitor().visit(ctx.decimalValue().expressionBody());

            variable = new Variable(name, expression, EVariableType.INT);
            variable.setVariableDeclaration(EVariableDeclaration.EXPRESSION);
            variable.setDeclaredWithMinus(this.isMinusValue(ctx));
        }

        // check parallel declaration
        if (ctx.paralelDeclaration() != null)
        {
            if (variable != null)
            {
                variable.setParallelArray(this.getParallel(ctx.paralelDeclaration()));
            }
        }

        return variable;
    }

    private boolean isMinusValue(CzechGrammarParser.DecimalVariableContext ctx)
    {

        if (ctx.decimalSymbol() != null && ctx.decimalSymbol().getText().equals(EOperatorAdditive.MINUS.getTranslation()))
        {
            return true;
        }
        return false;
    }

    /**
     * Creates boolean variable
     * @param ctx BoolVariable context
     * @return
     */
    private Variable createBoolean(CzechGrammarParser.BoolVariableContext ctx)
    {
        Variable variable = null;

        String name = ctx.identifier().getText();

        // boolean a = true;
        if (ctx.boolValue().booleanValue() != null)
        {
            boolean val = Boolean.parseBoolean(ctx.boolValue().booleanValue().getText());

            variable = new Variable(name, new Value(val), EVariableType.BOOLEAN);
            variable.setVariableDeclaration(EVariableDeclaration.BOOLEAN);
        }
        // boolean a = b;
        else if (ctx.boolValue().identifier() != null)
        {
            String val = ctx.boolValue().identifier().getText();

            variable = new Variable(name, new Value(val), EVariableType.BOOLEAN);
            variable.setVariableDeclaration(EVariableDeclaration.IDENTIFIER);

        }
        // boolean a = declaration();
        else if (ctx.boolValue().methodCall() != null)
        {
            MethodCall methodCall = new MethodCallVisitor().visit(ctx.boolValue().methodCall());
            methodCall.setExpectedReturnType(EMethodReturnType.BOOLEAN);


            variable = new Variable(name, methodCall, EVariableType.BOOLEAN);
            variable.setVariableDeclaration(EVariableDeclaration.METHOD_CALL);

        }
        // boolean a = a && b;
        else if (ctx.boolValue().expressionBody() != null)
        {
            Expression expression = new ExpressionBodyVisitor().visit(ctx.boolValue().expressionBody());

            variable = new Variable(name, expression, EVariableType.BOOLEAN);
            variable.setVariableDeclaration(EVariableDeclaration.EXPRESSION);
        }

        // check parallel declaration
        if (ctx.paralelDeclaration() != null)
        {
            if (variable != null)
            {
                variable.setParallelArray(this.getParallel(ctx.paralelDeclaration()));
            }
        }

        return variable;
    }

    /**
     * Processes parallel declaration
     * @param ctx ParalelDeclaration context
     * @return
     */
    private List<String> getParallel(List<CzechGrammarParser.ParalelDeclarationContext> ctx)
    {
        List<String> parallel = new ArrayList<>();

        for (int i = 0 ; i < ctx.size() ; i++)
        {
            parallel.add(ctx.get(i).identifier().getText());
        }

        return parallel;
    }
}
