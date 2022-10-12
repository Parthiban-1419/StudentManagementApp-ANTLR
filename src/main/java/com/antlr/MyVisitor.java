package com.antlr;


import com.query.QueryParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenSource;

public class MyVisitor extends AntlrQueryBaseVisitor<String> {
    String result = "";
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

        System.out.println("Visiting ***************************************** " + ctx.getText());
        String newInput = "a=1|2";
        TokenSource tokenSource = new AntlrQueryLexer(CharStreams.fromString(newInput));
        CommonTokenStream tokens = new CommonTokenStream(tokenSource);
        AntlrQueryParser parser = new AntlrQueryParser(tokens);


        System.out.println("====================" + ctx.getText());
//        for(int i=0; i<ctx.getChildCount(); i++) {
//            System.out.println("Child------------------------------>" + ctx.getChild(i));
            ctx.getChild(0).setParent(parser.orQuery());
//        }



//            result += this.visitAndQuery();


        return result;
    }

    @Override
    public String visitAndQuery(AntlrQueryParser.AndQueryContext ctx) {
//        System.out.println(ctx.getText());

        return this.visitQuery(ctx.query(0));
    }

    @Override
    public String visitQuery(AntlrQueryParser.QueryContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitExpression(AntlrQueryParser.ExpressionContext ctx) {
        return ctx.getText();
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