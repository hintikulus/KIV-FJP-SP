package compilator.enums;

public enum EVariableType {
    INT("cislo"),
    BOOLEAN("vyrok");


    private final String translation;

    EVariableType(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    public static EVariableType getSymbol(String value) {
        for (EVariableType e : EVariableType.values()) {
            if (e.translation.equals(value)) {
                return e;
            }
        }
        return null;
    }
}
