// Generated from C:/Users/parthi-pt4593/eclipse-workspace/myEclipse/StudentManagementApp/src/main/java/com/boolean_evaluator\BooleanEvaluator.g4 by ANTLR 4.10.1
package com.boolean_evaluator;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BooleanEvaluatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, INTEGER=9, 
		DOUBLE=10, NULL=11, CONTAINS=12, MATCHES=13, ENDS_WITH=14, STARTS_WITH=15, 
		AND=16, OR=17, BOOLEAN=18, TRUE=19, FALSE=20, STRING=21, ENDS=22, WITH=23, 
		STARTS=24, SINGLEQUOTE=25, DOUBLEQOUTE=26, ALPHANUMERIC=27, ESCAPE=28;
	public static final int
		RULE_booleanQuery = 0, RULE_orQuery = 1, RULE_andQuery = 2, RULE_query = 3, 
		RULE_key = 4, RULE_comparisonOperator = 5, RULE_value = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"booleanQuery", "orQuery", "andQuery", "query", "key", "comparisonOperator", 
			"value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'='", "'!='", "'>'", "'>='", "'<'", "'<='", null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'''", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "INTEGER", "DOUBLE", 
			"NULL", "CONTAINS", "MATCHES", "ENDS_WITH", "STARTS_WITH", "AND", "OR", 
			"BOOLEAN", "TRUE", "FALSE", "STRING", "ENDS", "WITH", "STARTS", "SINGLEQUOTE", 
			"DOUBLEQOUTE", "ALPHANUMERIC", "ESCAPE"
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
	public String getGrammarFileName() { return "BooleanEvaluator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BooleanEvaluatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class BooleanQueryContext extends ParserRuleContext {
		public OrQueryContext orQuery() {
			return getRuleContext(OrQueryContext.class,0);
		}
		public TerminalNode EOF() { return getToken(BooleanEvaluatorParser.EOF, 0); }
		public BooleanQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanEvaluatorListener ) ((BooleanEvaluatorListener)listener).enterBooleanQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanEvaluatorListener ) ((BooleanEvaluatorListener)listener).exitBooleanQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BooleanEvaluatorVisitor ) return ((BooleanEvaluatorVisitor<? extends T>)visitor).visitBooleanQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanQueryContext booleanQuery() throws RecognitionException {
		BooleanQueryContext _localctx = new BooleanQueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_booleanQuery);
		try {
			setState(16);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case ALPHANUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				orQuery();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(15);
				match(EOF);
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

	public static class OrQueryContext extends ParserRuleContext {
		public List<AndQueryContext> andQuery() {
			return getRuleContexts(AndQueryContext.class);
		}
		public AndQueryContext andQuery(int i) {
			return getRuleContext(AndQueryContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(BooleanEvaluatorParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(BooleanEvaluatorParser.OR, i);
		}
		public OrQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanEvaluatorListener ) ((BooleanEvaluatorListener)listener).enterOrQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanEvaluatorListener ) ((BooleanEvaluatorListener)listener).exitOrQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BooleanEvaluatorVisitor ) return ((BooleanEvaluatorVisitor<? extends T>)visitor).visitOrQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrQueryContext orQuery() throws RecognitionException {
		OrQueryContext _localctx = new OrQueryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_orQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			andQuery();
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(19);
				match(OR);
				setState(20);
				andQuery();
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class AndQueryContext extends ParserRuleContext {
		public List<QueryContext> query() {
			return getRuleContexts(QueryContext.class);
		}
		public QueryContext query(int i) {
			return getRuleContext(QueryContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(BooleanEvaluatorParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(BooleanEvaluatorParser.AND, i);
		}
		public AndQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanEvaluatorListener ) ((BooleanEvaluatorListener)listener).enterAndQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanEvaluatorListener ) ((BooleanEvaluatorListener)listener).exitAndQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BooleanEvaluatorVisitor ) return ((BooleanEvaluatorVisitor<? extends T>)visitor).visitAndQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndQueryContext andQuery() throws RecognitionException {
		AndQueryContext _localctx = new AndQueryContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_andQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			query();
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(27);
				match(AND);
				setState(28);
				query();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class QueryContext extends ParserRuleContext {
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public OrQueryContext orQuery() {
			return getRuleContext(OrQueryContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanEvaluatorListener ) ((BooleanEvaluatorListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanEvaluatorListener ) ((BooleanEvaluatorListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BooleanEvaluatorVisitor ) return ((BooleanEvaluatorVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_query);
		try {
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALPHANUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				key();
				setState(35);
				comparisonOperator();
				setState(36);
				value();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				match(T__0);
				setState(39);
				orQuery();
				setState(40);
				match(T__1);
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

	public static class KeyContext extends ParserRuleContext {
		public TerminalNode ALPHANUMERIC() { return getToken(BooleanEvaluatorParser.ALPHANUMERIC, 0); }
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanEvaluatorListener ) ((BooleanEvaluatorListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanEvaluatorListener ) ((BooleanEvaluatorListener)listener).exitKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BooleanEvaluatorVisitor ) return ((BooleanEvaluatorVisitor<? extends T>)visitor).visitKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(ALPHANUMERIC);
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

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode CONTAINS() { return getToken(BooleanEvaluatorParser.CONTAINS, 0); }
		public TerminalNode MATCHES() { return getToken(BooleanEvaluatorParser.MATCHES, 0); }
		public TerminalNode ENDS_WITH() { return getToken(BooleanEvaluatorParser.ENDS_WITH, 0); }
		public TerminalNode STARTS_WITH() { return getToken(BooleanEvaluatorParser.STARTS_WITH, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanEvaluatorListener ) ((BooleanEvaluatorListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanEvaluatorListener ) ((BooleanEvaluatorListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BooleanEvaluatorVisitor ) return ((BooleanEvaluatorVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << CONTAINS) | (1L << MATCHES) | (1L << ENDS_WITH) | (1L << STARTS_WITH))) != 0)) ) {
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(BooleanEvaluatorParser.BOOLEAN, 0); }
		public TerminalNode INTEGER() { return getToken(BooleanEvaluatorParser.INTEGER, 0); }
		public TerminalNode DOUBLE() { return getToken(BooleanEvaluatorParser.DOUBLE, 0); }
		public TerminalNode NULL() { return getToken(BooleanEvaluatorParser.NULL, 0); }
		public TerminalNode STRING() { return getToken(BooleanEvaluatorParser.STRING, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanEvaluatorListener ) ((BooleanEvaluatorListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanEvaluatorListener ) ((BooleanEvaluatorListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BooleanEvaluatorVisitor ) return ((BooleanEvaluatorVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << DOUBLE) | (1L << NULL) | (1L << BOOLEAN) | (1L << STRING))) != 0)) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001\u001c3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0001\u0000\u0003"+
		"\u0000\u0011\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u0016"+
		"\b\u0001\n\u0001\f\u0001\u0019\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002\u001e\b\u0002\n\u0002\f\u0002!\t\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003+\b\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0000\u0000\u0007\u0000\u0002"+
		"\u0004\u0006\b\n\f\u0000\u0002\u0002\u0000\u0003\b\f\u000f\u0003\u0000"+
		"\t\u000b\u0012\u0012\u0015\u0015/\u0000\u0010\u0001\u0000\u0000\u0000"+
		"\u0002\u0012\u0001\u0000\u0000\u0000\u0004\u001a\u0001\u0000\u0000\u0000"+
		"\u0006*\u0001\u0000\u0000\u0000\b,\u0001\u0000\u0000\u0000\n.\u0001\u0000"+
		"\u0000\u0000\f0\u0001\u0000\u0000\u0000\u000e\u0011\u0003\u0002\u0001"+
		"\u0000\u000f\u0011\u0005\u0000\u0000\u0001\u0010\u000e\u0001\u0000\u0000"+
		"\u0000\u0010\u000f\u0001\u0000\u0000\u0000\u0011\u0001\u0001\u0000\u0000"+
		"\u0000\u0012\u0017\u0003\u0004\u0002\u0000\u0013\u0014\u0005\u0011\u0000"+
		"\u0000\u0014\u0016\u0003\u0004\u0002\u0000\u0015\u0013\u0001\u0000\u0000"+
		"\u0000\u0016\u0019\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000"+
		"\u0000\u0017\u0018\u0001\u0000\u0000\u0000\u0018\u0003\u0001\u0000\u0000"+
		"\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u001a\u001f\u0003\u0006\u0003"+
		"\u0000\u001b\u001c\u0005\u0010\u0000\u0000\u001c\u001e\u0003\u0006\u0003"+
		"\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001e!\u0001\u0000\u0000\u0000"+
		"\u001f\u001d\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 \u0005"+
		"\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000\"#\u0003\b\u0004"+
		"\u0000#$\u0003\n\u0005\u0000$%\u0003\f\u0006\u0000%+\u0001\u0000\u0000"+
		"\u0000&\'\u0005\u0001\u0000\u0000\'(\u0003\u0002\u0001\u0000()\u0005\u0002"+
		"\u0000\u0000)+\u0001\u0000\u0000\u0000*\"\u0001\u0000\u0000\u0000*&\u0001"+
		"\u0000\u0000\u0000+\u0007\u0001\u0000\u0000\u0000,-\u0005\u001b\u0000"+
		"\u0000-\t\u0001\u0000\u0000\u0000./\u0007\u0000\u0000\u0000/\u000b\u0001"+
		"\u0000\u0000\u000001\u0007\u0001\u0000\u00001\r\u0001\u0000\u0000\u0000"+
		"\u0004\u0010\u0017\u001f*";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}