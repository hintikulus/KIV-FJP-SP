// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class czech_grammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FINAL=1, ASSIGN=2, DECLARATION=3, BOOLEAN=4, INT=5, VOID=6, METHOD_KEYWORD=7, 
		MULTIPLY=8, DIVIDE=9, MODULO=10, PLUS=11, MINUS=12, GREATER_THAN=13, GREATER_EQUALS=14, 
		LESS_THAN=15, LESS_EQUALS=16, EQUALS=17, NOT_EQUALS=18, NEGATION=19, AND=20, 
		OR=21, IF=22, SO=23, RETURN=24, SWITCH=25, CASE=26, DEFAULT=27, BREAK=28, 
		TERNAL=29, WHILE=30, DO=31, FOR=32, FROM=33, TO=34, DOUBLE_COMMA=35, L_ROUND_BRACE=36, 
		R_ROUND_BRACE=37, L_CURLY_BRACE=38, R_CURLY_BRACE=39, COMMA=40, SEMI=41, 
		TRUE=42, FALSE=43, POSITIVE=44, NEGATIVE=45, DECIMAL=46, WORD=47, WHITESPACE=48, 
		LINE_COMMENT=49;
	public static final int
		RULE_program = 0, RULE_functionReturnType = 1, RULE_booleanValue = 2, 
		RULE_varType = 3, RULE_numberSignChar = 4, RULE_decimalValue = 5, RULE_value = 6, 
		RULE_identifier = 7, RULE_paralelDeclaration = 8, RULE_decimalVariable = 9, 
		RULE_decimalExpression = 10, RULE_booleanVariable = 11, RULE_booleanExpression = 12, 
		RULE_localVariableDeclaration = 13, RULE_constVariableDeclaration = 14, 
		RULE_variableDeclaration = 15, RULE_variableAssignment = 16, RULE_block = 17, 
		RULE_body = 18, RULE_blockStatement = 19, RULE_blockBody = 20, RULE_statement = 21, 
		RULE_expression = 22, RULE_methodDeclaration = 23, RULE_methodParameter = 24, 
		RULE_elsestatement = 25, RULE_returnStatement = 26, RULE_methodBody = 27, 
		RULE_methodCall = 28, RULE_switchBlock = 29, RULE_caseBlock = 30, RULE_defaultBlock = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "functionReturnType", "booleanValue", "varType", "numberSignChar", 
			"decimalValue", "value", "identifier", "paralelDeclaration", "decimalVariable", 
			"decimalExpression", "booleanVariable", "booleanExpression", "localVariableDeclaration", 
			"constVariableDeclaration", "variableDeclaration", "variableAssignment", 
			"block", "body", "blockStatement", "blockBody", "statement", "expression", 
			"methodDeclaration", "methodParameter", "elsestatement", "returnStatement", 
			"methodBody", "methodCall", "switchBlock", "caseBlock", "defaultBlock"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'necht'", "'prave rovno'", "'existuje'", "'vyrok'", "'cislo'", 
			"'nic'", "'spageta'", "'krat'", "'deleno'", "'modulo'", "'plus'", "'minus'", 
			"'vetsi nez'", "'vetsi rovno nez'", "'mensi nez'", "'mensi rovno nez'", 
			"'rovno'", "'nerovno'", "'opak'", "'a zaroven'", "'nebo'", "'kdyz'", 
			"'tak'", "'vrat'", "'prepinej'", "'pripad'", "'jinak'", "'zastav'", "'za podminky'", 
			"'dokud'", "'delej'", "'pro'", "'od'", "'do'", "':'", "'('", "')'", "'{'", 
			"'}'", "','", "'budiz'", "'pravda'", "'lez'", "'kladne'", "'zaporne'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FINAL", "ASSIGN", "DECLARATION", "BOOLEAN", "INT", "VOID", "METHOD_KEYWORD", 
			"MULTIPLY", "DIVIDE", "MODULO", "PLUS", "MINUS", "GREATER_THAN", "GREATER_EQUALS", 
			"LESS_THAN", "LESS_EQUALS", "EQUALS", "NOT_EQUALS", "NEGATION", "AND", 
			"OR", "IF", "SO", "RETURN", "SWITCH", "CASE", "DEFAULT", "BREAK", "TERNAL", 
			"WHILE", "DO", "FOR", "FROM", "TO", "DOUBLE_COMMA", "L_ROUND_BRACE", 
			"R_ROUND_BRACE", "L_CURLY_BRACE", "R_CURLY_BRACE", "COMMA", "SEMI", "TRUE", 
			"FALSE", "POSITIVE", "NEGATIVE", "DECIMAL", "WORD", "WHITESPACE", "LINE_COMMENT"
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

	public czech_grammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(czech_grammarParser.DO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof czech_grammarVisitor ) return ((czech_grammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(DO);
			setState(65);
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
	public static class FunctionReturnTypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(czech_grammarParser.INT, 0); }
		public TerminalNode BOOLEAN() { return getToken(czech_grammarParser.BOOLEAN, 0); }
		public TerminalNode VOID() { return getToken(czech_grammarParser.VOID, 0); }
		public FunctionReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionReturnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).enterFunctionReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).exitFunctionReturnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof czech_grammarVisitor ) return ((czech_grammarVisitor<? extends T>)visitor).visitFunctionReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionReturnTypeContext functionReturnType() throws RecognitionException {
		FunctionReturnTypeContext _localctx = new FunctionReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_functionReturnType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 112L) != 0) ) {
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
		public TerminalNode TRUE() { return getToken(czech_grammarParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(czech_grammarParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof czech_grammarVisitor ) return ((czech_grammarVisitor<? extends T>)visitor).visitBooleanValue(this);
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
			setState(69);
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
	public static class VarTypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(czech_grammarParser.INT, 0); }
		public TerminalNode BOOLEAN() { return getToken(czech_grammarParser.BOOLEAN, 0); }
		public VarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).enterVarType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).exitVarType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof czech_grammarVisitor ) return ((czech_grammarVisitor<? extends T>)visitor).visitVarType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarTypeContext varType() throws RecognitionException {
		VarTypeContext _localctx = new VarTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
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
	public static class NumberSignCharContext extends ParserRuleContext {
		public TerminalNode POSITIVE() { return getToken(czech_grammarParser.POSITIVE, 0); }
		public TerminalNode MINUS() { return getToken(czech_grammarParser.MINUS, 0); }
		public NumberSignCharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberSignChar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).enterNumberSignChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).exitNumberSignChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof czech_grammarVisitor ) return ((czech_grammarVisitor<? extends T>)visitor).visitNumberSignChar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberSignCharContext numberSignChar() throws RecognitionException {
		NumberSignCharContext _localctx = new NumberSignCharContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_numberSignChar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_la = _input.LA(1);
			if ( !(_la==MINUS || _la==POSITIVE) ) {
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
	public static class DecimalValueContext extends ParserRuleContext {
		public TerminalNode DECIMAL() { return getToken(czech_grammarParser.DECIMAL, 0); }
		public NumberSignCharContext numberSignChar() {
			return getRuleContext(NumberSignCharContext.class,0);
		}
		public DecimalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).enterDecimalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).exitDecimalValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof czech_grammarVisitor ) return ((czech_grammarVisitor<? extends T>)visitor).visitDecimalValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalValueContext decimalValue() throws RecognitionException {
		DecimalValueContext _localctx = new DecimalValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_decimalValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS || _la==POSITIVE) {
				{
				setState(75);
				numberSignChar();
				}
			}

			setState(78);
			match(DECIMAL);
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
	public static class ValueContext extends ParserRuleContext {
		public DecimalValueContext decimalValue() {
			return getRuleContext(DecimalValueContext.class,0);
		}
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof czech_grammarVisitor ) return ((czech_grammarVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_value);
		try {
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case POSITIVE:
			case DECIMAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				decimalValue();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
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
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(czech_grammarParser.WORD, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof czech_grammarVisitor ) return ((czech_grammarVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
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
	public static class ParalelDeclarationContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(czech_grammarParser.ASSIGN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParalelDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paralelDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).enterParalelDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).exitParalelDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof czech_grammarVisitor ) return ((czech_grammarVisitor<? extends T>)visitor).visitParalelDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParalelDeclarationContext paralelDeclaration() throws RecognitionException {
		ParalelDeclarationContext _localctx = new ParalelDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_paralelDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(ASSIGN);
			setState(87);
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
	public static class DecimalVariableContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(czech_grammarParser.INT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ParalelDeclarationContext> paralelDeclaration() {
			return getRuleContexts(ParalelDeclarationContext.class);
		}
		public ParalelDeclarationContext paralelDeclaration(int i) {
			return getRuleContext(ParalelDeclarationContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(czech_grammarParser.ASSIGN, 0); }
		public DecimalExpressionContext decimalExpression() {
			return getRuleContext(DecimalExpressionContext.class,0);
		}
		public NumberSignCharContext numberSignChar() {
			return getRuleContext(NumberSignCharContext.class,0);
		}
		public DecimalVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).enterDecimalVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).exitDecimalVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof czech_grammarVisitor ) return ((czech_grammarVisitor<? extends T>)visitor).visitDecimalVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalVariableContext decimalVariable() throws RecognitionException {
		DecimalVariableContext _localctx = new DecimalVariableContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_decimalVariable);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(INT);
			setState(90);
			identifier();
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(91);
					paralelDeclaration();
					}
					} 
				}
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(97);
				match(ASSIGN);
				setState(99);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(98);
					numberSignChar();
					}
					break;
				}
				setState(101);
				decimalExpression();
				}
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
	public static class DecimalExpressionContext extends ParserRuleContext {
		public TerminalNode DECIMAL() { return getToken(czech_grammarParser.DECIMAL, 0); }
		public NumberSignCharContext numberSignChar() {
			return getRuleContext(NumberSignCharContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DecimalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).enterDecimalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).exitDecimalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof czech_grammarVisitor ) return ((czech_grammarVisitor<? extends T>)visitor).visitDecimalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalExpressionContext decimalExpression() throws RecognitionException {
		DecimalExpressionContext _localctx = new DecimalExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_decimalExpression);
		int _la;
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS || _la==POSITIVE) {
					{
					setState(104);
					numberSignChar();
					}
				}

				setState(107);
				match(DECIMAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				methodCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				identifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(110);
				expression(0);
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
	public static class BooleanVariableContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(czech_grammarParser.BOOLEAN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(czech_grammarParser.ASSIGN, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public List<ParalelDeclarationContext> paralelDeclaration() {
			return getRuleContexts(ParalelDeclarationContext.class);
		}
		public ParalelDeclarationContext paralelDeclaration(int i) {
			return getRuleContext(ParalelDeclarationContext.class,i);
		}
		public BooleanVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).enterBooleanVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).exitBooleanVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof czech_grammarVisitor ) return ((czech_grammarVisitor<? extends T>)visitor).visitBooleanVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanVariableContext booleanVariable() throws RecognitionException {
		BooleanVariableContext _localctx = new BooleanVariableContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_booleanVariable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(BOOLEAN);
			setState(114);
			identifier();
			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(115);
					paralelDeclaration();
					}
					} 
				}
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(121);
			match(ASSIGN);
			setState(122);
			booleanExpression();
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
	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).enterBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).exitBooleanExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof czech_grammarVisitor ) return ((czech_grammarVisitor<? extends T>)visitor).visitBooleanExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_booleanExpression);
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				booleanValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				methodCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				identifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(127);
				expression(0);
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
		public TerminalNode DECLARATION() { return getToken(czech_grammarParser.DECLARATION, 0); }
		public TerminalNode SEMI() { return getToken(czech_grammarParser.SEMI, 0); }
		public DecimalVariableContext decimalVariable() {
			return getRuleContext(DecimalVariableContext.class,0);
		}
		public BooleanVariableContext booleanVariable() {
			return getRuleContext(BooleanVariableContext.class,0);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).exitLocalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof czech_grammarVisitor ) return ((czech_grammarVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_localVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(DECLARATION);
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(131);
				decimalVariable();
				}
				break;
			case BOOLEAN:
				{
				setState(132);
				booleanVariable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(135);
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
		public TerminalNode FINAL() { return getToken(czech_grammarParser.FINAL, 0); }
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ConstVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).enterConstVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).exitConstVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof czech_grammarVisitor ) return ((czech_grammarVisitor<? extends T>)visitor).visitConstVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstVariableDeclarationContext constVariableDeclaration() throws RecognitionException {
		ConstVariableDeclarationContext _localctx = new ConstVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_constVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(FINAL);
			setState(138);
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
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof czech_grammarVisitor ) return ((czech_grammarVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLARATION:
				{
				setState(140);
				localVariableDeclaration();
				}
				break;
			case FINAL:
				{
				setState(141);
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
	public static class VariableAssignmentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(czech_grammarParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(czech_grammarParser.SEMI, 0); }
		public VariableAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).enterVariableAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).exitVariableAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof czech_grammarVisitor ) return ((czech_grammarVisitor<? extends T>)visitor).visitVariableAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableAssignmentContext variableAssignment() throws RecognitionException {
		VariableAssignmentContext _localctx = new VariableAssignmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variableAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			identifier();
			setState(145);
			match(ASSIGN);
			setState(146);
			expression(0);
			setState(147);
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
		public TerminalNode L_CURLY_BRACE() { return getToken(czech_grammarParser.L_CURLY_BRACE, 0); }
		public TerminalNode R_CURLY_BRACE() { return getToken(czech_grammarParser.R_CURLY_BRACE, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof czech_grammarVisitor ) return ((czech_grammarVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(L_CURLY_BRACE);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 140745327509642L) != 0) {
				{
				setState(150);
				blockStatement();
				}
			}

			setState(153);
			match(R_CURLY_BRACE);
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
		public TerminalNode L_CURLY_BRACE() { return getToken(czech_grammarParser.L_CURLY_BRACE, 0); }
		public TerminalNode R_CURLY_BRACE() { return getToken(czech_grammarParser.R_CURLY_BRACE, 0); }
		public BlockBodyContext blockBody() {
			return getRuleContext(BlockBodyContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof czech_grammarVisitor ) return ((czech_grammarVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(L_CURLY_BRACE);
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(156);
				blockBody();
				}
				break;
			}
			setState(159);
			match(R_CURLY_BRACE);
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
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof czech_grammarVisitor ) return ((czech_grammarVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_blockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(163);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FINAL:
				case DECLARATION:
				case IF:
				case RETURN:
				case SWITCH:
				case BREAK:
				case WHILE:
				case DO:
				case FOR:
				case WORD:
					{
					setState(161);
					statement();
					}
					break;
				case METHOD_KEYWORD:
					{
					setState(162);
					methodDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(165); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 140745327509642L) != 0 );
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
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).enterBlockBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).exitBlockBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof czech_grammarVisitor ) return ((czech_grammarVisitor<? extends T>)visitor).visitBlockBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockBodyContext blockBody() throws RecognitionException {
		BlockBodyContext _localctx = new BlockBodyContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_blockBody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(167);
					statement();
					}
					} 
				}
				setState(172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
	public static class StatementDoWhileContext extends StatementContext {
		public TerminalNode DO() { return getToken(czech_grammarParser.DO, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(czech_grammarParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(czech_grammarParser.SEMI, 0); }
		public StatementDoWhileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).enterStatementDoWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).exitStatementDoWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof czech_grammarVisitor ) return ((czech_grammarVisitor<? extends T>)visitor).visitStatementDoWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementAssigmentContext extends StatementContext {
		public VariableAssignmentContext variableAssignment() {
			return getRuleContext(VariableAssignmentContext.class,0);
		}
		public StatementAssigmentContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).enterStatementAssigment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).exitStatementAssigment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof czech_grammarVisitor ) return ((czech_grammarVisitor<? extends T>)visitor).visitStatementAssigment(this);
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
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).enterStatementVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).exitStatementVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof czech_grammarVisitor ) return ((czech_grammarVisitor<? extends T>)visitor).visitStatementVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementReturnContext extends StatementContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public StatementReturnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).enterStatementReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).exitStatementReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof czech_grammarVisitor ) return ((czech_grammarVisitor<? extends T>)visitor).visitStatementReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementForContext extends StatementContext {
		public TerminalNode FOR() { return getToken(czech_grammarParser.FOR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(czech_grammarParser.FROM, 0); }
		public List<DecimalExpressionContext> decimalExpression() {
			return getRuleContexts(DecimalExpressionContext.class);
		}
		public DecimalExpressionContext decimalExpression(int i) {
			return getRuleContext(DecimalExpressionContext.class,i);
		}
		public TerminalNode TO() { return getToken(czech_grammarParser.TO, 0); }
		public TerminalNode DO() { return getToken(czech_grammarParser.DO, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public StatementForContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).enterStatementFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).exitStatementFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof czech_grammarVisitor ) return ((czech_grammarVisitor<? extends T>)visitor).visitStatementFor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementBreakContext extends StatementContext {
		public TerminalNode BREAK() { return getToken(czech_grammarParser.BREAK, 0); }
		public TerminalNode SEMI() { return getToken(czech_grammarParser.SEMI, 0); }
		public StatementBreakContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).enterStatementBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).exitStatementBreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof czech_grammarVisitor ) return ((czech_grammarVisitor<? extends T>)visitor).visitStatementBreak(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementWhileContext extends StatementContext {
		public TerminalNode WHILE() { return getToken(czech_grammarParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SO() { return getToken(czech_grammarParser.SO, 0); }
		public TerminalNode DO() { return getToken(czech_grammarParser.DO, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public StatementWhileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).enterStatementWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).exitStatementWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof czech_grammarVisitor ) return ((czech_grammarVisitor<? extends T>)visitor).visitStatementWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementMethodCallContext extends StatementContext {
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(czech_grammarParser.SEMI, 0); }
		public StatementMethodCallContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).enterStatementMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).exitStatementMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof czech_grammarVisitor ) return ((czech_grammarVisitor<? extends T>)visitor).visitStatementMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SwitchStatementContext extends StatementContext {
		public TerminalNode SWITCH() { return getToken(czech_grammarParser.SWITCH, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
		}
		public SwitchStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof czech_grammarVisitor ) return ((czech_grammarVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementIfContext extends StatementContext {
		public TerminalNode IF() { return getToken(czech_grammarParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SO() { return getToken(czech_grammarParser.SO, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ElsestatementContext elsestatement() {
			return getRuleContext(ElsestatementContext.class,0);
		}
		public StatementIfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).enterStatementIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).exitStatementIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof czech_grammarVisitor ) return ((czech_grammarVisitor<? extends T>)visitor).visitStatementIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_statement);
		int _la;
		try {
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new StatementIfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(IF);
				setState(174);
				expression(0);
				setState(175);
				match(SO);
				setState(176);
				body();
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(177);
					elsestatement();
					}
				}

				}
				break;
			case 2:
				_localctx = new StatementWhileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				match(WHILE);
				setState(181);
				expression(0);
				setState(182);
				match(SO);
				setState(183);
				match(DO);
				setState(184);
				body();
				}
				break;
			case 3:
				_localctx = new StatementDoWhileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				match(DO);
				setState(187);
				body();
				setState(188);
				match(WHILE);
				setState(189);
				expression(0);
				setState(190);
				match(SEMI);
				}
				break;
			case 4:
				_localctx = new StatementForContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(192);
				match(FOR);
				setState(193);
				identifier();
				setState(194);
				match(FROM);
				setState(195);
				decimalExpression();
				setState(196);
				match(TO);
				setState(197);
				decimalExpression();
				setState(198);
				match(DO);
				setState(199);
				body();
				}
				break;
			case 5:
				_localctx = new StatementMethodCallContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(201);
				methodCall();
				setState(202);
				match(SEMI);
				}
				break;
			case 6:
				_localctx = new StatementAssigmentContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(204);
				variableAssignment();
				}
				break;
			case 7:
				_localctx = new StatementVariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(205);
				variableDeclaration();
				}
				break;
			case 8:
				_localctx = new SwitchStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(206);
				match(SWITCH);
				setState(207);
				expression(0);
				setState(208);
				switchBlock();
				}
				break;
			case 9:
				_localctx = new StatementReturnContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(210);
				returnStatement();
				}
				break;
			case 10:
				_localctx = new StatementBreakContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(211);
				match(BREAK);
				setState(212);
				match(SEMI);
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprNegContext extends ExpressionContext {
		public TerminalNode NEGATION() { return getToken(czech_grammarParser.NEGATION, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprNegContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).enterExprNeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).exitExprNeg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof czech_grammarVisitor ) return ((czech_grammarVisitor<? extends T>)visitor).visitExprNeg(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprPlusContext extends ExpressionContext {
		public TerminalNode PLUS() { return getToken(czech_grammarParser.PLUS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprPlusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).enterExprPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).exitExprPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof czech_grammarVisitor ) return ((czech_grammarVisitor<? extends T>)visitor).visitExprPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprAdditiveContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(czech_grammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(czech_grammarParser.MINUS, 0); }
		public ExprAdditiveContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).enterExprAdditive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).exitExprAdditive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof czech_grammarVisitor ) return ((czech_grammarVisitor<? extends T>)visitor).visitExprAdditive(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TernalOperatorContext extends ExpressionContext {
		public TerminalNode TERNAL() { return getToken(czech_grammarParser.TERNAL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SO() { return getToken(czech_grammarParser.SO, 0); }
		public TerminalNode DEFAULT() { return getToken(czech_grammarParser.DEFAULT, 0); }
		public TernalOperatorContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).enterTernalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).exitTernalOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof czech_grammarVisitor ) return ((czech_grammarVisitor<? extends T>)visitor).visitTernalOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprParContext extends ExpressionContext {
		public TerminalNode L_ROUND_BRACE() { return getToken(czech_grammarParser.L_ROUND_BRACE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_ROUND_BRACE() { return getToken(czech_grammarParser.R_ROUND_BRACE, 0); }
		public ExprParContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).enterExprPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).exitExprPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof czech_grammarVisitor ) return ((czech_grammarVisitor<? extends T>)visitor).visitExprPar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprMinusContext extends ExpressionContext {
		public TerminalNode MINUS() { return getToken(czech_grammarParser.MINUS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprMinusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).enterExprMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).exitExprMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof czech_grammarVisitor ) return ((czech_grammarVisitor<? extends T>)visitor).visitExprMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprRelationalContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GREATER_THAN() { return getToken(czech_grammarParser.GREATER_THAN, 0); }
		public TerminalNode GREATER_EQUALS() { return getToken(czech_grammarParser.GREATER_EQUALS, 0); }
		public TerminalNode LESS_THAN() { return getToken(czech_grammarParser.LESS_THAN, 0); }
		public TerminalNode LESS_EQUALS() { return getToken(czech_grammarParser.LESS_EQUALS, 0); }
		public TerminalNode EQUALS() { return getToken(czech_grammarParser.EQUALS, 0); }
		public TerminalNode NOT_EQUALS() { return getToken(czech_grammarParser.NOT_EQUALS, 0); }
		public ExprRelationalContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).enterExprRelational(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).exitExprRelational(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof czech_grammarVisitor ) return ((czech_grammarVisitor<? extends T>)visitor).visitExprRelational(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprIdentifierContext extends ExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExprIdentifierContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).enterExprIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).exitExprIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof czech_grammarVisitor ) return ((czech_grammarVisitor<? extends T>)visitor).visitExprIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprPossibleValueContext extends ExpressionContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ExprPossibleValueContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).enterExprPossibleValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).exitExprPossibleValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof czech_grammarVisitor ) return ((czech_grammarVisitor<? extends T>)visitor).visitExprPossibleValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprMethodCallContext extends ExpressionContext {
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public ExprMethodCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).enterExprMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).exitExprMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof czech_grammarVisitor ) return ((czech_grammarVisitor<? extends T>)visitor).visitExprMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprLogicalContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(czech_grammarParser.AND, 0); }
		public TerminalNode OR() { return getToken(czech_grammarParser.OR, 0); }
		public ExprLogicalContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).enterExprLogical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).exitExprLogical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof czech_grammarVisitor ) return ((czech_grammarVisitor<? extends T>)visitor).visitExprLogical(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprMultipliContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULTIPLY() { return getToken(czech_grammarParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(czech_grammarParser.DIVIDE, 0); }
		public TerminalNode MODULO() { return getToken(czech_grammarParser.MODULO, 0); }
		public ExprMultipliContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).enterExprMultipli(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).exitExprMultipli(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof czech_grammarVisitor ) return ((czech_grammarVisitor<? extends T>)visitor).visitExprMultipli(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				_localctx = new ExprPossibleValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(216);
				value();
				}
				break;
			case 2:
				{
				_localctx = new ExprIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(217);
				identifier();
				}
				break;
			case 3:
				{
				_localctx = new ExprMethodCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(218);
				methodCall();
				}
				break;
			case 4:
				{
				_localctx = new ExprParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(219);
				match(L_ROUND_BRACE);
				setState(220);
				expression(0);
				setState(221);
				match(R_ROUND_BRACE);
				}
				break;
			case 5:
				{
				_localctx = new ExprNegContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(223);
				match(NEGATION);
				setState(224);
				expression(4);
				}
				break;
			case 6:
				{
				_localctx = new ExprMinusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(225);
				match(MINUS);
				setState(226);
				expression(3);
				}
				break;
			case 7:
				{
				_localctx = new ExprPlusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(227);
				match(PLUS);
				setState(228);
				expression(2);
				}
				break;
			case 8:
				{
				_localctx = new TernalOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(229);
				match(TERNAL);
				setState(230);
				expression(0);
				setState(231);
				match(SO);
				setState(232);
				expression(0);
				setState(233);
				match(DEFAULT);
				setState(234);
				expression(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(252);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(250);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMultipliContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(238);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(239);
						((ExprMultipliContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 1792L) != 0) ) {
							((ExprMultipliContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(240);
						expression(10);
						}
						break;
					case 2:
						{
						_localctx = new ExprAdditiveContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(241);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(242);
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
						setState(243);
						expression(9);
						}
						break;
					case 3:
						{
						_localctx = new ExprRelationalContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(244);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(245);
						((ExprRelationalContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 516096L) != 0) ) {
							((ExprRelationalContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(246);
						expression(8);
						}
						break;
					case 4:
						{
						_localctx = new ExprLogicalContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(247);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(248);
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
						setState(249);
						expression(7);
						}
						break;
					}
					} 
				}
				setState(254);
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
	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode METHOD_KEYWORD() { return getToken(czech_grammarParser.METHOD_KEYWORD, 0); }
		public FunctionReturnTypeContext functionReturnType() {
			return getRuleContext(FunctionReturnTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode L_ROUND_BRACE() { return getToken(czech_grammarParser.L_ROUND_BRACE, 0); }
		public TerminalNode R_ROUND_BRACE() { return getToken(czech_grammarParser.R_ROUND_BRACE, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<MethodParameterContext> methodParameter() {
			return getRuleContexts(MethodParameterContext.class);
		}
		public MethodParameterContext methodParameter(int i) {
			return getRuleContext(MethodParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(czech_grammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(czech_grammarParser.COMMA, i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof czech_grammarVisitor ) return ((czech_grammarVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(METHOD_KEYWORD);
			setState(256);
			functionReturnType();
			setState(257);
			identifier();
			setState(258);
			match(L_ROUND_BRACE);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BOOLEAN || _la==INT) {
				{
				setState(259);
				methodParameter();
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(260);
					match(COMMA);
					setState(261);
					methodParameter();
					}
					}
					setState(266);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(269);
			match(R_ROUND_BRACE);
			setState(270);
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
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
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
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).enterMethodParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).exitMethodParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof czech_grammarVisitor ) return ((czech_grammarVisitor<? extends T>)visitor).visitMethodParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodParameterContext methodParameter() throws RecognitionException {
		MethodParameterContext _localctx = new MethodParameterContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_methodParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			varType();
			setState(273);
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
	public static class ElsestatementContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(czech_grammarParser.OR, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ElsestatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsestatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).enterElsestatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).exitElsestatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof czech_grammarVisitor ) return ((czech_grammarVisitor<? extends T>)visitor).visitElsestatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElsestatementContext elsestatement() throws RecognitionException {
		ElsestatementContext _localctx = new ElsestatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_elsestatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(OR);
			setState(276);
			body();
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
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(czech_grammarParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(czech_grammarParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof czech_grammarVisitor ) return ((czech_grammarVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(RETURN);
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 241961814988800L) != 0) {
				{
				setState(279);
				expression(0);
				}
			}

			setState(282);
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
	public static class MethodBodyContext extends ParserRuleContext {
		public TerminalNode L_CURLY_BRACE() { return getToken(czech_grammarParser.L_CURLY_BRACE, 0); }
		public TerminalNode R_CURLY_BRACE() { return getToken(czech_grammarParser.R_CURLY_BRACE, 0); }
		public BlockBodyContext blockBody() {
			return getRuleContext(BlockBodyContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof czech_grammarVisitor ) return ((czech_grammarVisitor<? extends T>)visitor).visitMethodBody(this);
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
			setState(284);
			match(L_CURLY_BRACE);
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(285);
				blockBody();
				}
				break;
			}
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(288);
				returnStatement();
				}
			}

			setState(291);
			match(R_CURLY_BRACE);
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
		public TerminalNode L_ROUND_BRACE() { return getToken(czech_grammarParser.L_ROUND_BRACE, 0); }
		public TerminalNode R_ROUND_BRACE() { return getToken(czech_grammarParser.R_ROUND_BRACE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(czech_grammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(czech_grammarParser.COMMA, i);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof czech_grammarVisitor ) return ((czech_grammarVisitor<? extends T>)visitor).visitMethodCall(this);
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
			setState(293);
			identifier();
			setState(294);
			match(L_ROUND_BRACE);
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 241961814988800L) != 0) {
				{
				setState(295);
				expression(0);
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(296);
					match(COMMA);
					setState(297);
					expression(0);
					}
					}
					setState(302);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(305);
			match(R_ROUND_BRACE);
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
	public static class SwitchBlockContext extends ParserRuleContext {
		public TerminalNode L_CURLY_BRACE() { return getToken(czech_grammarParser.L_CURLY_BRACE, 0); }
		public TerminalNode R_CURLY_BRACE() { return getToken(czech_grammarParser.R_CURLY_BRACE, 0); }
		public List<CaseBlockContext> caseBlock() {
			return getRuleContexts(CaseBlockContext.class);
		}
		public CaseBlockContext caseBlock(int i) {
			return getRuleContext(CaseBlockContext.class,i);
		}
		public DefaultBlockContext defaultBlock() {
			return getRuleContext(DefaultBlockContext.class,0);
		}
		public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).enterSwitchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).exitSwitchBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof czech_grammarVisitor ) return ((czech_grammarVisitor<? extends T>)visitor).visitSwitchBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_switchBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(L_CURLY_BRACE);
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(308);
				caseBlock();
				}
				}
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(314);
				defaultBlock();
				}
			}

			setState(317);
			match(R_CURLY_BRACE);
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
	public static class CaseBlockContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(czech_grammarParser.CASE, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode SO() { return getToken(czech_grammarParser.SO, 0); }
		public BlockBodyContext blockBody() {
			return getRuleContext(BlockBodyContext.class,0);
		}
		public CaseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).enterCaseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).exitCaseBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof czech_grammarVisitor ) return ((czech_grammarVisitor<? extends T>)visitor).visitCaseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseBlockContext caseBlock() throws RecognitionException {
		CaseBlockContext _localctx = new CaseBlockContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_caseBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(CASE);
			setState(320);
			value();
			setState(321);
			match(SO);
			setState(322);
			blockBody();
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
	public static class DefaultBlockContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(czech_grammarParser.DEFAULT, 0); }
		public TerminalNode SO() { return getToken(czech_grammarParser.SO, 0); }
		public BlockBodyContext blockBody() {
			return getRuleContext(BlockBodyContext.class,0);
		}
		public DefaultBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).enterDefaultBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof czech_grammarListener ) ((czech_grammarListener)listener).exitDefaultBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof czech_grammarVisitor ) return ((czech_grammarVisitor<? extends T>)visitor).visitDefaultBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultBlockContext defaultBlock() throws RecognitionException {
		DefaultBlockContext _localctx = new DefaultBlockContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_defaultBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(DEFAULT);
			setState(325);
			match(SO);
			setState(326);
			blockBody();
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
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00011\u0149\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0003\u0005M\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0003\u0006S\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0005\t]\b\t\n\t\f\t"+
		"`\t\t\u0001\t\u0001\t\u0003\td\b\t\u0001\t\u0003\tg\b\t\u0001\n\u0003"+
		"\nj\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\np\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000bu\b\u000b\n\u000b\f\u000bx\t\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f"+
		"\u0081\b\f\u0001\r\u0001\r\u0001\r\u0003\r\u0086\b\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0003\u000f\u008f"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u0098\b\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u009e\b\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0004\u0013\u00a4\b\u0013\u000b\u0013\f\u0013\u00a5"+
		"\u0001\u0014\u0005\u0014\u00a9\b\u0014\n\u0014\f\u0014\u00ac\t\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00b3"+
		"\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00d6\b\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u00ed\b\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u00fb"+
		"\b\u0016\n\u0016\f\u0016\u00fe\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u0107\b\u0017"+
		"\n\u0017\f\u0017\u010a\t\u0017\u0003\u0017\u010c\b\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0003\u001a\u0119\b\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0003\u001b\u011f\b\u001b\u0001"+
		"\u001b\u0003\u001b\u0122\b\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u012b\b\u001c\n"+
		"\u001c\f\u001c\u012e\t\u001c\u0003\u001c\u0130\b\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001d\u0001\u001d\u0005\u001d\u0136\b\u001d\n\u001d\f\u001d"+
		"\u0139\t\u001d\u0001\u001d\u0003\u001d\u013c\b\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0000\u0001, \u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>\u0000\b\u0001\u0000\u0004\u0006\u0001\u0000*+"+
		"\u0001\u0000\u0004\u0005\u0002\u0000\f\f,,\u0001\u0000\b\n\u0001\u0000"+
		"\u000b\f\u0001\u0000\r\u0012\u0001\u0000\u0014\u0015\u015a\u0000@\u0001"+
		"\u0000\u0000\u0000\u0002C\u0001\u0000\u0000\u0000\u0004E\u0001\u0000\u0000"+
		"\u0000\u0006G\u0001\u0000\u0000\u0000\bI\u0001\u0000\u0000\u0000\nL\u0001"+
		"\u0000\u0000\u0000\fR\u0001\u0000\u0000\u0000\u000eT\u0001\u0000\u0000"+
		"\u0000\u0010V\u0001\u0000\u0000\u0000\u0012Y\u0001\u0000\u0000\u0000\u0014"+
		"o\u0001\u0000\u0000\u0000\u0016q\u0001\u0000\u0000\u0000\u0018\u0080\u0001"+
		"\u0000\u0000\u0000\u001a\u0082\u0001\u0000\u0000\u0000\u001c\u0089\u0001"+
		"\u0000\u0000\u0000\u001e\u008e\u0001\u0000\u0000\u0000 \u0090\u0001\u0000"+
		"\u0000\u0000\"\u0095\u0001\u0000\u0000\u0000$\u009b\u0001\u0000\u0000"+
		"\u0000&\u00a3\u0001\u0000\u0000\u0000(\u00aa\u0001\u0000\u0000\u0000*"+
		"\u00d5\u0001\u0000\u0000\u0000,\u00ec\u0001\u0000\u0000\u0000.\u00ff\u0001"+
		"\u0000\u0000\u00000\u0110\u0001\u0000\u0000\u00002\u0113\u0001\u0000\u0000"+
		"\u00004\u0116\u0001\u0000\u0000\u00006\u011c\u0001\u0000\u0000\u00008"+
		"\u0125\u0001\u0000\u0000\u0000:\u0133\u0001\u0000\u0000\u0000<\u013f\u0001"+
		"\u0000\u0000\u0000>\u0144\u0001\u0000\u0000\u0000@A\u0005\u001f\u0000"+
		"\u0000AB\u0003\"\u0011\u0000B\u0001\u0001\u0000\u0000\u0000CD\u0007\u0000"+
		"\u0000\u0000D\u0003\u0001\u0000\u0000\u0000EF\u0007\u0001\u0000\u0000"+
		"F\u0005\u0001\u0000\u0000\u0000GH\u0007\u0002\u0000\u0000H\u0007\u0001"+
		"\u0000\u0000\u0000IJ\u0007\u0003\u0000\u0000J\t\u0001\u0000\u0000\u0000"+
		"KM\u0003\b\u0004\u0000LK\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000"+
		"MN\u0001\u0000\u0000\u0000NO\u0005.\u0000\u0000O\u000b\u0001\u0000\u0000"+
		"\u0000PS\u0003\n\u0005\u0000QS\u0003\u0004\u0002\u0000RP\u0001\u0000\u0000"+
		"\u0000RQ\u0001\u0000\u0000\u0000S\r\u0001\u0000\u0000\u0000TU\u0005/\u0000"+
		"\u0000U\u000f\u0001\u0000\u0000\u0000VW\u0005\u0002\u0000\u0000WX\u0003"+
		"\u000e\u0007\u0000X\u0011\u0001\u0000\u0000\u0000YZ\u0005\u0005\u0000"+
		"\u0000Z^\u0003\u000e\u0007\u0000[]\u0003\u0010\b\u0000\\[\u0001\u0000"+
		"\u0000\u0000]`\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000^_\u0001"+
		"\u0000\u0000\u0000_f\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000"+
		"ac\u0005\u0002\u0000\u0000bd\u0003\b\u0004\u0000cb\u0001\u0000\u0000\u0000"+
		"cd\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000eg\u0003\u0014\n\u0000"+
		"fa\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000g\u0013\u0001\u0000"+
		"\u0000\u0000hj\u0003\b\u0004\u0000ih\u0001\u0000\u0000\u0000ij\u0001\u0000"+
		"\u0000\u0000jk\u0001\u0000\u0000\u0000kp\u0005.\u0000\u0000lp\u00038\u001c"+
		"\u0000mp\u0003\u000e\u0007\u0000np\u0003,\u0016\u0000oi\u0001\u0000\u0000"+
		"\u0000ol\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000on\u0001\u0000"+
		"\u0000\u0000p\u0015\u0001\u0000\u0000\u0000qr\u0005\u0004\u0000\u0000"+
		"rv\u0003\u000e\u0007\u0000su\u0003\u0010\b\u0000ts\u0001\u0000\u0000\u0000"+
		"ux\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000"+
		"\u0000wy\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000yz\u0005\u0002"+
		"\u0000\u0000z{\u0003\u0018\f\u0000{\u0017\u0001\u0000\u0000\u0000|\u0081"+
		"\u0003\u0004\u0002\u0000}\u0081\u00038\u001c\u0000~\u0081\u0003\u000e"+
		"\u0007\u0000\u007f\u0081\u0003,\u0016\u0000\u0080|\u0001\u0000\u0000\u0000"+
		"\u0080}\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u007f"+
		"\u0001\u0000\u0000\u0000\u0081\u0019\u0001\u0000\u0000\u0000\u0082\u0085"+
		"\u0005\u0003\u0000\u0000\u0083\u0086\u0003\u0012\t\u0000\u0084\u0086\u0003"+
		"\u0016\u000b\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0084\u0001"+
		"\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0088\u0005"+
		")\u0000\u0000\u0088\u001b\u0001\u0000\u0000\u0000\u0089\u008a\u0005\u0001"+
		"\u0000\u0000\u008a\u008b\u0003\u001a\r\u0000\u008b\u001d\u0001\u0000\u0000"+
		"\u0000\u008c\u008f\u0003\u001a\r\u0000\u008d\u008f\u0003\u001c\u000e\u0000"+
		"\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008d\u0001\u0000\u0000\u0000"+
		"\u008f\u001f\u0001\u0000\u0000\u0000\u0090\u0091\u0003\u000e\u0007\u0000"+
		"\u0091\u0092\u0005\u0002\u0000\u0000\u0092\u0093\u0003,\u0016\u0000\u0093"+
		"\u0094\u0005)\u0000\u0000\u0094!\u0001\u0000\u0000\u0000\u0095\u0097\u0005"+
		"&\u0000\u0000\u0096\u0098\u0003&\u0013\u0000\u0097\u0096\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000"+
		"\u0000\u0099\u009a\u0005\'\u0000\u0000\u009a#\u0001\u0000\u0000\u0000"+
		"\u009b\u009d\u0005&\u0000\u0000\u009c\u009e\u0003(\u0014\u0000\u009d\u009c"+
		"\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\'\u0000\u0000\u00a0%\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a4\u0003*\u0015\u0000\u00a2\u00a4\u0003.\u0017"+
		"\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\'\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a9\u0003*\u0015\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a9"+
		"\u00ac\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ab\u0001\u0000\u0000\u0000\u00ab)\u0001\u0000\u0000\u0000\u00ac\u00aa"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005\u0016\u0000\u0000\u00ae\u00af"+
		"\u0003,\u0016\u0000\u00af\u00b0\u0005\u0017\u0000\u0000\u00b0\u00b2\u0003"+
		"$\u0012\u0000\u00b1\u00b3\u00032\u0019\u0000\u00b2\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00d6\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b5\u0005\u001e\u0000\u0000\u00b5\u00b6\u0003,\u0016\u0000"+
		"\u00b6\u00b7\u0005\u0017\u0000\u0000\u00b7\u00b8\u0005\u001f\u0000\u0000"+
		"\u00b8\u00b9\u0003$\u0012\u0000\u00b9\u00d6\u0001\u0000\u0000\u0000\u00ba"+
		"\u00bb\u0005\u001f\u0000\u0000\u00bb\u00bc\u0003$\u0012\u0000\u00bc\u00bd"+
		"\u0005\u001e\u0000\u0000\u00bd\u00be\u0003,\u0016\u0000\u00be\u00bf\u0005"+
		")\u0000\u0000\u00bf\u00d6\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005 \u0000"+
		"\u0000\u00c1\u00c2\u0003\u000e\u0007\u0000\u00c2\u00c3\u0005!\u0000\u0000"+
		"\u00c3\u00c4\u0003\u0014\n\u0000\u00c4\u00c5\u0005\"\u0000\u0000\u00c5"+
		"\u00c6\u0003\u0014\n\u0000\u00c6\u00c7\u0005\u001f\u0000\u0000\u00c7\u00c8"+
		"\u0003$\u0012\u0000\u00c8\u00d6\u0001\u0000\u0000\u0000\u00c9\u00ca\u0003"+
		"8\u001c\u0000\u00ca\u00cb\u0005)\u0000\u0000\u00cb\u00d6\u0001\u0000\u0000"+
		"\u0000\u00cc\u00d6\u0003 \u0010\u0000\u00cd\u00d6\u0003\u001e\u000f\u0000"+
		"\u00ce\u00cf\u0005\u0019\u0000\u0000\u00cf\u00d0\u0003,\u0016\u0000\u00d0"+
		"\u00d1\u0003:\u001d\u0000\u00d1\u00d6\u0001\u0000\u0000\u0000\u00d2\u00d6"+
		"\u00034\u001a\u0000\u00d3\u00d4\u0005\u001c\u0000\u0000\u00d4\u00d6\u0005"+
		")\u0000\u0000\u00d5\u00ad\u0001\u0000\u0000\u0000\u00d5\u00b4\u0001\u0000"+
		"\u0000\u0000\u00d5\u00ba\u0001\u0000\u0000\u0000\u00d5\u00c0\u0001\u0000"+
		"\u0000\u0000\u00d5\u00c9\u0001\u0000\u0000\u0000\u00d5\u00cc\u0001\u0000"+
		"\u0000\u0000\u00d5\u00cd\u0001\u0000\u0000\u0000\u00d5\u00ce\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d2\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d6+\u0001\u0000\u0000\u0000\u00d7\u00d8\u0006\u0016\uffff"+
		"\uffff\u0000\u00d8\u00ed\u0003\f\u0006\u0000\u00d9\u00ed\u0003\u000e\u0007"+
		"\u0000\u00da\u00ed\u00038\u001c\u0000\u00db\u00dc\u0005$\u0000\u0000\u00dc"+
		"\u00dd\u0003,\u0016\u0000\u00dd\u00de\u0005%\u0000\u0000\u00de\u00ed\u0001"+
		"\u0000\u0000\u0000\u00df\u00e0\u0005\u0013\u0000\u0000\u00e0\u00ed\u0003"+
		",\u0016\u0004\u00e1\u00e2\u0005\f\u0000\u0000\u00e2\u00ed\u0003,\u0016"+
		"\u0003\u00e3\u00e4\u0005\u000b\u0000\u0000\u00e4\u00ed\u0003,\u0016\u0002"+
		"\u00e5\u00e6\u0005\u001d\u0000\u0000\u00e6\u00e7\u0003,\u0016\u0000\u00e7"+
		"\u00e8\u0005\u0017\u0000\u0000\u00e8\u00e9\u0003,\u0016\u0000\u00e9\u00ea"+
		"\u0005\u001b\u0000\u0000\u00ea\u00eb\u0003,\u0016\u0001\u00eb\u00ed\u0001"+
		"\u0000\u0000\u0000\u00ec\u00d7\u0001\u0000\u0000\u0000\u00ec\u00d9\u0001"+
		"\u0000\u0000\u0000\u00ec\u00da\u0001\u0000\u0000\u0000\u00ec\u00db\u0001"+
		"\u0000\u0000\u0000\u00ec\u00df\u0001\u0000\u0000\u0000\u00ec\u00e1\u0001"+
		"\u0000\u0000\u0000\u00ec\u00e3\u0001\u0000\u0000\u0000\u00ec\u00e5\u0001"+
		"\u0000\u0000\u0000\u00ed\u00fc\u0001\u0000\u0000\u0000\u00ee\u00ef\n\t"+
		"\u0000\u0000\u00ef\u00f0\u0007\u0004\u0000\u0000\u00f0\u00fb\u0003,\u0016"+
		"\n\u00f1\u00f2\n\b\u0000\u0000\u00f2\u00f3\u0007\u0005\u0000\u0000\u00f3"+
		"\u00fb\u0003,\u0016\t\u00f4\u00f5\n\u0007\u0000\u0000\u00f5\u00f6\u0007"+
		"\u0006\u0000\u0000\u00f6\u00fb\u0003,\u0016\b\u00f7\u00f8\n\u0006\u0000"+
		"\u0000\u00f8\u00f9\u0007\u0007\u0000\u0000\u00f9\u00fb\u0003,\u0016\u0007"+
		"\u00fa\u00ee\u0001\u0000\u0000\u0000\u00fa\u00f1\u0001\u0000\u0000\u0000"+
		"\u00fa\u00f4\u0001\u0000\u0000\u0000\u00fa\u00f7\u0001\u0000\u0000\u0000"+
		"\u00fb\u00fe\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000"+
		"\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd-\u0001\u0000\u0000\u0000\u00fe"+
		"\u00fc\u0001\u0000\u0000\u0000\u00ff\u0100\u0005\u0007\u0000\u0000\u0100"+
		"\u0101\u0003\u0002\u0001\u0000\u0101\u0102\u0003\u000e\u0007\u0000\u0102"+
		"\u010b\u0005$\u0000\u0000\u0103\u0108\u00030\u0018\u0000\u0104\u0105\u0005"+
		"(\u0000\u0000\u0105\u0107\u00030\u0018\u0000\u0106\u0104\u0001\u0000\u0000"+
		"\u0000\u0107\u010a\u0001\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000"+
		"\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u010c\u0001\u0000\u0000"+
		"\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010b\u0103\u0001\u0000\u0000"+
		"\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000"+
		"\u0000\u010d\u010e\u0005%\u0000\u0000\u010e\u010f\u00036\u001b\u0000\u010f"+
		"/\u0001\u0000\u0000\u0000\u0110\u0111\u0003\u0006\u0003\u0000\u0111\u0112"+
		"\u0003\u000e\u0007\u0000\u01121\u0001\u0000\u0000\u0000\u0113\u0114\u0005"+
		"\u0015\u0000\u0000\u0114\u0115\u0003$\u0012\u0000\u01153\u0001\u0000\u0000"+
		"\u0000\u0116\u0118\u0005\u0018\u0000\u0000\u0117\u0119\u0003,\u0016\u0000"+
		"\u0118\u0117\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000"+
		"\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u011b\u0005)\u0000\u0000\u011b"+
		"5\u0001\u0000\u0000\u0000\u011c\u011e\u0005&\u0000\u0000\u011d\u011f\u0003"+
		"(\u0014\u0000\u011e\u011d\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000"+
		"\u0000\u0000\u011f\u0121\u0001\u0000\u0000\u0000\u0120\u0122\u00034\u001a"+
		"\u0000\u0121\u0120\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000\u0000"+
		"\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u0124\u0005\'\u0000\u0000"+
		"\u01247\u0001\u0000\u0000\u0000\u0125\u0126\u0003\u000e\u0007\u0000\u0126"+
		"\u012f\u0005$\u0000\u0000\u0127\u012c\u0003,\u0016\u0000\u0128\u0129\u0005"+
		"(\u0000\u0000\u0129\u012b\u0003,\u0016\u0000\u012a\u0128\u0001\u0000\u0000"+
		"\u0000\u012b\u012e\u0001\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000"+
		"\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u0130\u0001\u0000\u0000"+
		"\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012f\u0127\u0001\u0000\u0000"+
		"\u0000\u012f\u0130\u0001\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000"+
		"\u0000\u0131\u0132\u0005%\u0000\u0000\u01329\u0001\u0000\u0000\u0000\u0133"+
		"\u0137\u0005&\u0000\u0000\u0134\u0136\u0003<\u001e\u0000\u0135\u0134\u0001"+
		"\u0000\u0000\u0000\u0136\u0139\u0001\u0000\u0000\u0000\u0137\u0135\u0001"+
		"\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138\u013b\u0001"+
		"\u0000\u0000\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u013a\u013c\u0003"+
		">\u001f\u0000\u013b\u013a\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000"+
		"\u0000\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d\u013e\u0005\'\u0000"+
		"\u0000\u013e;\u0001\u0000\u0000\u0000\u013f\u0140\u0005\u001a\u0000\u0000"+
		"\u0140\u0141\u0003\f\u0006\u0000\u0141\u0142\u0005\u0017\u0000\u0000\u0142"+
		"\u0143\u0003(\u0014\u0000\u0143=\u0001\u0000\u0000\u0000\u0144\u0145\u0005"+
		"\u001b\u0000\u0000\u0145\u0146\u0005\u0017\u0000\u0000\u0146\u0147\u0003"+
		"(\u0014\u0000\u0147?\u0001\u0000\u0000\u0000\u001eLR^cfiov\u0080\u0085"+
		"\u008e\u0097\u009d\u00a3\u00a5\u00aa\u00b2\u00d5\u00ec\u00fa\u00fc\u0108"+
		"\u010b\u0118\u011e\u0121\u012c\u012f\u0137\u013b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}