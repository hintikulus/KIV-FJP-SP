package compilator.object.symbolTable;

import compilator.enums.EMethodReturnType;
import compilator.enums.EVariableType;
import compilator.object.method.MethodDeclarationParameter;

import java.util.List;

/**
 * Represent record in Symbol table
 */
public class SymbolTableItem {
    /**
     * identifier
     */
    private String name;

    /**
     * level
     */
    private int level;

    /**
     * address
     */
    private int address;

    /**
     * size
     */
    private int size;

    /**
     * indication if record belongs to variable
     */
    private boolean isVariable = false;

    /**
     * indication if record is constant
     */
    private boolean isConstant = false;

    /**
     * indication of variable type
     */
    private EVariableType variableType = null;

    /**
     * indication if record belongs to method
     */
    private boolean isMethod = false;

    /**
     * indication of method identifier
     */
    private String methodIdentifier = null;

    /**
     * method return value
     */
    private EMethodReturnType methodReturnType = null;

    /**
     * method parameters - for later check
     */
    private List<MethodDeclarationParameter> methodDeclarationParameters = null;

    public SymbolTableItem(String name, int level, int address, int size) {
        this.name = name;
        this.level = level;
        this.address = address;
        this.size = size;
    }

    @Override
    public String toString() {
        return "SymbolTableItem{" +
                "name='" + name +
                ", level=" + level +
                ", address=" + address +
                ", size=" + size +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isVariable() {
        return isVariable;
    }

    public boolean isMethod() {
        return isMethod;
    }

    public void setMethod(boolean method) {
        isMethod = method;
    }

    public boolean isConstant() {
        return isConstant;
    }

    public void setConstant(boolean constant) {
        isConstant = constant;
    }

    public EVariableType getVariableType() {
        return variableType;
    }

    public void setVariableType(EVariableType variableType) {
        this.variableType = variableType;
    }

    public void setIsVariable(boolean isVariable) {
        this.isVariable = isVariable;
    }

    public String getMethodIdentifier() {
        return methodIdentifier;
    }

    public void setMethodIdentifier(String methodIdentifier) {
        this.methodIdentifier = methodIdentifier;
    }

    public EMethodReturnType getMethodReturnType() {
        return methodReturnType;
    }

    public void setMethodReturnType(EMethodReturnType methodReturnType) {
        this.methodReturnType = methodReturnType;
    }

    public List<MethodDeclarationParameter> getMethodDeclarationParameters() {
        return methodDeclarationParameters;
    }

    public void setMethodDeclarationParameters(List<MethodDeclarationParameter> methodDeclarationParameters) {
        this.methodDeclarationParameters = methodDeclarationParameters;
    }
}
