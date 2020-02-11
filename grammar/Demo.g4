grammar Demo;
main: PROGRAM ID BRACKET_OPEN program BRACKET_CLOSE;
program: programPart+;
programPart:
	sentence	# MainSentences
	| function	# FunctionDeclarations;
sentence: println | var_decl | var_assign;

var_decl: INT varName = ID ;
var_assign: varName = ID ASSIGN exp = expression ;

expression:
	left = expression DIV right = expression	# Div
	| left = expression MUL right = expression	# Mul
	| left = expression MIN right = expression	# Minus
	| left = expression PLUS right = expression	# Plus
	| number = NUMBER							# Number
	| varName = ID								# Variable
	| functionCall								# FunCallExpression;

println:
	PRINTLN PAIR_OPEN argument = expression PAIR_CLOSE;
function:
	INT FUNCTION funcName=ID PAIR_OPEN params=parameterDeclaration PAIR_CLOSE BRACKET_OPEN statements=statementsList RETURN returnValue = expression
		 BRACKET_CLOSE;
functionCall: funcName = ID PAIR_OPEN arguments=expressionList PAIR_CLOSE ;
parameterDeclaration: declarations+= var_decl (COMMA var_decl)*
|
;
expressionList: expressions+=expression (COMMA expression)*
|
;
statementsList:sentence*;
PROGRAM: 'program';
PRINTLN: 'println';
FUNCTION: 'function';
RETURN: 'return';

BRACKET_OPEN: '{';
BRACKET_CLOSE: '}';
PAIR_OPEN: '(';
PAIR_CLOSE: ')';
SEMICOLON: ';';
COMMA:',';

PLUS: '+';
MIN: '-';
DIV: '/';
MUL: '*';

INT: 'int';
STRING: 'string';
ASSIGN: '=';

NUMBER: [0-9]+;
ID: [a-zA-Z][a-zA-Z0-9]*;

WS: [ \t\n\r]+ -> skip;
