package com.boolean_evaluator;

import com.antlr.AntlrQueryLexer;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class QueryEvaluator {
    public static void main(String[] args) {
        QueryEvaluator evaluator = new QueryEvaluator();
        System.out.println(evaluator.getQuery("(`operation = 'Abc') and (b = 20  or b = 10)"));
    }

    public String getQuery(String userQuery){
        TokenSource tokenSource = new AntlrQueryLexer(CharStreams.fromString(userQuery));
        CommonTokenStream tokens = new CommonTokenStream(tokenSource);
        BooleanEvaluatorParser parser = new BooleanEvaluatorParser(tokens);
        BooleanQueryListener listener  = new BooleanQueryListener();
        BooleanEvaluatorParser.OrQueryContext tree = parser.orQuery();
        ParseTreeWalker.DEFAULT.walk(listener, tree);
        System.out.println("user : " + userQuery);

        return listener.result;
    }
}
