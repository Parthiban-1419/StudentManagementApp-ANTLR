// Generated from C:/Users/parthi-pt4593/eclipse-workspace/myEclipse/StudentManagementApp/src/main/java/com/antlr\AntlrQuery.g4 by ANTLR 4.10.1
package com.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AntlrQueryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPERATOR=1, SEPERATOR=2, EQUAL=3, NOT=4, NOTEQUAL=5, OR=6, AND=7, TO=8, 
		OPENBRACKET=9, CLOSEBRAKET=10, FROM=11, INBETWEEN=12, BETWEEN=13, RANGESTART=14, 
		RANGEEND=15, NUMBER=16, QOUTE=17, VALUE=18, STRING=19, THAN=20, GREATER=21, 
		GREATERTHAN=22, GREATERTHANOREQUAL=23, LESS=24, LESSTHAN=25, LESSTHANOREQUAL=26, 
		ESCAPE=27;
	public static final int
		RULE_antlrQuery = 0, RULE_orQuery = 1, RULE_andQuery = 2, RULE_query = 3, 
		RULE_expression = 4, RULE_orValue = 5, RULE_andValue = 6, RULE_value = 7, 
		RULE_rangeValue = 8, RULE_number = 9, RULE_separator = 10, RULE_field = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"antlrQuery", "orQuery", "andQuery", "query", "expression", "orValue", 
			"andValue", "value", "rangeValue", "number", "separator", "field"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'~'", null, null, null, null, null, null, null, "'('", "')'", 
			null, null, null, "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OPERATOR", "SEPERATOR", "EQUAL", "NOT", "NOTEQUAL", "OR", "AND", 
			"TO", "OPENBRACKET", "CLOSEBRAKET", "FROM", "INBETWEEN", "BETWEEN", "RANGESTART", 
			"RANGEEND", "NUMBER", "QOUTE", "VALUE", "STRING", "THAN", "GREATER", 
			"GREATERTHAN", "GREATERTHANOREQUAL", "LESS", "LESSTHAN", "LESSTHANOREQUAL", 
			"ESCAPE"
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
	public String getGrammarFileName() { return "AntlrQuery.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AntlrQueryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class AntlrQueryContext extends ParserRuleContext {
		public OrQueryContext orQuery() {
			return getRuleContext(OrQueryContext.class,0);
		}
		public TerminalNode EOF() { return getToken(AntlrQueryParser.EOF, 0); }
		public AntlrQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_antlrQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrQueryListener ) ((AntlrQueryListener)listener).enterAntlrQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrQueryListener ) ((AntlrQueryListener)listener).exitAntlrQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrQueryVisitor ) return ((AntlrQueryVisitor<? extends T>)visitor).visitAntlrQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AntlrQueryContext antlrQuery() throws RecognitionException {
		AntlrQueryContext _localctx = new AntlrQueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_antlrQuery);
		try {
			setState(26);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPENBRACKET:
			case FROM:
			case INBETWEEN:
			case BETWEEN:
			case RANGESTART:
			case NUMBER:
			case VALUE:
			case STRING:
			case GREATERTHAN:
			case GREATERTHANOREQUAL:
			case LESSTHAN:
			case LESSTHANOREQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				orQuery();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
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
		public List<TerminalNode> OR() { return getTokens(AntlrQueryParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(AntlrQueryParser.OR, i);
		}
		public OrQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrQueryListener ) ((AntlrQueryListener)listener).enterOrQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrQueryListener ) ((AntlrQueryListener)listener).exitOrQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrQueryVisitor ) return ((AntlrQueryVisitor<? extends T>)visitor).visitOrQuery(this);
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
			setState(28);
			andQuery();
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(29);
				match(OR);
				setState(30);
				andQuery();
				}
				}
				setState(35);
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
		public List<TerminalNode> AND() { return getTokens(AntlrQueryParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(AntlrQueryParser.AND, i);
		}
		public AndQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrQueryListener ) ((AntlrQueryListener)listener).enterAndQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrQueryListener ) ((AntlrQueryListener)listener).exitAndQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrQueryVisitor ) return ((AntlrQueryVisitor<? extends T>)visitor).visitAndQuery(this);
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
			setState(36);
			query();
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(37);
				match(AND);
				setState(38);
				query();
				}
				}
				setState(43);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OPENBRACKET() { return getToken(AntlrQueryParser.OPENBRACKET, 0); }
		public OrQueryContext orQuery() {
			return getRuleContext(OrQueryContext.class,0);
		}
		public TerminalNode CLOSEBRAKET() { return getToken(AntlrQueryParser.CLOSEBRAKET, 0); }
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrQueryListener ) ((AntlrQueryListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrQueryListener ) ((AntlrQueryListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrQueryVisitor ) return ((AntlrQueryVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_query);
		try {
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				match(OPENBRACKET);
				setState(46);
				orQuery();
				setState(47);
				match(CLOSEBRAKET);
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

	public static class ExpressionContext extends ParserRuleContext {
		public OrValueContext orValue() {
			return getRuleContext(OrValueContext.class,0);
		}
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public SeparatorContext separator() {
			return getRuleContext(SeparatorContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrQueryListener ) ((AntlrQueryListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrQueryListener ) ((AntlrQueryListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrQueryVisitor ) return ((AntlrQueryVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expression);
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				orValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				field();
				setState(53);
				separator();
				setState(54);
				orValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				field();
				{
				setState(57);
				orValue();
				}
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

	public static class OrValueContext extends ParserRuleContext {
		public TerminalNode OPENBRACKET() { return getToken(AntlrQueryParser.OPENBRACKET, 0); }
		public OrValueContext orValue() {
			return getRuleContext(OrValueContext.class,0);
		}
		public TerminalNode CLOSEBRAKET() { return getToken(AntlrQueryParser.CLOSEBRAKET, 0); }
		public List<AndValueContext> andValue() {
			return getRuleContexts(AndValueContext.class);
		}
		public AndValueContext andValue(int i) {
			return getRuleContext(AndValueContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(AntlrQueryParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(AntlrQueryParser.OR, i);
		}
		public OrValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrQueryListener ) ((AntlrQueryListener)listener).enterOrValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrQueryListener ) ((AntlrQueryListener)listener).exitOrValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrQueryVisitor ) return ((AntlrQueryVisitor<? extends T>)visitor).visitOrValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrValueContext orValue() throws RecognitionException {
		OrValueContext _localctx = new OrValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_orValue);
		try {
			int _alt;
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPENBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				match(OPENBRACKET);
				setState(62);
				orValue();
				setState(63);
				match(CLOSEBRAKET);
				}
				break;
			case FROM:
			case INBETWEEN:
			case BETWEEN:
			case RANGESTART:
			case NUMBER:
			case VALUE:
			case GREATERTHAN:
			case GREATERTHANOREQUAL:
			case LESSTHAN:
			case LESSTHANOREQUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				andValue();
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(66);
						match(OR);
						setState(67);
						andValue();
						}
						} 
					}
					setState(72);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
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

	public static class AndValueContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(AntlrQueryParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(AntlrQueryParser.AND, i);
		}
		public AndValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrQueryListener ) ((AntlrQueryListener)listener).enterAndValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrQueryListener ) ((AntlrQueryListener)listener).exitAndValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrQueryVisitor ) return ((AntlrQueryVisitor<? extends T>)visitor).visitAndValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndValueContext andValue() throws RecognitionException {
		AndValueContext _localctx = new AndValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_andValue);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			value();
			setState(80);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(76);
					match(AND);
					setState(77);
					value();
					}
					} 
				}
				setState(82);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		public RangeValueContext rangeValue() {
			return getRuleContext(RangeValueContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode VALUE() { return getToken(AntlrQueryParser.VALUE, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrQueryListener ) ((AntlrQueryListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrQueryListener ) ((AntlrQueryListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrQueryVisitor ) return ((AntlrQueryVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_value);
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FROM:
			case INBETWEEN:
			case BETWEEN:
			case RANGESTART:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				rangeValue();
				}
				break;
			case NUMBER:
			case GREATERTHAN:
			case GREATERTHANOREQUAL:
			case LESSTHAN:
			case LESSTHANOREQUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				number();
				}
				break;
			case VALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				match(VALUE);
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

	public static class RangeValueContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(AntlrQueryParser.FROM, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(AntlrQueryParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(AntlrQueryParser.NUMBER, i);
		}
		public TerminalNode TO() { return getToken(AntlrQueryParser.TO, 0); }
		public TerminalNode AND() { return getToken(AntlrQueryParser.AND, 0); }
		public TerminalNode RANGESTART() { return getToken(AntlrQueryParser.RANGESTART, 0); }
		public TerminalNode RANGEEND() { return getToken(AntlrQueryParser.RANGEEND, 0); }
		public TerminalNode INBETWEEN() { return getToken(AntlrQueryParser.INBETWEEN, 0); }
		public TerminalNode BETWEEN() { return getToken(AntlrQueryParser.BETWEEN, 0); }
		public RangeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrQueryListener ) ((AntlrQueryListener)listener).enterRangeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrQueryListener ) ((AntlrQueryListener)listener).exitRangeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrQueryVisitor ) return ((AntlrQueryVisitor<? extends T>)visitor).visitRangeValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeValueContext rangeValue() throws RecognitionException {
		RangeValueContext _localctx = new RangeValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_rangeValue);
		int _la;
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FROM:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				match(FROM);
				setState(89);
				match(NUMBER);
				setState(90);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==TO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(91);
				match(NUMBER);
				}
				break;
			case RANGESTART:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				match(RANGESTART);
				setState(93);
				match(NUMBER);
				setState(94);
				match(TO);
				setState(95);
				match(NUMBER);
				setState(96);
				match(RANGEEND);
				}
				break;
			case INBETWEEN:
			case BETWEEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				_la = _input.LA(1);
				if ( !(_la==INBETWEEN || _la==BETWEEN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(98);
				match(NUMBER);
				setState(99);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==TO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(100);
				match(NUMBER);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(AntlrQueryParser.NUMBER, 0); }
		public TerminalNode GREATERTHAN() { return getToken(AntlrQueryParser.GREATERTHAN, 0); }
		public TerminalNode GREATERTHANOREQUAL() { return getToken(AntlrQueryParser.GREATERTHANOREQUAL, 0); }
		public TerminalNode LESSTHAN() { return getToken(AntlrQueryParser.LESSTHAN, 0); }
		public TerminalNode LESSTHANOREQUAL() { return getToken(AntlrQueryParser.LESSTHANOREQUAL, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrQueryListener ) ((AntlrQueryListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrQueryListener ) ((AntlrQueryListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrQueryVisitor ) return ((AntlrQueryVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_number);
		int _la;
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				match(NUMBER);
				}
				break;
			case GREATERTHAN:
			case GREATERTHANOREQUAL:
			case LESSTHAN:
			case LESSTHANOREQUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATERTHAN) | (1L << GREATERTHANOREQUAL) | (1L << LESSTHAN) | (1L << LESSTHANOREQUAL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(105);
				match(NUMBER);
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

	public static class SeparatorContext extends ParserRuleContext {
		public TerminalNode NOTEQUAL() { return getToken(AntlrQueryParser.NOTEQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(AntlrQueryParser.EQUAL, 0); }
		public TerminalNode NOT() { return getToken(AntlrQueryParser.NOT, 0); }
		public TerminalNode SEPERATOR() { return getToken(AntlrQueryParser.SEPERATOR, 0); }
		public SeparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_separator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrQueryListener ) ((AntlrQueryListener)listener).enterSeparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrQueryListener ) ((AntlrQueryListener)listener).exitSeparator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrQueryVisitor ) return ((AntlrQueryVisitor<? extends T>)visitor).visitSeparator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeparatorContext separator() throws RecognitionException {
		SeparatorContext _localctx = new SeparatorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_separator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEPERATOR) | (1L << EQUAL) | (1L << NOT) | (1L << NOTEQUAL))) != 0)) ) {
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

	public static class FieldContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AntlrQueryParser.STRING, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrQueryListener ) ((AntlrQueryListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrQueryListener ) ((AntlrQueryListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrQueryVisitor ) return ((AntlrQueryVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(STRING);
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
		"\u0004\u0001\u001bq\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0001\u0000\u0003\u0000\u001b\b\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u0001 \b\u0001\n\u0001\f\u0001#\t\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002(\b\u0002\n\u0002\f\u0002+\t\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u00032\b"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004<\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005E\b\u0005\n\u0005\f\u0005H\t\u0005\u0003\u0005J\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006O\b\u0006\n\u0006\f\u0006R\t\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007W\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\bf\b\b\u0001\t\u0001\t\u0001\t\u0003\tk\b\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0000\u0000\f\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u0004\u0001\u0000"+
		"\u0007\b\u0001\u0000\f\r\u0002\u0000\u0016\u0017\u0019\u001a\u0001\u0000"+
		"\u0002\u0005r\u0000\u001a\u0001\u0000\u0000\u0000\u0002\u001c\u0001\u0000"+
		"\u0000\u0000\u0004$\u0001\u0000\u0000\u0000\u00061\u0001\u0000\u0000\u0000"+
		"\b;\u0001\u0000\u0000\u0000\nI\u0001\u0000\u0000\u0000\fK\u0001\u0000"+
		"\u0000\u0000\u000eV\u0001\u0000\u0000\u0000\u0010e\u0001\u0000\u0000\u0000"+
		"\u0012j\u0001\u0000\u0000\u0000\u0014l\u0001\u0000\u0000\u0000\u0016n"+
		"\u0001\u0000\u0000\u0000\u0018\u001b\u0003\u0002\u0001\u0000\u0019\u001b"+
		"\u0005\u0000\u0000\u0001\u001a\u0018\u0001\u0000\u0000\u0000\u001a\u0019"+
		"\u0001\u0000\u0000\u0000\u001b\u0001\u0001\u0000\u0000\u0000\u001c!\u0003"+
		"\u0004\u0002\u0000\u001d\u001e\u0005\u0006\u0000\u0000\u001e \u0003\u0004"+
		"\u0002\u0000\u001f\u001d\u0001\u0000\u0000\u0000 #\u0001\u0000\u0000\u0000"+
		"!\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"\u0003\u0001"+
		"\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000$)\u0003\u0006\u0003\u0000"+
		"%&\u0005\u0007\u0000\u0000&(\u0003\u0006\u0003\u0000\'%\u0001\u0000\u0000"+
		"\u0000(+\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000)*\u0001\u0000"+
		"\u0000\u0000*\u0005\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000"+
		",2\u0003\b\u0004\u0000-.\u0005\t\u0000\u0000./\u0003\u0002\u0001\u0000"+
		"/0\u0005\n\u0000\u000002\u0001\u0000\u0000\u00001,\u0001\u0000\u0000\u0000"+
		"1-\u0001\u0000\u0000\u00002\u0007\u0001\u0000\u0000\u00003<\u0003\n\u0005"+
		"\u000045\u0003\u0016\u000b\u000056\u0003\u0014\n\u000067\u0003\n\u0005"+
		"\u00007<\u0001\u0000\u0000\u000089\u0003\u0016\u000b\u00009:\u0003\n\u0005"+
		"\u0000:<\u0001\u0000\u0000\u0000;3\u0001\u0000\u0000\u0000;4\u0001\u0000"+
		"\u0000\u0000;8\u0001\u0000\u0000\u0000<\t\u0001\u0000\u0000\u0000=>\u0005"+
		"\t\u0000\u0000>?\u0003\n\u0005\u0000?@\u0005\n\u0000\u0000@J\u0001\u0000"+
		"\u0000\u0000AF\u0003\f\u0006\u0000BC\u0005\u0006\u0000\u0000CE\u0003\f"+
		"\u0006\u0000DB\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000\u0000FD\u0001"+
		"\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GJ\u0001\u0000\u0000\u0000"+
		"HF\u0001\u0000\u0000\u0000I=\u0001\u0000\u0000\u0000IA\u0001\u0000\u0000"+
		"\u0000J\u000b\u0001\u0000\u0000\u0000KP\u0003\u000e\u0007\u0000LM\u0005"+
		"\u0007\u0000\u0000MO\u0003\u000e\u0007\u0000NL\u0001\u0000\u0000\u0000"+
		"OR\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000"+
		"\u0000Q\r\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000SW\u0003\u0010"+
		"\b\u0000TW\u0003\u0012\t\u0000UW\u0005\u0012\u0000\u0000VS\u0001\u0000"+
		"\u0000\u0000VT\u0001\u0000\u0000\u0000VU\u0001\u0000\u0000\u0000W\u000f"+
		"\u0001\u0000\u0000\u0000XY\u0005\u000b\u0000\u0000YZ\u0005\u0010\u0000"+
		"\u0000Z[\u0007\u0000\u0000\u0000[f\u0005\u0010\u0000\u0000\\]\u0005\u000e"+
		"\u0000\u0000]^\u0005\u0010\u0000\u0000^_\u0005\b\u0000\u0000_`\u0005\u0010"+
		"\u0000\u0000`f\u0005\u000f\u0000\u0000ab\u0007\u0001\u0000\u0000bc\u0005"+
		"\u0010\u0000\u0000cd\u0007\u0000\u0000\u0000df\u0005\u0010\u0000\u0000"+
		"eX\u0001\u0000\u0000\u0000e\\\u0001\u0000\u0000\u0000ea\u0001\u0000\u0000"+
		"\u0000f\u0011\u0001\u0000\u0000\u0000gk\u0005\u0010\u0000\u0000hi\u0007"+
		"\u0002\u0000\u0000ik\u0005\u0010\u0000\u0000jg\u0001\u0000\u0000\u0000"+
		"jh\u0001\u0000\u0000\u0000k\u0013\u0001\u0000\u0000\u0000lm\u0007\u0003"+
		"\u0000\u0000m\u0015\u0001\u0000\u0000\u0000no\u0005\u0013\u0000\u0000"+
		"o\u0017\u0001\u0000\u0000\u0000\u000b\u001a!)1;FIPVej";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}