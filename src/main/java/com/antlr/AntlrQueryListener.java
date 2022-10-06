// Generated from C:/Users/parthi-pt4593/eclipse-workspace/myEclipse/StudentManagementApp/src/main/java/com/antlr\AntlrQuery.g4 by ANTLR 4.10.1
package com.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AntlrQueryParser}.
 */
public interface AntlrQueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AntlrQueryParser#antlrQuery}.
	 * @param ctx the parse tree
	 */
	void enterAntlrQuery(AntlrQueryParser.AntlrQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrQueryParser#antlrQuery}.
	 * @param ctx the parse tree
	 */
	void exitAntlrQuery(AntlrQueryParser.AntlrQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrQueryParser#orQuery}.
	 * @param ctx the parse tree
	 */
	void enterOrQuery(AntlrQueryParser.OrQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrQueryParser#orQuery}.
	 * @param ctx the parse tree
	 */
	void exitOrQuery(AntlrQueryParser.OrQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrQueryParser#andQuery}.
	 * @param ctx the parse tree
	 */
	void enterAndQuery(AntlrQueryParser.AndQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrQueryParser#andQuery}.
	 * @param ctx the parse tree
	 */
	void exitAndQuery(AntlrQueryParser.AndQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrQueryParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(AntlrQueryParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrQueryParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(AntlrQueryParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrQueryParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(AntlrQueryParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrQueryParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(AntlrQueryParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrQueryParser#andValue}.
	 * @param ctx the parse tree
	 */
	void enterAndValue(AntlrQueryParser.AndValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrQueryParser#andValue}.
	 * @param ctx the parse tree
	 */
	void exitAndValue(AntlrQueryParser.AndValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrQueryParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(AntlrQueryParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrQueryParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(AntlrQueryParser.ValueContext ctx);
}