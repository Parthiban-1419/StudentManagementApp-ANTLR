//package com.es;
//
//
//import org.antlr.v4.runtime.CharStreams;
//import org.antlr.v4.runtime.CommonTokenStream;
//import org.antlr.v4.runtime.TokenStream;
//import org.antlr.v4.runtime.TokenStreamRewriter;
//import org.antlr.v4.runtime.tree.ParseTree;
//import org.antlr.v4.runtime.tree.ParseTreeWalker;
//import org.antlr.v4.runtime.tree.TerminalNode;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class QueryGenerator extends Java8BaseListener {
//
//    private List<String> errors = new ArrayList<>();
//
//    public static void main(String[] args) {
//        QueryGenerator qg = new QueryGenerator();
//        qg.antler();
//    }
//
////    public Exception getErrors(){
////
////        return new Error();
////    }
//
//
//    @Override
//    public void enterMethodDeclarator(Java8Parser.MethodDeclaratorContext ctx) {
//        TerminalNode node = ctx.Identifier();
//        String methodName = node.getText();
//
//        if (Character.isUpperCase(methodName.charAt(0))) {
//            String error = String.format("Method %s is uppercased!", methodName);
//            errors.add(error);
//        }
//    }
//
//    void antler(){
//
//        String javaClassContent = "public class SampleClass { void DoSomething(){} } protected class SampleClas22 { void DoSomething2(){} } ";
//        Java8Lexer lexer = new Java8Lexer(CharStreams.fromString(javaClassContent));
//
//        CommonTokenStream tokens = new CommonTokenStream(lexer);
//        Java8Parser parser = new Java8Parser(tokens);
//
//        ParseTree tree = parser.compilationUnit();
//
//        System.out.println(parser.getInputStream());
//        TokenStream t = parser.getInputStream();
//        TokenStreamRewriter rewriter = new TokenStreamRewriter(t);
//
//        ParseTreeWalker walker = new ParseTreeWalker();
//        QueryGenerator listener= new QueryGenerator();
//
//        walker.walk(listener, tree);
//    }
//}
