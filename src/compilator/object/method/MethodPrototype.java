package compilator.object.method;

import compilator.enums.EMethodReturnType;
import compilator.enums.EVariableType;

public class MethodPrototype {
    /**
     * Nazev metody
     */
    private String name;

    /**
     * Parametry metody
     */
    private EMethodReturnType methodReturnType;

    public MethodPrototype(String name, EMethodReturnType methodReturnType) {
        this.name = name;
        this.methodReturnType = methodReturnType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EMethodReturnType getMethodReturnType() {
        return methodReturnType;
    }

    public void setMethodReturnType(EMethodReturnType methodReturnType) {
        this.methodReturnType = methodReturnType;
    }

    public EVariableType convertReturnTypeToVariableType() {
        if (this.methodReturnType == EMethodReturnType.INT) {
            return EVariableType.INT;
        } else if (this.methodReturnType == EMethodReturnType.BOOLEAN) {
            return EVariableType.BOOLEAN;
        }

        return null;
    }
}
