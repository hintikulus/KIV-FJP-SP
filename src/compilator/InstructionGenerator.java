package compilator;

import compilator.compiler.ProgramCompiler;
import compilator.object.Program;
import compilator.object.instruction.Instruction;

import java.util.List;


public class InstructionGenerator {

    private Program program;

    public InstructionGenerator(Program program) {
        this.program = program;
    }

    /**
     * Generovani instrukci z ulozenych struktur
     *
     * @return seznam instrukci
     */
    public List<Instruction> generateInstructions() {
        ProgramCompiler programCompiler = new ProgramCompiler(this.program);
        programCompiler.run();

        return programCompiler.getInstructionsList();
    }
}
