// Generated from /Users/yangyuxin/IdeaProjects/workshop20200415/sharding-parser/src/main/antlr4/imports/SQLStatement.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SQLStatementParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SQLStatementVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SQLStatementParser#use}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse(SQLStatementParser.UseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLStatementParser#schemaName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaName(SQLStatementParser.SchemaNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLStatementParser#insert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert(SQLStatementParser.InsertContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLStatementParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(SQLStatementParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLStatementParser#selectColumnNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectColumnNames(SQLStatementParser.SelectColumnNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLStatementParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(SQLStatementParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLStatementParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(SQLStatementParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLStatementParser#columnValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnValue(SQLStatementParser.ColumnValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLStatementParser#assignmentValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentValues(SQLStatementParser.AssignmentValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLStatementParser#assignmentValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentValue(SQLStatementParser.AssignmentValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLStatementParser#columnNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnNames(SQLStatementParser.ColumnNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLStatementParser#columnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnName(SQLStatementParser.ColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLStatementParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(SQLStatementParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLStatementParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(SQLStatementParser.IdentifierContext ctx);
}