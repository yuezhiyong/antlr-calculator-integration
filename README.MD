# ANTLR4 基础与进阶

## 了解ANTLR4基本工作流程

ANTLR4的工作过程可分为五个阶段：

1. **语法定义**：编写`.g4`语法文件
2. **代码生成**：ANTLR自动生成词法分析器(Lexer)和语法分析器(Parser)
3. **集成应用**：将生成的代码嵌入到你的程序中
4. **解析输入**：处理文本生成语法树
5. **遍历语法树**：通过监听器(Listener)或访问者(Visitor)模式操作语法树

---

## Hello World 案例

### G4文件三大组成部分

每个ANTLR语法文件都包含三个核心部分：

1. **语法声明**（Grammar Declaration）
2. **解析规则**（Parser Rules）
3. **词法规则**（Lexer Rules）

### 完整示例：Hello.g4

```antlr
// 1. 语法声明（必须与文件名一致）
grammar Hello;

// 2. 解析规则（小写字母开头）
// 定义语言结构：匹配'Hello'后接一个标识符
r : 'Hello' ID ;

// 3. 词法规则（大写字母开头）
// 定义如何将字符组合成词法符号

// 匹配1个或多个小写字母
ID : [a-z]+ ;

// 匹配空白字符但丢弃（不传给解析器）
WS : [ \t\r\n]+ -> skip ;


```

## 数组语法解析案例

```antlr

 ArrayInitParser.java: 该文件包含专为识别数组语言语法而定义的 ArrayInit 语法解析器类.该文件包含语法中每个规则对应的解析方法，以及一些辅助代码
 
 ArrayInitLexer.java: ANTLR 会自动从语法定义中提取独立的解析器（parser）和词法分析器（lexer）规范。该文件包含由 ANTLR 生成的词法分析器类定义，其基于对词法规则（如 INT 和 WS）以及语法字面量（如 {、, 和 }）的分析而生成。词法分析器的作用是对输入进行词法标记化（tokenize），将其拆分为词汇符号。以下是该类的结构概览.
 
 ArrayInit.tokens: ANTLR会为我们定义的每个词法符号分配一个类型编号，并将这些值存储在此文件中。当我们需要将大型语法拆分为多个小型语法时，该文件可确保ANTLR能同步所有词法符号类型编号.
 
 
 ArrayInitListener.java, ArrayInitBaseListener.java: ANTLR 解析器默认会基于输入内容构建语法树。通过遍历该语法树，树遍历器（tree walker）可向我们提供的监听器对象（listener）触发"事件"（即回调函数）.
 


```



