grammar Query;

query : orExpression | EOF;
orExpression : andExpression (OR andExpression)*;
andExpression : expression (AND expression)*;
expression : ATTRIBUTE COMPARISON VALUE;

OR : 'OR' | '|' | 'or';
AND : 'AND' | '&' | '&&' | 'and';

COMPARISON : GREATER | LESSER | EQUAL | GREATER EQUAL | LESSER EQUAL | NOT EQUAL;
VALUE : '\'' VAL+  '\'' ;
ATTRIBUTE : LETTER+;
WHITESPACE : (' ' | '\t' | '\n' | '\r')+ -> skip;

fragment LETTER : [a-zA-Z0-9_];
fragment VAL : [a-zA-Z0-9_* /\-:];
fragment GREATER : '>';
fragment LESSER : '<';
fragment EQUAL : '=';
fragment NOT : '!';
fragment QUOTE : '\'' | '"';