package compilator.compilerPart;

import compilator.enums.EInstruction;
import compilator.object.Program;

public class ProgramCompiler extends BaseCompiler
{

    private Program program;

    public ProgramCompiler(Program program)
    {
        this.program = program;
    }


    public void run()
    {
        // first jump on first address -> our first instruction
        this.addInstruction(EInstruction.JMP, 0, 1);

        new BlockCompiler(program.getBlock()).run();
    }
}
