package org.example.loader.csv;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.example.csv.CSVLexer;

import java.io.FileInputStream;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if ( args.length>0 ) inputFile = args[0];
        InputStream is = System.in;
        if ( inputFile!=null ) is = new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(is);
        CSVLexer initLexer = new CSVLexer(input);
        // 创建通用令牌流，存储词法分析结果
        CommonTokenStream tokenStream = new CommonTokenStream(initLexer);
        ParseTreeWalker walker = new ParseTreeWalker();
        CSVLoader loader = new CSVLoader();
        CSVParser parser = new CSVParser(tokenStream);
 	    walker.walk(loader, parser.file());
 	    System.out.println(loader.rows);
    }
}
