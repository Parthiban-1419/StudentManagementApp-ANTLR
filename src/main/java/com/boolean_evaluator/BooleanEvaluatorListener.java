// Generated from C:/Users/parthi-pt4593/eclipse-workspace/myEclipse/StudentManagementApp/src/main/java/com/boolean_evaluator\BooleanEvaluator.g4 by ANTLR 4.10.1
package com.boolean_evaluator;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BooleanEvaluatorParser}.
 */
public interface BooleanEvaluatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BooleanEvaluatorParser#booleanQuery}.
	 * @param ctx the parse tree
	 */
	void enterBooleanQuery(BooleanEvaluatorParser.BooleanQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link BooleanEvaluatorParser#booleanQuery}.
	 * @param ctx the parse tree
	 */
	void exitBooleanQuery(BooleanEvaluatorParser.BooleanQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link BooleanEvaluatorParser#orQuery}.
	 * @param ctx the parse tree
	 */
	void enterOrQuery(BooleanEvaluatorParser.OrQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link BooleanEvaluatorParser#orQuery}.
	 * @param ctx the parse tree
	 */
	void exitOrQuery(BooleanEvaluatorParser.OrQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link BooleanEvaluatorParser#andQuery}.
	 * @param ctx the parse tree
	 */
	void enterAndQuery(BooleanEvaluatorParser.AndQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link BooleanEvaluatorParser#andQuery}.
	 * @param ctx the parse tree
	 */
	void exitAndQuery(BooleanEvaluatorParser.AndQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link BooleanEvaluatorParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(BooleanEvaluatorParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link BooleanEvaluatorParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(BooleanEvaluatorParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link BooleanEvaluatorParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(BooleanEvaluatorParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link BooleanEvaluatorParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(BooleanEvaluatorParser.KeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link BooleanEvaluatorParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(BooleanEvaluatorParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BooleanEvaluatorParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(BooleanEvaluatorParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BooleanEvaluatorParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(BooleanEvaluatorParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link BooleanEvaluatorParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(BooleanEvaluatorParser.ValueContext ctx);
}