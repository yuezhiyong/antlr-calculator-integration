package org.example.trigger;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.example.arrayInit.ArrayInitLexer;
import org.example.arrayInit.ArrayInitParser;

public class AppMain {

    public static void main(String[] args) throws Exception{
        // 创建ANTLR输入流，从标准输入读取数据
        ANTLRInputStream antlrInputStream = new ANTLRInputStream(System.in);

        // 创建词法分析器(Lexer)，处理输入流
        ArrayInitLexer initLexer = new ArrayInitLexer(antlrInputStream);

        // 创建通用令牌流，存储词法分析结果
        CommonTokenStream tokenStream = new CommonTokenStream(initLexer);

        // 创建语法分析器(Parser)，处理令牌流
        ArrayInitParser parser = new ArrayInitParser(tokenStream);

        // 从init规则开始进行语法分析，生成解析树
        ParseTree parseTree = parser.init();

        // 以字符串形式输出解析树结构
        System.out.println(parseTree.toStringTree(parser));
    }
}
