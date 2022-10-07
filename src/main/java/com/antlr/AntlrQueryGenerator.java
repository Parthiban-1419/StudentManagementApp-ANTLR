package com.antlr;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class AntlrQueryGenerator {
    public static void main(String[] args) {
        AntlrQueryGenerator generator = new AntlrQueryGenerator();
        System.out.println(generator.getAntlrQuery("operation > 10 | operation < 9 | operation = 10"));
    }

    public String getAntlrQuery(String input) {
        TokenSource tokenSource = new AntlrQueryLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(tokenSource);
        AntlrQueryParser parser = new AntlrQueryParser(tokens);
        MyListener  listener  = new MyListener ();
        MyVisitor visitor = new MyVisitor();
        parser.addParseListener(listener);
        AntlrQueryParser.OrQueryContext tree = parser.orQuery();
//        System.out.println(visitor.visit(tree));;
//        ParseTreeWalker.DEFAULT.walk(listener, tree);
//        System.out.println(input);
        return listener.result;
    }
}











//        parser.addParseListener(listener);
//        System.out.println(visitor.visit(tree));
//        System.out.println(tree.toStringTree(parser));