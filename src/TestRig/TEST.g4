grammar TEST;
program: PROGRAM ID BRACKET_OPEN println+ BRACKET_CLOSE;
expression:
	left = expression DIV right = expression	# Div
	| left = expression MUL right = expression	# Mul
	| left = expression PLUS right = expression	# Plus
	| left = expression MIN right = expression	# Minus
	| number = NUMBER							# Number;

println:
	PRINTLN PAIR_OPEN argument = expression PAIR_CLOSE SEMICOLON;

PROGRAM: 'program';
PRINTLN: 'println';

BRACKET_OPEN: '{';
BRACKET_CLOSE: '}';
PAIR_OPEN: '(';
PAIR_CLOSE: ')';
SEMICOLON: ';';

PLUS: '+';
MIN: '-';
DIV: '/';
MUL: '*';

NUMBER: [0-9]+;
ID: [a-zA-Z]+;

WS: [ \t\n\r]+ -> skip;
