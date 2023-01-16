package compilator.visitor;

import compilator.object.BlockStatement;
import compilator.object.StatementData;
import compilator.object.method.Method;
import compilator.object.statement.Statement;
import parser.CzechGrammarBaseVisitor;
import parser.CzechGrammarParser;

import java.util.ArrayList;
import java.util.List;

public class BlockStatementVisitor extends CzechGrammarBaseVisitor<BlockStatement> {

    /**
     * Visitor for BlockStatement()
     *
     * @param ctx BlockStatement context
     * @return internal BlockStatement structure
     */
    public BlockStatement visitBlockStatement(CzechGrammarParser.BlockStatementContext ctx) {
        List<Statement> statements = this.getStatements(ctx.statement());
        List<Method> methods = this.getMethods(ctx.methodDeclaration());

        return new BlockStatement(new StatementData(statements), methods);
    }

    /**
     * Processes all statements in BlockStatement();
     *
     * @param statementContextList list of statements
     * @return internal list of statements
     */
    private List<Statement> getStatements(List<CzechGrammarParser.StatementContext> statementContextList) {
        List<Statement> statements = new ArrayList<>();
        Statement statement;

        for (CzechGrammarParser.StatementContext statementContext : statementContextList) {
            statement = new StatementVisitor().visit(statementContext);
            statements.add(statement);
        }

        return statements;
    }

    /**
     * Processes all methods in BlockStatement();
     *
     * @param methodDeclarationContextList list of methods
     * @return internal list of methods
     */
    private List<Method> getMethods(List<CzechGrammarParser.MethodDeclarationContext> methodDeclarationContextList) {
        List<Method> methods = new ArrayList<>();
        Method method;

        for (CzechGrammarParser.MethodDeclarationContext methodDeclarationContext : methodDeclarationContextList) {
            method = new MethodDeclarationVisitor().visit(methodDeclarationContext);
            methods.add(method);
        }

        return methods;
    }

}
