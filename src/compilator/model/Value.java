package compilator.model;

/**
 * Ulozeni vsech typu hodnot
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
