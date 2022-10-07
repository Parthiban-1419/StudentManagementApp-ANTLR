package com.antlr;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

public class MyListener implements AntlrQueryListener {
    public String result = "";
    boolean range = false;

    @Override
    public void enterAntlrQuery(AntlrQueryParser.AntlrQueryContext ctx) {
//        AntlrQueryParser.OrQueryContext nodeList = ctx.orQuery();
//        System.out.println("size : " + nodeList.size());
//        for(int i=0; i<nodeList.size(); i++)
//            System.out.println("OR -----> " + nodeList.get(i).getText() + "********");
    }

    @Override
    public void exitAntlrQuery(AntlrQueryParser.AntlrQueryContext ctx) {

    }

    @Override
    public void enterOrQuery(AntlrQueryParser.OrQueryContext ctx) {
        System.out.println("orQuery : " + ctx.getText() + " count : " + ctx.getChildCount());
//        if(ctx.getChildCount() > 1) {
//            System.out.println(ctx.getText());
//            for(int i=0; i<ctx.getChildCount(); i+=2) {
//                System.out.println(i + "\t\tchild ---->" + ctx.getChild(i).getText() + " count : " + ctx.getChild(i).getChildCount() + " token : " + ctx.getToken(5, i));
//            }
//        }
//        System.out.println();
//
//        for(AntlrQueryParser.AndQueryContext node : nodeList)
//            System.out.println(nodeList.equals(node));
    }

    @Override
    public void exitOrQuery(AntlrQueryParser.OrQueryContext ctx) {

    }

    @Override
    public void enterAndQuery(AntlrQueryParser.AndQueryContext ctx) {
        System.out.println("andQuery : " + ctx.getText() + " childCount : " + ctx.getChildCount());
    }

    @Override
    public void exitAndQuery(AntlrQueryParser.AndQueryContext ctx) {

    }

    @Override
    public void enterQuery(AntlrQueryParser.QueryContext ctx) {
        System.out.println("childCount : " + ctx.getChildCount() + " Query : " + ctx.getText());
//        if(ctx.getChildCount() > 1) {
//            for (int i = 0; i < ctx.getChildCount(); i++)
//                if(ctx.getChild(i).getChildCount() > 2) {
//                    System.out.println("\t\t" + ctx.getChild(i).getText() + " count : " + ctx.getChild(i).getChildCount());
//                }
//
//        }
    }

    @Override
    public void exitQuery(AntlrQueryParser.QueryContext ctx) {

    }

    @Override
    public void enterExpression(AntlrQueryParser.ExpressionContext ctx) {
//        System.out.println("Exp : " + ctx.getText());
    }

    @Override
    public void exitExpression(AntlrQueryParser.ExpressionContext ctx) {

    }

    @Override
    public void enterSeparator(AntlrQueryParser.SeparatorContext ctx) {

    }

    @Override
    public void exitSeparator(AntlrQueryParser.SeparatorContext ctx) {

    }

    @Override
    public void enterOrValue(AntlrQueryParser.OrValueContext ctx) {

    }

    @Override
    public void exitOrValue(AntlrQueryParser.OrValueContext ctx) {

    }

    @Override
    public void enterAndValue(AntlrQueryParser.AndValueContext ctx) {

    }

    @Override
    public void exitAndValue(AntlrQueryParser.AndValueContext ctx) {

    }

    @Override
    public void enterValue(AntlrQueryParser.ValueContext ctx) {

    }

    @Override
    public void exitValue(AntlrQueryParser.ValueContext ctx) {
//        System.out.println("********* " + ctx.getText());
//        if(ctx.getToken(16, 0) == null){
//            if(ctx.getToken(18, 0) != null){
//                result += ctx.getToken(18, 0) + " ";
//            }
//        }
//        else
//            result += ctx.getToken(16, 0) + " ";

//        result += ctx.getToken(16, 0) == null ? (ctx.getToken(18, 0) == null ? "" : ctx.getToken(18, 0) + " ") : ctx.getToken(16, 0) + " ";
    }

    @Override
    public void enterRangeValue(AntlrQueryParser.RangeValueContext ctx) {
        range = true;
    }

    @Override
    public void exitRangeValue(AntlrQueryParser.RangeValueContext ctx) {
        List<TerminalNode> list = ctx.getTokens(16);
        if(!list.isEmpty())
            result += ": [ "  + list.get(0).getSymbol().getText() + " TO " + list.get(1).getSymbol().getText() + " ] ";
        range = false;
    }

    @Override
    public void enterNumber(AntlrQueryParser.NumberContext ctx) {
    }

    @Override
    public void exitNumber(AntlrQueryParser.NumberContext ctx) {

    }

    @Override
    public void enterField(AntlrQueryParser.FieldContext ctx) {

    }

    @Override
    public void exitField(AntlrQueryParser.FieldContext ctx) {
//        result += ctx.getText() + " ";
    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {
//        System.out.println("ter --> " + terminalNode.getSymbol() + terminalNode + " " + terminalNode.getText() );
        String str;
        if(!range)
            switch (terminalNode.getSymbol().getType()){
            case 2:
            case 3:
                result += ": ";
                break;
            case 4:
            case 5:
                result += "NOT ";
                break;
            case 6:
                result += "OR ";
                break;
            case 7:
                result += "AND ";
                break;
            case 9:
                result += "( " ;
                break;
            case 10:
                result += ") " ;
                break;
            case 16:
            case 18:
            case 19:
                if(terminalNode.getText().charAt(0) == '\'')
                    str = terminalNode.getText().substring(1, terminalNode.getText().length()-1) + " ";
                else
                    str = terminalNode.getText() + " ";
                result += str;
                break;
            case 22:
                result += "> ";
                break;
            case 23:
                  result += ">= ";
                  break;
            case 25:
                result += "< ";
                break;
            case 26:
                result += "<= ";
                break;
            default:

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







//                    ParserRuleContext newParser = (ParserRuleContext) ctx.getChild(i);
//                    MyVisitor newVisitor = new MyVisitor();
//                    MyListener newlistener = new MyListener();
////                    newVisitor.visit(newParser);
////                    newParser.accept();
//                    ParseTreeWalker.DEFAULT.walk(newlistener, newParser);
//                    System.out.println("Newww.........." + newlistener.result);