package com.antlr;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.List;

public class MyListener implements AntlrQueryListener {
    public String result = "";
    boolean range = false, contains = false;

    @Override
    public void enterAntlrQuery(AntlrQueryParser.AntlrQueryContext ctx) {
        System.out.println("Antlr ----> " + ctx.getText() + " chid count : " + ctx.getChildCount());
    }

    @Override
    public void exitAntlrQuery(AntlrQueryParser.AntlrQueryContext ctx) {}

    @Override
    public void enterOrQuery(AntlrQueryParser.OrQueryContext ctx) {
        System.out.println("Enter orQuery ---> " + ctx.getText() + " count : " + ctx.getChildCount());
        AntlrQueryParser.ExpressionContext currentExpression;
        AntlrQueryParser.ExpressionContext matchedExpression;

        for(int i=0; i<ctx.getChildCount(); i++){
            if(ctx.getChild(i).getChildCount() == 1 && ctx.getChild(i).getChild(0) instanceof AntlrQueryParser.QueryContext) {
                for(int j = i+1; j < ctx.getChildCount(); j++){
                    if(ctx.getChild(j).getChildCount() == 1 && ctx.getChild(j).getChild(0) instanceof AntlrQueryParser.QueryContext ){
                        currentExpression = ((AntlrQueryParser.QueryContext) ctx.getChild(i).getChild(0)).expression();
                        matchedExpression = ((AntlrQueryParser.QueryContext) ctx.getChild(j).getChild(0)).expression();
                        if(currentExpression != null && matchedExpression != null && matchedExpression.field().getText().equals(currentExpression.field().getText())){
                            TokenSource tokenSource = new AntlrQueryLexer(CharStreams.fromString(currentExpression.field().getText() + "( "  + currentExpression.orValue().getText() + " | " +  matchedExpression.orValue().getText() + ") "));
                            CommonTokenStream tokens = new CommonTokenStream(tokenSource);
                            AntlrQueryParser parser = new AntlrQueryParser(tokens);
                            ((AntlrQueryParser.QueryContext) ctx.getChild(i).getChild(0)).removeLastChild();
                            ctx.children.remove(j);
                            ctx.children.remove(j-1);
                            ((AntlrQueryParser.QueryContext) ctx.getChild(i).getChild(0)).addChild(parser.expression());
                        }
                    }
                }
            }
        }
    }

    @Override
    public void exitOrQuery(AntlrQueryParser.OrQueryContext ctx) {
        System.out.println("Exit orQuery ---> " + ctx.getText() + " count : " + ctx.getChildCount());
    }

    @Override
    public void enterAndQuery(AntlrQueryParser.AndQueryContext ctx) {
        System.out.println("\tEnter andQuery : " + ctx.getText() + " childCount : " + ctx.getChildCount());
    }

    @Override
    public void exitAndQuery(AntlrQueryParser.AndQueryContext ctx) {
        System.out.println("\tExit andQuery : " + ctx.getText() + " childCount : " + ctx.getChildCount());

    }

    @Override
    public void enterQuery(AntlrQueryParser.QueryContext ctx) {
        System.out.println("\t\tEnter Query childCount : " + ctx.getChildCount() + " Query : " + ctx.getText());
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
        System.out.println("\t\tExit query childCount : " + ctx.getChildCount() + " Query : " + ctx.getText());

    }

    @Override
    public void enterExpression(AntlrQueryParser.ExpressionContext ctx) {
//        System.out.println("Exp : " + ctx.getText());
    }

    @Override
    public void exitExpression(AntlrQueryParser.ExpressionContext ctx) {}

    @Override
    public void enterSeparator(AntlrQueryParser.SeparatorContext ctx) {
        ctx.SEPERATOR();

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
            result += " [ "  + list.get(0).getSymbol().getText() + " TO " + list.get(1).getSymbol().getText() + " ] ";
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
                case 1:
                    contains = true;
                    System.out.println(terminalNode.getText() + " contains....................");
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
                    result += terminalNode.getText() + " ";
                    break;
                case 18:
                    result += terminalNode.getText().substring(1, terminalNode.getText().length()-1).toLowerCase();
                    result += (contains) ? "* " : " ";
                    contains = false;
                    break;
                case 19:
                    result += terminalNode.getText() + " : ";
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