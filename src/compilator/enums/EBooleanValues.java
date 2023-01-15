package compilator.enums;

public enum EBooleanValues {
    TRUE("pravda"),
    FALSE("nepravda");


    private final String translation;

    EBooleanValues(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    public static EBooleanValues getSymbol(String value) {
        for (EBooleanValues e : EBooleanValues.values()) {
            if (e.translation.equals(value)) {
                return e;
            }
        }
        return null;
    }
}
