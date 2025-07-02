```antlr

javac LibExpr*.java

grun LibExpr prog -tree
6+8
>eof
(prog (stat (expr (expr 6) + (expr 8)) \n))



grun LibExpr prog -gui

```