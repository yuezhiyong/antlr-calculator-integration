grammar Calc;

/** The start rule; begin parsing here. */

prog: stat+;

stat: expr NEWLINE
    | ID '=' expr NEWLINE
    | NEWLINE
    ;


expr: expr ('*' | '/') expr
    | expr ('+' | '-') expr
    | INT
    | ID
    | '(' expr ')'
    ;


ID: [a-zA-Z]+ ;

INT: [0-9]+;

NEWLINE: '\r'? '\n' ;

WS  :   [ \t]+ -> skip ;


