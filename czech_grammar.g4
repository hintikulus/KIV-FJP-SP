grammar czech_grammar;

/* Klicova slova */

/* PROMENNA */
FINAL: 'necht'; /* Konstanta */
ASSIGN: 'prave rovno';
DECLARATION: 'existuje';

/* Typy */
BOOLEAN : 'vyrok';
INT : 'cislo';
VOID : 'nic';
METHOD_KEYWORD : 'spageta';

/* Operatory */
MULTIPLY : 'krat';
DIVIDE : 'deleno';
MODULO : 'modulo';
PLUS : 'plus';
MINUS : 'minus';
GREATER_THAN : 'vetsi nez';
GREATER_EQUALS : 'vetsi rovno nez';
LESS_THAN : 'mensi nez';
LESS_EQUALS: 'mensi rovno nez';
EQUALS: 'rovno';
NOT_EQUALS: 'nerovno';
NEGATION: 'opak';
AND: 'a zaroven';
OR: 'nebo';

/* Podminka */
IF : 'kdyz';
SO : 'tak';
RETURN: 'vrat';
SWITCH: 'prepinej';
CASE: 'pripad';
DEFAULT: 'jinak';
BREAK: 'zastav';
TERNAL: 'za podminky';

/* Cyklus */
WHILE : 'dokud';
DO : 'delej';
FOR : 'pro';
FROM : 'od';
TO: 'do';
DOUBLE_COMMA: ':';

L_ROUND_BRACE: '(';
R_ROUND_BRACE: ')';
L_CURLY_BRACE: '{';
R_CURLY_BRACE: '}';
COMMA:         ',';
SEMI:          'budiz';

/* Hodnoty */
TRUE : 'pravda';
FALSE: 'lez';
POSITIVE: 'kladne';
NEGATIVE: 'zaporne';

/* Literály */

fragment DIGIT : [0-9] ;

fragment LOWER_CASE : [a-z] ;

fragment UPPER_CASE : [A-Z] ;

DECIMAL : DIGIT+ ;

WORD : (LOWER_CASE | UPPER_CASE | DIGIT | '_')+ ;

WHITESPACE : [ \r\t\n]+ -> skip;

LINE_COMMENT : '#' ~[\r\n]* -> skip;

/* Parser */

/* Hlavni block programu */
program: DO block;

functionReturnType : INT | BOOLEAN | VOID;

booleanValue : TRUE | FALSE;

varType: INT | BOOLEAN;

numberSignChar: POSITIVE | MINUS;

decimalValue: numberSignChar? DECIMAL;

value: decimalValue | booleanValue;

identifier: WORD;

paralelDeclaration
  : ASSIGN identifier
  ;

/* Celé číslo */
decimalVariable: INT identifier (paralelDeclaration)* (ASSIGN numberSignChar? decimalExpression)?;

decimalExpression: numberSignChar? DECIMAL | methodCall | identifier | expression;

/* Pravdivostni hodnota */
booleanVariable: BOOLEAN identifier (paralelDeclaration)* ASSIGN booleanExpression;

booleanExpression: booleanValue | methodCall | identifier | expression;

/* Definice proměnných */
localVariableDeclaration: DECLARATION (decimalVariable | booleanVariable) SEMI;

constVariableDeclaration: FINAL localVariableDeclaration;

variableDeclaration: (localVariableDeclaration | constVariableDeclaration);

/* Přiřazení hodnoty proměnné */
variableAssignment: identifier ASSIGN expression SEMI;

block
    : L_CURLY_BRACE blockStatement? R_CURLY_BRACE
    ;

body
    : L_CURLY_BRACE blockBody? R_CURLY_BRACE
    ;

blockStatement
    : (statement | methodDeclaration)+
    ;

blockBody: (statement)*;

/* Konstrukce */
statement
    : IF expression SO body (elsestatement)? #statementIf
    | WHILE expression SO DO body                                             #statementWhile
    | DO body WHILE expression SEMI                                           #statementDoWhile
    | FOR identifier FROM decimalExpression TO decimalExpression DO body      #statementFor
    | methodCall SEMI                                                         #statementMethodCall
    | variableAssignment                                                      #statementAssigment
    | variableDeclaration                                                     #statementVariableDeclaration
    | SWITCH expression switchBlock                                           #switchStatement
    | returnStatement #statementReturn
    | BREAK SEMI #statementBreak
    ;

/* Výrazy */
expression
    : value                                                         #exprPossibleValue
    | identifier                                                    #exprIdentifier
    | methodCall                                                    #exprMethodCall
    | expression op=(MULTIPLY | DIVIDE | MODULO) expression         #exprMultipli
    | expression op=(PLUS | MINUS) expression                       #exprAdditive
    | expression op=(GREATER_THAN | GREATER_EQUALS | LESS_THAN | LESS_EQUALS | EQUALS | NOT_EQUALS) expression    #exprRelational
    | expression op=(AND | OR) expression                           #exprLogical
    | L_ROUND_BRACE expression R_ROUND_BRACE                        #exprPar
    | NEGATION expression                                           #exprNeg
    | MINUS expression                                              #exprMinus
    | PLUS expression                                               #exprPlus
    | TERNAL expression SO expression DEFAULT expression            #ternalOperator
    ;

methodDeclaration
    : METHOD_KEYWORD functionReturnType identifier L_ROUND_BRACE (methodParameter (COMMA methodParameter)*)? R_ROUND_BRACE methodBody
    ;

methodParameter
    : varType identifier
    ;

elsestatement:
    OR body;

returnStatement:
    RETURN (expression)? SEMI;

methodBody
    : L_CURLY_BRACE blockBody? (returnStatement)? R_CURLY_BRACE
    ;

methodCall
    : identifier L_ROUND_BRACE (expression (COMMA expression)*)? R_ROUND_BRACE
    ;

switchBlock: L_CURLY_BRACE (caseBlock)* (defaultBlock)? R_CURLY_BRACE;

caseBlock: CASE value SO blockBody;

defaultBlock: DEFAULT SO blockBody;

/*
existuj x prave rovno (c rovno pravda) tak c prave rovno 4 jinak c prave rovno 0 budiz
*/