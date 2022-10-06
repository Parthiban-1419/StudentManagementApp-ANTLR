package com.antlr;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MyListener implements AntlrQueryListener {
    public String result = "";

    @Override
    public void enterAntlrQuery(AntlrQueryParser.AntlrQueryContext ctx) {

    }

    @Override
    public void exitAntlrQuery(AntlrQueryParser.AntlrQueryContext ctx) {

    }

    @Override
    public void enterOrQuery(AntlrQueryParser.OrQueryContext ctx) {
//        if(ctx.getChildCount() > 0)  result += "( ";
    }

    @Override
    public void exitOrQuery(AntlrQueryParser.OrQueryContext ctx) {
//        if(ctx.getChildCount() > 0)  result += ") ";
    }

    @Override
    public void enterAndQuery(AntlrQueryParser.AndQueryContext ctx) {
        if(ctx.getChildCount() > 1)  result += "( ";
    }

    @Override
    public void exitAndQuery(AntlrQueryParser.AndQueryContext ctx) {
        if(ctx.getChildCount() > 1)  result += ") ";
    }

    @Override
    public void enterQuery(AntlrQueryParser.QueryContext ctx) {
        if(ctx.getChildCount() > 0)
            result += "( ";
    }

    @Override
    public void exitQuery(AntlrQueryParser.QueryContext ctx) {
        if(ctx.getChildCount() > 0)
            result += ") ";
    }

    @Override
    public void enterExpression(AntlrQueryParser.ExpressionContext ctx) {

    }

    @Override
    public void exitExpression(AntlrQueryParser.ExpressionContext ctx) {

    }

    @Override
    public void enterAndValue(AntlrQueryParser.AndValueContext ctx) {

    }

    @Override
    public void exitAndValue(AntlrQueryParser.AndValueContext ctx) {

    }

    @Override
    public void enterValue(AntlrQueryParser.ValueContext ctx) {
//        result += "( ";
    }

    @Override
    public void exitValue(AntlrQueryParser.ValueContext ctx) {
//        result += " )";
    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {
        String text;
        switch(terminalNode.getSymbol().getType()) {
            case 3:
                result += ": ";
                break;
            case 4:
                result += "OR ";
                break;
            case 5:
                result += "AND ";
                break;
            case 10:
                text = terminalNode.getText().substring(1, terminalNode.getText().length() - 1).toLowerCase();
                result += text.length() > 2 ? text + "* " : text + " ";
                break;
            default:
                result += terminalNode.getText() + " ";
        }
    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
