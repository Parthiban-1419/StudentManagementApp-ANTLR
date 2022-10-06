package com.antlr;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class AntlrQueryGenerator {
    public static void main(String[] args) {
        AntlrQueryGenerator generator = new AntlrQueryGenerator();
        System.out.println(generator.getAntlrQuery("operation : '   and b : 3 | c:4"));

    }

    public String getAntlrQuery(String input) {
        TokenSource tokenSource = new AntlrQueryLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(tokenSource);
        AntlrQueryParser parser = new AntlrQueryParser(tokens);
        MyListener  listener  = new MyListener ();
        AntlrQueryParser.OrQueryContext tree = parser.orQuery();
        ParseTreeWalker.DEFAULT.walk(listener, tree);
        System.out.println(tree.toStringTree(parser));
        return listener.result;
    }
}
