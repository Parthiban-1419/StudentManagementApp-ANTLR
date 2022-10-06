package json;

public class MyVisitor extends JsonBaseVisitor<String>{
    @Override
    public String visitJson(JsonParser.JsonContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitValue(JsonParser.ValueContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitObject(JsonParser.ObjectContext ctx) {
        System.out.println("my method");
        return visitChildren(ctx);
    }
    @Override
    public String visitArray(JsonParser.ArrayContext ctx) {
        return visitChildren(ctx);
    }
}
