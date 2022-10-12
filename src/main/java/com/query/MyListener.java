package com.query;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

public class MyListener implements  QueryListener{
    public String result = "";
    @Override
    public void enterQuery(QueryParser.QueryContext ctx) {
//        QueryParser.OrExpressionContext node = ctx.orExpression();
//        System.out.println("entered..");
    }
    @Override
    public void exitQuery(QueryParser.QueryContext ctx) {
//        QueryParser.OrExpressionContext node = ctx.orExpression();
//        System.out.println("Exiting.........................................." + node.getText());
//        ctx.accept(visitor);
    }

    @Override public void enterOrExpression(QueryParser.OrExpressionContext ctx) {

//        ctx.OR().clear();
//        List<QueryParser.AndExpressionContext> nodes= ctx.andExpression();
////        for(QueryParser.AndExpressionContext node : nodes) {
////            System.out.println(node.getText());
////        }
//        System.out.println("Entered..or.\n");
////        ctx.accept(visitor);
////        result += "( ";
    }

    @Override
    public void exitOrExpression(QueryParser.OrExpressionContext ctx) {
//        List<QueryParser.AndExpressionContext> nodes= ctx.andExpression();
//        for(QueryParser.AndExpressionContext node : nodes) {
////            System.out.println(node.start.getStartIndex() + " " + node.getText() + " " + node.stop.getStopIndex());
//        }
//        //ctx.accept(visitor);
//        System.out.println("Exited..or.\n");
////        result +=  " )";
    }

    @Override public void enterAndExpression(QueryParser.AndExpressionContext ctx) {
//        List<QueryParser.ExpressionContext> nodes = ctx.expression();

        result += "( ";
    }

    @Override
    public void exitAndExpression(QueryParser.AndExpressionContext ctx) {
//        List<QueryParser.ExpressionContext> nodes = ctx.expression();

        result += " )";
    }

    @Override
    public void enterExpression(QueryParser.ExpressionContext ctx) {}

    @Override
    public void exitExpression(QueryParser.ExpressionContext ctx) {
        TerminalNode aNode = ctx.ATTRIBUTE(), cNode = ctx.COMPARISON(), vNode = ctx.VALUE();
        result += aNode.getText() + " " + cNode.getText() + " " + vNode.getText();
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
//        for (ParseTree child : ctx.children) {
//            System.out.println(child.getText());
//        }
//        System.out.println("Entered...\n");
//        ctx.accept(visitor);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
//        for (ParseTree child : ctx.children) {
//            System.out.println(child.getText());
//        }
//        //ctx.accept(visitor);
//        System.out.println("Exited...\n");
    }

    @Override
    public void visitTerminal(TerminalNode node) {

        int nodeType = node.getSymbol().getType();
        if(nodeType == 1)
            result += " OR ";
        else if(nodeType == 2)
            result += " AND ";
//
//        if(nodeType == 5)
//            result += " " + node.getText();
//        else if(nodeType == 4 | nodeType == 3 | nodeType == 1)
//
//        else if (nodeType == -1)
//            result +=  " )";
//        else
//            result += " ) " + node.getText() + " ( ";
//        System.out.println(node.getText() + " ---> " + nodeType);
    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {
        System.out.println("Error -> " + errorNode.getText());
    }
}
