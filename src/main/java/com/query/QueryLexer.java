// Generated from C:/Users/parthi-pt4593/eclipse-workspace/myEclipse/StudentManagementApp/src/main/java/com/query\Query.g4 by ANTLR 4.10.1
package com.query;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QueryLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OR=1, AND=2, COMPARISON=3, VALUE=4, ATTRIBUTE=5, WHITESPACE=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"OR", "AND", "COMPARISON", "VALUE", "ATTRIBUTE", "WHITESPACE", "LETTER", 
			"VAL", "GREATER", "LESSER", "EQUAL", "NOT", "QUOTE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OR", "AND", "COMPARISON", "VALUE", "ATTRIBUTE", "WHITESPACE"
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


	public QueryLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Query.g4"; }

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
		"\u0004\u0000\u0006]\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0003\u0000!\b\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001,\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002:\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0004\u0003>\b\u0003\u000b\u0003\f\u0003?\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0004\u0004E\b\u0004\u000b\u0004\f\u0004F\u0001\u0005\u0004"+
		"\u0005J\b\u0005\u000b\u0005\f\u0005K\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0000\u0000\r\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0000"+
		"\u000f\u0000\u0011\u0000\u0013\u0000\u0015\u0000\u0017\u0000\u0019\u0000"+
		"\u0001\u0000\u0004\u0003\u0000\t\n\r\r  \u0004\u000009AZ__az\u0007\u0000"+
		"  **--/:AZ__az\u0002\u0000\"\"\'\'b\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0001 \u0001\u0000\u0000\u0000\u0003+\u0001"+
		"\u0000\u0000\u0000\u00059\u0001\u0000\u0000\u0000\u0007;\u0001\u0000\u0000"+
		"\u0000\tD\u0001\u0000\u0000\u0000\u000bI\u0001\u0000\u0000\u0000\rO\u0001"+
		"\u0000\u0000\u0000\u000fQ\u0001\u0000\u0000\u0000\u0011S\u0001\u0000\u0000"+
		"\u0000\u0013U\u0001\u0000\u0000\u0000\u0015W\u0001\u0000\u0000\u0000\u0017"+
		"Y\u0001\u0000\u0000\u0000\u0019[\u0001\u0000\u0000\u0000\u001b\u001c\u0005"+
		"O\u0000\u0000\u001c!\u0005R\u0000\u0000\u001d!\u0005|\u0000\u0000\u001e"+
		"\u001f\u0005o\u0000\u0000\u001f!\u0005r\u0000\u0000 \u001b\u0001\u0000"+
		"\u0000\u0000 \u001d\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000"+
		"!\u0002\u0001\u0000\u0000\u0000\"#\u0005A\u0000\u0000#$\u0005N\u0000\u0000"+
		"$,\u0005D\u0000\u0000%,\u0005&\u0000\u0000&\'\u0005&\u0000\u0000\',\u0005"+
		"&\u0000\u0000()\u0005a\u0000\u0000)*\u0005n\u0000\u0000*,\u0005d\u0000"+
		"\u0000+\"\u0001\u0000\u0000\u0000+%\u0001\u0000\u0000\u0000+&\u0001\u0000"+
		"\u0000\u0000+(\u0001\u0000\u0000\u0000,\u0004\u0001\u0000\u0000\u0000"+
		"-:\u0003\u0011\b\u0000.:\u0003\u0013\t\u0000/:\u0003\u0015\n\u000001\u0003"+
		"\u0011\b\u000012\u0003\u0015\n\u00002:\u0001\u0000\u0000\u000034\u0003"+
		"\u0013\t\u000045\u0003\u0015\n\u00005:\u0001\u0000\u0000\u000067\u0003"+
		"\u0017\u000b\u000078\u0003\u0015\n\u00008:\u0001\u0000\u0000\u00009-\u0001"+
		"\u0000\u0000\u00009.\u0001\u0000\u0000\u00009/\u0001\u0000\u0000\u0000"+
		"90\u0001\u0000\u0000\u000093\u0001\u0000\u0000\u000096\u0001\u0000\u0000"+
		"\u0000:\u0006\u0001\u0000\u0000\u0000;=\u0005\'\u0000\u0000<>\u0003\u000f"+
		"\u0007\u0000=<\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?=\u0001"+
		"\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000"+
		"AB\u0005\'\u0000\u0000B\b\u0001\u0000\u0000\u0000CE\u0003\r\u0006\u0000"+
		"DC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000"+
		"\u0000FG\u0001\u0000\u0000\u0000G\n\u0001\u0000\u0000\u0000HJ\u0007\u0000"+
		"\u0000\u0000IH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KI\u0001"+
		"\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000"+
		"MN\u0006\u0005\u0000\u0000N\f\u0001\u0000\u0000\u0000OP\u0007\u0001\u0000"+
		"\u0000P\u000e\u0001\u0000\u0000\u0000QR\u0007\u0002\u0000\u0000R\u0010"+
		"\u0001\u0000\u0000\u0000ST\u0005>\u0000\u0000T\u0012\u0001\u0000\u0000"+
		"\u0000UV\u0005<\u0000\u0000V\u0014\u0001\u0000\u0000\u0000WX\u0005=\u0000"+
		"\u0000X\u0016\u0001\u0000\u0000\u0000YZ\u0005!\u0000\u0000Z\u0018\u0001"+
		"\u0000\u0000\u0000[\\\u0007\u0003\u0000\u0000\\\u001a\u0001\u0000\u0000"+
		"\u0000\u0007\u0000 +9?FK\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}