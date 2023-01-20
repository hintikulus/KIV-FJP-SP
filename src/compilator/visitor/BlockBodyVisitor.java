package compilator.visitor;

import compilator.model.BlockStatement;
import compilator.model.StatementData;
import compilator.model.statement.Statement;
import parser.CzechGrammarBaseVisitor;
import parser.CzechGrammarParser;

import java.util.ArrayList;
import java.util.List;

public class BlockBodyVisitor extends CzechGrammarBaseVisitor<BlockStatement> {
    /**
     * Visitor pro BlockBody
     *
     * @param ctx block body kontext
     * @return interni struktura BlockStatement
     */
    public BlockStatement visitBlockBody(CzechGrammarParser.BlockBodyContext ctx) {
        if (ctx == null) {
            return null;
        }

        List<Statement> statements = this.getStatements(ctx.statement());

        return new BlockStatement(new StatementData(statements), null);
    }

    /**
     * Zpracuje vsechny statementy blockBody();
     *
     * @return seznam statementu
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
}