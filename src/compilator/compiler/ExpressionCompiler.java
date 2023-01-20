package compilator.compiler;

import compilator.enums.*;
import compilator.object.Value;
import compilator.object.expression.*;
import compilator.object.symbolTable.SymbolTableItem;

public class ExpressionCompiler extends BaseCompiler {
    /**
     * Výraz určený pro zpracování
     */
    private final Expression expression;

    /**
     * Hloubka výrazu
     */
    private int level;

    /**
     * Návratový typ metody
     */
    private EMethodReturnType methodReturnType;

    /**
     * Předpokládaný návratový typ
     */
    private EVariableType resultType;

    public ExpressionCompiler(Expression expression, int level) {
        this.expression = expression;
        this.level = level;
    }

    public ExpressionCompiler(Expression expression, EVariableType resultType, int level) {
        this.expression = expression;
        this.resultType = resultType;
        this.level = level;
    }

    public ExpressionCompiler(Expression expression, EMethodReturnType methodReturnType, int level) {

        this.expression = expression;
        this.methodReturnType = methodReturnType;
        this.level = level;
    }

    public EVariableType runReturnType() {
        return this.processExpression(this.expression);
    }

    /**
     * Zpracovani vyrazu do instrukci
     */
    public void run() {
        EVariableType type = this.processExpression(this.expression);

        if (this.resultType != null && type != null) {
            // pokud se ocekavany navratovy typ neshoduje s vyslednym typem
            if (type != this.resultType) {
                this.getErrorHandler().throwErrorMismatchExpressionResult(this.resultType.toString(), type.toString(), this.expression.getLine());
            }
        }
    }

    /**
     * Zpracovani vyrazu volaneho rekurzivne
     *
     * @param expression
     * @return
     */
    private EVariableType processExpression(Expression expression) {
        EVariableType type = null;

        switch (expression.getType()) {
            case IDENTIFIER:
                type = this.generateIdentifierInstructions((ExpressionIdentifier) expression);
                break;
            case VALUE:
                type = this.generateValueInstructions((ExpressionValue) expression);
                break;
            case MULTIPLICATION:
                type = this.generateMultiplicationInstructions((ExpressionMultiplication) expression);
                break;
            case ADDITIVE:
                type = this.generateAdditiveInstructions((ExpressionAdditive) expression);
                break;
            case RELATIONAL:
                type = this.generateRelationalInstructions((ExpressionRelational) expression);
                break;
            case LOGICAL:
                type = this.generateLogicalInstructions((ExpressionLogical) expression);
                break;
            case NEGATION:
                type = this.generateNegationInstructions((ExpressionNegation) expression);
                break;
            case PAR:
                type = this.generateParInstructions((ExpressionPar) expression);
                break;
            case METHOD_CALL:
                type = this.generateMethodCallInstructions((ExpressionMethodCall) expression);
                break;
            case MINUS:
                type = this.generateMinusInstructions((ExpressionMinus) expression);
                break;
            case PLUS:
                type = this.generatePlusInstructions((ExpressionPlus) expression);
        }

        return type;
    }

    /**
     * Vyraz identifikator
     *
     * @param expression
     * @return
     */
    private EVariableType generateIdentifierInstructions(ExpressionIdentifier expression) {
        String identifier = expression.getValue().toString();

        if (this.isInSymbolTable(identifier)) {
            SymbolTableItem item = this.getSymbolTable().getItem(identifier);
            this.addInstruction(EInstruction.LOD, this.level - item.getLevel(), item.getAddress());

            return item.getVariableType();
        } else {
            this.getErrorHandler().throwVariableNotExistsError(identifier, expression.getLine());
        }

        return null;
    }

    /**
     * Konkretni hodnota vyrazu
     *
     * @param expression
     * @return
     */
    private EVariableType generateValueInstructions(ExpressionValue expression) {
        Value value = expression.getValue();

        if (expression.getVariableType() == EVariableType.INT) {
            this.addInstruction(EInstruction.LIT, 0, value.toInt());
            return EVariableType.INT;
        } else if (expression.getVariableType() == EVariableType.BOOLEAN) {
            this.addInstruction(EInstruction.LIT, 0, value.toBooleanAsInt());
            return EVariableType.BOOLEAN;
        }

        return null;
    }

    /**
     * Vyraz nasobeni
     *
     * @param expression
     * @return
     */
    private EVariableType generateMultiplicationInstructions(ExpressionMultiplication expression) {
        EVariableType leftExpression = this.processExpression(expression.getLeftExpression());
        EVariableType rightExpression = this.processExpression(expression.getRightExpression());

        checkVariableTypes(leftExpression, rightExpression, EVariableType.INT);

        this.addInstruction(EInstruction.OPR, 0, expression.getOperatorCode());

        return EVariableType.INT;
    }

    /**
     * Vyraz scitani
     *
     * @param expression
     * @return
     */
    private EVariableType generateAdditiveInstructions(ExpressionAdditive expression) {
        EVariableType leftExpression = this.processExpression(expression.getLeftExpression());
        EVariableType rightExpression = this.processExpression(expression.getRightExpression());

        checkVariableTypes(leftExpression, rightExpression, EVariableType.INT);

        this.addInstruction(EInstruction.OPR, 0, expression.getOperatorCode());

        return EVariableType.INT;
    }

    /**
     * Relacni vyraz
     *
     * @param expression
     * @return
     */
    private EVariableType generateRelationalInstructions(ExpressionRelational expression) {
        EVariableType leftExpression = this.processExpression(expression.getLeftExpression());
        EVariableType rightExpression = this.processExpression(expression.getRightExpression());

        checkVariableTypes(leftExpression, rightExpression, EVariableType.INT);

        this.addInstruction(EInstruction.OPR, 0, expression.getOperatorCode());

        return EVariableType.BOOLEAN;
    }

    /**
     * Logicky vyraz
     *
     * @param expression
     * @return
     */
    private EVariableType generateLogicalInstructions(ExpressionLogical expression) {
        EVariableType leftExpression = this.processExpression(expression.getLeftExpression());
        EVariableType rightExpression = this.processExpression(expression.getRightExpression());

        checkVariableTypes(leftExpression, rightExpression, EVariableType.BOOLEAN);
        if (expression.getOperatorLogical() == EOperatorLogical.AND) {
            this.addInstruction(EInstruction.OPR, 0, EInstructionOperation.MULTIPLY.getCode());
            this.addInstruction(EInstruction.LIT, 0, 1);
            this.addInstruction(EInstruction.OPR, 0, EInstructionOperation.EQ.getCode());
        } else {
            this.addInstruction(EInstruction.OPR, 0, EInstructionOperation.PLUS.getCode());
            this.addInstruction(EInstruction.LIT, 0, 0);
            this.addInstruction(EInstruction.OPR, 0, EInstructionOperation.GREATER.getCode());
        }

        return EVariableType.BOOLEAN;
    }

    /**
     * Negace vyrazu
     *
     * @param expression
     * @return
     */
    private EVariableType generateNegationInstructions(ExpressionNegation expression) {
        // nasobna logicka negace
        if (expression.getType() == expression.getExpression().getType()) {
            this.getErrorHandler().throwArithmeticError(EOperatorLogical.NEGATION.toString(), expression.getExpression().getLine());
        }

        EVariableType expressionType = this.processExpression(expression.getExpression());

        this.checkVariableType(expressionType, EVariableType.BOOLEAN);

        this.addInstruction(EInstruction.LIT, 0, 0);
        this.addInstruction(EInstruction.OPR, 0, EInstructionOperation.EQ.getCode());

        return EVariableType.BOOLEAN;
    }

    /**
     * Negace vyrazu
     *
     * @param expression
     * @return
     */
    private EVariableType generateMinusInstructions(ExpressionMinus expression) {
        // nasobna ciselna negace
        if (expression.getType() == expression.getExpression().getType()) {
            this.getErrorHandler().throwArithmeticError(EOperatorAdditive.MINUS.toString(), expression.getExpression().getLine());
        }

        EVariableType expressionType = this.processExpression(expression.getExpression());

        this.checkVariableType(expressionType, EVariableType.INT);

        this.addInstruction(EInstruction.LIT, 0, -1);
        this.addInstruction(EInstruction.OPR, 0, EInstructionOperation.MULTIPLY.getCode());

        return EVariableType.INT;
    }

    /**
     * Vyraz scitani
     *
     * @param expression
     * @return
     */
    private EVariableType generatePlusInstructions(ExpressionPlus expression) {
        // nasobna ciselna negace
        if (expression.getType() == expression.getExpression().getType()) {
            this.getErrorHandler().throwArithmeticError(EOperatorAdditive.PLUS.toString(), expression.getExpression().getLine());
        }

        EVariableType expressionType = this.processExpression(expression.getExpression());

        this.checkVariableType(expressionType, EVariableType.INT);

        return EVariableType.INT;
    }

    /**
     * Par vyraz
     *
     * @param expression
     * @return
     */
    private EVariableType generateParInstructions(ExpressionPar expression) {
        return this.processExpression(expression.getExpression());
    }

    /**
     * Vyraz volani metody
     *
     * @param expression
     * @return
     */
    private EVariableType generateMethodCallInstructions(ExpressionMethodCall expression) {
        if (expression.getMethodCall().getExpectedReturnType() == EMethodReturnType.VOID) {
            this.getErrorHandler().throwVoidMethodExpressionError(expression.getMethodCall().getIdentifier(), expression.getLine());
        }

        // kontrola, jestli k funkci existuje prototyp
        if (!this.getMethodPrototypes().containsKey(expression.getMethodCall().getIdentifier())) {
            this.getErrorHandler().throwErrorMethodNotExists(expression.getMethodCall().getIdentifier(), expression.getMethodCall().getLine());
        }

        // nastav navratovy typ z prototypu funkce
        expression.getMethodCall().setExpectedReturnType(this.getMethodPrototypes().get(expression.getMethodCall().getIdentifier()).getMethodReturnType());

        // zkompiluj volani metody
        new MethodCallCompiler(expression.getMethodCall(), this.level).run();

        return this.getMethodPrototype().get(expression.getMethodCall().getIdentifier()).convertReturnTypeToVariableType();
    }

    /**
     * Kontrola navratovych typu
     *
     * @param type1
     * @param type2
     * @param expected
     */
    private void checkVariableTypes(EVariableType type1, EVariableType type2, EVariableType expected) {
        if (type1 != expected || type2 != expected) {
            this.getErrorHandler().throwErrorMismatchTypesExpression(expected.toString(), type1, type2, this.expression.getLine());
        }
    }

    /**
     * Kontrola zda je navratovy typ stejny jako predikovany
     *
     * @param type
     * @param expected
     */
    private void checkVariableType(EVariableType type, EVariableType expected) {
        if (type != expected) {
            this.getErrorHandler().throwErrorMismatchExpressionResult(expected.toString(), type.toString(), this.expression.getLine());
        }
    }

    public EMethodReturnType getMethodReturnType() {
        return methodReturnType;
    }

    public void setMethodReturnType(EMethodReturnType methodReturnType) {
        this.methodReturnType = methodReturnType;
    }
}
