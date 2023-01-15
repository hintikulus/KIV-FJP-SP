package compilator.enums;

public enum EInstruction {
    LIT("LIT"),
    OPR("OPR"),
    LOD("LOD"),
    STO("STO"),
    CAL("CAL"),
    INT("INT"),
    JMP("JMP"),
    JMC("JMC"),
    RET("RET");

    private String value;

    EInstruction(String value) {
        this.value = value;
    }

    public String toString() {
        return this.value;
    }

}
