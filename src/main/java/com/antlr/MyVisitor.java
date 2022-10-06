package com.antlr;


public class MyVisitor extends AntlrQueryBaseVisitor<String> {
    @Override public String visitAntlrQuery(AntlrQueryParser.AntlrQueryContext ctx) { return visitChildren(ctx); }
    
    @Override public String visitOrQuery(AntlrQueryParser.OrQueryContext ctx) { return visitChildren(ctx); }
  
    @Override public String visitAndQuery(AntlrQueryParser.AndQueryContext ctx) { return visitChildren(ctx); }
    
    @Override public String visitQuery(AntlrQueryParser.QueryContext ctx) { return visitChildren(ctx); }

    @Override public String visitExpression(AntlrQueryParser.ExpressionContext ctx) { return visitChildren(ctx); }
    
    @Override public String visitAndValue(AntlrQueryParser.AndValueContext ctx) { return visitChildren(ctx); }
     
    @Override public String visitValue(AntlrQueryParser.ValueContext ctx) { return visitChildren(ctx); }
}
