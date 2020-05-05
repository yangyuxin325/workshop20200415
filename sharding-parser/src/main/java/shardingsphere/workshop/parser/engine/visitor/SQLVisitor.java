
package shardingsphere.workshop.parser.engine.visitor;

import autogen.MySQLStatementBaseVisitor;
import autogen.MySQLStatementParser;
import autogen.MySQLStatementParser.IdentifierContext;
import autogen.MySQLStatementParser.SchemaNameContext;
import autogen.MySQLStatementParser.UseContext;
import shardingsphere.workshop.parser.statement.ASTNode;
import shardingsphere.workshop.parser.statement.segment.*;
import shardingsphere.workshop.parser.statement.statement.SelectStatement;
import shardingsphere.workshop.parser.statement.statement.UseStatement;

import java.util.ArrayList;
import java.util.List;

/**
 * MySQL visitor.
 */
public final class SQLVisitor extends MySQLStatementBaseVisitor<ASTNode> {
    
    @Override
    public ASTNode visitUse(final UseContext ctx) {
        SchemeNameSegment schemeName = (SchemeNameSegment) visit(ctx.schemaName());
        return new UseStatement(schemeName);
    }

    @Override
    public ASTNode visitSelect(MySQLStatementParser.SelectContext ctx) {
        SelectColumnNamesSegment columnNames = (SelectColumnNamesSegment) visit(ctx.selectColumnNames());
        FromClauseSegment fromClause = (FromClauseSegment) visit(ctx.fromClause());
        WhereClauseSegment whereClause = (WhereClauseSegment) visit(ctx.whereClause());
        return new SelectStatement(columnNames, fromClause, whereClause);
    }

    @Override
    public ASTNode visitSchemaName(final SchemaNameContext ctx) {
        IdentifierSegment identifier = (IdentifierSegment) visit(ctx.identifier());
        return new SchemeNameSegment(identifier);
    }
    
    @Override
    public ASTNode visitIdentifier(final IdentifierContext ctx) {
        return new IdentifierSegment(ctx.getText());
    }

    @Override
    public ASTNode visitColumnName(MySQLStatementParser.ColumnNameContext ctx) {
        IdentifierSegment identifier = (IdentifierSegment) visit(ctx.identifier());
        return new ColumnNameSegment(identifier);
    }

    @Override
    public ASTNode visitSelectColumnNames(MySQLStatementParser.SelectColumnNamesContext ctx) {
        List<ColumnNameSegment> columnNameSegmentList = new ArrayList<>();
        for (MySQLStatementParser.ColumnNameContext columnNameContext : ctx.columnName()) {
            ColumnNameSegment columnNameSegment = (ColumnNameSegment) visit(columnNameContext);
            columnNameSegmentList.add(columnNameSegment);
        }
        return new SelectColumnNamesSegment(columnNameSegmentList);
    }

    @Override
    public ASTNode visitTableName(MySQLStatementParser.TableNameContext ctx) {
        IdentifierSegment identifier = (IdentifierSegment) visit(ctx.identifier());
        return new TableNameSegment(identifier);
    }

    @Override
    public ASTNode visitFromClause(MySQLStatementParser.FromClauseContext ctx) {
        TableNameSegment tableNameSegment = (TableNameSegment) visit(ctx.tableName());
        return new FromClauseSegment(tableNameSegment);
    }

    @Override
    public ASTNode visitColumnValue(MySQLStatementParser.ColumnValueContext ctx) {
        IdentifierSegment identifier = (IdentifierSegment) visit(ctx.identifier());
        return new ColumnValueSegment(identifier);
    }

    @Override
    public ASTNode visitWhereClause(MySQLStatementParser.WhereClauseContext ctx) {
        ColumnNameSegment columnNameSegment = (ColumnNameSegment) visit(ctx.columnName());
        ColumnValueSegment columnValueSegment = (ColumnValueSegment) visit(ctx.columnValue());
        return new WhereClauseSegment(columnNameSegment, columnValueSegment);
    }
}
