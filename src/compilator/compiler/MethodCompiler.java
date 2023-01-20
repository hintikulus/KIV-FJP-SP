package compilator.compiler;

import compilator.enums.EInstruction;
import compilator.model.method.Method;
import compilator.model.method.MethodDeclarationParameter;
import compilator.model.symbolTable.SymbolTableItem;

import java.util.List;

public class MethodCompiler extends BaseCompiler {
    private Method method;

    public MethodCompiler(Method method) {
        this.method = method;
    }

    public void run() {
        this.processMethod();
    }

    /**
     * Zpracovani metody na instrukce
     */
    private void processMethod() {
        // kontrola jestli metoda existuje v tabulce symbolu
        if (this.isInSymbolTable(this.method.getIdentifier())) {
            this.getErrorHandler().throwErrorMethodAlreadyExistsError(this.method.getIdentifier(), this.method.getLine());
        }

        this.setStackPointer(this.STACK_POINTER_DEFAULT_VALUE);

        // promenne + parametry + velikost metody
        int methodCustomSize = 0;

        if (this.method.getBody() != null) {
            methodCustomSize = this.method.getBody().getStatementData().getVariableDeclarationCount() + this.method.getBody().getStatementData().getForStatementCount();
        }

        // misto pro promenne je definovane v blockStatement
        int baseMethodSize = this.method.getParameters().size() + this.BASE_METHOD_SIZE;

        // pridani metody do tabulky symbolu
        // adresy metod smeruji z INT instrukce metod
        this.addMethodToSymbolTable(methodCustomSize, baseMethodSize);

        // nacti promenne ze zasobniku
        this.loadParametersFromStack();

        BlockStatementCompiler blockStatementCompiler = new BlockStatementCompiler(this.method.getBody(), 1);
        blockStatementCompiler.setUpInnerBodySettings();


        blockStatementCompiler.setDeleteLocalVariables(false);
        blockStatementCompiler.run();

        if (this.method.getReturnValue() != null) {
            new ExpressionCompiler(this.method.getReturnValue(), this.method.getReturnType(), 1).run();
            // uloz navratovou adresu
            this.addInstruction(EInstruction.STO, 0, -(this.method.getParameters().size() + 1));
        }

        // smazani lokalnich promennych metody
        blockStatementCompiler.deleteLocalVariables();
        this.deleteParametersFromSymbolOfTable();

        this.addInstruction(EInstruction.RET, 0, 0);
    }

    /**
     * Prida metodu do tabulky symbolu a navysi zasobnik
     *
     * @param methodSize     velikost pro symbol
     * @param baseMethodSize velikost s paramametry
     */
    private void addMethodToSymbolTable(int methodSize, int baseMethodSize) {
        SymbolTableItem symbolTableItem = new SymbolTableItem(this.method.getIdentifier(), 0, this.getInstructionsCounter(), methodSize);
        symbolTableItem.setMethod(true);
        symbolTableItem.setMethodReturnType(method.getReturnType());
        symbolTableItem.setMethodDeclarationParameters(method.getParameters());

        this.getSymbolTable().addItem(symbolTableItem);

        this.addInstruction(EInstruction.INT, 0, baseMethodSize);
    }

    /**
     * Nacteni parametru z vrchnolu zasobniku a jejich ulozeni
     */
    private void loadParametersFromStack() {
        List<MethodDeclarationParameter> parameters = this.method.getParameters();
        SymbolTableItem item;

        for (int i = 0; i < parameters.size(); i++) {
            if (this.isInSymbolTable(parameters.get(i).getIdentifier())) {
                this.getErrorHandler().throwErrorVariableAlreadyExists(parameters.get(i).getIdentifier(), this.method.getLine());
            }

            this.addInstruction(EInstruction.LOD, 0, i - parameters.size());

            item = new SymbolTableItem(parameters.get(i).getIdentifier(), 1, this.getAndIncreaseStackPointer(), 0);
            item.setVariableType(parameters.get(i).getType());
            this.getSymbolTable().addItem(item);

            this.addInstruction(EInstruction.STO, 0, item.getAddress());

        }
    }

    /**
     * Odstraneni symbolu z tabulky
     */
    private void deleteParametersFromSymbolOfTable() {
        for (MethodDeclarationParameter parameter : this.method.getParameters()) {
            this.getSymbolTable().getTable().remove(parameter.getIdentifier());
        }
    }
}
