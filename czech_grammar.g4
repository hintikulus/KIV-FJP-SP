grammar czech_grammar;

/* Klicova slova */

/* PROMENNA */
FINAL: 'necht'; /* Konstanta */
ASSIGN: 'prave rovno';
DECLARATION: 'existuje';

/* Typy */
BOOLEAN : 'boolean';
INT : 'cislo';
VOID : 'nic';
METHOD_KEYWORD : 'metoda';
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

/* Cyklus */
WHILE : 'dokud';
DO : 'delej';
FOR : 'pro';
FROM : 'od';
TO: 'do';

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

fragment DIGIT : [0-9]+ ;

fragment LOWER_CASE : [a-z] ;

fragment UPPER_CASE : [A-Z] ;

WORD : (LOWER_CASE | UPPER_CASE | '_')+ ;

DECIMAL : DIGIT ;

WHITESPACE : [ \r\t\n]+ -> skip;

LINE_COMMENT : '#' ~[\r\n]* -> skip;

/* Parser */

functionReturnType : INT | BOOLEAN | VOID;

booleanValue : TRUE | FALSE;

varType: INT | BOOLEAN;

numberSignChar: POSITIVE | MINUS;

value: numberSignChar? DECIMAL | booleanValue;

identifier: WORD (WORD | DECIMAL)*;

paralelDeclaration
  : ASSIGN identifier
  ;

decimalVariable: INT identifier (paralelDeclaration)* (ASSIGN numberSignChar? decimalExpression)?;

decimalExpression: numberSignChar? DECIMAL | methodCall | identifier | expressionBody;

boolVariable: BOOLEAN identifier (paralelDeclaration)* ASSIGN booleanExpression;

booleanExpression: booleanValue | methodCall | identifier | expressionBody;

localVariableDeclaration: DECLARATION (decimalVariable | boolVariable) SEMI;

constVariableDeclaration: FINAL localVariableDeclaration;

variableDeclaration: (localVariableDeclaration | constVariableDeclaration);

variableAssignment: identifier ASSIGN expressionBody SEMI;

program
  : block
  ;

block
  : L_CURLY_BRACE blockStatement? R_CURLY_BRACE
  ;

body
  : L_CURLY_BRACE blockBody? R_CURLY_BRACE
  ;

blockStatement
  : (statement
  | methodDeclaration)+
  ;

blockBody
  : (statement)*
  ;

ifstatement:
    IF expression SO body (elsestatement)?;
elsestatement:
    OR body;

forexpression:
    L_ROUND_BRACE identifier FROM decimalExpression TO decimalExpression R_ROUND_BRACE;

statement
  : ifstatement                        #statementIf
  | WHILE expression SO DO body                                  #statementWhile
  | DO body WHILE expression SEMI                               #statementDoWhile
  | FOR forexpression DO body                                   #statementFor
  | methodCall SEMI                                        #statementMethodCall
  | variableAssignment                                      #statementAssigment
  | variableDeclaration                                    #statementVariableDeclaration
  ;

expression: L_ROUND_BRACE expressionBody R_ROUND_BRACE;

expressionBody
  : value                                                          #exprPossibleValue
  | identifier                                                              #exprIdentifier
  | methodCall                                                              #exprMethodCall
  | expressionBody op=(MULTIPLY | DIVIDE | MODULO) expressionBody                     #exprMultipli
  | expressionBody op=(PLUS | MINUS) expressionBody                         #exprAdditive
  | expressionBody op=(GREATER_THAN | GREATER_EQUALS | LESS_THAN | LESS_EQUALS | EQUALS | NOT_EQUALS) expressionBody    #exprRelational
  | expressionBody op=(AND | OR) expressionBody                             #exprLogical
  | L_ROUND_BRACE expressionBody R_ROUND_BRACE                              #exprPar
  | NEGATION expressionBody                                                 #exprNeg
  | MINUS expressionBody                                                    #exprMinus
  | PLUS expressionBody                                                     #exprPlus
  ;

methodDeclaration
  : functionReturnType METHOD_KEYWORD identifier L_ROUND_BRACE (methodParameter (COMMA methodParameter)*)? R_ROUND_BRACE methodBody
  ;

methodParameter
  : varType identifier
  ;

methodBody
  : L_CURLY_BRACE blockBody? (RETURN expressionBody SEMI)? R_CURLY_BRACE
  ;

methodCall
  : identifier L_ROUND_BRACE (methodCallParameter (COMMA methodCallParameter)*)? R_ROUND_BRACE
  ;

methodCallParameter
  : expressionBody
  ;