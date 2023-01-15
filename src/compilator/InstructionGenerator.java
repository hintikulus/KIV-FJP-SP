package compilator;

import compilator.compilerPart.ProgramCompiler;
import compilator.object.Program;
import compilator.object.instruction.Instruction;

import java.util.List;


public class InstructionGenerator
{

    private Program program;

    public InstructionGenerator(Program program)
    {
        this.program = program;
    }

    /**
     * Generate instructions from stored structure
     * @return list of instructions
     */
    public List<Instruction> generateInstructions()
    {
        ProgramCompiler programCompiler = new ProgramCompiler(this.program);
        programCompiler.run();

        return programCompiler.getInstructionsList();
    }
}
