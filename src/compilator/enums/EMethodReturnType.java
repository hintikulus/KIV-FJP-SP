package compilator.enums;

public enum EMethodReturnType
{
    VOID("nic"),
    BOOLEAN("vyrok"),
    INT("cislo");

    private final String translation;

    EMethodReturnType(String translation) {
        this.translation = translation;
    }

    public static EMethodReturnType getSymbol(String value) {
        for (EMethodReturnType e : EMethodReturnType.values()) {
            if (e.translation.equals(value)) {
                return e;
            }
        }
        return null;
    }

    public String getTranslation() {
        return translation;
    }
}
