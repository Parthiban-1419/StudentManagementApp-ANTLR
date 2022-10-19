// Generated from C:/Users/parthi-pt4593/eclipse-workspace/myEclipse/StudentManagementApp/src/main/java/com/log/parse\SqlLog.g4 by ANTLR 4.10.1
package com.log.parse;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SqlLogParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SqlLogVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SqlLogParser#sqlLog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlLog(SqlLogParser.SqlLogContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlLogParser#dateTime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateTime(SqlLogParser.DateTimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlLogParser#threadId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThreadId(SqlLogParser.ThreadIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlLogParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(SqlLogParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlLogParser#errorCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorCode(SqlLogParser.ErrorCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlLogParser#subSystem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubSystem(SqlLogParser.SubSystemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlLogParser#message}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessage(SqlLogParser.MessageContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlLogParser#userName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserName(SqlLogParser.UserNameContext ctx);
}