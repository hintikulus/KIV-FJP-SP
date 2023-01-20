package compilator;

import compilator.compiler.ProgramCompiler;
import compilator.model.Program;
import compilator.model.instruction.Instruction;

import java.util.List;


public class PL0Generator {

    private Program program;

    public PL0Generator(Program program) {
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
