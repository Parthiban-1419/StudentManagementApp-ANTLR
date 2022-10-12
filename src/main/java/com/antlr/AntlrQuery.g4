grammar AntlrQuery ;

antlrQuery : orQuery | EOF ;
orQuery : andQuery (OR andQuery)* ;
andQuery : query (AND query)*;
query : expression | OPENBRACKET orQuery CLOSEBRACKET ;
expression : orValue  | field separator orValue | field (orValue);
orValue : OPENBRACKET orValue (OR andValue)* CLOSEBRACKET | andValue (OR andValue)* ;
andValue : value (AND value)* ;
value : rangeValue | number | VALUE | CONTAINS VALUE;
rangeValue : FROM NUMBER (TO | AND) NUMBER | RANGESTART NUMBER TO NUMBER RANGEEND | (INBETWEEN | BETWEEN) NUMBER (AND | TO) NUMBER ;
number : NUMBER | (GREATERTHAN | GREATERTHANOREQUAL | LESSTHAN | LESSTHANOREQUAL) NUMBER ;
separator : NOTEQUAL | EQUAL | NOT  | SEPERATOR ;
field : STRING ;


CONTAINS :  ('C' |'c')('O' | 'o')('N' |'n')('T' | 't')('A' | 'a')('I' | 'i')('N' | 'n')('S' | 's');
SEPERATOR : 'in' | 'is' | ':' ;
EQUAL : '=' | '==' | '===' | ('E' | 'e')('Q' | 'q')('U' | 'u')('A' | 'a')('L' |'l')(TO | ' ' TO);

NOT : '!' | '!=' | ('N' | 'n')('O' | 'o')('T' | 't') ;
NOTEQUAL : NOT (EQUAL | ' ' EQUAL) ;
OR : ('O' | 'o')('R' |'r') | '|' ;
AND : ('A' | 'a')('N' | 'n' )('D' | 'd') | '&' | '&&' | ',' ;
TO : ('T' | 't')('O' | 'o') | '-' ;

OPENBRACKET : '(' ;
CLOSEBRACKET : ')' ;

FROM : ('F' | 'f')('R' | 'r')('O' | 'o')('M' | 'm') ;
INBETWEEN : ('I' |'i')('N' | 'n') (BETWEEN | ' ' BETWEEN);
BETWEEN : ('B' | 'b')('E' | 'e')('T' | 't')('W' | 'w')('E' | 'e')('E' | 'e')('N' | 'n') ;
RANGESTART : '[' ;
RANGEEND : ']' ;

NUMBER : [0-9]+ ;

QUOTE :  '\'' | '"';
VALUE : QUOTE STRING (' ' STRING)* QUOTE;
STRING : [a-zA-Z0-9*?+]+;

THAN : ('T' | 't')('H' | 'h')('A' |'a')('N' |'n');

GREATER :  ('G' | 'g')('R' | 'r')('E' | 'e')('A' | 'a')('T' | 't')('E'| 'e')('R' | 'r') ;
GREATERTHAN : '>' | GREATER (THAN | ' ' THAN) ;
GREATERTHANOREQUAL : '>=' | '=>' | '> =' | '= >' | GREATERTHAN (OR | ' ' OR) (EQUAL | ' ' EQUAL);

LESS :  ('L' | 'l')('E' | 'e')('S' | 's')('S' | 's') ;
LESSTHAN : '<' | LESS (THAN | ' ' THAN);
LESSTHANOREQUAL : '=<' | '= <' | '<=' | '< =' | LESSTHAN (OR | ' ' OR) (EQUAL | ' ' EQUAL);

ESCAPE : (' ' | '\t' | '\n' | '\r' )+ -> skip;






























