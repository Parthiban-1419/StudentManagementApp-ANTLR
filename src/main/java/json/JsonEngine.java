package json;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.Arrays;

public class JsonEngine {
    public static void main(String[] args) {
        String query = "{'data' : [{'name' : 'Parthiban'}, { 'age' : 21}]}";
        JsonLexer lexer = new JsonLexer(CharStreams.fromString(query));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JsonParser parser = new JsonParser(tokens);
        JsonParser.JsonContext tree = parser.json();
        ParseTreeWalker walker = ParseTreeWalker.DEFAULT;
        MyListener listener = new  MyListener();
        parser.addParseListener(listener);
        walker.walk(listener, tree);
        System.out.println(Arrays.asList(parser.getRuleNames()));
        System.out.println(parser.json().toStringTree(Arrays.asList(parser.getRuleNames())));
    }


}
