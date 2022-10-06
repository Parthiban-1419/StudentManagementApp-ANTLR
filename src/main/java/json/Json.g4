grammar Json;

json : '{' STRING ':' value '}' | EOF;
value : STRING | NUMBER | BOOLEAN | 'null' | object;
object : json | array;
array : '[' value (',' value)* ']' | '[' ']' ;

STRING : '\'' [a-zA-Z0-9]+ '\'';
NUMBER : [0-9]+;
BOOLEAN : 'true' | 'false';
WS : [ \t\n\r] + -> skip;