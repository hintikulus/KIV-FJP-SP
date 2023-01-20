package compilator.model.instruction;

import compilator.enums.EInstruction;
import compilator.model.method.MethodCall;

public class Instruction {
    private EInstruction instruction;
    private int rowId;
    private int level;
    private int address;

    private boolean laterInitialization = false;
    private MethodCall methodCall = null;
    private boolean updatedCall = false;

    public Instruction(EInstruction instruction, int rowId, int level, int address) {
        this.instruction = instruction;
        this.rowId = rowId;
        this.level = level;
        this.address = address;
    }

    public Instruction(EInstruction instruction, int rowId, int level, MethodCall methodCall) {
        this.instruction = instruction;
        this.rowId = rowId;
        this.level = level;
        this.methodCall = methodCall;
        this.address = -1;
        this.laterInitialization = true;
    }

    @Override
    public String toString() {
        return this.rowId + "\t" + this.instruction + "\t" + this.level + "\t" + this.address + "\n";
    }

    public void setAddress(int address) {
        this.address = address;
    }

    /**
     * Adresy iniciovane ve volaci instrukci
     *
     * @return
     */
    public boolean isLaterInitialization() {
        return laterInitialization;
    }

    public void setLaterInitialization(boolean laterInitialization) {
        this.laterInitialization = laterInitialization;
    }

    public MethodCall getMethodCall() {
        return methodCall;
    }

}
