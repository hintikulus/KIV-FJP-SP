package compilator.object.method;

import compilator.enums.EMethodReturnType;
import compilator.object.BlockStatement;
import compilator.object.expression.Expression;

import java.util.List;

public class Method {
    /**
     * Method name
     */
    private final String identifier;

    /**
     * Method return type
     */
    private final EMethodReturnType returnType;

    /**
     * List of parameters
     */
    private final List<MethodDeclarationParameter> parameters;

    /**
     * Method body
     */
    private final BlockStatement body;

    /**
     * Return value
     */
    private final Expression returnValue;

    /**
     * Line of method head
     */
    private int line;

    public Method(EMethodReturnType returnType, String identifier, List<MethodDeclarationParameter> parameters, BlockStatement body, Expression returnValue, int line) {
        this.identifier = identifier;
        this.returnType = returnType;
        this.parameters = parameters;
        this.body = body;
        this.returnValue = returnValue;
        this.line = line;
    }

    public String getIdentifier() {
        return identifier;
    }

    public EMethodReturnType getReturnType() {
        return returnType;
    }

    public List<MethodDeclarationParameter> getParameters() {
        return parameters;
    }

    public BlockStatement getBody() {
        return body;
    }

    public Expression getReturnValue() {
        return returnValue;
    }

    @Override
    public String toString() {
        return "Method{" +
                "identifier='" + identifier + '\'' +
                ", returnType=" + returnType +
                ", parameters=" + parameters +
                ", body=" + body +
                ", returnValue=" + returnValue +
                '}';
    }

    public int getLine() {
        return line;
    }
}
