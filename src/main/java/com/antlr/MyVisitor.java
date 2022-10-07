package com.antlr;

import org.antlr.v4.runtime.Parser;

public class MyVisitor extends AntlrQueryBaseVisitor<String> {
    @Override
    public String visitAntlrQuery(AntlrQueryParser.AntlrQueryContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitOrQuery(AntlrQueryParser.OrQueryContext ctx) {
//        System.out.println(ctx.getText());
//        Parser p;
//        for(int i=0; i<ctx.getChildCount(); i++){
//
//            ctx.getChild(i);
//        }
        return visitChildren(ctx);
    }

    @Override
    public String visitAndQuery(AntlrQueryParser.AndQueryContext ctx) {
//        System.out.println(ctx.getText());
        return visitChildren(ctx);
    }

    @Override
    public String visitQuery(AntlrQueryParser.QueryContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitExpression(AntlrQueryParser.ExpressionContext ctx) {

        return visitChildren(ctx);
//        return "mmmm";
    }

    @Override
    public String visitOrValue(AntlrQueryParser.OrValueContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitAndValue(AntlrQueryParser.AndValueContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitValue(AntlrQueryParser.ValueContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitRangeValue(AntlrQueryParser.RangeValueContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitField(AntlrQueryParser.FieldContext ctx) {
        return visitChildren(ctx);
    }
}