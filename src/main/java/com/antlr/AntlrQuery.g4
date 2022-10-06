grammar AntlrQuery;

antlrQuery : orQuery | EOF ;
orQuery : andQuery (OR andQuery)* ;                                 //
andQuery : query (AND query)* ;
query : expression | STRING SEPERATOR expression;                  //
expression : andValue (OR andValue)* ;                          //
andValue : value (AND value)* ;                                 //
value : COMPARISON NUMBER | '[' NUMBER TO NUMBER ']' | NUMBER | VALUE ;      //


SEPERATOR : ':' | '=';
OR : ('O' | 'o')('R' |'r') | '|';
AND : ('A' | 'a')('N' | 'n' )('D' | 'd') | '&' | '&&' ;


//NUMBERRANGE : OPENBRACKET NUMBER TO NUMBER CLOSEBRACKET ;
//OPENBRACKET : '[';
//CLOSEBRACKET : ']';
TO : ('T' | 't')('O' | 'o') | '-';

COMPARISON : '>' | '>=' | '<' | '<=' | '!' ;
NUMBER : [0-9]+;

STRING : [a-zA-Z0-9]+;
VALUE : QOUTE (STRING | ('*' | '?' | '+')) QOUTE;

QOUTE :  '\'';
ESCAPE : (' ' | '\t' | '\n' | '\r' | '(' | ')' )+ -> skip;
