// Generated from C:/Users/parthi-pt4593/eclipse-workspace/myEclipse/StudentManagementApp/src/main/java/com/boolean_evaluator\BooleanEvaluator.g4 by ANTLR 4.10.1
package com.boolean_evaluator;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BooleanEvaluatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BooleanEvaluatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BooleanEvaluatorParser#booleanQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanQuery(BooleanEvaluatorParser.BooleanQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link BooleanEvaluatorParser#orQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrQuery(BooleanEvaluatorParser.OrQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link BooleanEvaluatorParser#andQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndQuery(BooleanEvaluatorParser.AndQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link BooleanEvaluatorParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(BooleanEvaluatorParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link BooleanEvaluatorParser#key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey(BooleanEvaluatorParser.KeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link BooleanEvaluatorParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(BooleanEvaluatorParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link BooleanEvaluatorParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(BooleanEvaluatorParser.ValueContext ctx);
}