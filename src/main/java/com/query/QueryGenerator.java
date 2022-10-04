package com.query;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

public class QueryGenerator extends QueryBaseListener{

    private List<String> errors = new ArrayList<>();

    public static void main(String[] args) {

        String query = "userId > 'p o' AND operation='poi' OR date = '03/10/2022'";
        QueryLexer lexer = new QueryLexer(CharStreams.fromString(query));

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        QueryParser parser = new QueryParser(tokens);
        QueryParser.QueryContext tree = parser.query();
        parser.setBuildParseTree(false);
        TokenStream t = parser.getInputStream();

//      TokenStreamRewriter rewriter = new TokenStreamRewriter(t);

        ParseTreeWalker walker = ParseTreeWalker.DEFAULT;
        QueryListener listener = new QueryGenerator();

        walker.walk(listener, tree);
        System.out.println(parser.query().toStringTree());
    }

    public Error getErrors(){
        return new Error();
    }

    @Override
    public void enterQuery(QueryParser.QueryContext ctx) {
        QueryParser.OrExpressionContext node = ctx.orExpression();
        String nodeText = node.getText();
        System.out.println(nodeText);
        System.out.println("Entered...\n");
    }
    @Override
    public void exitQuery(QueryParser.QueryContext ctx) {
        QueryParser.OrExpressionContext node = ctx.orExpression();
        String nodeText = node.getText();
        System.out.println(nodeText);
        System.out.println("Exited...\n");
    }

    @Override public void enterOrExpression(QueryParser.OrExpressionContext ctx) {
        List<QueryParser.AndExpressionContext> nodes= ctx.andExpression();
        for(QueryParser.AndExpressionContext node : nodes) {
            System.out.println(node.getText());
        }
        System.out.println("Entered...\n");
    }

    @Override
    public void exitOrExpression(QueryParser.OrExpressionContext ctx) {
        List<QueryParser.AndExpressionContext> nodes= ctx.andExpression();
        for(QueryParser.AndExpressionContext node : nodes) {
            System.out.println(node.getText());
        }
        System.out.println("Exited...\n");
    }

    @Override public void enterAndExpression(QueryParser.AndExpressionContext ctx) {
        List<QueryParser.ExpressionContext> nodes = ctx.expression();
        for(QueryParser.ExpressionContext node : nodes) {
            System.out.println(node.getText());
        }
        System.out.println("Entered...\n");

    }

    @Override
    public void exitAndExpression(QueryParser.AndExpressionContext ctx) {
        List<QueryParser.ExpressionContext> nodes = ctx.expression();
        for(QueryParser.ExpressionContext node : nodes) {
            System.out.println(node.getText());
        }
        System.out.println("Exited...\n");

    }

    @Override
    public void enterExpression(QueryParser.ExpressionContext ctx) {
        TerminalNode aNode = ctx.ATTRIBUTE();
        System.out.println(aNode.getText());
        System.out.println("Entered...\n");

        TerminalNode cNode = ctx.COMPARISON();
        System.out.println(cNode.getText());
        System.out.println("Entered...\n");

        TerminalNode vNode = ctx.VALUE();
        System.out.println(vNode.getText());
        System.out.println("Entered...\n");
    }

    @Override
    public void exitExpression(QueryParser.ExpressionContext ctx) {
        TerminalNode aNode = ctx.ATTRIBUTE();
        System.out.println(aNode.getText());
        System.out.println("Exited...\n");

        TerminalNode cNode = ctx.COMPARISON();
        System.out.println(cNode.getText());
        System.out.println("Exited...\n");

        TerminalNode vNode = ctx.VALUE();
        System.out.println(vNode.getText());
        System.out.println("Exited...\n");
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        for (ParseTree child : ctx.children) {
            System.out.println(child.getText());
        }
        System.out.println("Entered...\n");
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        for (ParseTree child : ctx.children) {
            System.out.println(child.getText());
        }
        System.out.println("Exited...\n");
    }

    public String visit(ParseTree parseTree) {
        return null;
    }

    public String visitChildren(RuleNode ruleNode) {
        return null;
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        System.out.println(node.getText());
        System.out.println("visited terminal...\n");
        node.getText();
    }

    public void visitErrorNode(ErrorNode errorNode) {

    }

    public String visitQuery(QueryParser.QueryContext ctx){
        return ctx.getText();
    }


    public String visitOrExpression(QueryParser.OrExpressionContext ctx){
        return ctx.getText();
    }

    public String visitAndExpression(QueryParser.AndExpressionContext ctx){
        return ctx.getText();
    }

    public String visitExpression(QueryParser.ExpressionContext ctx) {
        return visitChildren(ctx);
    }

}
