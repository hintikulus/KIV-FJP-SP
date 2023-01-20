package compilator.object;

import compilator.enums.EVariableDeclaration;
import compilator.enums.EVariableType;
import compilator.object.expression.Expression;
import compilator.object.method.MethodCall;

import java.util.ArrayList;
import java.util.List;

/**
 * Reprezentace promennych v interni strukture
 */
public class Variable {

    /**
     * Nazev promenne
     */
    private String name;

    /**
     * Hodnota promenne
     */
    private Value value;

    /**
     * Je promenna oznacena jako konstantni?
     */
    private boolean isConstant;

    /**
     * Promenna vyrazu
     */
    private Expression expression;

    /**
     * Typ promenne
     */
    private EVariableType type;

    /**
     * Seznam paralelnich deklaraci
     */
    private List<String> parallelArray;

    /**
     * Hodnota promenne hodnoty volani metody
     */
    private MethodCall methodCall;

    /**
     * Jak byla promenna deklarovana?
     */
    private EVariableDeclaration variableDeclaration;

    /**
     * Byla promenna deklarovana se symbolem minus?
     */
    private boolean isDeclaredWithMinus = false;

    /**
     * Na jake radce byla promenna deklarovana?
     */
    private int line;

    public Variable(String name, Value value, EVariableType type) {
        this.name = name;
        this.value = value;
        this.type = type;
        this.isConstant = false;
        this.parallelArray = new ArrayList<>();
    }

    public Variable(String name, MethodCall methodCall, EVariableType type) {
        this.name = name;
        this.methodCall = methodCall;
        this.type = type;
        this.isConstant = false;
        this.parallelArray = new ArrayList<>();
    }

    public Variable(String name, Expression expression, EVariableType type) {
        this.name = name;
        this.expression = expression;
        this.type = type;
        this.isConstant = false;
        this.parallelArray = new ArrayList<>();
    }

    public Variable(String name, Value value, EVariableType type, boolean isConstant) {
        this.name = name;
        this.value = value;
        this.type = type;
        this.isConstant = isConstant;
        this.parallelArray = new ArrayList<>();
    }

    public boolean existsParallel() {
        if (this.parallelArray.size() == 0) {
            return false;
        }

        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public boolean isConstant() {
        return isConstant;
    }

    public void setConstant(boolean constant) {
        isConstant = constant;
    }

    public EVariableType getType() {
        return type;
    }

    public void setType(EVariableType type) {
        this.type = type;
    }

    public List<String> getParallelArray() {
        return parallelArray;
    }

    public void setParallelArray(List<String> parallelArray) {
        this.parallelArray = parallelArray;
    }


    public MethodCall getMethodCall() {
        return methodCall;
    }

    public EVariableDeclaration getVariableDeclaration() {
        return variableDeclaration;
    }

    public void setVariableDeclaration(EVariableDeclaration variableDeclaration) {
        this.variableDeclaration = variableDeclaration;
    }

    @Override
    public String toString() {
        Object a = value;
        if (variableDeclaration == EVariableDeclaration.DECIMAL) {
            a = value.toInt();
        }
        return "Variable{" +
                "name='" + name + '\'' +
                ", value=" + a +
                ", isConstant=" + isConstant +
                ", type=" + type +
                '}';
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public boolean isDeclaredWithMinus() {
        return isDeclaredWithMinus;
    }

    public void setDeclaredWithMinus(boolean declaredWithMinus) {
        isDeclaredWithMinus = declaredWithMinus;
    }
}
