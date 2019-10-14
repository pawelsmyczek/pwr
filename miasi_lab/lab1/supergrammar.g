grammar supergrammar;



plik 	
	: expr*EOF	
	;

expr
	: term (PLUS term
	| MINUS term)*
	;

term
	: atom (MUL atom
	| DIV atom)*
	;
atom
	: INT
	| (LP expr RP)
	;



ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :	'0'..'9'+
    ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        ) {$channel=HIDDEN; skip();}
    ;

NL
	: '\r'? '\n' {skip();}
	;

PLUS	
	: '+'
	;

MINUS	
	: '-'
	;

MUL	
	: '*'
	;

DIV	
	: '/'
	;

LP	
	: '('
	;

RP	
	: ')'
	;
