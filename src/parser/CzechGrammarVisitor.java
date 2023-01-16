package parser;// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CzechGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CzechGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CzechGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CzechGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CzechGrammarParser#methodReturnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReturnType(CzechGrammarParser.MethodReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CzechGrammarParser#booleanValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanValue(CzechGrammarParser.BooleanValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CzechGrammarParser#possibleTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPossibleTypes(CzechGrammarParser.PossibleTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CzechGrammarParser#decimalSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalSymbol(CzechGrammarParser.DecimalSymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link CzechGrammarParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(CzechGrammarParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CzechGrammarParser#possibleValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPossibleValues(CzechGrammarParser.PossibleValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CzechGrammarParser#decimalVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalVariable(CzechGrammarParser.DecimalVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link CzechGrammarParser#decimalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalValue(CzechGrammarParser.DecimalValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CzechGrammarParser#boolVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolVariable(CzechGrammarParser.BoolVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link CzechGrammarParser#boolValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolValue(CzechGrammarParser.BoolValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CzechGrammarParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(CzechGrammarParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CzechGrammarParser#constVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstVariableDeclaration(CzechGrammarParser.ConstVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CzechGrammarParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(CzechGrammarParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CzechGrammarParser#paralelDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParalelDeclaration(CzechGrammarParser.ParalelDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CzechGrammarParser#variableAssigment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssigment(CzechGrammarParser.VariableAssigmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CzechGrammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(CzechGrammarParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CzechGrammarParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(CzechGrammarParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CzechGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(CzechGrammarParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CzechGrammarParser#blockBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockBody(CzechGrammarParser.BlockBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementIf}
	 * labeled alternative in {@link CzechGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementIf(CzechGrammarParser.StatementIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementFor}
	 * labeled alternative in {@link CzechGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementFor(CzechGrammarParser.StatementForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementWhile}
	 * labeled alternative in {@link CzechGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWhile(CzechGrammarParser.StatementWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementDo}
	 * labeled alternative in {@link CzechGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementDo(CzechGrammarParser.StatementDoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementSwitch}
	 * labeled alternative in {@link CzechGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementSwitch(CzechGrammarParser.StatementSwitchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementRepeat}
	 * labeled alternative in {@link CzechGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementRepeat(CzechGrammarParser.StatementRepeatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementMethodCall}
	 * labeled alternative in {@link CzechGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementMethodCall(CzechGrammarParser.StatementMethodCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementAssigment}
	 * labeled alternative in {@link CzechGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementAssigment(CzechGrammarParser.StatementAssigmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementVariableDeclaration}
	 * labeled alternative in {@link CzechGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementVariableDeclaration(CzechGrammarParser.StatementVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CzechGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CzechGrammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprNeg}
	 * labeled alternative in {@link CzechGrammarParser#expressionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNeg(CzechGrammarParser.ExprNegContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprPlus}
	 * labeled alternative in {@link CzechGrammarParser#expressionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPlus(CzechGrammarParser.ExprPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprAdditive}
	 * labeled alternative in {@link CzechGrammarParser#expressionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAdditive(CzechGrammarParser.ExprAdditiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprPar}
	 * labeled alternative in {@link CzechGrammarParser#expressionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPar(CzechGrammarParser.ExprParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprMinus}
	 * labeled alternative in {@link CzechGrammarParser#expressionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMinus(CzechGrammarParser.ExprMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprRelational}
	 * labeled alternative in {@link CzechGrammarParser#expressionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprRelational(CzechGrammarParser.ExprRelationalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprIdentifier}
	 * labeled alternative in {@link CzechGrammarParser#expressionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprIdentifier(CzechGrammarParser.ExprIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprPossibleValue}
	 * labeled alternative in {@link CzechGrammarParser#expressionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPossibleValue(CzechGrammarParser.ExprPossibleValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprMethodCall}
	 * labeled alternative in {@link CzechGrammarParser#expressionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMethodCall(CzechGrammarParser.ExprMethodCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprLogical}
	 * labeled alternative in {@link CzechGrammarParser#expressionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLogical(CzechGrammarParser.ExprLogicalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprMultipli}
	 * labeled alternative in {@link CzechGrammarParser#expressionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMultipli(CzechGrammarParser.ExprMultipliContext ctx);
	/**
	 * Visit a parse tree produced by {@link CzechGrammarParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(CzechGrammarParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link CzechGrammarParser#switchBlockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatement(CzechGrammarParser.SwitchBlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CzechGrammarParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(CzechGrammarParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CzechGrammarParser#methodParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodParameter(CzechGrammarParser.MethodParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CzechGrammarParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(CzechGrammarParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CzechGrammarParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(CzechGrammarParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link CzechGrammarParser#methodCallParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCallParameter(CzechGrammarParser.MethodCallParameterContext ctx);
}