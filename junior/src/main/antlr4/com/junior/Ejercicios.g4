grammar Ejercicios;

programa : instruccion+ EOF;
individual : instruccion EOF;
instruccion : sentencia_if | asignacion PUN_COMA? | expresion PUN_COMA?;
sentencia_if : PR_IF PAR_IZQ expresion PAR_DER LLAVE_IZQ instruccion* LLAVE_DER;
asignacion : ID OP_ASIG expresion;
expresion : expresion_relacional;
expresion_relacional : expresion_aditiva (OP_MAYOR expresion_aditiva)?;
expresion_aditiva : termino ((OP_SUMA | OP_RESTA) termino)*;
termino : factor ((OP_MULT | OP_DIV) factor)*;
factor : ENT | ID | PAR_IZQ expresion PAR_DER;

PR_IF: 'if';
OP_ASIG: '=';
OP_MAYOR: '>';
OP_SUMA: '+';
OP_RESTA: '-';
OP_MULT: '*';
OP_DIV: '/';
PAR_IZQ: '(';
PAR_DER: ')';
LLAVE_IZQ: '{';
LLAVE_DER: '}';
PUN_COMA: ';';
ENT: [0-9]+;
ID: [a-zA-Z_][a-zA-Z_0-9]*;
WS: [ \t\r\n\f]+ -> skip;
