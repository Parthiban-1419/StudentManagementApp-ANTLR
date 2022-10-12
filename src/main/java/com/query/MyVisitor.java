package com.query;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.RuleNode;

public class MyVisitor extends QueryBaseVisitor<String>{

    @Override
    public String visitQuery(QueryParser.QueryContext ctx) {
//        String result = this.visitOrExpression(ctx.orExpression());
//        if(ctx.getChildCount() == 0)
//            result =  ctx.getText();
//        else {
//            for(int i=0; i < ctx.getChildCount(); i++)
//                ctx.
//                result += visitOrExpression(ctx.orExpression());
//        }
        System.out.println("visiting query...");
        QueryLexer lexer = new QueryLexer(CharStreams.fromString("a = '10'"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        QueryParser parser = new QueryParser(tokens);
        MyListener listener = new MyListener();
        return ctx.orExpression() == null ? "" : "( " + this.visitOrExpression(ctx.orExpression()) + " )";
    }

    @Override
    public String visitOrExpression(QueryParser.OrExpressionContext ctx) {
//
        String result = "";
        for(QueryParser.AndExpressionContext andExpQuery : ctx.andExpression())
            result += visitAndExpression(andExpQuery);

        return result;
    }

    @Override
    public String visitAndExpression(QueryParser.AndExpressionContext ctx) {
        String result = "";
        if(ctx.getChildCount() > 0)
            for(int i=0; i< ctx.getChildCount(); i++)
                result += visitExpression(ctx.expression().get(0));

        return "( " + result + " )";
    }

    @Override
    public String visitExpression(QueryParser.ExpressionContext ctx) {
        return ctx.getText();
    }

//    @Override
//    public String visit(ParseTree parseTree) {
//        return parseTree.getText();
//    }

    @Override
    public String visitChildren(RuleNode ruleNode) {
        System.out.println("visiting children...");
//        visitAndExpression();
        return "";//ruleNode.getText();
    }

//    @Override
//    public String visitTerminal(TerminalNode terminalNode) {
//        return terminalNode.getText();
//    }
//
//    @Override
//    public String visitErrorNode(ErrorNode errorNode) {
//        return errorNode.getText();
//    }
}
