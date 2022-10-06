package com.es;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.queryparser.surround.parser.ParseException;
import org.apache.lucene.queryparser.surround.parser.QueryParser;
import org.apache.lucene.queryparser.surround.parser.Token;
import org.apache.lucene.queryparser.surround.query.BasicQueryFactory;
import org.apache.lucene.queryparser.surround.query.SrndQuery;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.apache.poi.ss.formula.functions.T;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class Lucene {
    List<SrndQuery> disQueries = new ArrayList<>();
    List<SrndQuery> andQueries = new ArrayList<>();


    public static void main(String[] args) throws ParseException, IOException {
        String queryStatement = "userId:P2000 AND operation:create OR userId:1810001 AND operation:login";
        Lucene lucene = new Lucene();
        lucene.doRange();
    }

    public void doRange() throws ParseException {
        QueryParser qp = new QueryParser();
        disQueries.add(QueryParser.parse("time : 1664522624493"));
        disQueries.add(QueryParser.parse("time : 1664779949570"));

//        qp.getDistanceQuery(disQueries, true, new Token(), true);
    }



    public void getOrQuery(String statement){
        for(String andQurey : statement.split("OR")){

        }
    }


    public SrndQuery getSrndQuery(String query) throws ParseException, ArrayIndexOutOfBoundsException{
        SrndQuery sQ = QueryParser.parse(query.split(":")[1]);
        return sQ;
    }

    public static void getByLucene(Query query) throws ParseException, IOException {
        Directory directory = FSDirectory.open(Paths.get("D:/ES/elasticsearch-7.9.2/data/nodes/0/indices/a9KuzLkPSBiZiJgxdKUNQA/0/index"));
        IndexReader reader = DirectoryReader.open(directory);
        IndexSearcher indexSearcher = new IndexSearcher(reader);
        TopDocs hits = indexSearcher.search(query, reader.maxDoc());

        System.out.println("query : " + query.toString() + " hits : " + hits.totalHits.value);
    }
}
