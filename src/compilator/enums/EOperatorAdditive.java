package compilator.enums;

public enum EOperatorAdditive {
    PLUS("plus"),
    MINUS("minus");

    private String symbol;

    EOperatorAdditive(String symbol) {
        this.symbol = symbol;
    }

    public static EOperatorAdditive getSymbol(String value) {
        for (EOperatorAdditive e : EOperatorAdditive.values()) {
            if (e.symbol.equals(value)) {
                return e;
            }
        }
        return null;
    }

    public String getTranslation() {
        return this.symbol;
    }
}
