grammar AntlrQuery ;

antlrQuery : orQuery | EOF ;
orQuery : andQuery (OR andQuery)* ;
andQuery : query (AND query)*;
query : expression | OPENBRACKET orQuery CLOSEBRAKET ;
expression : orValue  | field separator orValue | field (orValue);
orValue : OPENBRACKET orValue CLOSEBRAKET | andValue (OR andValue)* ;
andValue : value (AND value)* ;
value : rangeValue | number | VALUE ;
rangeValue : FROM NUMBER (TO | AND) NUMBER | RANGESTART NUMBER TO NUMBER RANGEEND | (INBETWEEN | BETWEEN) NUMBER (AND | TO) NUMBER ;
number : NUMBER | (GREATERTHAN | GREATERTHANOREQUAL | LESSTHAN | LESSTHANOREQUAL) NUMBER ;
separator : NOTEQUAL | EQUAL | NOT  | SEPERATOR ;
field : STRING ;


OPERATOR :  '~';
SEPERATOR : 'in' | 'is' | ':' ;
EQUAL : '=' | '==' | '===' | ('E' | 'e')('Q' | 'q')('U' | 'u')('A' | 'a')('L' |'l')(TO | ' ' TO);

NOT : '!' | '!=' | ('N' | 'n')('O' | 'o')('T' | 't') ;
NOTEQUAL : NOT (EQUAL | ' ' EQUAL) ;
OR : ('O' | 'o')('R' |'r') | '|' ;
AND : ('A' | 'a')('N' | 'n' )('D' | 'd') | '&' | '&&' | ',' ;
TO : ('T' | 't')('O' | 'o') | '-' ;

OPENBRACKET : '(' ;
CLOSEBRAKET : ')' ;

FROM : ('F' | 'f')('R' | 'r')('O' | 'o')('M' | 'm') ;
INBETWEEN : ('I' |'i')('N' | 'n') (BETWEEN | ' ' BETWEEN);
BETWEEN : ('B' | 'b')('E' | 'e')('T' | 't')('W' | 'w')('E' | 'e')('E' | 'e')('N' | 'n') ;
RANGESTART : '[' ;
RANGEEND : ']' ;

NUMBER : [0-9]+ ;

QOUTE :  '\'' | '"';
VALUE : QOUTE STRING (' ' STRING)* QOUTE;
STRING : [a-zA-Z0-9*?+]+;

THAN : ('T' | 't')('H' | 'h')('A' |'a')('N' |'n');

GREATER :  ('G' | 'g')('R' | 'r')('E' | 'e')('A' | 'a')('T' | 't')('E'| 'e')('R' | 'r') ;
GREATERTHAN : '>' | GREATER (THAN | ' ' THAN) ;
GREATERTHANOREQUAL : '>=' | '> =' | GREATERTHAN (OR | ' ' OR) (EQUAL | ' ' EQUAL);

LESS :  ('L' | 'l')('E' | 'e')('S' | 's')('S' | 's') ;
LESSTHAN : '<' | LESS (THAN | ' ' THAN);
LESSTHANOREQUAL : '<=' | '< =' | LESSTHAN (OR | ' ' OR) (EQUAL | ' ' EQUAL);

ESCAPE : (' ' | '\t' | '\n' | '\r' )+ -> skip;






























