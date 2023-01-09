grammar CzechGrammar;

/* -------------- lexical rules -------------- */

/* ------ Keywords ------ */
/* types */
BOOLEAN : 'vyrok' ;
INT   : 'cislo' ;

/* condition */
IF    : 'kdyz' ;
ELSE  : 'jinak' ;
SWITCH  : 'prepinej' ; // todo mozna pregenerovat a napsat prepinac, doresit nazev default vetve
CASE  : 'pripad' ;
DEFAULT : 'v jinem pripade' ;

/* loops */
FOR   : 'pro' ;
WHILE : 'dokud' ;
DO    : 'delej' ;
REPEAT  : 'od' ;
UNTIL : 'do' ;

VOID  : 'nic' ;
RETURN : 'vrat' ;
CONST : 'necht existuje' ;
FUNCTION_KEYWORD : 'spageta' ;

/* ------ Operators ------ */
TRUE  : 'pravda' ;
FALSE : 'nepravda' ;
MULT  : 'krat' ;
DIV   : 'deleno' ;
MOD   : 'modulo' ;
PLUS  : 'plus' ;
MINUS : 'minus' ;
GT    : 'vetsi nez' ;
GE    : 'vetsi rovno nez' ;
LT    : 'mensi nez' ;
LE    : 'mensi rovno nez' ;
SAME  : 'se shoduje' ;
EQ    : 'rovno' ;
AND   : 'a zaroven' ;
OR    : 'nebo' ;
QUESTION : '?' ;
COLON : ':' ;
NOT_EQ : 'nerovno' ;
NEGATION : 'negace';


/* ------ Separators ------ */
LPAREN:             '(';
RPAREN:             ')';
LBRACE:             '{';
RBRACE:             '}';
LBRACK:             '[';
RBRACK:             ']';
SEMI:               '.';
COMMA:              ',';



/* ------ Literals ------ */

fragment DIGIT : [0-9]+ ;

fragment LOWECASE : [a-z] ;

fragment UPPERCASE : [A-Z] ;

WORD  : (LOWECASE | UPPERCASE) (LOWECASE | UPPERCASE | DIGIT | '_')* ;

DECIMAL : DIGIT;

WHITESPACE : [ \r\t\n]+ -> skip ;

LINE_COMMENT : '//' ~[\r\n]* -> skip;

/* -------------- parser rules -------------- */

program
  : block
  ;

methodReturnType
  : INT
  | BOOLEAN
  | VOID
  ;

booleanValue
  : TRUE
  | FALSE
  ;

possibleTypes
  : INT
  | BOOLEAN
  ;

decimalSymbol
  : PLUS
  | MINUS
  ;

identifier
  : WORD
  ;

possibleValues
  : decimalSymbol? DECIMAL
  | booleanValue
  ;

decimalVariable
  : INT identifier (paralelDeclaration)* EQ decimalSymbol? decimalValue
  ;


decimalValue
  : decimalSymbol? DECIMAL
  | methodCall
  | identifier
  | expressionBody
  ;

boolVariable
  : BOOLEAN identifier (paralelDeclaration)* EQ boolValue
  ;

boolValue
  : booleanValue
  | methodCall
  | identifier
  | expressionBody
  ;

localVariableDeclaration
  : (decimalVariable | boolVariable) SEMI
  ;

constVariableDeclaration
  : CONST localVariableDeclaration
  ;

variableDeclaration
  : (localVariableDeclaration | constVariableDeclaration)
  ;

paralelDeclaration
  : EQ identifier
  ;


variableAssigment
  : identifier EQ expressionBody SEMI
  ;


block
  : LBRACE blockStatement? RBRACE
  ;

body
  : LBRACE blockBody? RBRACE
  ;

blockStatement
  : (statement
  | methodDeclaration)+
  ;

blockBody
  : (statement)+
  ;

statement
  : IF expression body (ELSE body)?                        #statementIf
  | FOR forControl body                                    #statementFor
  | WHILE expression body                                  #statementWhile
  | DO body WHILE expression                               #statementDo
  | SWITCH expression LBRACE switchBlockStatement* RBRACE  #statementSwitch
  | REPEAT body UNTIL expression                           #statementRepeat
  | methodCall SEMI                                        #statementMethodCall
  | variableAssigment                                      #statementAssigment
  | variableDeclaration                                    #statementVariableDeclaration
  ;

expression
  : LPAREN expressionBody RPAREN
  ;

expressionBody
  : possibleValues                                                          #exprPossibleValue
  | identifier                                                              #exprIdentifier
  | methodCall                                                              #exprMethodCall
  | expressionBody op=(MULT | DIV | MOD) expressionBody                     #exprMultipli
  | expressionBody op=(PLUS | MINUS) expressionBody                         #exprAdditive
  | expressionBody op=(GT | GE | LT | LE | SAME | NOT_EQ) expressionBody    #exprRelational
  | expressionBody op=(AND | OR) expressionBody                             #exprLogical
  | LPAREN expressionBody RPAREN                                            #exprPar
  | NEGATION expressionBody                                                 #exprNeg
  | MINUS expressionBody                                                    #exprMinus
  | PLUS expressionBody                                                     #exprPlus
  ;

forControl
  : LPAREN identifier EQ decimalSymbol? expressionBody '...' decimalSymbol? expressionBody RPAREN
  ;

switchBlockStatement
  : CASE DECIMAL COLON body
  | DEFAULT COLON body
  ;

methodDeclaration
  : methodReturnType FUNCTION_KEYWORD identifier LPAREN (methodParameter (COMMA methodParameter)*)? RPAREN methodBody
  ;

methodParameter
  : possibleTypes identifier
  ;

methodBody
  : LBRACE blockBody? (RETURN expressionBody SEMI)? RBRACE
  ;

methodCall
  : identifier LPAREN (methodCallParameter (COMMA methodCallParameter)*)? RPAREN
  ;

methodCallParameter
  : expressionBody
  ;
