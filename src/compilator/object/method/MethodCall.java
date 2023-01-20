package compilator.object.method;

import compilator.enums.EMethodReturnType;
import compilator.enums.EVariableType;

import java.util.List;

public class MethodCall {
    /**
     * Nazev metody pro volani
     */
    private final String identifier;

    /**
     * Volaci parametry
     */
    private List<MethodCallParameter> parameters;

    /**
     * Předpokladany navratpvy typ
     */
    private EMethodReturnType expectedReturnType;

    /**
     * Cislo radky deklarace metody
     */
    private int line;

    public MethodCall(String identifier) {
        this.identifier = identifier;
    }

    public MethodCall(String identifier, List<MethodCallParameter> parameters, int line) {
        this.identifier = identifier;
        this.parameters = parameters;
        this.line = line;
    }

    public MethodCall(String identifier, EMethodReturnType expectedReturnType, int line) {
        this.identifier = identifier;
        this.expectedReturnType = expectedReturnType;
        this.line = line;
    }

    public String getIdentifier() {
        return identifier;
    }

    public EMethodReturnType getExpectedReturnType() {
        return expectedReturnType;
    }

    /**
     * Prevod EMethodReturnType na EVariableType
     *
     * @return
     */
    public EVariableType convertReturnTypeToVariableType() {
        if (this.expectedReturnType == EMethodReturnType.INT) {
            return EVariableType.INT;
        } else if (this.expectedReturnType == EMethodReturnType.BOOLEAN) {
            return EVariableType.BOOLEAN;
        }

        return null;
    }

    public void setExpectedReturnType(EMethodReturnType expectedReturnType) {
        this.expectedReturnType = expectedReturnType;
    }

    public List<MethodCallParameter> getParameters() {
        return parameters;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }
}
