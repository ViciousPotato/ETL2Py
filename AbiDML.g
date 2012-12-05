grammar AbiDML;

options {
	backtrack = true;
}

@header {
import java.util.HashMap;
}

@members {
HashMap symtable = new HashMap();
int indentlevel = 0;

public void output(String s) {
    for (int i = 0; i < indentlevel; i++) {
        System.out.print("    ");
    }
    System.out.println(s);
}
}

top_level
	:	type opt_semicolon | declaration_list
	;

// ------------------ Types -----------------------------
type	returns [String typename, Object value, Object extra]
	:	base_type
		{
			$typename = $base_type.typename;
			$value = $base_type.value;
			$extra = $base_type.extra;
		}
	|	
		compounding_type // | TYPE_NAME
	;

base_type returns [String typename, Object value, Object extra]
	:	native_type
		{
			$typename = $native_type.typename;
		}
	|
		binary_integer_type
		{
			$typename = "integer";
		}
	|
		decimal_type
		{
			$typename = "decimal";
			$extra = $decimal_type.sep;
		}
	|
		real_type
	|
		date_type
	|
        	datetime_type
        |	
        	string_type
        	{
        		$typename = "string";
        		$value = "";
        		$extra = $string_type.sep;
        	}
        |
        	void_type
	;
    
compounding_type
	:	vector_type | record_type // | union_type
	;

vector_length_type
	:	native_type | binary_integer_type | decimal_type | real_type	
	;
	
vector_type // Simple vector, 1 dimension. only constant
	:	base_type '[' (constant_expr | size_expr | delimiter_expr | vector_length_type)? ']'
	;

record_type
    :   character_family? 'record' slots? 'end' opt_delim
    	{
    		String cls = "class Test(RecordVarSequence):\n";
    		       cls +="    def __init__(self):\n";
    		       cls +="        RecordVarSequence.__init__(self)\n";
    		for (Object s : $slots.slots) {
    		       cls +="        " + (String)s + "\n";
    		}
    		System.out.println(cls);
    	}
    ;

slots returns [List slots]
@init {$slots = new ArrayList();}	:
	s=slot{ $slots.add($s.expr); } (s=slot{ $slots.add($s.expr); })*;
	

slot returns [String expr]
	:
       /*type f=field_name (lb='[' c=constant? ']')? o=opt_init ';' 
    	{
    		$expr = "self." + $f.text + " = Var(\""+$type.typename+"\", " + $type.extra + ", " + $o.expr +  ")";    		
    	}*/
	    	type var_list ';'
	//|	type ID '(' arg_list ')' '=' expression ';'  //Don't handle function field currently
	//|	'begin' slot+ 'end' opt_semicolon 
	//|	'if' '(' expression ')' slot ('else' slot)?
    	;

// ------------------------- Expressions ---------------------------------------------------

primary_expression
	:	constant_expr
	|	funcall_expr
	|	variable_expr
	|	unarycall
	|	cast_expr
	|	reinterpret_expr
	|	'(' expression ')'
	|	null_expr
	|	getenv_expr
	|	whole_record_expr
	|	loop_expr
	|	make_record_expr
	|	make_vector_expr
	;

cast_expr:	'(' type ')' expression
	;
	
reinterpret_expr
	:	'reinterpret_as' '(' type ',' expression ')'	
	;

getenv_expr
	:	'$' name	
	;

whole_record_expr
	:	'this_record'	
	;

loop_expr
	:	'while' '(' expression ')' opt_statement+ ':' expression
	|	'for' '(' variable_expr ',' expression ')' opt_statement+ ':' expression	
	;

opt_statement
	:	assignment
	|	block_statement	
	;

make_record_expr
	:	'[' 'record' record_expr_slots ']'
	;

record_expr_slots
	:	field_name expression (',' field_name expression)*	
	;

make_vector_expr
	:	'[' 'vector' expression (',' expression)* ']'
	;

expression returns [String expr]
	:	
		(
			primary_expression (
				('.' (name+ | '*')) // field_expr
			| 
				(binop expression) // binarycall
			|
				('[' expression ']') // element_expr
			|
				(conditionalop expression) 
			| 	
				('?' expression ':' expression)
			)? 
		)
	|
		'if' '(' expression ')' expression ('else' expression)?
// in brackets are field_expr
//	|	(field_expr)=>field_expr
//	|	(element_expr)=>element_expr
//	|	(binarycall)=>binarycall
//	|	(conditional)=>conditional
	;

	
field_expr
	:	primary_expression '.' (name+ | '*')
	;

element_expr
	:	primary_expression '[' expression ']'
	;


binarycall
	:	primary_expression binop expression
	;

conditionalop
	:	'||' | 'or' | '&&' | 'and'
	;

conditional
	:	primary_expression (conditionalop expression | '?' expression ':' expression)
	|	'if' '(' expression ')' expression ('else' expression)?
    	;

funcall_expr returns [String expr]
	:	ID '(' argument_list ')'
		{
			$expr = $ID.text + "(" + $argument_list.expr + ")";
		}
	;

variable_expr
	:	name	
	;

name	:	ID
	;

unarycall
	:	'+' expression
	|	'!' expression
	|	'~' expression
	;

argument_list returns [String expr]
	:	e=expression {$expr = $e.expr;} (',' e2=expression {$expr = $expr + "," + $e2.expr;})*
	;

ifr_expression
	:	'(' '(' type ')' expression')'	
	;

if_expression
	:	'if' '(' expression ')' ifr_expression ('else' ifr_expression)?	
	;



/*
lefthand_expression returns [String expr]
	:	(ID '(') => funcall_expr {$expr = $funcall_expr.expr;} 
	|	primary_expression {$expr = $primary_expression.expr;}
	| 	if_expression
	;

expression returns [String expr]
	:	lefthand_expression {$expr = $lefthand_expression.expr;} (binop e=expression {$expr = $expr + $binop.text + $e.expr;})*
	;
	*/
/*
expression returns [String expr]
	:	(
	
		c=constant {$expr = $c.text;} 
	|	id=ID {$expr = $id.text;}
	|	fid=ID '.*' {$expr = $fid.text + ".*";} // field_expr 
	
		) 
		(b=binop e=expression {$expr = $expr + $b.text + $e.expr;})*
	;
*/

binop	:	'+' | '-' | '*' | '/' | '%' | '<' | '<=' | '>' | '>=' | '==' | '!=' |
		'&' | '^' | '|' |
		'<<' | '>>' |
		'and' | 'or' | '&&' | '||' 
	;

unop	:	 '+' | '!' | '~';



delimiter_expr
	:	'delimiter' '==' expression
	;
size_expr
	:	variable_expr
	|	(funcall_expr) => funcall_expr
	
	|	unarycall
	
	|	(field_expr)   => field_expr
	|	(element_expr) => element_expr
	|	(binarycall)   => binarycall
	|	(conditional)  => conditional
	
	|	(cast_expr) => cast_expr
	|	'(' expression ')'	
	;



constant_expr returns [String text]
    :   INT    {$text = $INT.text;}
    | 	FLOAT  {$text = $FLOAT.text;}
    | 	STRING {$text = $STRING.text;} // and decimal, but what about | unarycall | '-' expression???
//    |	CHAR   {$text = $CHAR.text;}
    ;
        

var_list:	var (',' var)*
	;

var	:	field_name opt_init
	|	field_name '[' constant_expr ']' opt_init
	|	field_name '[' size_expr ']' opt_init
	| 	field_name '[' delimiter_expr ']' opt_init
	|	field_name '[' ']' opt_init
	;


arg_list:	arg (',' arg)*
	;

arg	:	type ID
	;
/*
var_list returns [List vars]
@init {$vars = new ArrayList();}
	:	v=var {$vars.add($v.expr);} (',' v=var{$vars.add($v.expr);})* 
	;

var returns [String expr]
	:	f=field_name (lb='[' c=constant? ']')? o=opt_init // simple var, no size_expr and delimiter_expr
		{
			$expr = $f.text + $o.expr;
		}
	;
*/
field_name 
	:	ID;

opt_init returns [String expr] 
	:	('=' (e=expression {$expr = $e.expr;}
		     | null_expr '(' expression ')' {$expr = "NULL";}))?
	;

null_expr
	:	'NULL'
	;

native_type returns [String typename]
    :   sign_spec? ('char' {$typename="char";} | 'short' {$typename="short";} | 'int' {$typename="int";} | 'long' {$typename="long"}) 
    		    |   'float' {$typename = "float";}
    		    |   'double' {$typename ="double";}
    ;

binary_integer_type
    :   sign_spec? endian_spec? 'integer' '(' INT ')'
    ;
    
decimal_type returns [String sep]
    :   character_family? 'decimal' '(' ( INT | decl_string) ')'
    	{
    		// judge INT size = 4 or 8
    		$sep = $decl_string.text;
    	}
    ;
    
date_type
    :   character_family? 'date' '(' decl_string (',' param)* ')' opt_delim
    ;

datetime_type
    :   character_family? 'datetime' '(' decl_string (',' param)* ')' opt_delim
    ;
    
real_type
    :   sign_spec? endian_spec? float_family? 'real' '(' INT ')'
    ;

varstring_length_type
    :   native_type | binary_integer_type | decimal_type | real_type
    ;
    
string_type returns [String sep]
    :   character_family? 'string' '(' (INT | decl_string {$sep = $decl_string.text;} | varstring_length_type) ')'
    ;
    
character_family
    :   'ascii' | 'ebcdic' | 'iso_8859_2' | 'iso_8859_3' | 'iso_8859_4' | 'iso_8859_5' | 'iso_8859_6' |
        'iso_8859_7' | 'iso_8859_8' | 'iso_8859_9' | 'jis_201' | 'jis_208_euc' | 'jis_208_sjis' |
        'utf8' | endian_spec 'unicode' | 'packed'
    ;

void_type
    :   'void' '(' INT ')'
    ;

param_list
	:	param (',' param)*
	;

param	:	ID '=' decl_string
	;


opt_delim
    :   ('(' decl_string ')')?
    ;

sign_spec
    :   'signed' | 'unsigned'
    ; //empty

endian_spec
    :   'big' 'endian' | 'little' 'endian'
    ; // empty

float_family
    :   'ieee' | 'ibm'
    ; //empty

decl_string
    :   STRING
    ;
/*
declaration_list
	:	declaration+
	;

declaration
	:	
	;
*/
opt_semicolon
	:	';'?
	;

// ------------declaration ------------------
declaration_list
	:	declaration+
	;

declaration
	:	transform_declaration
	;

transform_declaration
    :   name_list '::' ID '(' name_list ')' '=' 'begin' variable_declaration_list xfr_statement_list 'end' opt_semicolon
    ;

name_list
	:	(ID ',')* ID
	;

variable_declaration_list
	:	variable_declaration*
	;

variable_declaration
	:	'let' t=type ID (a='=' expression)? ';' 
		{
			// TODO: get expression value
			if ($a != null) {
				if ($t.typename.equals("string")) {
					output($ID.text + "= StringVar(" + $t.extra + ", " + "" + ")");
				} else if ($t.typename.equals("decimal")) {
					output($ID.text + "= DecimalVar(" + $t.extra + ", " + "" + ")");
				} else if ($t.typename.equals("int")) {
					output($ID.text + "=0");
				}
			
			} else {
				if ($t.typename.equals("string")) {
					output($ID.text + "= StringVar(" + $t.extra + ")");
				} else if ($t.typename.equals("decimal")) {
					output($ID.text + "= DecimalVar(" + $t.extra + ")");
				} else if ($t.typename.equals("int")) {
					output($ID.text + "=0");
				}
			}
		}
	;

xfr_statement_list
	:	xfr_statement+
	;

xfr_statement
	:	rule | procedural_statement
	;

rule	:	out_expr_list (':' optional_priority ':' | '::') expression (',' expression)* ';'
    	;

procedural_statement
	:	(if_statement | while_statement | for_statement | block_statement | assignment) ';'?
	;
    
assignment
	:	out_expr '=' expression
	;

out_expr
	:	(field_expr) => field_expr
	|	(element_expr) => element_expr
	|	variable_expr
	;

/*
field_expr
	:	 expression ('.' ID | '.*')
	;

element_expr
	:	expression '[' expression ']'
	;
*/
if_statement
    :   'if' '(' expression ')' procedural_statement ('else' procedural_statement)?
    	{
    		//System.out.println($expression.expr);
    	}
    ;

while_statement
    :   'while' '(' expression ')' procedural_statement
    ;
    
switch_statement
    :   'switch' '(' expression ')' case_actions 'end' ';' //;????
    ;

case_actions
    :   ('case' match_list ':' procedural_statement ';' case_actions | 'default' ':' procedural_statement)?
    ;

match_list
    :   expression  (',' match_list)?
    ;
    
for_statement
    :   'for' '(' ID ',' expression ')' procedural_statement
    ;

block_statement
    :   'begin' variable_declaration_list procedural_statement_list 'end'
    ;

procedural_statement_list
    :   (procedural_statement+ | switch_statement)?
    ;
    
out_expr_list
    :   out_expr (',' out_expr)*
    ;
    
optional_priority
    : INT?
    ;
    	

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :	'0'..'9'+
    ;

FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
    ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

STRING
    :
    	'"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

/*
CHAR:  '\'' ( ESC_SEQ | ~('\''|'\\') ) '\''
    ;
*/
fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;
