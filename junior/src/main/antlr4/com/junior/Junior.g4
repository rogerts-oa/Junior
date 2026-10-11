grammar Junior;

start
:
	'hello' 'world'
;

WS
:
	[ \t\r\n]+ -> skip
;