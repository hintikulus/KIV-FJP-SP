package compilator.object;

import compilator.enums.EVariableDeclaration;
import compilator.enums.EVariableType;
import compilator.object.expression.Expression;
import compilator.object.method.MethodCall;

import java.util.ArrayList;
import java.util.List;

/**
 * Represent of variable in internal structure
 */
public class Variable {

    /**
     * Variable name
     */
    private String name;

    /**
     * Variable value
     */
    private Value value;

    /**
     * Is variable constant indication
     */
    private boolean isConstant;

    /**
     * Variable expression value
     */
    private Expression expression;

    /**
     * Variable type
     */
    private EVariableType type;

    /**
     * List of parallel declared variables
     */
    private List<String> parallelArray;

    /**
     * Variable method call value
     */
    private MethodCall methodCall;

    /**
     * How was variable declared indication
     */
    private EVariableDeclaration variableDeclaration;

    /**
     * indication if variable was declared with minus symbol
     */
    private boolean isDeclaredWithMinus = false;

    /**
     * On which line was variable declared
     */
    private int line;

    public Variable(String name, Value value, EVariableType type)
    {
        this.name = name;
        this.value = value;
        this.type = type;
        this.isConstant = false;
        this.parallelArray = new ArrayList<>();
    }

    public Variable(String name, MethodCall methodCall, EVariableType type)
    {
        this.name = name;
        this.methodCall = methodCall;
        this.type = type;
        this.isConstant = false;
        this.parallelArray = new ArrayList<>();
    }

    public Variable(String name, Expression expression, EVariableType type)
    {
        this.name = name;
        this.expression = expression;
        this.type = type;
        this.isConstant = false;
        this.parallelArray = new ArrayList<>();
    }

    public Variable(String name, Value value, EVariableType type, boolean isConstant)
    {
        this.name = name;
        this.value = value;
        this.type = type;
        this.isConstant = isConstant;
        this.parallelArray = new ArrayList<>();
    }

    public boolean existsParallel()
    {
        if (this.parallelArray.size() == 0)
        {
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


    public MethodCall getMethodCall()
    {
        return methodCall;
    }

    public EVariableDeclaration getVariableDeclaration()
    {
        return variableDeclaration;
    }

    public void setVariableDeclaration(EVariableDeclaration variableDeclaration)
    {
        this.variableDeclaration = variableDeclaration;
    }

    @Override
    public String toString()
    {
        Object a = value;
        if (variableDeclaration == EVariableDeclaration.DECIMAL)
        {
            a = value.toInt();
        }
        return "Variable{" +
                "name='" + name + '\'' +
                ", value=" + a +
                ", isConstant=" + isConstant +
                ", type=" + type +
                '}';
    }

    public Expression getExpression()
    {
        return expression;
    }

    public void setExpression(Expression expression)
    {
        this.expression = expression;
    }

    public int getLine()
    {
        return line;
    }

    public void setLine(int line)
    {
        this.line = line;
    }

    public boolean isDeclaredWithMinus()
    {
        return isDeclaredWithMinus;
    }

    public void setDeclaredWithMinus(boolean declaredWithMinus)
    {
        isDeclaredWithMinus = declaredWithMinus;
    }
}
