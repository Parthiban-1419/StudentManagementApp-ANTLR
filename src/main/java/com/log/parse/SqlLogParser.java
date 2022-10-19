// Generated from C:/Users/parthi-pt4593/eclipse-workspace/myEclipse/StudentManagementApp/src/main/java/com/log/parse\SqlLog.g4 by ANTLR 4.10.1
package com.log.parse;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SqlLogParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, ESCAPE=8, DATE=9, 
		YEAR=10, MONTH=11, DATEVALUE=12, NUMBER=13, ERRORCODERANGE=14, STRING=15, 
		TIME=16, HOURS=17, MINUTES=18, SECONDS=19, MILLISECONDS=20, ZEROTOSIXTY=21;
	public static final int
		RULE_sqlLog = 0, RULE_dateTime = 1, RULE_threadId = 2, RULE_label = 3, 
		RULE_errorCode = 4, RULE_subSystem = 5, RULE_message = 6, RULE_userName = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"sqlLog", "dateTime", "threadId", "label", "errorCode", "subSystem", 
			"message", "userName"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'T'", "'Warning'", "'Error'", "'Note'", "'MY-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "ESCAPE", "DATE", "YEAR", 
			"MONTH", "DATEVALUE", "NUMBER", "ERRORCODERANGE", "STRING", "TIME", "HOURS", 
			"MINUTES", "SECONDS", "MILLISECONDS", "ZEROTOSIXTY"
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
	public String getGrammarFileName() { return "SqlLog.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SqlLogParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SqlLogContext extends ParserRuleContext {
		public DateTimeContext dateTime() {
			return getRuleContext(DateTimeContext.class,0);
		}
		public ThreadIdContext threadId() {
			return getRuleContext(ThreadIdContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public ErrorCodeContext errorCode() {
			return getRuleContext(ErrorCodeContext.class,0);
		}
		public SubSystemContext subSystem() {
			return getRuleContext(SubSystemContext.class,0);
		}
		public MessageContext message() {
			return getRuleContext(MessageContext.class,0);
		}
		public UserNameContext userName() {
			return getRuleContext(UserNameContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlLogParser.EOF, 0); }
		public SqlLogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlLog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlLogListener ) ((SqlLogListener)listener).enterSqlLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlLogListener ) ((SqlLogListener)listener).exitSqlLog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlLogVisitor ) return ((SqlLogVisitor<? extends T>)visitor).visitSqlLog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlLogContext sqlLog() throws RecognitionException {
		SqlLogContext _localctx = new SqlLogContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sqlLog);
		try {
			setState(33);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				dateTime();
				setState(17);
				threadId();
				setState(18);
				match(T__0);
				setState(19);
				label();
				setState(20);
				match(T__1);
				setState(21);
				match(T__0);
				setState(22);
				errorCode();
				setState(23);
				match(T__1);
				setState(24);
				match(T__0);
				setState(25);
				subSystem();
				setState(26);
				match(T__1);
				setState(27);
				message();
				setState(28);
				match(T__0);
				setState(29);
				userName();
				setState(30);
				match(T__1);
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
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

	public static class DateTimeContext extends ParserRuleContext {
		public TerminalNode DATE() { return getToken(SqlLogParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(SqlLogParser.TIME, 0); }
		public DateTimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateTime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlLogListener ) ((SqlLogListener)listener).enterDateTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlLogListener ) ((SqlLogListener)listener).exitDateTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlLogVisitor ) return ((SqlLogVisitor<? extends T>)visitor).visitDateTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateTimeContext dateTime() throws RecognitionException {
		DateTimeContext _localctx = new DateTimeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dateTime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(DATE);
			setState(36);
			match(T__2);
			setState(37);
			match(TIME);
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

	public static class ThreadIdContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(SqlLogParser.NUMBER, 0); }
		public ThreadIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_threadId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlLogListener ) ((SqlLogListener)listener).enterThreadId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlLogListener ) ((SqlLogListener)listener).exitThreadId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlLogVisitor ) return ((SqlLogVisitor<? extends T>)visitor).visitThreadId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThreadIdContext threadId() throws RecognitionException {
		ThreadIdContext _localctx = new ThreadIdContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_threadId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(NUMBER);
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

	public static class LabelContext extends ParserRuleContext {
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlLogListener ) ((SqlLogListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlLogListener ) ((SqlLogListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlLogVisitor ) return ((SqlLogVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_label);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) ) {
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

	public static class ErrorCodeContext extends ParserRuleContext {
		public TerminalNode ERRORCODERANGE() { return getToken(SqlLogParser.ERRORCODERANGE, 0); }
		public ErrorCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlLogListener ) ((SqlLogListener)listener).enterErrorCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlLogListener ) ((SqlLogListener)listener).exitErrorCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlLogVisitor ) return ((SqlLogVisitor<? extends T>)visitor).visitErrorCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCodeContext errorCode() throws RecognitionException {
		ErrorCodeContext _localctx = new ErrorCodeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_errorCode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(T__6);
			setState(44);
			match(ERRORCODERANGE);
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

	public static class SubSystemContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SqlLogParser.STRING, 0); }
		public SubSystemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subSystem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlLogListener ) ((SqlLogListener)listener).enterSubSystem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlLogListener ) ((SqlLogListener)listener).exitSubSystem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlLogVisitor ) return ((SqlLogVisitor<? extends T>)visitor).visitSubSystem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubSystemContext subSystem() throws RecognitionException {
		SubSystemContext _localctx = new SubSystemContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_subSystem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
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

	public static class MessageContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(SqlLogParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlLogParser.STRING, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(SqlLogParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SqlLogParser.NUMBER, i);
		}
		public MessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlLogListener ) ((SqlLogListener)listener).enterMessage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlLogListener ) ((SqlLogListener)listener).exitMessage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlLogVisitor ) return ((SqlLogVisitor<? extends T>)visitor).visitMessage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageContext message() throws RecognitionException {
		MessageContext _localctx = new MessageContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_message);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMBER || _la==STRING) {
				{
				{
				setState(48);
				_la = _input.LA(1);
				if ( !(_la==NUMBER || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(53);
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

	public static class UserNameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SqlLogParser.STRING, 0); }
		public UserNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlLogListener ) ((SqlLogListener)listener).enterUserName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlLogListener ) ((SqlLogListener)listener).exitUserName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlLogVisitor ) return ((SqlLogVisitor<? extends T>)visitor).visitUserName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UserNameContext userName() throws RecognitionException {
		UserNameContext _localctx = new UserNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_userName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
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
		"\u0004\u0001\u00159\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\"\b"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0005\u00062\b\u0006\n\u0006\f\u00065\t"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0000\u0000\b\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0000\u0002\u0001\u0000\u0004\u0006\u0002\u0000\r\r"+
		"\u000f\u000f2\u0000!\u0001\u0000\u0000\u0000\u0002#\u0001\u0000\u0000"+
		"\u0000\u0004\'\u0001\u0000\u0000\u0000\u0006)\u0001\u0000\u0000\u0000"+
		"\b+\u0001\u0000\u0000\u0000\n.\u0001\u0000\u0000\u0000\f3\u0001\u0000"+
		"\u0000\u0000\u000e6\u0001\u0000\u0000\u0000\u0010\u0011\u0003\u0002\u0001"+
		"\u0000\u0011\u0012\u0003\u0004\u0002\u0000\u0012\u0013\u0005\u0001\u0000"+
		"\u0000\u0013\u0014\u0003\u0006\u0003\u0000\u0014\u0015\u0005\u0002\u0000"+
		"\u0000\u0015\u0016\u0005\u0001\u0000\u0000\u0016\u0017\u0003\b\u0004\u0000"+
		"\u0017\u0018\u0005\u0002\u0000\u0000\u0018\u0019\u0005\u0001\u0000\u0000"+
		"\u0019\u001a\u0003\n\u0005\u0000\u001a\u001b\u0005\u0002\u0000\u0000\u001b"+
		"\u001c\u0003\f\u0006\u0000\u001c\u001d\u0005\u0001\u0000\u0000\u001d\u001e"+
		"\u0003\u000e\u0007\u0000\u001e\u001f\u0005\u0002\u0000\u0000\u001f\"\u0001"+
		"\u0000\u0000\u0000 \"\u0005\u0000\u0000\u0001!\u0010\u0001\u0000\u0000"+
		"\u0000! \u0001\u0000\u0000\u0000\"\u0001\u0001\u0000\u0000\u0000#$\u0005"+
		"\t\u0000\u0000$%\u0005\u0003\u0000\u0000%&\u0005\u0010\u0000\u0000&\u0003"+
		"\u0001\u0000\u0000\u0000\'(\u0005\r\u0000\u0000(\u0005\u0001\u0000\u0000"+
		"\u0000)*\u0007\u0000\u0000\u0000*\u0007\u0001\u0000\u0000\u0000+,\u0005"+
		"\u0007\u0000\u0000,-\u0005\u000e\u0000\u0000-\t\u0001\u0000\u0000\u0000"+
		"./\u0005\u000f\u0000\u0000/\u000b\u0001\u0000\u0000\u000002\u0007\u0001"+
		"\u0000\u000010\u0001\u0000\u0000\u000025\u0001\u0000\u0000\u000031\u0001"+
		"\u0000\u0000\u000034\u0001\u0000\u0000\u00004\r\u0001\u0000\u0000\u0000"+
		"53\u0001\u0000\u0000\u000067\u0005\u000f\u0000\u00007\u000f\u0001\u0000"+
		"\u0000\u0000\u0002!3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}