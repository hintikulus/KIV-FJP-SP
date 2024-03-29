package compilator.compiler;

import compilator.enums.*;
import compilator.model.BlockStatement;
import compilator.model.StatementData;
import compilator.model.Variable;
import compilator.model.expression.ExpressionMethodCall;
import compilator.model.instruction.Instruction;
import compilator.model.method.Method;
import compilator.model.method.MethodCall;
import compilator.model.statement.*;
import compilator.model.symbolTable.SymbolTableItem;

import java.util.ArrayList;
import java.util.Map;

public class BlockStatementCompiler extends BaseCompiler {
    /**
     * Instance bloku prikazu
     */
    private BlockStatement blockStatement;

    /**
     * Data vyrazu
     */
    private StatementData statementData;

    /**
     * Hloubka instrukcí
     */
    private int level;

    /**
     * Generovat metody?
     */
    private boolean generateMethods = true;

    /**
     * Zvetsovat zasobnik?
     */
    private boolean increaseStack = true;

    /**
     * Generovat return?
     */
    private boolean generateReturn = true;

    /**
     * Odstranovat lokalni promenne
     */
    private boolean deleteLocalVariables = false;

    /**
     * Alokovane misto pro lokalni promenne
     */
    private boolean createLocalSpaceForLocalVariables = false;

    public BlockStatementCompiler(BlockStatement blockStatement, int level) {
        this.blockStatement = blockStatement;

        if (blockStatement != null) {
            this.statementData = blockStatement.getStatementData();
        }
        this.level = level;
    }

    /**
     * Zpracovat blok prikazu na prikazy
     */
    public void run() {
        if (this.blockStatement == null) {
            return;
        }

        // zvetsi misto na zasobniku pro promenne
        this.incrementStackForVariables();

        this.generateInstructionForStatements();

        // vygenerovani return instrukci
        if (this.generateReturn) {
            this.addInstruction(EInstruction.RET, 0, 0);
        }

        // metory generovane pouze v hlavnim tele
        if (this.generateMethods) {
            this.generateInstructionForMethods();
            this.initializeMethodsInInstructions();
        }

        if (this.deleteLocalVariables) {
            this.deleteLocalVariables();
        }
    }

    /**
     * Zvetseni zasobniku na zaklade nastaveni
     */
    private void incrementStackForVariables() {
        // v hlavnim bloku programu
        if (this.increaseStack) {
            this.addInstruction(EInstruction.INT, 0, this.BASE_METHOD_SIZE + this.statementData.getVariableDeclarationCount() + this.statementData.getForStatementCount());
        }

        // pro cykly, podminky, dalsi bloky programu
        if (this.createLocalSpaceForLocalVariables && this.statementData.getVariableDeclarationCount() != 0) {
            this.addInstruction(EInstruction.INT, 0, this.statementData.getVariableDeclarationCount());
        }
    }

    /**
     * Kompilace metod do instrukci volane po prikazech
     */
    private void generateInstructionForMethods() {
        for (Method method : this.blockStatement.getMethods()) {
            new MethodCompiler(method).run();
        }
    }

    /**
     * Zpracovani prikazu
     */
    private void generateInstructionForStatements() {
        for (Statement statement : this.statementData.getStatements()) {
            switch (statement.getType()) {
                case DECLARATION:
                    this.generateDeclarationInstruction((StatementDeclaration) statement);
                    break;
                case ASSIGMENT:
                    this.generateAssigmentInstruction((StatementAssigment) statement);
                    break;
                case IF:
                    this.generateIfInstructions((StatementIf) statement);
                    break;
                case FOR:
                    this.generateForInstructions((StatementFor) statement);
                    break;
                case WHILE:
                    this.generateWhileInstructions((StatementWhile) statement);
                    break;
                case DO_WHILE:
                    this.generateDoWhileInstructions((StatementDo) statement);
                    break;
                case METHOD_CALL:
                    this.generateMethodCallInstructions((StatementMethodCall) statement);
                    break;
                case REPEAT_UNTIL:
                    this.generateRepeatUntilInstructions((StatementRepeat) statement);
                    break;
                case SWITCH:
                    this.generateSwitchInstructions((StatementSwitch) statement);
                    break;
            }
        }
    }

    /**
     * Generace instrukci pro deklaraci promennych
     *
     * @param statementDeclaration
     */
    private void generateDeclarationInstruction(StatementDeclaration statementDeclaration) {
        Variable variable = statementDeclaration.getVariable();

        if (this.isInSymbolTable(variable.getName())) {
            this.getErrorHandler().throwErrorVariableAlreadyExists(variable.getName(), variable.getLine());
        }

        switch (variable.getType()) {
            case INT:
                this.variableIntInstruction(variable);
                break;
            case BOOLEAN:
                this.variableBooleanInstruction(variable);
                break;
        }

        SymbolTableItem symbolTableItem = this.addVariable(variable.getName(), variable);

        if (variable.existsParallel()) {
            for (String variableName : variable.getParallelArray()) {
                this.addInstruction(EInstruction.LOD, this.level - symbolTableItem.getLevel(), symbolTableItem.getAddress());
                this.addVariable(variableName, variable);
            }
        }
    }

    /**
     * Prida promennou do tabulky symbolu
     *
     * @param name
     * @param variable
     * @return
     */
    private SymbolTableItem addVariable(String name, Variable variable) {
        SymbolTableItem symbolTableItem = new SymbolTableItem(name, this.level, this.getAndIncreaseStackPointer(), 0);
        symbolTableItem.setIsVariable(true);
        symbolTableItem.setConstant(variable.isConstant());
        symbolTableItem.setVariableType(variable.getType());

        this.getSymbolTable().addItem(symbolTableItem);

        if (variable.isDeclaredWithMinus()) {
            this.addInstruction(EInstruction.LIT, 0, -1);
            this.addInstruction(EInstruction.OPR, 0, EInstructionOperation.MULTIPLY.getCode());
        }

        this.addInstruction(EInstruction.STO, 0, symbolTableItem.getAddress());

        return symbolTableItem;
    }

    /**
     * Generace instrukci pro celocislelne promenne na zaklade typu nezname
     *
     * @param variable
     */
    private void variableIntInstruction(Variable variable) {
        switch (variable.getVariableDeclaration()) {
            case DECIMAL:
                this.addInstruction(EInstruction.LIT, 0, variable.getValue().toInt());
                break;
            case METHOD_CALL:
                new MethodCallCompiler(variable.getMethodCall(), this.level).run();
                break;
            case IDENTIFIER:
                this.variableAssigmentIdentifier(variable);
                break;
            case EXPRESSION:
                new ExpressionCompiler(variable.getExpression(), EVariableType.INT, this.level).run();
                break;
        }
    }

    /**
     * Generace instrukci pro pravdivnosti promenne na zaklade typu promenne
     *
     * @param variable
     */
    private void variableBooleanInstruction(Variable variable) {
        switch (variable.getVariableDeclaration()) {
            case BOOLEAN:
                this.addInstruction(EInstruction.LIT, 0, variable.getValue().toBooleanAsInt());
                break;
            case METHOD_CALL:
                new MethodCallCompiler(variable.getMethodCall(), this.level).run();
                break;
            case IDENTIFIER:
                this.variableAssigmentIdentifier(variable);
                break;
            case EXPRESSION:
                new ExpressionCompiler(variable.getExpression(), EVariableType.BOOLEAN, this.level).run();
                break;
        }
    }

    /**
     * Generace instrukci pro deklaraci pres prirazenu
     *
     * @param variable
     */
    private void variableAssigmentIdentifier(Variable variable) {
        // existuje promenna v tabulce symbolu?
        if (!this.isInSymbolTable(variable.getValue().toString())) {
            this.getErrorHandler().throwAssignedVariableNotExistError(variable.getValue().toString(), variable.getLine());
        }

        SymbolTableItem assignedValue = this.getSymbolTable().getItem(variable.getValue().toString());

        // kontrola typu
        if (variable.getType() != assignedValue.getVariableType()) {
            this.getErrorHandler().throwErrorMismatchTypesVariable(variable.getName(), variable.getType(), assignedValue.getVariableType(), variable.getLine());
        }

        // generovani instrukce nacti hodnotu na vrchol zasobniku
        this.addInstruction(EInstruction.LOD, this.level, assignedValue.getAddress());
    }

    /**
     * Generovani prirazovacich instrukci
     *
     * @param statementAssigment
     */
    private void generateAssigmentInstruction(StatementAssigment statementAssigment) {
        if (this.isInSymbolTable(statementAssigment.getIdentifier())) {
            SymbolTableItem symbolTableItem = this.getSymbolTable().getItem(statementAssigment.getIdentifier());

            if (symbolTableItem.isConstant()) {
                this.getErrorHandler().throwConstantAssigmentError(symbolTableItem.getName(), statementAssigment.getLine());
            }

            // je zde nutne nastavit navratovy typ metody, jelikoz je ve vyssi vrstve gramatiky (stromu) neznamy
            if (statementAssigment.getExpression().getType() == EExpressionType.METHOD_CALL) {
                ExpressionMethodCall expressionMethodCall = (ExpressionMethodCall) statementAssigment.getExpression();
                EMethodReturnType methodReturnType = symbolTableItem.getVariableType() == EVariableType.INT ? EMethodReturnType.INT : EMethodReturnType.BOOLEAN;
                expressionMethodCall.getMethodCall().setExpectedReturnType(methodReturnType);

                new ExpressionCompiler(expressionMethodCall, symbolTableItem.getVariableType(), this.level).run();
            } else {
                statementAssigment.getExpression().setExpectedReturnType(symbolTableItem.getVariableType());
                new ExpressionCompiler(statementAssigment.getExpression(), symbolTableItem.getVariableType(), this.level).run();
            }

            // generuj instrukce pro nacteni hodnot navrchol zasobniku
            this.addInstruction(EInstruction.STO, this.level - symbolTableItem.getLevel(), symbolTableItem.getAddress());
        } else {
            this.getErrorHandler().throwVariableNotExistsError(statementAssigment.getIdentifier(), statementAssigment.getLine());
        }
    }

    /**
     * Generace podminky pro podminky
     *
     * @param statementIf
     */
    private void generateIfInstructions(StatementIf statementIf) {
        new ExpressionCompiler(statementIf.getExpression(), EVariableType.BOOLEAN, this.level).run();

        int jmcElseRow = this.getInstructionsCounter();

        // skok na else nebo na konec if
        this.addInstruction(EInstruction.JMC, 0, -1); // address is set later

        BlockStatementCompiler blockStatementCompiler = new BlockStatementCompiler(statementIf.getBodyIf(), this.level);
        blockStatementCompiler.setUpInnerBodySettings();
        blockStatementCompiler.run();

        int jmpEndIfStatement = this.getInstructionsCounter();

        // preskoci else blok, pokud existuje
        if (statementIf.hasElse()) {
            this.addInstruction(EInstruction.JMP, 0, -1); //adresa nastavena pozdeji
        }

        // nastav adresu na konec else nebo if bloku
        this.getInstructionsList().get(jmcElseRow).setAddress(this.getInstructionsCounter());

        if (statementIf.hasElse()) {
            BlockStatementCompiler blockStatementCompilerElse = new BlockStatementCompiler(statementIf.getBodyElse(), this.level);
            blockStatementCompilerElse.setUpInnerBodySettings();
            blockStatementCompilerElse.run();

            // nastav adresu na konec
            this.getInstructionsList().get(jmpEndIfStatement).setAddress(this.getInstructionsCounter());
        }
    }

    /**
     * Generace instrukci pro for konstrukci
     *
     * @param statementFor
     */
    private void generateForInstructions(StatementFor statementFor) {
        // existuje for iterator v tabulce symbolu
        if (this.isInSymbolTable(statementFor.getControlFor().getIdentifier())) {
            this.getErrorHandler().throwErrorVariableAlreadyExists(statementFor.getControlFor().getIdentifier(), statementFor.getLine());
        }

        new ExpressionCompiler(statementFor.getControlFor().getFrom(), EVariableType.INT, this.level).run();

        // nacti for iterator ze zasobniku
        SymbolTableItem symbolTableItem = new SymbolTableItem(statementFor.getControlFor().getIdentifier(), this.level, this.getAndIncreaseStackPointer(), 0);
        symbolTableItem.setIsVariable(true);
        symbolTableItem.setVariableType(EVariableType.INT);

        this.getSymbolTable().addItem(symbolTableItem);

        // uloz hodnotu "od"
        this.addInstruction(EInstruction.STO, 0, symbolTableItem.getAddress());

        int startIndex = this.getInstructionsCounter();

        // nacti hodnotu "od"
        this.addInstruction(EInstruction.LOD, 0, symbolTableItem.getAddress());

        // zpracuj hodnotu "do"
        new ExpressionCompiler(statementFor.getControlFor().getTo(), EVariableType.INT, this.level).run();

        // porovnej
        this.addInstruction(EInstruction.OPR, 0, EInstructionOperation.LESS_EQ.getCode());

        int jmcEndIndex = this.getInstructionsCounter();
        // skok pres blok
        this.addInstruction(EInstruction.JMC, 0, -1); // adresa nastavena pozdeji

        // zpracuj telo
        BlockStatementCompiler blockStatementCompiler = new BlockStatementCompiler(statementFor.getBody(), this.level);
        blockStatementCompiler.setUpInnerBodySettings();
        blockStatementCompiler.run();

        // zvetsi iterator for cyklu
        this.addInstruction(EInstruction.LOD, 0, symbolTableItem.getAddress());
        this.addInstruction(EInstruction.LIT, 0, 1);
        this.addInstruction(EInstruction.OPR, 0, EInstructionOperation.PLUS.getCode());
        this.addInstruction(EInstruction.STO, 0, symbolTableItem.getAddress());
        this.addInstruction(EInstruction.JMP, 0, startIndex);

        // nastav adresu skoku
        this.getInstructionsList().get(jmcEndIndex).setAddress(this.getInstructionsCounter());
    }

    /**
     * Generace promennych pro while cyklus
     *
     * @param statementWhile
     */
    private void generateWhileInstructions(StatementWhile statementWhile) {
        int startIndex = this.getInstructionsCounter();
        // zpracuj vyraz
        new ExpressionCompiler(statementWhile.getExpression(), EVariableType.BOOLEAN, this.level).run();

        int jmcIndex = this.getInstructionsCounter();
        this.addInstruction(EInstruction.JMC, 0, -1);

        // Zpracuj telo
        BlockStatementCompiler blockStatementCompiler = new BlockStatementCompiler(statementWhile.getBody(), this.level);
        blockStatementCompiler.setUpInnerBodySettings();
        blockStatementCompiler.run();

        // skok na start
        this.addInstruction(EInstruction.JMP, 0, startIndex);

        // uprava jmc adresy
        this.getInstructionsList().get(jmcIndex).setAddress(this.getInstructionsCounter());
    }

    /**
     * Generace instrsukci pro do-while cyklus
     *
     * @param statementDoWhile
     */
    private void generateDoWhileInstructions(StatementDo statementDoWhile) {
        int startIndex = this.getInstructionsCounter();

        //zpracuj telo
        BlockStatementCompiler blockStatementCompiler = new BlockStatementCompiler(statementDoWhile.getBody(), this.level);
        blockStatementCompiler.setUpInnerBodySettings();
        blockStatementCompiler.run();

        // zpracuj vyraz
        new ExpressionCompiler(statementDoWhile.getExpression(), EVariableType.BOOLEAN, this.level).run();

        int jmcIndex = this.getInstructionsCounter();
        this.addInstruction(EInstruction.JMC, 0, -1);

        // skok na start
        this.addInstruction(EInstruction.JMP, 0, startIndex);

        // uprava jmc adresy
        this.getInstructionsList().get(jmcIndex).setAddress(this.getInstructionsCounter());

    }

    /**
     * Generovani instrukci pro volani metody
     *
     * @param statementMethodCall
     */
    private void generateMethodCallInstructions(StatementMethodCall statementMethodCall) {
        // zavolej kompilator volani metody
        new MethodCallCompiler(statementMethodCall.getMethodCall(), this.level).run();
    }

    /**
     * Generace instrukci pro cyklus before-after
     *
     * @param statementRepeatUntil
     */
    private void generateRepeatUntilInstructions(StatementRepeat statementRepeatUntil) {
        int startAddress = this.getInstructionsCounter();

        // zpracuj telo
        BlockStatementCompiler blockStatementCompiler = new BlockStatementCompiler(statementRepeatUntil.getBody(), this.level);
        blockStatementCompiler.setUpInnerBodySettings();
        blockStatementCompiler.run();

        // zpracuj vyraz
        new ExpressionCompiler(statementRepeatUntil.getExpression(), EVariableType.BOOLEAN, this.level).run();

        // skoc zpet pokud neplati
        this.addInstruction(EInstruction.JMC, 0, startAddress);
    }

    /**
     * Generace instrukci pro konstrukci switch
     *
     * @param statementSwitch
     */
    private void generateSwitchInstructions(StatementSwitch statementSwitch) {
        ArrayList<Integer> jmpIndexes = new ArrayList<>();

        // vytvor switch bloky
        for (Map.Entry<Integer, StatementSwitchBlock> block : statementSwitch.getBlocks().entrySet()) {
            int key = block.getKey();
            StatementSwitchBlock body = block.getValue();

            // zpracus vyraz - switch
            new ExpressionCompiler(statementSwitch.getExpression(), EVariableType.INT, this.level).run();

            this.addInstruction(EInstruction.LIT, 0, key);

            // zkontroluj hodnotu case proti hodnote switch
            this.addInstruction(EInstruction.OPR, 0, EInstructionOperation.EQ.getCode());

            int jmcIndex = this.getInstructionsCounter();
            // skoc na dalsi case, pokud se switch neshoduje
            this.addInstruction(EInstruction.JMC, 0, -1);

            // zpracuj telo
            BlockStatementCompiler blockStatementCompiler = new BlockStatementCompiler(body.getBody(), this.level);
            blockStatementCompiler.setUpInnerBodySettings();
            blockStatementCompiler.run();

            int jmpEndIndex = this.getInstructionsCounter();
            // list skoku na konec
            jmpIndexes.add(jmpEndIndex);
            // skoky na konec
            this.addInstruction(EInstruction.JMP, 0, -1);

            this.getInstructionsList().get(jmcIndex).setAddress(this.getInstructionsCounter());
        }

        // default blok
        if (statementSwitch.getDefaultBlock() != null) {
            BlockStatementCompiler blockStatementCompiler = new BlockStatementCompiler(statementSwitch.getDefaultBlock().getBody(), this.level);
            blockStatementCompiler.setUpInnerBodySettings();
            blockStatementCompiler.run();
        }

        int currentInstructionCounter = this.getInstructionsCounter();

        // inicializace skoku ven ze switch
        for (int index : jmpIndexes) {
            this.getInstructionsList().get(index).setAddress(currentInstructionCounter);
        }
    }

    public void setGenerateMethods(boolean generateMethods) {
        this.generateMethods = generateMethods;
    }

    /**
     * Uprava adresy pro volani metody
     */
    private void initializeMethodsInInstructions() {
        for (Instruction instruction : this.getInstructionsList()) {
            if (instruction.isLaterInitialization()) {
                MethodCall methodCall = instruction.getMethodCall();

                // kontrola jestli metoda existuje
                if (this.isInSymbolTable(methodCall.getIdentifier())) {
                    SymbolTableItem symbolTableItem = this.getSymbolTable().getItem(methodCall.getIdentifier());

                    // kontrola ocekavaneho navratoveho typu
                    if (methodCall.getExpectedReturnType() != symbolTableItem.getMethodReturnType()) {
                        this.getErrorHandler().throwErrorMismatchMethodCallReturnType(methodCall.getIdentifier(),
                                methodCall.getExpectedReturnType(),
                                symbolTableItem.getMethodReturnType(),
                                methodCall.getLine());
                    }

                    // kontrola poctu parametru
                    if (methodCall.getParameters().size() != symbolTableItem.getMethodDeclarationParameters().size()) {
                        this.getErrorHandler().throwErrorInvalidParametersCountError(symbolTableItem.getName(), symbolTableItem.getMethodDeclarationParameters().size(), methodCall.getLine());
                    }

                    // kontrola typu parametru
                    for (int i = 0; i < methodCall.getParameters().size(); i++) {
                        EVariableType callType = methodCall.getParameters().get(i).getVariableType();
                        EVariableType methodType = symbolTableItem.getMethodDeclarationParameters().get(i).getType();
                        if (callType != methodType) {
                            this.getErrorHandler().throwErrorMismatchMethodAndCallParameterTypes(methodCall.getIdentifier(), methodType, callType, i + 1, methodCall.getLine());
                        }
                    }

                    instruction.setAddress(symbolTableItem.getAddress());
                } else {
                    this.getErrorHandler().throwErrorMethodNotExists(methodCall.getIdentifier(), methodCall.getLine());
                }
            }
        }
    }

    /**
     * Odstraneni lokalnich a snizeni zasobniku
     */
    public void deleteLocalVariables() {
        // kontrola, jestli existuje promenna
        if (this.statementData != null) {
            for (String name : this.statementData.getVariableNames()) {
                this.getSymbolTable().getTable().remove(name);
            }

            if (this.createLocalSpaceForLocalVariables && this.statementData.getVariableDeclarationCount() != 0) {
                this.addInstruction(EInstruction.INT, 0, -this.statementData.getVariableDeclarationCount());
            }
        }
    }


    public void setIncreaseStack(boolean increaseStack) {
        this.increaseStack = increaseStack;
    }

    public void setGenerateReturn(boolean generateReturn) {
        this.generateReturn = generateReturn;
    }

    public void setDeleteLocalVariables(boolean deleteLocalVariables) {
        this.deleteLocalVariables = deleteLocalVariables;
    }

    /**
     * Nastaveni pro bloky krome hlavniho bloku
     */
    public void setUpInnerBodySettings() {
        this.setGenerateMethods(false);
        this.setIncreaseStack(false);
        this.setGenerateReturn(false);
        this.setDeleteLocalVariables(true);
        this.setCreateLocalSpaceForLocalVariables(true);
    }

    public void setCreateLocalSpaceForLocalVariables(boolean createLocalSpaceForLocalVariables) {
        this.createLocalSpaceForLocalVariables = createLocalSpaceForLocalVariables;
    }
}
