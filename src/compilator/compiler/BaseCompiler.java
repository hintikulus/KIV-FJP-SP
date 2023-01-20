package compilator.compiler;

import compilator.ErrorController;
import compilator.enums.EInstruction;
import compilator.object.instruction.Instruction;
import compilator.object.method.MethodCall;
import compilator.object.method.MethodPrototype;
import compilator.object.symbolTable.SymbolTable;

import java.util.ArrayList;
import java.util.HashMap;

public class BaseCompiler {
    /**
     * Seznam instrukci
     */
    protected static ArrayList<Instruction> instructionsList = new ArrayList<>();

    /**
     * Tabulka symbolu
     */
    protected static SymbolTable symbolTable = new SymbolTable();

    /**
     * Pocitadlo instrukci
     */
    private static int instructionsCounter = 0;

    /**
     * Vychozi velikost metody
     */
    protected final int BASE_METHOD_SIZE = 3;

    /**
     * Zasobnikovy ukazatel
     */
    private static int stackPointer = 3;

    /**
     * Vychozi hodnota zasobnikového ukazatele
     */
    public final int STACK_POINTER_DEFAULT_VALUE = 3;

    /**
     * Seznam prototypu metod
     */
    private static HashMap<String, MethodPrototype> methodPrototype = new HashMap<>();

    /**
     * Obsluha chyb
     */
    protected static ErrorController errorController = ErrorController.getInstance();

    /**
     * Pridá instrukci do seznamu instrukci
     *
     * @param instruction
     * @param level
     * @param address
     */
    protected void addInstruction(EInstruction instruction, int level, int address) {
        instructionsList.add(new Instruction(instruction, this.getInstructionsCounter(), level, address));
        instructionsCounter++;
    }

    /**
     * Prida instrukci pro volani metody do seznamu instrukci
     *
     * @param instruction
     * @param level
     * @param methodCall
     */
    protected void addMethodCallInstruction(EInstruction instruction, int level, MethodCall methodCall) {
        instructionsList.add(new Instruction(instruction, this.getInstructionsCounter(), level, methodCall));
        instructionsCounter++;
    }

    public ArrayList<Instruction> getInstructionsList() {
        return instructionsList;
    }

    protected int getStackPointer() {
        return stackPointer;
    }

    protected void setStackPointer(int address) {
        stackPointer = address;
    }

    protected void increaseStackPointer() {
        stackPointer++;
    }

    protected int getAndIncreaseStackPointer() {
        int val = stackPointer;

        this.increaseStackPointer();

        return val;
    }

    protected int getInstructionsCounter() {
        return instructionsCounter;
    }

    protected SymbolTable getSymbolTable() {
        return symbolTable;
    }

    protected boolean isInSymbolTable(String identifier) {
        return this.getSymbolTable().getTable().containsKey(identifier);
    }

    protected ErrorController getErrorHandler() {
        return errorController;
    }

    public HashMap<String, MethodPrototype> getMethodPrototype() {
        return methodPrototype;
    }

    public HashMap<String, MethodPrototype> getMethodPrototypes() {
        return methodPrototype;
    }
}
