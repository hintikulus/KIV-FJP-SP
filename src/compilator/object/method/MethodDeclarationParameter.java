package compilator.object.method;

import compilator.enums.EVariableType;

public class MethodDeclarationParameter {
    /**
     * Parameter type
     */
    private EVariableType type;

    /**
     * Parameter identifier
     */
    private String identifier;

    public MethodDeclarationParameter(EVariableType type, String identifier) {
        this.type = type;
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public EVariableType getType() {
        return type;
    }

    public void setType(EVariableType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "MethodDeclarationParameter{" +
                "type=" + type +
                ", identifier='" + identifier + '\'' +
                '}';
    }
}
