// Generated from C:/Users/parthi-pt4593/eclipse-workspace/myEclipse/StudentManagementApp/src/main/java/com/log/parse\SqlLog.g4 by ANTLR 4.10.1
package com.log.parse;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SqlLogParser}.
 */
public interface SqlLogListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SqlLogParser#sqlLog}.
	 * @param ctx the parse tree
	 */
	void enterSqlLog(SqlLogParser.SqlLogContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlLogParser#sqlLog}.
	 * @param ctx the parse tree
	 */
	void exitSqlLog(SqlLogParser.SqlLogContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlLogParser#dateTime}.
	 * @param ctx the parse tree
	 */
	void enterDateTime(SqlLogParser.DateTimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlLogParser#dateTime}.
	 * @param ctx the parse tree
	 */
	void exitDateTime(SqlLogParser.DateTimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlLogParser#threadId}.
	 * @param ctx the parse tree
	 */
	void enterThreadId(SqlLogParser.ThreadIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlLogParser#threadId}.
	 * @param ctx the parse tree
	 */
	void exitThreadId(SqlLogParser.ThreadIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlLogParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(SqlLogParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlLogParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(SqlLogParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlLogParser#errorCode}.
	 * @param ctx the parse tree
	 */
	void enterErrorCode(SqlLogParser.ErrorCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlLogParser#errorCode}.
	 * @param ctx the parse tree
	 */
	void exitErrorCode(SqlLogParser.ErrorCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlLogParser#subSystem}.
	 * @param ctx the parse tree
	 */
	void enterSubSystem(SqlLogParser.SubSystemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlLogParser#subSystem}.
	 * @param ctx the parse tree
	 */
	void exitSubSystem(SqlLogParser.SubSystemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlLogParser#message}.
	 * @param ctx the parse tree
	 */
	void enterMessage(SqlLogParser.MessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlLogParser#message}.
	 * @param ctx the parse tree
	 */
	void exitMessage(SqlLogParser.MessageContext ctx);
}