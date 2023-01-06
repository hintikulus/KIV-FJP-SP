// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link czech_grammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface czech_grammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link czech_grammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(czech_grammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link czech_grammarParser#functionReturnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionReturnType(czech_grammarParser.FunctionReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link czech_grammarParser#booleanValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanValue(czech_grammarParser.BooleanValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link czech_grammarParser#varType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarType(czech_grammarParser.VarTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link czech_grammarParser#numberSignChar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberSignChar(czech_grammarParser.NumberSignCharContext ctx);
	/**
	 * Visit a parse tree produced by {@link czech_grammarParser#decimalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalValue(czech_grammarParser.DecimalValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link czech_grammarParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(czech_grammarParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link czech_grammarParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(czech_grammarParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link czech_grammarParser#paralelDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParalelDeclaration(czech_grammarParser.ParalelDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link czech_grammarParser#decimalVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalVariable(czech_grammarParser.DecimalVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link czech_grammarParser#decimalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalExpression(czech_grammarParser.DecimalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link czech_grammarParser#booleanVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanVariable(czech_grammarParser.BooleanVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link czech_grammarParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpression(czech_grammarParser.BooleanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link czech_grammarParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(czech_grammarParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link czech_grammarParser#constVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstVariableDeclaration(czech_grammarParser.ConstVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link czech_grammarParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(czech_grammarParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link czech_grammarParser#variableAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssignment(czech_grammarParser.VariableAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link czech_grammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(czech_grammarParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link czech_grammarParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(czech_grammarParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link czech_grammarParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(czech_grammarParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link czech_grammarParser#blockBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockBody(czech_grammarParser.BlockBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementIf}
	 * labeled alternative in {@link czech_grammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementIf(czech_grammarParser.StatementIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementWhile}
	 * labeled alternative in {@link czech_grammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWhile(czech_grammarParser.StatementWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementDoWhile}
	 * labeled alternative in {@link czech_grammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementDoWhile(czech_grammarParser.StatementDoWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementFor}
	 * labeled alternative in {@link czech_grammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementFor(czech_grammarParser.StatementForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementMethodCall}
	 * labeled alternative in {@link czech_grammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementMethodCall(czech_grammarParser.StatementMethodCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementAssigment}
	 * labeled alternative in {@link czech_grammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementAssigment(czech_grammarParser.StatementAssigmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementVariableDeclaration}
	 * labeled alternative in {@link czech_grammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementVariableDeclaration(czech_grammarParser.StatementVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code switchStatement}
	 * labeled alternative in {@link czech_grammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(czech_grammarParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementReturn}
	 * labeled alternative in {@link czech_grammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementReturn(czech_grammarParser.StatementReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementBreak}
	 * labeled alternative in {@link czech_grammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementBreak(czech_grammarParser.StatementBreakContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprNeg}
	 * labeled alternative in {@link czech_grammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNeg(czech_grammarParser.ExprNegContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprPlus}
	 * labeled alternative in {@link czech_grammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPlus(czech_grammarParser.ExprPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprAdditive}
	 * labeled alternative in {@link czech_grammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAdditive(czech_grammarParser.ExprAdditiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ternalOperator}
	 * labeled alternative in {@link czech_grammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernalOperator(czech_grammarParser.TernalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprPar}
	 * labeled alternative in {@link czech_grammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPar(czech_grammarParser.ExprParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprMinus}
	 * labeled alternative in {@link czech_grammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMinus(czech_grammarParser.ExprMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprRelational}
	 * labeled alternative in {@link czech_grammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprRelational(czech_grammarParser.ExprRelationalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprIdentifier}
	 * labeled alternative in {@link czech_grammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprIdentifier(czech_grammarParser.ExprIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprPossibleValue}
	 * labeled alternative in {@link czech_grammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPossibleValue(czech_grammarParser.ExprPossibleValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprMethodCall}
	 * labeled alternative in {@link czech_grammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMethodCall(czech_grammarParser.ExprMethodCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprLogical}
	 * labeled alternative in {@link czech_grammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLogical(czech_grammarParser.ExprLogicalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprMultipli}
	 * labeled alternative in {@link czech_grammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMultipli(czech_grammarParser.ExprMultipliContext ctx);
	/**
	 * Visit a parse tree produced by {@link czech_grammarParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(czech_grammarParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link czech_grammarParser#methodParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodParameter(czech_grammarParser.MethodParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link czech_grammarParser#elsestatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsestatement(czech_grammarParser.ElsestatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link czech_grammarParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(czech_grammarParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link czech_grammarParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(czech_grammarParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link czech_grammarParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(czech_grammarParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link czech_grammarParser#switchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlock(czech_grammarParser.SwitchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link czech_grammarParser#caseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseBlock(czech_grammarParser.CaseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link czech_grammarParser#defaultBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultBlock(czech_grammarParser.DefaultBlockContext ctx);
}