```antlr

生成visitor代码
antlr4 -no-listener -visitor LabeledExpr.g4
编译EvalVisitor
javac EvalVisitor.java
编译Clac
javac Clac.java

计算执行input的表达式结果
java Clac input.expr
```