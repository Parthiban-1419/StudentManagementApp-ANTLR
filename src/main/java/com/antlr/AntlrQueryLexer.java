// Generated from C:/Users/parthi-pt4593/eclipse-workspace/myEclipse/StudentManagementApp/src/main/java/com/antlr\AntlrQuery.g4 by ANTLR 4.10.1
package com.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AntlrQueryLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, SEPERATOR=3, OR=4, AND=5, TO=6, COMPARISON=7, NUMBER=8, 
		STRING=9, VALUE=10, QOUTE=11, ESCAPE=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "SEPERATOR", "OR", "AND", "TO", "COMPARISON", "NUMBER", 
			"STRING", "VALUE", "QOUTE", "ESCAPE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", null, null, null, null, null, null, null, null, "'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "SEPERATOR", "OR", "AND", "TO", "COMPARISON", "NUMBER", 
			"STRING", "VALUE", "QOUTE", "ESCAPE"
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


	public AntlrQueryLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AntlrQuery.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\fT\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003#\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004+\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"0\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u00069\b\u0006\u0001\u0007\u0004\u0007"+
		"<\b\u0007\u000b\u0007\f\u0007=\u0001\b\u0004\bA\b\b\u000b\b\f\bB\u0001"+
		"\t\u0001\t\u0001\t\u0003\tH\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0004\u000bO\b\u000b\u000b\u000b\f\u000bP\u0001\u000b\u0001\u000b"+
		"\u0000\u0000\f\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0001"+
		"\u0000\u000b\u0002\u0000::==\u0002\u0000OOoo\u0002\u0000RRrr\u0002\u0000"+
		"AAaa\u0002\u0000NNnn\u0002\u0000DDdd\u0002\u0000TTtt\u0001\u000009\u0003"+
		"\u000009AZaz\u0002\u0000*+??\u0004\u0000\t\n\r\r  ()_\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0001\u0019\u0001\u0000\u0000"+
		"\u0000\u0003\u001b\u0001\u0000\u0000\u0000\u0005\u001d\u0001\u0000\u0000"+
		"\u0000\u0007\"\u0001\u0000\u0000\u0000\t*\u0001\u0000\u0000\u0000\u000b"+
		"/\u0001\u0000\u0000\u0000\r8\u0001\u0000\u0000\u0000\u000f;\u0001\u0000"+
		"\u0000\u0000\u0011@\u0001\u0000\u0000\u0000\u0013D\u0001\u0000\u0000\u0000"+
		"\u0015K\u0001\u0000\u0000\u0000\u0017N\u0001\u0000\u0000\u0000\u0019\u001a"+
		"\u0005[\u0000\u0000\u001a\u0002\u0001\u0000\u0000\u0000\u001b\u001c\u0005"+
		"]\u0000\u0000\u001c\u0004\u0001\u0000\u0000\u0000\u001d\u001e\u0007\u0000"+
		"\u0000\u0000\u001e\u0006\u0001\u0000\u0000\u0000\u001f \u0007\u0001\u0000"+
		"\u0000 #\u0007\u0002\u0000\u0000!#\u0005|\u0000\u0000\"\u001f\u0001\u0000"+
		"\u0000\u0000\"!\u0001\u0000\u0000\u0000#\b\u0001\u0000\u0000\u0000$%\u0007"+
		"\u0003\u0000\u0000%&\u0007\u0004\u0000\u0000&+\u0007\u0005\u0000\u0000"+
		"\'+\u0005&\u0000\u0000()\u0005&\u0000\u0000)+\u0005&\u0000\u0000*$\u0001"+
		"\u0000\u0000\u0000*\'\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000"+
		"+\n\u0001\u0000\u0000\u0000,-\u0007\u0006\u0000\u0000-0\u0007\u0001\u0000"+
		"\u0000.0\u0005-\u0000\u0000/,\u0001\u0000\u0000\u0000/.\u0001\u0000\u0000"+
		"\u00000\f\u0001\u0000\u0000\u000019\u0005>\u0000\u000023\u0005>\u0000"+
		"\u000039\u0005=\u0000\u000049\u0005<\u0000\u000056\u0005<\u0000\u0000"+
		"69\u0005=\u0000\u000079\u0005!\u0000\u000081\u0001\u0000\u0000\u00008"+
		"2\u0001\u0000\u0000\u000084\u0001\u0000\u0000\u000085\u0001\u0000\u0000"+
		"\u000087\u0001\u0000\u0000\u00009\u000e\u0001\u0000\u0000\u0000:<\u0007"+
		"\u0007\u0000\u0000;:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000"+
		"=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>\u0010\u0001\u0000"+
		"\u0000\u0000?A\u0007\b\u0000\u0000@?\u0001\u0000\u0000\u0000AB\u0001\u0000"+
		"\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000C\u0012"+
		"\u0001\u0000\u0000\u0000DG\u0003\u0015\n\u0000EH\u0003\u0011\b\u0000F"+
		"H\u0007\t\u0000\u0000GE\u0001\u0000\u0000\u0000GF\u0001\u0000\u0000\u0000"+
		"HI\u0001\u0000\u0000\u0000IJ\u0003\u0015\n\u0000J\u0014\u0001\u0000\u0000"+
		"\u0000KL\u0005\'\u0000\u0000L\u0016\u0001\u0000\u0000\u0000MO\u0007\n"+
		"\u0000\u0000NM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PN\u0001"+
		"\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000"+
		"RS\u0006\u000b\u0000\u0000S\u0018\u0001\u0000\u0000\u0000\t\u0000\"*/"+
		"8=BGP\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}