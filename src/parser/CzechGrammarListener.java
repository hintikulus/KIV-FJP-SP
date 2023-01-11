package parser;// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CzechGrammarParser}.
 */
public interface CzechGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CzechGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CzechGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CzechGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CzechGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CzechGrammarParser#methodReturnType}.
	 * @param ctx the parse tree
	 */
	void enterMethodReturnType(CzechGrammarParser.MethodReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CzechGrammarParser#methodReturnType}.
	 * @param ctx the parse tree
	 */
	void exitMethodReturnType(CzechGrammarParser.MethodReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CzechGrammarParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanValue(CzechGrammarParser.BooleanValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CzechGrammarParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanValue(CzechGrammarParser.BooleanValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CzechGrammarParser#possibleTypes}.
	 * @param ctx the parse tree
	 */
	void enterPossibleTypes(CzechGrammarParser.PossibleTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CzechGrammarParser#possibleTypes}.
	 * @param ctx the parse tree
	 */
	void exitPossibleTypes(CzechGrammarParser.PossibleTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CzechGrammarParser#decimalSymbol}.
	 * @param ctx the parse tree
	 */
	void enterDecimalSymbol(CzechGrammarParser.DecimalSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CzechGrammarParser#decimalSymbol}.
	 * @param ctx the parse tree
	 */
	void exitDecimalSymbol(CzechGrammarParser.DecimalSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CzechGrammarParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(CzechGrammarParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CzechGrammarParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(CzechGrammarParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CzechGrammarParser#possibleValues}.
	 * @param ctx the parse tree
	 */
	void enterPossibleValues(CzechGrammarParser.PossibleValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CzechGrammarParser#possibleValues}.
	 * @param ctx the parse tree
	 */
	void exitPossibleValues(CzechGrammarParser.PossibleValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CzechGrammarParser#decimalVariable}.
	 * @param ctx the parse tree
	 */
	void enterDecimalVariable(CzechGrammarParser.DecimalVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CzechGrammarParser#decimalVariable}.
	 * @param ctx the parse tree
	 */
	void exitDecimalVariable(CzechGrammarParser.DecimalVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CzechGrammarParser#decimalValue}.
	 * @param ctx the parse tree
	 */
	void enterDecimalValue(CzechGrammarParser.DecimalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CzechGrammarParser#decimalValue}.
	 * @param ctx the parse tree
	 */
	void exitDecimalValue(CzechGrammarParser.DecimalValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CzechGrammarParser#boolVariable}.
	 * @param ctx the parse tree
	 */
	void enterBoolVariable(CzechGrammarParser.BoolVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CzechGrammarParser#boolVariable}.
	 * @param ctx the parse tree
	 */
	void exitBoolVariable(CzechGrammarParser.BoolVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CzechGrammarParser#boolValue}.
	 * @param ctx the parse tree
	 */
	void enterBoolValue(CzechGrammarParser.BoolValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CzechGrammarParser#boolValue}.
	 * @param ctx the parse tree
	 */
	void exitBoolValue(CzechGrammarParser.BoolValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CzechGrammarParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(CzechGrammarParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CzechGrammarParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(CzechGrammarParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CzechGrammarParser#constVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstVariableDeclaration(CzechGrammarParser.ConstVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CzechGrammarParser#constVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstVariableDeclaration(CzechGrammarParser.ConstVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CzechGrammarParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(CzechGrammarParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CzechGrammarParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(CzechGrammarParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CzechGrammarParser#paralelDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParalelDeclaration(CzechGrammarParser.ParalelDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CzechGrammarParser#paralelDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParalelDeclaration(CzechGrammarParser.ParalelDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CzechGrammarParser#variableAssigment}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssigment(CzechGrammarParser.VariableAssigmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CzechGrammarParser#variableAssigment}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssigment(CzechGrammarParser.VariableAssigmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CzechGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CzechGrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CzechGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CzechGrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CzechGrammarParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(CzechGrammarParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CzechGrammarParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(CzechGrammarParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CzechGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(CzechGrammarParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CzechGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(CzechGrammarParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CzechGrammarParser#blockBody}.
	 * @param ctx the parse tree
	 */
	void enterBlockBody(CzechGrammarParser.BlockBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CzechGrammarParser#blockBody}.
	 * @param ctx the parse tree
	 */
	void exitBlockBody(CzechGrammarParser.BlockBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementIf}
	 * labeled alternative in {@link CzechGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementIf(CzechGrammarParser.StatementIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementIf}
	 * labeled alternative in {@link CzechGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementIf(CzechGrammarParser.StatementIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementFor}
	 * labeled alternative in {@link CzechGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementFor(CzechGrammarParser.StatementForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementFor}
	 * labeled alternative in {@link CzechGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementFor(CzechGrammarParser.StatementForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementWhile}
	 * labeled alternative in {@link CzechGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementWhile(CzechGrammarParser.StatementWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementWhile}
	 * labeled alternative in {@link CzechGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementWhile(CzechGrammarParser.StatementWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementDo}
	 * labeled alternative in {@link CzechGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementDo(CzechGrammarParser.StatementDoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementDo}
	 * labeled alternative in {@link CzechGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementDo(CzechGrammarParser.StatementDoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementSwitch}
	 * labeled alternative in {@link CzechGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementSwitch(CzechGrammarParser.StatementSwitchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementSwitch}
	 * labeled alternative in {@link CzechGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementSwitch(CzechGrammarParser.StatementSwitchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementRepeat}
	 * labeled alternative in {@link CzechGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementRepeat(CzechGrammarParser.StatementRepeatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementRepeat}
	 * labeled alternative in {@link CzechGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementRepeat(CzechGrammarParser.StatementRepeatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementMethodCall}
	 * labeled alternative in {@link CzechGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementMethodCall(CzechGrammarParser.StatementMethodCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementMethodCall}
	 * labeled alternative in {@link CzechGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementMethodCall(CzechGrammarParser.StatementMethodCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementAssigment}
	 * labeled alternative in {@link CzechGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementAssigment(CzechGrammarParser.StatementAssigmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementAssigment}
	 * labeled alternative in {@link CzechGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementAssigment(CzechGrammarParser.StatementAssigmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementVariableDeclaration}
	 * labeled alternative in {@link CzechGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementVariableDeclaration(CzechGrammarParser.StatementVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementVariableDeclaration}
	 * labeled alternative in {@link CzechGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementVariableDeclaration(CzechGrammarParser.StatementVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CzechGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CzechGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CzechGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CzechGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprNeg}
	 * labeled alternative in {@link CzechGrammarParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void enterExprNeg(CzechGrammarParser.ExprNegContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprNeg}
	 * labeled alternative in {@link CzechGrammarParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void exitExprNeg(CzechGrammarParser.ExprNegContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprPlus}
	 * labeled alternative in {@link CzechGrammarParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void enterExprPlus(CzechGrammarParser.ExprPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprPlus}
	 * labeled alternative in {@link CzechGrammarParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void exitExprPlus(CzechGrammarParser.ExprPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprAdditive}
	 * labeled alternative in {@link CzechGrammarParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void enterExprAdditive(CzechGrammarParser.ExprAdditiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprAdditive}
	 * labeled alternative in {@link CzechGrammarParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void exitExprAdditive(CzechGrammarParser.ExprAdditiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprPar}
	 * labeled alternative in {@link CzechGrammarParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void enterExprPar(CzechGrammarParser.ExprParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprPar}
	 * labeled alternative in {@link CzechGrammarParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void exitExprPar(CzechGrammarParser.ExprParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprMinus}
	 * labeled alternative in {@link CzechGrammarParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void enterExprMinus(CzechGrammarParser.ExprMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprMinus}
	 * labeled alternative in {@link CzechGrammarParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void exitExprMinus(CzechGrammarParser.ExprMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprRelational}
	 * labeled alternative in {@link CzechGrammarParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void enterExprRelational(CzechGrammarParser.ExprRelationalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprRelational}
	 * labeled alternative in {@link CzechGrammarParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void exitExprRelational(CzechGrammarParser.ExprRelationalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprIdentifier}
	 * labeled alternative in {@link CzechGrammarParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void enterExprIdentifier(CzechGrammarParser.ExprIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprIdentifier}
	 * labeled alternative in {@link CzechGrammarParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void exitExprIdentifier(CzechGrammarParser.ExprIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprPossibleValue}
	 * labeled alternative in {@link CzechGrammarParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void enterExprPossibleValue(CzechGrammarParser.ExprPossibleValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprPossibleValue}
	 * labeled alternative in {@link CzechGrammarParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void exitExprPossibleValue(CzechGrammarParser.ExprPossibleValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprMethodCall}
	 * labeled alternative in {@link CzechGrammarParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void enterExprMethodCall(CzechGrammarParser.ExprMethodCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprMethodCall}
	 * labeled alternative in {@link CzechGrammarParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void exitExprMethodCall(CzechGrammarParser.ExprMethodCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprLogical}
	 * labeled alternative in {@link CzechGrammarParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void enterExprLogical(CzechGrammarParser.ExprLogicalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprLogical}
	 * labeled alternative in {@link CzechGrammarParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void exitExprLogical(CzechGrammarParser.ExprLogicalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprMultipli}
	 * labeled alternative in {@link CzechGrammarParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void enterExprMultipli(CzechGrammarParser.ExprMultipliContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprMultipli}
	 * labeled alternative in {@link CzechGrammarParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void exitExprMultipli(CzechGrammarParser.ExprMultipliContext ctx);
	/**
	 * Enter a parse tree produced by {@link CzechGrammarParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(CzechGrammarParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link CzechGrammarParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(CzechGrammarParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link CzechGrammarParser#switchBlockStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatement(CzechGrammarParser.SwitchBlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CzechGrammarParser#switchBlockStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatement(CzechGrammarParser.SwitchBlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CzechGrammarParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(CzechGrammarParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CzechGrammarParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(CzechGrammarParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CzechGrammarParser#methodParameter}.
	 * @param ctx the parse tree
	 */
	void enterMethodParameter(CzechGrammarParser.MethodParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CzechGrammarParser#methodParameter}.
	 * @param ctx the parse tree
	 */
	void exitMethodParameter(CzechGrammarParser.MethodParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CzechGrammarParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(CzechGrammarParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CzechGrammarParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(CzechGrammarParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CzechGrammarParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(CzechGrammarParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CzechGrammarParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(CzechGrammarParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CzechGrammarParser#methodCallParameter}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallParameter(CzechGrammarParser.MethodCallParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CzechGrammarParser#methodCallParameter}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallParameter(CzechGrammarParser.MethodCallParameterContext ctx);
}