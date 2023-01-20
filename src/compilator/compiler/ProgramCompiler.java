package compilator.compiler;

import compilator.enums.EInstruction;
import compilator.model.Program;

public class ProgramCompiler extends BaseCompiler {

    private Program program;

    public ProgramCompiler(Program program) {
        this.program = program;
    }


    public void run() {
        // prvni instrukce - skok na adresu 1
        this.addInstruction(EInstruction.JMP, 0, 1);

        new BlockCompiler(program.getBlock()).run();
    }
}
