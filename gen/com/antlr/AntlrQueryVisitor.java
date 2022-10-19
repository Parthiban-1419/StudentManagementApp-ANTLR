// Generated from C:/Users/parthi-pt4593/eclipse-workspace/myEclipse/StudentManagementApp/src/main/java/com/antlr\AntlrQuery.g4 by ANTLR 4.10.1
package com.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AntlrQueryParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AntlrQueryVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AntlrQueryParser#antlrQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAntlrQuery(AntlrQueryParser.AntlrQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrQueryParser#orQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrQuery(AntlrQueryParser.OrQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrQueryParser#andQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndQuery(AntlrQueryParser.AndQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrQueryParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(AntlrQueryParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrQueryParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(AntlrQueryParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrQueryParser#orValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrValue(AntlrQueryParser.OrValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrQueryParser#andValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndValue(AntlrQueryParser.AndValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrQueryParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(AntlrQueryParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrQueryParser#rangeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeValue(AntlrQueryParser.RangeValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrQueryParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(AntlrQueryParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrQueryParser#separator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeparator(AntlrQueryParser.SeparatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrQueryParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(AntlrQueryParser.FieldContext ctx);
}