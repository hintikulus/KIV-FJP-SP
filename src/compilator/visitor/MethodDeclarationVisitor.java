package compilator.visitor;

import compilator.enums.EMethodReturnType;
import compilator.enums.EVariableType;
import compilator.object.BlockStatement;
import compilator.object.expression.Expression;
import compilator.object.method.Method;
import compilator.object.method.MethodDeclarationParameter;
import parser.CzechGrammarBaseVisitor;
import parser.CzechGrammarParser;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MethodDeclarationVisitor extends CzechGrammarBaseVisitor<Method> {
    /**
     * Indication of method
     */
    private final String METHOD_SYMBOL = "()";

    /**
     * Visitor for MethodDeclaration()
     *
     * @param ctx MethodDeclarationContext()
     * @return
     */
    @Override
    public Method visitMethodDeclaration(CzechGrammarParser.MethodDeclarationContext ctx) {

        EMethodReturnType returnType = EMethodReturnType.getSymbol(ctx.methodReturnType().getText().toLowerCase(Locale.ROOT));

        String identifier = ctx.identifier().getText() + this.METHOD_SYMBOL;

        List<MethodDeclarationParameter> parameters = this.parseMethodParameters(ctx.methodParameter());

        BlockStatement body = ctx.methodBody().blockBody() != null ? new BlockBodyVisitor().visit(ctx.methodBody().blockBody()) : null;

        Expression returnValue = null;

        if (ctx.methodBody().expressionBody() != null) {
            returnValue = new ExpressionBodyVisitor().visit(ctx.methodBody().expressionBody());
            returnValue.setExpectedReturnType(returnType == EMethodReturnType.INT ? EVariableType.INT : EVariableType.BOOLEAN);
        }

        return new Method(returnType, identifier, parameters, body, returnValue, ctx.start.getLine());
    }

    /**
     * Processes method parameters
     *
     * @param methodParameterContext list of parameters context
     * @return
     */
    private List<MethodDeclarationParameter> parseMethodParameters(List<CzechGrammarParser.MethodParameterContext> methodParameterContext) {
        List<MethodDeclarationParameter> methodDeclarationParameters = new ArrayList<>();
        MethodDeclarationParameter methodDeclarationParameter;

        for (CzechGrammarParser.MethodParameterContext method : methodParameterContext) {
            EVariableType type = EVariableType.getSymbol(method.possibleTypes().getText().toLowerCase(Locale.ROOT));
            String identifier = method.identifier().getText();

            methodDeclarationParameter = new MethodDeclarationParameter(type, identifier);

            methodDeclarationParameters.add(methodDeclarationParameter);
        }

        return methodDeclarationParameters;
    }

}
