package compilator.enums;

public enum EOperatorLogical {

    AND("a zaroven"),
    OR("nebo"),
    NEGATION("negace");


    private String symbol;

    EOperatorLogical(String symbol) {
        this.symbol = symbol;
    }

    public static EOperatorLogical getSymbol(String value) {
        for (EOperatorLogical e : EOperatorLogical.values()) {
            if (e.symbol.equals(value)) {
                return e;
            }
        }
        return null;
    }
}
