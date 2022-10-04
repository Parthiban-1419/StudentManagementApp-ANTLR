// Generated from C:/Users/parthi-pt4593/eclipse-workspace/myEclipse/StudentManagementApp/src/main/java/com/query\Query.g4 by ANTLR 4.10.1
package com.query;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link QueryParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface QueryVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link QueryParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(QueryParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueryParser#orExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(QueryParser.OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueryParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(QueryParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueryParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(QueryParser.ExpressionContext ctx);
}