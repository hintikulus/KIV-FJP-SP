package compilator.model.method;

import compilator.enums.EMethodReturnType;
import compilator.model.BlockStatement;
import compilator.model.expression.Expression;

import java.util.List;

public class Method {
    /**
     * Nazev metody
     */
    private final String identifier;

    /**
     * Typ návratove hodnoty
     */
    private final EMethodReturnType returnType;

    /**
     * Seznam parametru
     */
    private final List<MethodDeclarationParameter> parameters;

    /**
     * Telo metody
     */
    private final BlockStatement body;

    /**
     * Navratova metoda
     */
    private final Expression returnValue;

    /**
     * Radka deklarace metody
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
