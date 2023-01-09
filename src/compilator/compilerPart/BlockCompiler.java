package compilator.compilerPart;

import compilator.object.Block;
import compilator.object.method.Method;
import compilator.object.method.MethodPrototype;
import java.util.List;

public class BlockCompiler extends BaseCompiler
{
    private Block block;

    public BlockCompiler(Block block)
    {
        this.block = block;
    }

    public void run()
    {
        this.generateMethodsPrototype();

        new BlockStatementCompiler(this.block.getBlockStatement(), 0).run();
    }

    /**
     * Generates method prototypes
     */
    private void generateMethodsPrototype()
    {
        List<Method> methods = this.block.getBlockStatement().getMethods();
        for(Method method : methods)
        {
            if (this.getMethodPrototypes().containsKey(method.getIdentifier()))
            {
                this.getErrorHandler().throwErrorMethodAlreadyExistsError(method.getIdentifier(), method.getLine());
            }

            MethodPrototype prototype = new MethodPrototype(method.getIdentifier(), method.getReturnType());
            this.getMethodPrototypes().put(prototype.getName(), prototype);
        }
    }
}
