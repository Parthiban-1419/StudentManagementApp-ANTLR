// Generated from C:/Users/parthi-pt4593/eclipse-workspace/myEclipse/StudentManagementApp/src/main/java/com/query\Query.g4 by ANTLR 4.10.1
package com.query;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link QueryParser}.
 */
public interface QueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link QueryParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(QueryParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(QueryParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(QueryParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(QueryParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(QueryParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(QueryParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(QueryParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(QueryParser.ExpressionContext ctx);
}