package compilator.enums;

public enum EErrorCode {
    ERROR_COMPILE(1),
    ERROR_IO(2),
    ERROR_ANTLR(3),
    ERROR_UNKNOWN(4),
    ERROR_RUNTIME(5);

    private int code;

    EErrorCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }
}
