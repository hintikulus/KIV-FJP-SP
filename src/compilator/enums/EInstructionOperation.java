package compilator.enums;

public enum EInstructionOperation {
    UNARY_MINUS(1),
    PLUS(2),
    MINUS(3),
    MULTIPLY(4),
    DIVIDE(5),
    MODULO(6),
    EQ(8),
    NOT_EQ(9),
    LESS(10),
    GREATER_EQ(11),
    GREATER(12),
    LESS_EQ(13);


    private int value;

    EInstructionOperation(int value) {
        this.value = value;
    }

    public int getCode() {
        return this.value;
    }
}
