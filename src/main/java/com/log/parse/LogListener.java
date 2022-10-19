package com.log.parse;

import com.mysql.cj.jdbc.exceptions.SQLError;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.json.simple.JSONObject;

import java.sql.SQLException;
import java.sql.SQLWarning;
import java.time.Instant;
import java.time.temporal.ChronoField;

public class LogListener extends SqlLogBaseListener{
    JSONObject result = new JSONObject();

    @Override
    public void enterSqlLog(SqlLogParser.SqlLogContext ctx) {

    }

    @Override
    public void exitSqlLog(SqlLogParser.SqlLogContext ctx) {

    }

    @Override
    public void enterDateTime(SqlLogParser.DateTimeContext ctx) {
        Instant inst = Instant.parse(ctx.getText());
        result.put("time", inst.toString());
        result.put("ts", inst.toEpochMilli() + inst.getLong(ChronoField.MICRO_OF_SECOND));
        result.put("buffered" , inst.getEpochSecond() + "" + inst.getLong(ChronoField.MICRO_OF_SECOND));
    }

    @Override
    public void exitDateTime(SqlLogParser.DateTimeContext ctx) {

    }

    @Override
    public void enterThreadId(SqlLogParser.ThreadIdContext ctx) {
        result.put("thread", Integer.parseInt(ctx.getText()));
    }

    @Override
    public void exitThreadId(SqlLogParser.ThreadIdContext ctx) {

    }

    @Override
    public void enterLabel(SqlLogParser.LabelContext ctx) {
        result.put("label", ctx.getText());
        if(ctx.getText().equals("Error"))
            result.put("prio", 1);
        else if(ctx.getText().equals("Warning"))
            result.put("prio", 2);
        else if(ctx.getText().equals("Note"))
            result.put("prio", 3);
    }

    @Override
    public void exitLabel(SqlLogParser.LabelContext ctx) {

    }

    @Override
    public void enterErrorCode(SqlLogParser.ErrorCodeContext ctx) {
        result.put("err_code", Integer.parseInt(ctx.ERRORCODERANGE().getText()));

//        Exception e = new Exception("ER_SCHEDULER_STARTED");
//        SQLException ex = new SQLException(e.getCause());
//
//        System.out.println(ex.getErrorCode());
//        SQLError e = new SQLError();
//        SQLWarning w = new SQLWarning();

//        System.out.println("SQLException: " + ex.getMessage());
//        System.out.println("SQLState: " + ex.getSQLState());
//        System.out.println("VendorError: " + ex.getErrorCode());
    }

    @Override
    public void exitErrorCode(SqlLogParser.ErrorCodeContext ctx) {

    }

    @Override
    public void enterSubSystem(SqlLogParser.SubSystemContext ctx) {
        result.put("subsystem", ctx.getText());
    }

    @Override
    public void exitSubSystem(SqlLogParser.SubSystemContext ctx) {

    }

    @Override
    public void enterMessage(SqlLogParser.MessageContext ctx) {
        result.put("msg", ctx.getText());
    }

    @Override
    public void exitMessage(SqlLogParser.MessageContext ctx) { }

    @Override public void enterUserName(SqlLogParser.UserNameContext ctx) {
        result.put("userName", ctx.getText());
    }


    @Override public void exitUserName(SqlLogParser.UserNameContext ctx) { }



    @Override
    public void enterEveryRule(ParserRuleContext ctx) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {

    }

    @Override
    public void visitTerminal(TerminalNode node) {

    }

    @Override public void visitErrorNode(ErrorNode node) {

    }
}
