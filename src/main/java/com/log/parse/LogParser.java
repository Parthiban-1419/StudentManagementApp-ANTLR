package com.log.parse;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LogParser {
    public static void main(String[] args) throws IOException {
        JSONArray jArray = new JSONArray();
        LogParser parser = new LogParser();
        File file = new File("mysql_error");
        Scanner scanner = new Scanner(file);

        while(scanner.hasNext())
            jArray.add(parser.parseLog(scanner.nextLine()));

        System.out.println(jArray);
    }


    public JSONObject parseLog(String log) throws IOException {
        TokenSource tokenSource = new SqlLogLexer(CharStreams.fromString(log));
        CommonTokenStream tokens = new CommonTokenStream(tokenSource);
        SqlLogParser parser = new SqlLogParser(tokens);
        LogListener listener = new LogListener();
        SqlLogParser.SqlLogContext tree = parser.sqlLog();
        ParseTreeWalker.DEFAULT.walk(listener, tree);
        return listener.result;
    }

    /*static void printError(){
        SQLException ex = new SQLException("DDL log recovery : begin");
        System.out.println(ex.getErrorCode());
    }*/

}
