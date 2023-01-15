package compilator.enums;

public enum EOperatorRelational
{
    EQUAL("se shoduje"),
    NOT_EQUAL("nerovno"),
    LT("mensi nez"),
    LE("mensi rovno nez"),
    GE("vetsi rovno nez"),
    GT("vetsi nez");

    private String symbol;

    EOperatorRelational(String symbol)
    {
        this.symbol = symbol;
    }

    public static EOperatorRelational getSymbol(String value) {
        for(EOperatorRelational e: EOperatorRelational.values()) {
            if(e.symbol.equals(value))
            {
                return e;
            }
        }
        return null;
    }
}
