package compilator.visitor;

import compilator.model.expression.Expression;
import compilator.model.method.MethodCall;
import compilator.model.method.MethodCallParameter;
import parser.CzechGrammarBaseVisitor;
import parser.CzechGrammarParser;

import java.util.ArrayList;
import java.util.List;

public class MethodCallVisitor extends CzechGrammarBaseVisitor<MethodCall> {
    /**
     * Indication of method
     */
    private final String METHOD_SYMBOL = "()";

    /**
     * Visitor for MethodCall()
     *
     * @param ctx MethodCall context
     * @return
     */
    @Override
    public MethodCall visitMethodCall(CzechGrammarParser.MethodCallContext ctx) {
        String identifier = ctx.identifier().getText() + this.METHOD_SYMBOL;
        List<MethodCallParameter> methodCallParameters = this.parseMethodCallParameters(ctx.methodCallParameter());

        return new MethodCall(identifier, methodCallParameters, ctx.start.getLine());
    }

    /**
     * Processes method call parameters into internal structure
     *
     * @param methodCallParameterContextsList methodCallParameterContext
     * @return
     */
    private List<MethodCallParameter> parseMethodCallParameters(List<CzechGrammarParser.MethodCallParameterContext> methodCallParameterContextsList) {
        List<MethodCallParameter> methodCallParameters = new ArrayList<>();
        MethodCallParameter methodCallParameter;

        for (CzechGrammarParser.MethodCallParameterContext parameterContext : methodCallParameterContextsList) {
            Expression expression = new ExpressionBodyVisitor().visit(parameterContext.expressionBody());

            methodCallParameter = new MethodCallParameter(expression);

            methodCallParameters.add(methodCallParameter);
        }

        return methodCallParameters;
    }


}
