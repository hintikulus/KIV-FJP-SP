package generate;// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CzechGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, BOOLEAN=2, INT=3, IF=4, ELSE=5, SWITCH=6, CASE=7, DEFAULT=8, FOR=9, 
		WHILE=10, DO=11, REPEAT=12, UNTIL=13, VOID=14, RETURN=15, CONST=16, FUNCTION_KEYWORD=17, 
		TRUE=18, FALSE=19, MULT=20, DIV=21, MOD=22, PLUS=23, MINUS=24, GT=25, 
		GE=26, LT=27, LE=28, SAME=29, EQ=30, AND=31, OR=32, QUESTION=33, COLON=34, 
		NOT_EQ=35, NEGATION=36, LPAREN=37, RPAREN=38, LBRACE=39, RBRACE=40, LBRACK=41, 
		RBRACK=42, SEMI=43, COMMA=44, WORD=45, DECIMAL=46, WHITESPACE=47, LINE_COMMENT=48;
	public static final int
		RULE_program = 0, RULE_methodReturnType = 1, RULE_booleanValue = 2, RULE_possibleTypes = 3, 
		RULE_decimalSymbol = 4, RULE_identifier = 5, RULE_possibleValues = 6, 
		RULE_decimalVariable = 7, RULE_decimalValue = 8, RULE_boolVariable = 9, 
		RULE_boolValue = 10, RULE_localVariableDeclaration = 11, RULE_constVariableDeclaration = 12, 
		RULE_variableDeclaration = 13, RULE_paralelDeclaration = 14, RULE_variableAssigment = 15, 
		RULE_block = 16, RULE_body = 17, RULE_blockStatement = 18, RULE_blockBody = 19, 
		RULE_statement = 20, RULE_expression = 21, RULE_expressionBody = 22, RULE_forControl = 23, 
		RULE_switchBlockStatement = 24, RULE_methodDeclaration = 25, RULE_methodParameter = 26, 
		RULE_methodBody = 27, RULE_methodCall = 28, RULE_methodCallParameter = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "methodReturnType", "booleanValue", "possibleTypes", "decimalSymbol", 
			"identifier", "possibleValues", "decimalVariable", "decimalValue", "boolVariable", 
			"boolValue", "localVariableDeclaration", "constVariableDeclaration", 
			"variableDeclaration", "paralelDeclaration", "variableAssigment", "block", 
			"body", "blockStatement", "blockBody", "statement", "expression", "expressionBody", 
			"forControl", "switchBlockStatement", "methodDeclaration", "methodParameter", 
			"methodBody", "methodCall", "methodCallParameter"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'...'", "'vyrok'", "'cislo'", "'kdyz'", "'jinak'", "'prepinej'", 
			"'pripad'", "'v jinem pripade'", "'pro'", "'dokud'", "'delej'", "'od'", 
			"'do'", "'nic'", "'vrat'", "'necht existuje'", "'spageta'", "'pravda'", 
			"'nepravda'", "'krat'", "'deleno'", "'modulo'", "'plus'", "'minus'", 
			"'vetsi nez'", "'vetsi rovno nez'", "'mensi nez'", "'mensi rovno nez'", 
			"'se shoduje'", "'rovno'", "'a zaroven'", "'nebo'", "'?'", "':'", "'nerovno'", 
			"'negace'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'.'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "BOOLEAN", "INT", "IF", "ELSE", "SWITCH", "CASE", "DEFAULT", 
			"FOR", "WHILE", "DO", "REPEAT", "UNTIL", "VOID", "RETURN", "CONST", "FUNCTION_KEYWORD", 
			"TRUE", "FALSE", "MULT", "DIV", "MOD", "PLUS", "MINUS", "GT", "GE", "LT", 
			"LE", "SAME", "EQ", "AND", "OR", "QUESTION", "COLON", "NOT_EQ", "NEGATION", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
			"WORD", "DECIMAL", "WHITESPACE", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CzechGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CzechGrammarVisitor) return ((CzechGrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodReturnTypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CzechGrammarParser.INT, 0); }
		public TerminalNode BOOLEAN() { return getToken(CzechGrammarParser.BOOLEAN, 0); }
		public TerminalNode VOID() { return getToken(CzechGrammarParser.VOID, 0); }
		public MethodReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReturnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).enterMethodReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).exitMethodReturnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CzechGrammarVisitor) return ((CzechGrammarVisitor<? extends T>)visitor).visitMethodReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodReturnTypeContext methodReturnType() throws RecognitionException {
		MethodReturnTypeContext _localctx = new MethodReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_methodReturnType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 16396L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(CzechGrammarParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CzechGrammarParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CzechGrammarVisitor) return ((CzechGrammarVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PossibleTypesContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CzechGrammarParser.INT, 0); }
		public TerminalNode BOOLEAN() { return getToken(CzechGrammarParser.BOOLEAN, 0); }
		public PossibleTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_possibleTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).enterPossibleTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).exitPossibleTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CzechGrammarVisitor) return ((CzechGrammarVisitor<? extends T>)visitor).visitPossibleTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PossibleTypesContext possibleTypes() throws RecognitionException {
		PossibleTypesContext _localctx = new PossibleTypesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_possibleTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_la = _input.LA(1);
			if ( !(_la==BOOLEAN || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecimalSymbolContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(CzechGrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CzechGrammarParser.MINUS, 0); }
		public DecimalSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).enterDecimalSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).exitDecimalSymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CzechGrammarVisitor) return ((CzechGrammarVisitor<? extends T>)visitor).visitDecimalSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalSymbolContext decimalSymbol() throws RecognitionException {
		DecimalSymbolContext _localctx = new DecimalSymbolContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_decimalSymbol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(CzechGrammarParser.WORD, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CzechGrammarVisitor) return ((CzechGrammarVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PossibleValuesContext extends ParserRuleContext {
		public TerminalNode DECIMAL() { return getToken(CzechGrammarParser.DECIMAL, 0); }
		public DecimalSymbolContext decimalSymbol() {
			return getRuleContext(DecimalSymbolContext.class,0);
		}
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public PossibleValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_possibleValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).enterPossibleValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).exitPossibleValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CzechGrammarVisitor) return ((CzechGrammarVisitor<? extends T>)visitor).visitPossibleValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PossibleValuesContext possibleValues() throws RecognitionException {
		PossibleValuesContext _localctx = new PossibleValuesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_possibleValues);
		int _la;
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case DECIMAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(72);
					decimalSymbol();
					}
				}

				setState(75);
				match(DECIMAL);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				booleanValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecimalVariableContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CzechGrammarParser.INT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(CzechGrammarParser.EQ, 0); }
		public DecimalValueContext decimalValue() {
			return getRuleContext(DecimalValueContext.class,0);
		}
		public List<ParalelDeclarationContext> paralelDeclaration() {
			return getRuleContexts(ParalelDeclarationContext.class);
		}
		public ParalelDeclarationContext paralelDeclaration(int i) {
			return getRuleContext(ParalelDeclarationContext.class,i);
		}
		public DecimalSymbolContext decimalSymbol() {
			return getRuleContext(DecimalSymbolContext.class,0);
		}
		public DecimalVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).enterDecimalVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).exitDecimalVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CzechGrammarVisitor) return ((CzechGrammarVisitor<? extends T>)visitor).visitDecimalVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalVariableContext decimalVariable() throws RecognitionException {
		DecimalVariableContext _localctx = new DecimalVariableContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_decimalVariable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(INT);
			setState(80);
			identifier();
			setState(84);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(81);
					paralelDeclaration();
					}
					} 
				}
				setState(86);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(87);
			match(EQ);
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(88);
				decimalSymbol();
				}
				break;
			}
			setState(91);
			decimalValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecimalValueContext extends ParserRuleContext {
		public TerminalNode DECIMAL() { return getToken(CzechGrammarParser.DECIMAL, 0); }
		public DecimalSymbolContext decimalSymbol() {
			return getRuleContext(DecimalSymbolContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionBodyContext expressionBody() {
			return getRuleContext(ExpressionBodyContext.class,0);
		}
		public DecimalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).enterDecimalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).exitDecimalValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CzechGrammarVisitor) return ((CzechGrammarVisitor<? extends T>)visitor).visitDecimalValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalValueContext decimalValue() throws RecognitionException {
		DecimalValueContext _localctx = new DecimalValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_decimalValue);
		int _la;
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(93);
					decimalSymbol();
					}
				}

				setState(96);
				match(DECIMAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				methodCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				identifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(99);
				expressionBody(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BoolVariableContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(CzechGrammarParser.BOOLEAN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(CzechGrammarParser.EQ, 0); }
		public BoolValueContext boolValue() {
			return getRuleContext(BoolValueContext.class,0);
		}
		public List<ParalelDeclarationContext> paralelDeclaration() {
			return getRuleContexts(ParalelDeclarationContext.class);
		}
		public ParalelDeclarationContext paralelDeclaration(int i) {
			return getRuleContext(ParalelDeclarationContext.class,i);
		}
		public BoolVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).enterBoolVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).exitBoolVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CzechGrammarVisitor) return ((CzechGrammarVisitor<? extends T>)visitor).visitBoolVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolVariableContext boolVariable() throws RecognitionException {
		BoolVariableContext _localctx = new BoolVariableContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_boolVariable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(BOOLEAN);
			setState(103);
			identifier();
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(104);
					paralelDeclaration();
					}
					} 
				}
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(110);
			match(EQ);
			setState(111);
			boolValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BoolValueContext extends ParserRuleContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionBodyContext expressionBody() {
			return getRuleContext(ExpressionBodyContext.class,0);
		}
		public BoolValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).enterBoolValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).exitBoolValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CzechGrammarVisitor) return ((CzechGrammarVisitor<? extends T>)visitor).visitBoolValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolValueContext boolValue() throws RecognitionException {
		BoolValueContext _localctx = new BoolValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_boolValue);
		try {
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				booleanValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				methodCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				identifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(116);
				expressionBody(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(CzechGrammarParser.SEMI, 0); }
		public DecimalVariableContext decimalVariable() {
			return getRuleContext(DecimalVariableContext.class,0);
		}
		public BoolVariableContext boolVariable() {
			return getRuleContext(BoolVariableContext.class,0);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).exitLocalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CzechGrammarVisitor) return ((CzechGrammarVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_localVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(119);
				decimalVariable();
				}
				break;
			case BOOLEAN:
				{
				setState(120);
				boolVariable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(123);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstVariableDeclarationContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(CzechGrammarParser.CONST, 0); }
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ConstVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).enterConstVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).exitConstVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CzechGrammarVisitor) return ((CzechGrammarVisitor<? extends T>)visitor).visitConstVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstVariableDeclarationContext constVariableDeclaration() throws RecognitionException {
		ConstVariableDeclarationContext _localctx = new ConstVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_constVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(CONST);
			setState(126);
			localVariableDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ConstVariableDeclarationContext constVariableDeclaration() {
			return getRuleContext(ConstVariableDeclarationContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CzechGrammarVisitor) return ((CzechGrammarVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case INT:
				{
				setState(128);
				localVariableDeclaration();
				}
				break;
			case CONST:
				{
				setState(129);
				constVariableDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParalelDeclarationContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(CzechGrammarParser.EQ, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParalelDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paralelDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).enterParalelDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).exitParalelDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CzechGrammarVisitor) return ((CzechGrammarVisitor<? extends T>)visitor).visitParalelDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParalelDeclarationContext paralelDeclaration() throws RecognitionException {
		ParalelDeclarationContext _localctx = new ParalelDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_paralelDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(EQ);
			setState(133);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableAssigmentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(CzechGrammarParser.EQ, 0); }
		public ExpressionBodyContext expressionBody() {
			return getRuleContext(ExpressionBodyContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CzechGrammarParser.SEMI, 0); }
		public VariableAssigmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssigment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).enterVariableAssigment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).exitVariableAssigment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CzechGrammarVisitor) return ((CzechGrammarVisitor<? extends T>)visitor).visitVariableAssigment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableAssigmentContext variableAssigment() throws RecognitionException {
		VariableAssigmentContext _localctx = new VariableAssigmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variableAssigment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			identifier();
			setState(136);
			match(EQ);
			setState(137);
			expressionBody(0);
			setState(138);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(CzechGrammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CzechGrammarParser.RBRACE, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CzechGrammarVisitor) return ((CzechGrammarVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(LBRACE);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 35184372178524L) != 0) {
				{
				setState(141);
				blockStatement();
				}
			}

			setState(144);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(CzechGrammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CzechGrammarParser.RBRACE, 0); }
		public BlockBodyContext blockBody() {
			return getRuleContext(BlockBodyContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CzechGrammarVisitor) return ((CzechGrammarVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(LBRACE);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 35184372162140L) != 0) {
				{
				setState(147);
				blockBody();
				}
			}

			setState(150);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockStatementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CzechGrammarVisitor) return ((CzechGrammarVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_blockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(154);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(152);
					statement();
					}
					break;
				case 2:
					{
					setState(153);
					methodDeclaration();
					}
					break;
				}
				}
				setState(156); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 35184372178524L) != 0 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockBodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).enterBlockBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).exitBlockBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CzechGrammarVisitor) return ((CzechGrammarVisitor<? extends T>)visitor).visitBlockBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockBodyContext blockBody() throws RecognitionException {
		BlockBodyContext _localctx = new BlockBodyContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_blockBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(158);
				statement();
				}
				}
				setState(161); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 35184372162140L) != 0 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementAssigmentContext extends StatementContext {
		public VariableAssigmentContext variableAssigment() {
			return getRuleContext(VariableAssigmentContext.class,0);
		}
		public StatementAssigmentContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).enterStatementAssigment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).exitStatementAssigment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CzechGrammarVisitor) return ((CzechGrammarVisitor<? extends T>)visitor).visitStatementAssigment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementVariableDeclarationContext extends StatementContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public StatementVariableDeclarationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).enterStatementVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).exitStatementVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CzechGrammarVisitor) return ((CzechGrammarVisitor<? extends T>)visitor).visitStatementVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementRepeatContext extends StatementContext {
		public TerminalNode REPEAT() { return getToken(CzechGrammarParser.REPEAT, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode UNTIL() { return getToken(CzechGrammarParser.UNTIL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementRepeatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).enterStatementRepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).exitStatementRepeat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CzechGrammarVisitor) return ((CzechGrammarVisitor<? extends T>)visitor).visitStatementRepeat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementForContext extends StatementContext {
		public TerminalNode FOR() { return getToken(CzechGrammarParser.FOR, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public StatementForContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).enterStatementFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).exitStatementFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CzechGrammarVisitor) return ((CzechGrammarVisitor<? extends T>)visitor).visitStatementFor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementDoContext extends StatementContext {
		public TerminalNode DO() { return getToken(CzechGrammarParser.DO, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(CzechGrammarParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementDoContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).enterStatementDo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).exitStatementDo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CzechGrammarVisitor) return ((CzechGrammarVisitor<? extends T>)visitor).visitStatementDo(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementSwitchContext extends StatementContext {
		public TerminalNode SWITCH() { return getToken(CzechGrammarParser.SWITCH, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(CzechGrammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CzechGrammarParser.RBRACE, 0); }
		public List<SwitchBlockStatementContext> switchBlockStatement() {
			return getRuleContexts(SwitchBlockStatementContext.class);
		}
		public SwitchBlockStatementContext switchBlockStatement(int i) {
			return getRuleContext(SwitchBlockStatementContext.class,i);
		}
		public StatementSwitchContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).enterStatementSwitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).exitStatementSwitch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CzechGrammarVisitor) return ((CzechGrammarVisitor<? extends T>)visitor).visitStatementSwitch(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementWhileContext extends StatementContext {
		public TerminalNode WHILE() { return getToken(CzechGrammarParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public StatementWhileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).enterStatementWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).exitStatementWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CzechGrammarVisitor) return ((CzechGrammarVisitor<? extends T>)visitor).visitStatementWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementMethodCallContext extends StatementContext {
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CzechGrammarParser.SEMI, 0); }
		public StatementMethodCallContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).enterStatementMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).exitStatementMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CzechGrammarVisitor) return ((CzechGrammarVisitor<? extends T>)visitor).visitStatementMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementIfContext extends StatementContext {
		public TerminalNode IF() { return getToken(CzechGrammarParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CzechGrammarParser.ELSE, 0); }
		public StatementIfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).enterStatementIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).exitStatementIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CzechGrammarVisitor) return ((CzechGrammarVisitor<? extends T>)visitor).visitStatementIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_statement);
		int _la;
		try {
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new StatementIfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(IF);
				setState(164);
				expression();
				setState(165);
				body();
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(166);
					match(ELSE);
					setState(167);
					body();
					}
				}

				}
				break;
			case 2:
				_localctx = new StatementForContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				match(FOR);
				setState(171);
				forControl();
				setState(172);
				body();
				}
				break;
			case 3:
				_localctx = new StatementWhileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				match(WHILE);
				setState(175);
				expression();
				setState(176);
				body();
				}
				break;
			case 4:
				_localctx = new StatementDoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(178);
				match(DO);
				setState(179);
				body();
				setState(180);
				match(WHILE);
				setState(181);
				expression();
				}
				break;
			case 5:
				_localctx = new StatementSwitchContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(183);
				match(SWITCH);
				setState(184);
				expression();
				setState(185);
				match(LBRACE);
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(186);
					switchBlockStatement();
					}
					}
					setState(191);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(192);
				match(RBRACE);
				}
				break;
			case 6:
				_localctx = new StatementRepeatContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(194);
				match(REPEAT);
				setState(195);
				body();
				setState(196);
				match(UNTIL);
				setState(197);
				expression();
				}
				break;
			case 7:
				_localctx = new StatementMethodCallContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(199);
				methodCall();
				setState(200);
				match(SEMI);
				}
				break;
			case 8:
				_localctx = new StatementAssigmentContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(202);
				variableAssigment();
				}
				break;
			case 9:
				_localctx = new StatementVariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(203);
				variableDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CzechGrammarParser.LPAREN, 0); }
		public ExpressionBodyContext expressionBody() {
			return getRuleContext(ExpressionBodyContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CzechGrammarParser.RPAREN, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CzechGrammarVisitor) return ((CzechGrammarVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(LPAREN);
			setState(207);
			expressionBody(0);
			setState(208);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionBodyContext extends ParserRuleContext {
		public ExpressionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionBody; }
	 
		public ExpressionBodyContext() { }
		public void copyFrom(ExpressionBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprNegContext extends ExpressionBodyContext {
		public TerminalNode NEGATION() { return getToken(CzechGrammarParser.NEGATION, 0); }
		public ExpressionBodyContext expressionBody() {
			return getRuleContext(ExpressionBodyContext.class,0);
		}
		public ExprNegContext(ExpressionBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).enterExprNeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).exitExprNeg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CzechGrammarVisitor) return ((CzechGrammarVisitor<? extends T>)visitor).visitExprNeg(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprPlusContext extends ExpressionBodyContext {
		public TerminalNode PLUS() { return getToken(CzechGrammarParser.PLUS, 0); }
		public ExpressionBodyContext expressionBody() {
			return getRuleContext(ExpressionBodyContext.class,0);
		}
		public ExprPlusContext(ExpressionBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).enterExprPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).exitExprPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CzechGrammarVisitor) return ((CzechGrammarVisitor<? extends T>)visitor).visitExprPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprAdditiveContext extends ExpressionBodyContext {
		public Token op;
		public List<ExpressionBodyContext> expressionBody() {
			return getRuleContexts(ExpressionBodyContext.class);
		}
		public ExpressionBodyContext expressionBody(int i) {
			return getRuleContext(ExpressionBodyContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(CzechGrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CzechGrammarParser.MINUS, 0); }
		public ExprAdditiveContext(ExpressionBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).enterExprAdditive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).exitExprAdditive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CzechGrammarVisitor) return ((CzechGrammarVisitor<? extends T>)visitor).visitExprAdditive(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprParContext extends ExpressionBodyContext {
		public TerminalNode LPAREN() { return getToken(CzechGrammarParser.LPAREN, 0); }
		public ExpressionBodyContext expressionBody() {
			return getRuleContext(ExpressionBodyContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CzechGrammarParser.RPAREN, 0); }
		public ExprParContext(ExpressionBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).enterExprPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).exitExprPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CzechGrammarVisitor) return ((CzechGrammarVisitor<? extends T>)visitor).visitExprPar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprMinusContext extends ExpressionBodyContext {
		public TerminalNode MINUS() { return getToken(CzechGrammarParser.MINUS, 0); }
		public ExpressionBodyContext expressionBody() {
			return getRuleContext(ExpressionBodyContext.class,0);
		}
		public ExprMinusContext(ExpressionBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).enterExprMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).exitExprMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CzechGrammarVisitor) return ((CzechGrammarVisitor<? extends T>)visitor).visitExprMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprRelationalContext extends ExpressionBodyContext {
		public Token op;
		public List<ExpressionBodyContext> expressionBody() {
			return getRuleContexts(ExpressionBodyContext.class);
		}
		public ExpressionBodyContext expressionBody(int i) {
			return getRuleContext(ExpressionBodyContext.class,i);
		}
		public TerminalNode GT() { return getToken(CzechGrammarParser.GT, 0); }
		public TerminalNode GE() { return getToken(CzechGrammarParser.GE, 0); }
		public TerminalNode LT() { return getToken(CzechGrammarParser.LT, 0); }
		public TerminalNode LE() { return getToken(CzechGrammarParser.LE, 0); }
		public TerminalNode SAME() { return getToken(CzechGrammarParser.SAME, 0); }
		public TerminalNode NOT_EQ() { return getToken(CzechGrammarParser.NOT_EQ, 0); }
		public ExprRelationalContext(ExpressionBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).enterExprRelational(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).exitExprRelational(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CzechGrammarVisitor) return ((CzechGrammarVisitor<? extends T>)visitor).visitExprRelational(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprIdentifierContext extends ExpressionBodyContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExprIdentifierContext(ExpressionBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).enterExprIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).exitExprIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CzechGrammarVisitor) return ((CzechGrammarVisitor<? extends T>)visitor).visitExprIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprPossibleValueContext extends ExpressionBodyContext {
		public PossibleValuesContext possibleValues() {
			return getRuleContext(PossibleValuesContext.class,0);
		}
		public ExprPossibleValueContext(ExpressionBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).enterExprPossibleValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).exitExprPossibleValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CzechGrammarVisitor) return ((CzechGrammarVisitor<? extends T>)visitor).visitExprPossibleValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprMethodCallContext extends ExpressionBodyContext {
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public ExprMethodCallContext(ExpressionBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).enterExprMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).exitExprMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CzechGrammarVisitor) return ((CzechGrammarVisitor<? extends T>)visitor).visitExprMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprLogicalContext extends ExpressionBodyContext {
		public Token op;
		public List<ExpressionBodyContext> expressionBody() {
			return getRuleContexts(ExpressionBodyContext.class);
		}
		public ExpressionBodyContext expressionBody(int i) {
			return getRuleContext(ExpressionBodyContext.class,i);
		}
		public TerminalNode AND() { return getToken(CzechGrammarParser.AND, 0); }
		public TerminalNode OR() { return getToken(CzechGrammarParser.OR, 0); }
		public ExprLogicalContext(ExpressionBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).enterExprLogical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).exitExprLogical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CzechGrammarVisitor) return ((CzechGrammarVisitor<? extends T>)visitor).visitExprLogical(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprMultipliContext extends ExpressionBodyContext {
		public Token op;
		public List<ExpressionBodyContext> expressionBody() {
			return getRuleContexts(ExpressionBodyContext.class);
		}
		public ExpressionBodyContext expressionBody(int i) {
			return getRuleContext(ExpressionBodyContext.class,i);
		}
		public TerminalNode MULT() { return getToken(CzechGrammarParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(CzechGrammarParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(CzechGrammarParser.MOD, 0); }
		public ExprMultipliContext(ExpressionBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).enterExprMultipli(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).exitExprMultipli(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CzechGrammarVisitor) return ((CzechGrammarVisitor<? extends T>)visitor).visitExprMultipli(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionBodyContext expressionBody() throws RecognitionException {
		return expressionBody(0);
	}

	private ExpressionBodyContext expressionBody(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionBodyContext _localctx = new ExpressionBodyContext(_ctx, _parentState);
		ExpressionBodyContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_expressionBody, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				_localctx = new ExprPossibleValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(211);
				possibleValues();
				}
				break;
			case 2:
				{
				_localctx = new ExprIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(212);
				identifier();
				}
				break;
			case 3:
				{
				_localctx = new ExprMethodCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(213);
				methodCall();
				}
				break;
			case 4:
				{
				_localctx = new ExprParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(214);
				match(LPAREN);
				setState(215);
				expressionBody(0);
				setState(216);
				match(RPAREN);
				}
				break;
			case 5:
				{
				_localctx = new ExprNegContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(218);
				match(NEGATION);
				setState(219);
				expressionBody(3);
				}
				break;
			case 6:
				{
				_localctx = new ExprMinusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(220);
				match(MINUS);
				setState(221);
				expressionBody(2);
				}
				break;
			case 7:
				{
				_localctx = new ExprPlusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(222);
				match(PLUS);
				setState(223);
				expressionBody(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(240);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(238);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMultipliContext(new ExpressionBodyContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionBody);
						setState(226);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(227);
						((ExprMultipliContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 7340032L) != 0) ) {
							((ExprMultipliContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(228);
						expressionBody(9);
						}
						break;
					case 2:
						{
						_localctx = new ExprAdditiveContext(new ExpressionBodyContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionBody);
						setState(229);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(230);
						((ExprAdditiveContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((ExprAdditiveContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(231);
						expressionBody(8);
						}
						break;
					case 3:
						{
						_localctx = new ExprRelationalContext(new ExpressionBodyContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionBody);
						setState(232);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(233);
						((ExprRelationalContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 35399925760L) != 0) ) {
							((ExprRelationalContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(234);
						expressionBody(7);
						}
						break;
					case 4:
						{
						_localctx = new ExprLogicalContext(new ExpressionBodyContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionBody);
						setState(235);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(236);
						((ExprLogicalContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((ExprLogicalContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(237);
						expressionBody(6);
						}
						break;
					}
					} 
				}
				setState(242);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForControlContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CzechGrammarParser.LPAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(CzechGrammarParser.EQ, 0); }
		public List<ExpressionBodyContext> expressionBody() {
			return getRuleContexts(ExpressionBodyContext.class);
		}
		public ExpressionBodyContext expressionBody(int i) {
			return getRuleContext(ExpressionBodyContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(CzechGrammarParser.RPAREN, 0); }
		public List<DecimalSymbolContext> decimalSymbol() {
			return getRuleContexts(DecimalSymbolContext.class);
		}
		public DecimalSymbolContext decimalSymbol(int i) {
			return getRuleContext(DecimalSymbolContext.class,i);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).exitForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CzechGrammarVisitor) return ((CzechGrammarVisitor<? extends T>)visitor).visitForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_forControl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(LPAREN);
			setState(244);
			identifier();
			setState(245);
			match(EQ);
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(246);
				decimalSymbol();
				}
				break;
			}
			setState(249);
			expressionBody(0);
			setState(250);
			match(T__0);
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(251);
				decimalSymbol();
				}
				break;
			}
			setState(254);
			expressionBody(0);
			setState(255);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchBlockStatementContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(CzechGrammarParser.CASE, 0); }
		public TerminalNode DECIMAL() { return getToken(CzechGrammarParser.DECIMAL, 0); }
		public TerminalNode COLON() { return getToken(CzechGrammarParser.COLON, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(CzechGrammarParser.DEFAULT, 0); }
		public SwitchBlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).enterSwitchBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).exitSwitchBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CzechGrammarVisitor) return ((CzechGrammarVisitor<? extends T>)visitor).visitSwitchBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementContext switchBlockStatement() throws RecognitionException {
		SwitchBlockStatementContext _localctx = new SwitchBlockStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_switchBlockStatement);
		try {
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				match(CASE);
				setState(258);
				match(DECIMAL);
				setState(259);
				match(COLON);
				setState(260);
				body();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				match(DEFAULT);
				setState(262);
				match(COLON);
				setState(263);
				body();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodReturnTypeContext methodReturnType() {
			return getRuleContext(MethodReturnTypeContext.class,0);
		}
		public TerminalNode FUNCTION_KEYWORD() { return getToken(CzechGrammarParser.FUNCTION_KEYWORD, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CzechGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CzechGrammarParser.RPAREN, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<MethodParameterContext> methodParameter() {
			return getRuleContexts(MethodParameterContext.class);
		}
		public MethodParameterContext methodParameter(int i) {
			return getRuleContext(MethodParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CzechGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CzechGrammarParser.COMMA, i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CzechGrammarVisitor) return ((CzechGrammarVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			methodReturnType();
			setState(267);
			match(FUNCTION_KEYWORD);
			setState(268);
			identifier();
			setState(269);
			match(LPAREN);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BOOLEAN || _la==INT) {
				{
				setState(270);
				methodParameter();
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(271);
					match(COMMA);
					setState(272);
					methodParameter();
					}
					}
					setState(277);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(280);
			match(RPAREN);
			setState(281);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodParameterContext extends ParserRuleContext {
		public PossibleTypesContext possibleTypes() {
			return getRuleContext(PossibleTypesContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MethodParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).enterMethodParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).exitMethodParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CzechGrammarVisitor) return ((CzechGrammarVisitor<? extends T>)visitor).visitMethodParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodParameterContext methodParameter() throws RecognitionException {
		MethodParameterContext _localctx = new MethodParameterContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_methodParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			possibleTypes();
			setState(284);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(CzechGrammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CzechGrammarParser.RBRACE, 0); }
		public BlockBodyContext blockBody() {
			return getRuleContext(BlockBodyContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(CzechGrammarParser.RETURN, 0); }
		public ExpressionBodyContext expressionBody() {
			return getRuleContext(ExpressionBodyContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CzechGrammarParser.SEMI, 0); }
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CzechGrammarVisitor) return ((CzechGrammarVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_methodBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(LBRACE);
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 35184372162140L) != 0) {
				{
				setState(287);
				blockBody();
				}
			}

			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(290);
				match(RETURN);
				setState(291);
				expressionBody(0);
				setState(292);
				match(SEMI);
				}
			}

			setState(296);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodCallContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CzechGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CzechGrammarParser.RPAREN, 0); }
		public List<MethodCallParameterContext> methodCallParameter() {
			return getRuleContexts(MethodCallParameterContext.class);
		}
		public MethodCallParameterContext methodCallParameter(int i) {
			return getRuleContext(MethodCallParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CzechGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CzechGrammarParser.COMMA, i);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CzechGrammarVisitor) return ((CzechGrammarVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			identifier();
			setState(299);
			match(LPAREN);
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 105759300648960L) != 0) {
				{
				setState(300);
				methodCallParameter();
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(301);
					match(COMMA);
					setState(302);
					methodCallParameter();
					}
					}
					setState(307);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(310);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodCallParameterContext extends ParserRuleContext {
		public ExpressionBodyContext expressionBody() {
			return getRuleContext(ExpressionBodyContext.class,0);
		}
		public MethodCallParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCallParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).enterMethodCallParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CzechGrammarListener ) ((CzechGrammarListener)listener).exitMethodCallParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CzechGrammarVisitor) return ((CzechGrammarVisitor<? extends T>)visitor).visitMethodCallParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallParameterContext methodCallParameter() throws RecognitionException {
		MethodCallParameterContext _localctx = new MethodCallParameterContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_methodCallParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			expressionBody(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 22:
			return expressionBody_sempred((ExpressionBodyContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressionBody_sempred(ExpressionBodyContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00010\u013b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0003\u0006"+
		"J\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006N\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007S\b\u0007\n\u0007\f\u0007V\t\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007Z\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0003\b_\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\be\b\b\u0001\t\u0001"+
		"\t\u0001\t\u0005\tj\b\t\n\t\f\tm\t\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\nv\b\n\u0001\u000b\u0001\u000b\u0003\u000bz\b"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r"+
		"\u0003\r\u0083\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u008f\b\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u0095\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0004"+
		"\u0012\u009b\b\u0012\u000b\u0012\f\u0012\u009c\u0001\u0013\u0004\u0013"+
		"\u00a0\b\u0013\u000b\u0013\f\u0013\u00a1\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00a9\b\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u00bc\b\u0014\n"+
		"\u0014\f\u0014\u00bf\t\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00cd\b\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u00e1"+
		"\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0005\u0016\u00ef\b\u0016\n\u0016\f\u0016\u00f2\t\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u00f8\b\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u00fd\b\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0003\u0018\u0109\b\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019"+
		"\u0112\b\u0019\n\u0019\f\u0019\u0115\t\u0019\u0003\u0019\u0117\b\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0003\u001b\u0121\b\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0003\u001b\u0127\b\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c"+
		"\u0130\b\u001c\n\u001c\f\u001c\u0133\t\u001c\u0003\u001c\u0135\b\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0000\u0001"+
		",\u001e\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:\u0000\u0007\u0002\u0000\u0002\u0003"+
		"\u000e\u000e\u0001\u0000\u0012\u0013\u0001\u0000\u0002\u0003\u0001\u0000"+
		"\u0017\u0018\u0001\u0000\u0014\u0016\u0002\u0000\u0019\u001d##\u0001\u0000"+
		"\u001f \u014c\u0000<\u0001\u0000\u0000\u0000\u0002>\u0001\u0000\u0000"+
		"\u0000\u0004@\u0001\u0000\u0000\u0000\u0006B\u0001\u0000\u0000\u0000\b"+
		"D\u0001\u0000\u0000\u0000\nF\u0001\u0000\u0000\u0000\fM\u0001\u0000\u0000"+
		"\u0000\u000eO\u0001\u0000\u0000\u0000\u0010d\u0001\u0000\u0000\u0000\u0012"+
		"f\u0001\u0000\u0000\u0000\u0014u\u0001\u0000\u0000\u0000\u0016y\u0001"+
		"\u0000\u0000\u0000\u0018}\u0001\u0000\u0000\u0000\u001a\u0082\u0001\u0000"+
		"\u0000\u0000\u001c\u0084\u0001\u0000\u0000\u0000\u001e\u0087\u0001\u0000"+
		"\u0000\u0000 \u008c\u0001\u0000\u0000\u0000\"\u0092\u0001\u0000\u0000"+
		"\u0000$\u009a\u0001\u0000\u0000\u0000&\u009f\u0001\u0000\u0000\u0000("+
		"\u00cc\u0001\u0000\u0000\u0000*\u00ce\u0001\u0000\u0000\u0000,\u00e0\u0001"+
		"\u0000\u0000\u0000.\u00f3\u0001\u0000\u0000\u00000\u0108\u0001\u0000\u0000"+
		"\u00002\u010a\u0001\u0000\u0000\u00004\u011b\u0001\u0000\u0000\u00006"+
		"\u011e\u0001\u0000\u0000\u00008\u012a\u0001\u0000\u0000\u0000:\u0138\u0001"+
		"\u0000\u0000\u0000<=\u0003 \u0010\u0000=\u0001\u0001\u0000\u0000\u0000"+
		">?\u0007\u0000\u0000\u0000?\u0003\u0001\u0000\u0000\u0000@A\u0007\u0001"+
		"\u0000\u0000A\u0005\u0001\u0000\u0000\u0000BC\u0007\u0002\u0000\u0000"+
		"C\u0007\u0001\u0000\u0000\u0000DE\u0007\u0003\u0000\u0000E\t\u0001\u0000"+
		"\u0000\u0000FG\u0005-\u0000\u0000G\u000b\u0001\u0000\u0000\u0000HJ\u0003"+
		"\b\u0004\u0000IH\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JK\u0001"+
		"\u0000\u0000\u0000KN\u0005.\u0000\u0000LN\u0003\u0004\u0002\u0000MI\u0001"+
		"\u0000\u0000\u0000ML\u0001\u0000\u0000\u0000N\r\u0001\u0000\u0000\u0000"+
		"OP\u0005\u0003\u0000\u0000PT\u0003\n\u0005\u0000QS\u0003\u001c\u000e\u0000"+
		"RQ\u0001\u0000\u0000\u0000SV\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000"+
		"\u0000TU\u0001\u0000\u0000\u0000UW\u0001\u0000\u0000\u0000VT\u0001\u0000"+
		"\u0000\u0000WY\u0005\u001e\u0000\u0000XZ\u0003\b\u0004\u0000YX\u0001\u0000"+
		"\u0000\u0000YZ\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\\\u0003"+
		"\u0010\b\u0000\\\u000f\u0001\u0000\u0000\u0000]_\u0003\b\u0004\u0000^"+
		"]\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000"+
		"\u0000`e\u0005.\u0000\u0000ae\u00038\u001c\u0000be\u0003\n\u0005\u0000"+
		"ce\u0003,\u0016\u0000d^\u0001\u0000\u0000\u0000da\u0001\u0000\u0000\u0000"+
		"db\u0001\u0000\u0000\u0000dc\u0001\u0000\u0000\u0000e\u0011\u0001\u0000"+
		"\u0000\u0000fg\u0005\u0002\u0000\u0000gk\u0003\n\u0005\u0000hj\u0003\u001c"+
		"\u000e\u0000ih\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000ki\u0001"+
		"\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000ln\u0001\u0000\u0000\u0000"+
		"mk\u0001\u0000\u0000\u0000no\u0005\u001e\u0000\u0000op\u0003\u0014\n\u0000"+
		"p\u0013\u0001\u0000\u0000\u0000qv\u0003\u0004\u0002\u0000rv\u00038\u001c"+
		"\u0000sv\u0003\n\u0005\u0000tv\u0003,\u0016\u0000uq\u0001\u0000\u0000"+
		"\u0000ur\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000ut\u0001\u0000"+
		"\u0000\u0000v\u0015\u0001\u0000\u0000\u0000wz\u0003\u000e\u0007\u0000"+
		"xz\u0003\u0012\t\u0000yw\u0001\u0000\u0000\u0000yx\u0001\u0000\u0000\u0000"+
		"z{\u0001\u0000\u0000\u0000{|\u0005+\u0000\u0000|\u0017\u0001\u0000\u0000"+
		"\u0000}~\u0005\u0010\u0000\u0000~\u007f\u0003\u0016\u000b\u0000\u007f"+
		"\u0019\u0001\u0000\u0000\u0000\u0080\u0083\u0003\u0016\u000b\u0000\u0081"+
		"\u0083\u0003\u0018\f\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0081"+
		"\u0001\u0000\u0000\u0000\u0083\u001b\u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u0005\u001e\u0000\u0000\u0085\u0086\u0003\n\u0005\u0000\u0086\u001d\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0003\n\u0005\u0000\u0088\u0089\u0005\u001e"+
		"\u0000\u0000\u0089\u008a\u0003,\u0016\u0000\u008a\u008b\u0005+\u0000\u0000"+
		"\u008b\u001f\u0001\u0000\u0000\u0000\u008c\u008e\u0005\'\u0000\u0000\u008d"+
		"\u008f\u0003$\u0012\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0091"+
		"\u0005(\u0000\u0000\u0091!\u0001\u0000\u0000\u0000\u0092\u0094\u0005\'"+
		"\u0000\u0000\u0093\u0095\u0003&\u0013\u0000\u0094\u0093\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\u0005(\u0000\u0000\u0097#\u0001\u0000\u0000\u0000\u0098"+
		"\u009b\u0003(\u0014\u0000\u0099\u009b\u00032\u0019\u0000\u009a\u0098\u0001"+
		"\u0000\u0000\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001"+
		"\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001"+
		"\u0000\u0000\u0000\u009d%\u0001\u0000\u0000\u0000\u009e\u00a0\u0003(\u0014"+
		"\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a2\'\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005\u0004\u0000\u0000"+
		"\u00a4\u00a5\u0003*\u0015\u0000\u00a5\u00a8\u0003\"\u0011\u0000\u00a6"+
		"\u00a7\u0005\u0005\u0000\u0000\u00a7\u00a9\u0003\"\u0011\u0000\u00a8\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00cd"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\t\u0000\u0000\u00ab\u00ac\u0003"+
		".\u0017\u0000\u00ac\u00ad\u0003\"\u0011\u0000\u00ad\u00cd\u0001\u0000"+
		"\u0000\u0000\u00ae\u00af\u0005\n\u0000\u0000\u00af\u00b0\u0003*\u0015"+
		"\u0000\u00b0\u00b1\u0003\"\u0011\u0000\u00b1\u00cd\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b3\u0005\u000b\u0000\u0000\u00b3\u00b4\u0003\"\u0011\u0000\u00b4"+
		"\u00b5\u0005\n\u0000\u0000\u00b5\u00b6\u0003*\u0015\u0000\u00b6\u00cd"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005\u0006\u0000\u0000\u00b8\u00b9"+
		"\u0003*\u0015\u0000\u00b9\u00bd\u0005\'\u0000\u0000\u00ba\u00bc\u0003"+
		"0\u0018\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bf\u0001\u0000"+
		"\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000"+
		"\u0000\u0000\u00be\u00c0\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c1\u0005(\u0000\u0000\u00c1\u00cd\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c3\u0005\f\u0000\u0000\u00c3\u00c4\u0003\"\u0011\u0000"+
		"\u00c4\u00c5\u0005\r\u0000\u0000\u00c5\u00c6\u0003*\u0015\u0000\u00c6"+
		"\u00cd\u0001\u0000\u0000\u0000\u00c7\u00c8\u00038\u001c\u0000\u00c8\u00c9"+
		"\u0005+\u0000\u0000\u00c9\u00cd\u0001\u0000\u0000\u0000\u00ca\u00cd\u0003"+
		"\u001e\u000f\u0000\u00cb\u00cd\u0003\u001a\r\u0000\u00cc\u00a3\u0001\u0000"+
		"\u0000\u0000\u00cc\u00aa\u0001\u0000\u0000\u0000\u00cc\u00ae\u0001\u0000"+
		"\u0000\u0000\u00cc\u00b2\u0001\u0000\u0000\u0000\u00cc\u00b7\u0001\u0000"+
		"\u0000\u0000\u00cc\u00c2\u0001\u0000\u0000\u0000\u00cc\u00c7\u0001\u0000"+
		"\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cb\u0001\u0000"+
		"\u0000\u0000\u00cd)\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005%\u0000\u0000"+
		"\u00cf\u00d0\u0003,\u0016\u0000\u00d0\u00d1\u0005&\u0000\u0000\u00d1+"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d3\u0006\u0016\uffff\uffff\u0000\u00d3"+
		"\u00e1\u0003\f\u0006\u0000\u00d4\u00e1\u0003\n\u0005\u0000\u00d5\u00e1"+
		"\u00038\u001c\u0000\u00d6\u00d7\u0005%\u0000\u0000\u00d7\u00d8\u0003,"+
		"\u0016\u0000\u00d8\u00d9\u0005&\u0000\u0000\u00d9\u00e1\u0001\u0000\u0000"+
		"\u0000\u00da\u00db\u0005$\u0000\u0000\u00db\u00e1\u0003,\u0016\u0003\u00dc"+
		"\u00dd\u0005\u0018\u0000\u0000\u00dd\u00e1\u0003,\u0016\u0002\u00de\u00df"+
		"\u0005\u0017\u0000\u0000\u00df\u00e1\u0003,\u0016\u0001\u00e0\u00d2\u0001"+
		"\u0000\u0000\u0000\u00e0\u00d4\u0001\u0000\u0000\u0000\u00e0\u00d5\u0001"+
		"\u0000\u0000\u0000\u00e0\u00d6\u0001\u0000\u0000\u0000\u00e0\u00da\u0001"+
		"\u0000\u0000\u0000\u00e0\u00dc\u0001\u0000\u0000\u0000\u00e0\u00de\u0001"+
		"\u0000\u0000\u0000\u00e1\u00f0\u0001\u0000\u0000\u0000\u00e2\u00e3\n\b"+
		"\u0000\u0000\u00e3\u00e4\u0007\u0004\u0000\u0000\u00e4\u00ef\u0003,\u0016"+
		"\t\u00e5\u00e6\n\u0007\u0000\u0000\u00e6\u00e7\u0007\u0003\u0000\u0000"+
		"\u00e7\u00ef\u0003,\u0016\b\u00e8\u00e9\n\u0006\u0000\u0000\u00e9\u00ea"+
		"\u0007\u0005\u0000\u0000\u00ea\u00ef\u0003,\u0016\u0007\u00eb\u00ec\n"+
		"\u0005\u0000\u0000\u00ec\u00ed\u0007\u0006\u0000\u0000\u00ed\u00ef\u0003"+
		",\u0016\u0006\u00ee\u00e2\u0001\u0000\u0000\u0000\u00ee\u00e5\u0001\u0000"+
		"\u0000\u0000\u00ee\u00e8\u0001\u0000\u0000\u0000\u00ee\u00eb\u0001\u0000"+
		"\u0000\u0000\u00ef\u00f2\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000"+
		"\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1-\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005%\u0000\u0000"+
		"\u00f4\u00f5\u0003\n\u0005\u0000\u00f5\u00f7\u0005\u001e\u0000\u0000\u00f6"+
		"\u00f8\u0003\b\u0004\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f7\u00f8"+
		"\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u00fa"+
		"\u0003,\u0016\u0000\u00fa\u00fc\u0005\u0001\u0000\u0000\u00fb\u00fd\u0003"+
		"\b\u0004\u0000\u00fc\u00fb\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000"+
		"\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u00ff\u0003,\u0016"+
		"\u0000\u00ff\u0100\u0005&\u0000\u0000\u0100/\u0001\u0000\u0000\u0000\u0101"+
		"\u0102\u0005\u0007\u0000\u0000\u0102\u0103\u0005.\u0000\u0000\u0103\u0104"+
		"\u0005\"\u0000\u0000\u0104\u0109\u0003\"\u0011\u0000\u0105\u0106\u0005"+
		"\b\u0000\u0000\u0106\u0107\u0005\"\u0000\u0000\u0107\u0109\u0003\"\u0011"+
		"\u0000\u0108\u0101\u0001\u0000\u0000\u0000\u0108\u0105\u0001\u0000\u0000"+
		"\u0000\u01091\u0001\u0000\u0000\u0000\u010a\u010b\u0003\u0002\u0001\u0000"+
		"\u010b\u010c\u0005\u0011\u0000\u0000\u010c\u010d\u0003\n\u0005\u0000\u010d"+
		"\u0116\u0005%\u0000\u0000\u010e\u0113\u00034\u001a\u0000\u010f\u0110\u0005"+
		",\u0000\u0000\u0110\u0112\u00034\u001a\u0000\u0111\u010f\u0001\u0000\u0000"+
		"\u0000\u0112\u0115\u0001\u0000\u0000\u0000\u0113\u0111\u0001\u0000\u0000"+
		"\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u0117\u0001\u0000\u0000"+
		"\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0116\u010e\u0001\u0000\u0000"+
		"\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000"+
		"\u0000\u0118\u0119\u0005&\u0000\u0000\u0119\u011a\u00036\u001b\u0000\u011a"+
		"3\u0001\u0000\u0000\u0000\u011b\u011c\u0003\u0006\u0003\u0000\u011c\u011d"+
		"\u0003\n\u0005\u0000\u011d5\u0001\u0000\u0000\u0000\u011e\u0120\u0005"+
		"\'\u0000\u0000\u011f\u0121\u0003&\u0013\u0000\u0120\u011f\u0001\u0000"+
		"\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u0126\u0001\u0000"+
		"\u0000\u0000\u0122\u0123\u0005\u000f\u0000\u0000\u0123\u0124\u0003,\u0016"+
		"\u0000\u0124\u0125\u0005+\u0000\u0000\u0125\u0127\u0001\u0000\u0000\u0000"+
		"\u0126\u0122\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000"+
		"\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u0129\u0005(\u0000\u0000\u0129"+
		"7\u0001\u0000\u0000\u0000\u012a\u012b\u0003\n\u0005\u0000\u012b\u0134"+
		"\u0005%\u0000\u0000\u012c\u0131\u0003:\u001d\u0000\u012d\u012e\u0005,"+
		"\u0000\u0000\u012e\u0130\u0003:\u001d\u0000\u012f\u012d\u0001\u0000\u0000"+
		"\u0000\u0130\u0133\u0001\u0000\u0000\u0000\u0131\u012f\u0001\u0000\u0000"+
		"\u0000\u0131\u0132\u0001\u0000\u0000\u0000\u0132\u0135\u0001\u0000\u0000"+
		"\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0134\u012c\u0001\u0000\u0000"+
		"\u0000\u0134\u0135\u0001\u0000\u0000\u0000\u0135\u0136\u0001\u0000\u0000"+
		"\u0000\u0136\u0137\u0005&\u0000\u0000\u01379\u0001\u0000\u0000\u0000\u0138"+
		"\u0139\u0003,\u0016\u0000\u0139;\u0001\u0000\u0000\u0000\u001eIMTY^dk"+
		"uy\u0082\u008e\u0094\u009a\u009c\u00a1\u00a8\u00bd\u00cc\u00e0\u00ee\u00f0"+
		"\u00f7\u00fc\u0108\u0113\u0116\u0120\u0126\u0131\u0134";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}