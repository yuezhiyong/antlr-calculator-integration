// Define a grammar named 'Hello'
grammar Hello;
// Rule 'r' matches the word 'Hello' followed by an ID token
r: 'Hello' ID;
// ID token definition: matches one or more lowercase letters [a-z]
ID: [a-z]+;
// WS (whitespace) token definition: matches spaces, tabs, carriage returns, or newlines
// The '-> skip' directive tells the lexer to skip/discard these tokens
WS: [ \t\r\n]+ -> skip ;