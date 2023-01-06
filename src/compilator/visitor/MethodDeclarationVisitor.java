package compilator.visitor;

import compilator.enums.EMethodReturnType;
import compilator.enums.EVariableType;
import compilator.object.BlockStatement;
import compilator.object.expression.Expression;
import compilator.object.method.Method;
import compilator.object.method.MethodDeclarationParameter;
import generate.CzechGrammarBaseVisitor;
import generate.CzechGrammarParser;

import java.util.ArrayList;
import java.util.List;

public class MethodDeclarationVisitor extends CzechGrammarBaseVisitor<Method>
{
    /**
     * Indication of method
     */
    private final String METHOD_SYMBOL = "()";

    /**
     * Visitor for MethodDeclaration()
     * @param ctx MethodDeclarationContext()
     * @return
     */
    @Override
    public Method visitMethodDeclaration(CzechGrammarParser.MethodDeclarationContext ctx)
    {
        EMethodReturnType returnType = EMethodReturnType.valueOf(ctx.methodReturnType().getText().toUpperCase());

        String identifier = ctx.identifier().getText() + this.METHOD_SYMBOL;

        List<MethodDeclarationParameter> parameters = this.parseMethodParameters(ctx.methodParameter());

        BlockStatement body = ctx.methodBody().blockBody() != null ? new BlockBodyVisitor().visit(ctx.methodBody().blockBody()) : null;

        Expression returnValue =  null;

        if (ctx.methodBody().blockBody() != null)
        {
            returnValue = new ExpressionBodyVisitor().visit(ctx.methodBody().blockBody());
            returnValue.setExpectedReturnType(returnType == EMethodReturnType.INT ? EVariableType.INT : EVariableType.BOOLEAN);
        }

        return new Method(returnType, identifier, parameters, body, returnValue, ctx.start.getLine());
    }

    /**
     * Processes method parameters
     * @param methodParameterContext list of parameters context
     * @return
     */
    private List<MethodDeclarationParameter> parseMethodParameters(List<CzechGrammarParser.MethodParameterContext> methodParameterContext)
    {
        List<MethodDeclarationParameter> methodDeclarationParameters = new ArrayList<>();
        MethodDeclarationParameter methodDeclarationParameter;

        for (CzechGrammarParser.MethodParameterContext method : methodParameterContext)
        {
            EVariableType type = EVariableType.valueOf(method.possibleTypes().getText().toUpperCase());

            String identifier = method.identifier().getText();

            methodDeclarationParameter = new MethodDeclarationParameter(type,identifier);

            methodDeclarationParameters.add(methodDeclarationParameter);
        }

        return methodDeclarationParameters;
    }

}
