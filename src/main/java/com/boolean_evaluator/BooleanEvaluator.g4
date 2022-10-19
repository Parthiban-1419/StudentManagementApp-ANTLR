grammar BooleanEvaluator   ;

booleanQuery : orQuery | EOF ;
orQuery : andQuery (OR andQuery)* ;
andQuery : query (AND query)* ;
query : key comparisonOperator value | '(' orQuery ')' ;

key : ALPHANUMERIC ;
comparisonOperator :  '=' | '!=' | '>'| '>=' | '<' | '<=' |  CONTAINS | MATCHES | ENDS_WITH | STARTS_WITH ;
value : BOOLEAN | INTEGER | DOUBLE | NULL | STRING ;

INTEGER : [0-9]+ ;
DOUBLE : [0-9]+ ;
NULL : ('N' | 'n')('U' | 'u')('L' | 'l')('L' | 'l') ;
CONTAINS : ('C' | 'c')('O' | 'o')('N' | 'n')('T' | 't')('A' | 'a')('I' | 'i')('N' | 'n')('S' | 's') ;
MATCHES : ('M' | 'm')('A' | 'a')('T' | 't')('C' | 'c')('H' | 'h')('S'| 's') ;
ENDS_WITH : ENDS (WITH | ' ' WITH) ;
STARTS_WITH : STARTS (WITH | ' ' WITH) ;
AND : ('A' | 'a')('N' |'n')('D' | 'd') ;
OR : ('O' |'o')('R' | 'r') ;

BOOLEAN : TRUE | FALSE ;

TRUE : ('T' | 't')('R' | 'r')('U' | 'u')('E' | 'e') ;
FALSE : ('F' |'f')('A' |'a')('L' |'l')('S' |'s')('E' |'e') ;

STRING : SINGLEQUOTE ALPHANUMERIC SINGLEQUOTE | DOUBLEQOUTE ALPHANUMERIC  DOUBLEQOUTE ;

ENDS : ('E' | 'e')('N' | 'n')('D' | 'd')('S' | 's') ;
WITH : ('W' | 'w')('I' | 'i')('T' | 't')('H' | 'h') ;
STARTS : ('S' | 's')('T' | 't')('A' | 'a')('R' | 'r')('T' | 't')('S' |'s') ;
SINGLEQUOTE : '\'' ;
DOUBLEQOUTE : '"' ;

ALPHANUMERIC : [a-zA-Z0-9_*$]+ ;

ESCAPE : [ \t\n\r"]+ -> skip ;

