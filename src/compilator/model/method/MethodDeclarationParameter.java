package compilator.model.method;

import compilator.enums.EVariableType;

public class MethodDeclarationParameter {
    /**
     * Typ parametru
     */
    private EVariableType type;

    /**
     * Identifikator parametru
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
