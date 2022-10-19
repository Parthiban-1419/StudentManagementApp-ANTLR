package com.query;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
public class QueryGenerator extends QueryBaseListener{

    public static void main(String[] args) {
        QueryGenerator generator = new QueryGenerator();
        System.out.println(generator.getAntlrQuery("operator = 'view' | operation = 'login'"));;
    }
    public String getAntlrQuery(String query){
        QueryLexer lexer = new QueryLexer(CharStreams.fromString(query));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        QueryParser parser = new QueryParser(tokens);
        MyListener listener = new MyListener();
        QueryParser.QueryContext tree = parser.query();
        ParseTreeWalker.DEFAULT.walk(listener, tree);
        return listener.result;
    }
}

















//        MyVisitor visitor = new MyVisitor();
////        System.out.println(listener.result);
//        System.out.println("**********************************************");
////        System.out.println(tree.toStringTree(parser));
//        System.out.println("**********************************************");
//        System.out.println(visitor.visit(parser.query()));

//        System.out.println("/*****************************************************************************************/");
//        System.out.println(Arrays.asList(parser.getRuleNames()));
//        System.out.println("/*****************************************************************************************/");
//        System.out.println(Trees.toStringTree(tree));//, Arrays.asList(parser.getRuleNames())));
//        System.out.println("/*****************************************************************************************/");
//        System.out.println(Trees.toStringTree(tree, Arrays.asList(parser.getRuleNames())));
//        System.out.println("/*****************************************************************************************/");
//        System.out.println(parser.query().toStringTree(parser)); //Arrays.asList(parser.getRuleNames())