package json;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MyListener extends JsonBaseListener{
    @Override public void enterJson(JsonParser.JsonContext ctx) {
    }

    @Override public void exitJson(JsonParser.JsonContext ctx) {
    }

    @Override public void enterValue(JsonParser.ValueContext ctx) { }

    @Override public void exitValue(JsonParser.ValueContext ctx) { }

    @Override public void enterObject(JsonParser.ObjectContext ctx) { }

    @Override public void exitObject(JsonParser.ObjectContext ctx) { }

    @Override public void enterArray(JsonParser.ArrayContext ctx) { }

    @Override public void exitArray(JsonParser.ArrayContext ctx) { }


    @Override public void enterEveryRule(ParserRuleContext ctx) {
//        System.out.print("\n" + ctx.getText() + "----->");
    }

    @Override public void exitEveryRule(ParserRuleContext ctx) {

    }

    @Override public void visitTerminal(TerminalNode node) {
//        System.out.print(node.getText() + " ");
    }

    @Override public void visitErrorNode(ErrorNode node) { }
}
