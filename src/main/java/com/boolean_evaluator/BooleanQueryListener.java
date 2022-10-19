package com.boolean_evaluator;

import com.antlr.AntlrQueryLexer;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class BooleanQueryListener extends BooleanEvaluatorBaseListener{
    String result;

    @Override
    public void enterBooleanQuery(BooleanEvaluatorParser.BooleanQueryContext ctx) {

    }
      
    @Override
    public void exitBooleanQuery(BooleanEvaluatorParser.BooleanQueryContext ctx) {

    }

    @Override
    public void enterOrQuery(BooleanEvaluatorParser.OrQueryContext ctx) {
        BooleanEvaluatorParser.QueryContext currentExpression;
        BooleanEvaluatorParser.QueryContext matchedExpression;
        
        for(int i=0; i<ctx.getChildCount(); i++){
            if(ctx.getChild(i).getChildCount() == 1 && ctx.getChild(i).getChild(0) instanceof BooleanEvaluatorParser.QueryContext) {
                System.out.println(ctx.getChild(i));
                for(int j = i+1; j < ctx.getChildCount(); j++){
                    if(ctx.getChild(j).getChildCount() == 1 && ctx.getChild(j).getChild(0) instanceof BooleanEvaluatorParser.QueryContext ){
//                        currentExpression = ((BooleanEvaluatorParser.QueryContext) ctx.getChild(i).getChild(0)).query();
//                        matchedExpression = ((BooleanEvaluatorParser.QueryContext) ctx.getChild(j).getChild(0)).query();
//                        if(currentExpression != null && matchedExpression != null && matchedExpression.key().getText().equals(currentExpression.key().getText())){
//                            TokenSource tokenSource = new AntlrQueryLexer(CharStreams.fromString(currentExpression.key().getText() + "( "  + currentExpression.orValue().getText() + " | " +  matchedExpression.orValue().getText() + ") "));
//                            CommonTokenStream tokens = new CommonTokenStream(tokenSource);
//                            BooleanEvaluatorParser parser = new BooleanEvaluatorParser(tokens);
//                            ((BooleanEvaluatorParser.QueryContext) ctx.getChild(i).getChild(0)).removeLastChild();
//                            ctx.children.remove(j);
//                            ctx.children.remove(j-1);
//                            ((BooleanEvaluatorParser.QueryContext) ctx.getChild(i).getChild(0)).addChild(parser.expression());
//                        }
                        System.out.println(ctx.getChild(i) + " " + ctx.getChild(j));
                    }
                }
            }
        }

    }

    @Override
    public void exitOrQuery(BooleanEvaluatorParser.OrQueryContext ctx) {

    }

    @Override
    public void enterAndQuery(BooleanEvaluatorParser.AndQueryContext ctx) {
        System.out.println("andQuery : " + ctx.getText());

    }

    @Override
    public void exitAndQuery(BooleanEvaluatorParser.AndQueryContext ctx) {

    }

    @Override
    public void enterQuery(BooleanEvaluatorParser.QueryContext ctx) {

    }

    @Override
    public void exitQuery(BooleanEvaluatorParser.QueryContext ctx) {

    }

    @Override
    public void enterKey(BooleanEvaluatorParser.KeyContext ctx) {

    }

    @Override
    public void exitKey(BooleanEvaluatorParser.KeyContext ctx) {

    }

    @Override
    public void enterComparisonOperator(BooleanEvaluatorParser.ComparisonOperatorContext ctx) {

    }

    @Override
    public void exitComparisonOperator(BooleanEvaluatorParser.ComparisonOperatorContext ctx) {

    }

    @Override
    public void enterValue(BooleanEvaluatorParser.ValueContext ctx) {

    }

    @Override
    public void exitValue(BooleanEvaluatorParser.ValueContext ctx) {

    }


    @Override
    public void enterEveryRule(ParserRuleContext ctx) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {

    }

    @Override
    public void visitTerminal(TerminalNode node) {
        result += node.getText() + " " ;
    }

    @Override
    public void visitErrorNode(ErrorNode node) {

    }
    
}
