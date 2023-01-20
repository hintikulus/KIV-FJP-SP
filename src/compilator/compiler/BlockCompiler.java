package compilator.compiler;

import compilator.model.Block;
import compilator.model.method.Method;
import compilator.model.method.MethodPrototype;

import java.util.List;

public class BlockCompiler extends BaseCompiler {
    private Block block;

    public BlockCompiler(Block block) {
        this.block = block;
    }

    public void run() {
        this.generateMethodsPrototype();

        new BlockStatementCompiler(this.block.getBlockStatement(), 0).run();
    }

    /**
     * Vygenerovani prototypu metod
     */
    private void generateMethodsPrototype() {
        List<Method> methods = this.block.getBlockStatement().getMethods();
        for (Method method : methods) {
            if (this.getMethodPrototypes().containsKey(method.getIdentifier())) {
                this.getErrorHandler().throwErrorMethodAlreadyExistsError(method.getIdentifier(), method.getLine());
            }

            MethodPrototype prototype = new MethodPrototype(method.getIdentifier(), method.getReturnType());
            this.getMethodPrototypes().put(prototype.getName(), prototype);
        }
    }
}
