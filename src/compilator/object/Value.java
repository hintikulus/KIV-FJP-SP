package compilator.object;

/**
 * Stores all types of values
 * In getting you have to know what you want (Variable type)
 */
public class Value {
    final private Object value;

    public Value(Object value) {
        this.value = value;
    }

    public int toInt() {
        return Integer.parseInt(this.value.toString());
    }

    public String toString() {
        return (String) this.value;
    }

    public int toBooleanAsInt() {
        return Boolean.parseBoolean(this.value.toString()) ? 1 : 0;
    }
}
