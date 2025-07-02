package org.example.arithmetic;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.InputStream;

public class AppMain {

	@SuppressWarnings("deprecated")
    public static void main(String[] args) throws Exception {
        String inputFile = null; 
		if ( args.length>0 ) inputFile = args[0];
		InputStream is = System.in;
		if ( inputFile!=null ) is = new FileInputStream(inputFile);
		ANTLRInputStream input = new ANTLRInputStream(is);
		CalcLexer lexer = new CalcLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		CalcParser parser = new CalcParser(tokens);
		ParseTree tree = parser.prog(); // parse; start at prog
		System.out.println(tree.toStringTree(parser)); // print tree as text
    }
}
