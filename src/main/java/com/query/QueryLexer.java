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
			null, "'OR'", "'AND'"
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
		"\u0004\u0000\u0006R\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002/\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0004\u00033\b\u0003\u000b\u0003\f\u00034\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0004\u0004:\b\u0004\u000b\u0004\f\u0004;\u0001"+
		"\u0005\u0004\u0005?\b\u0005\u000b\u0005\f\u0005@\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0000"+
		"\u0000\r\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0000\u000f\u0000\u0011\u0000\u0013\u0000\u0015\u0000\u0017\u0000"+
		"\u0019\u0000\u0001\u0000\u0004\u0003\u0000\t\n\r\r  \u0004\u000009AZ_"+
		"_az\u0007\u0000  **--/:AZ__az\u0002\u0000\"\"\'\'R\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0001\u001b\u0001\u0000\u0000"+
		"\u0000\u0003\u001e\u0001\u0000\u0000\u0000\u0005.\u0001\u0000\u0000\u0000"+
		"\u00070\u0001\u0000\u0000\u0000\t9\u0001\u0000\u0000\u0000\u000b>\u0001"+
		"\u0000\u0000\u0000\rD\u0001\u0000\u0000\u0000\u000fF\u0001\u0000\u0000"+
		"\u0000\u0011H\u0001\u0000\u0000\u0000\u0013J\u0001\u0000\u0000\u0000\u0015"+
		"L\u0001\u0000\u0000\u0000\u0017N\u0001\u0000\u0000\u0000\u0019P\u0001"+
		"\u0000\u0000\u0000\u001b\u001c\u0005O\u0000\u0000\u001c\u001d\u0005R\u0000"+
		"\u0000\u001d\u0002\u0001\u0000\u0000\u0000\u001e\u001f\u0005A\u0000\u0000"+
		"\u001f \u0005N\u0000\u0000 !\u0005D\u0000\u0000!\u0004\u0001\u0000\u0000"+
		"\u0000\"/\u0003\u0011\b\u0000#/\u0003\u0013\t\u0000$/\u0003\u0015\n\u0000"+
		"%&\u0003\u0011\b\u0000&\'\u0003\u0015\n\u0000\'/\u0001\u0000\u0000\u0000"+
		"()\u0003\u0013\t\u0000)*\u0003\u0015\n\u0000*/\u0001\u0000\u0000\u0000"+
		"+,\u0003\u0017\u000b\u0000,-\u0003\u0015\n\u0000-/\u0001\u0000\u0000\u0000"+
		".\"\u0001\u0000\u0000\u0000.#\u0001\u0000\u0000\u0000.$\u0001\u0000\u0000"+
		"\u0000.%\u0001\u0000\u0000\u0000.(\u0001\u0000\u0000\u0000.+\u0001\u0000"+
		"\u0000\u0000/\u0006\u0001\u0000\u0000\u000002\u0003\u0019\f\u000013\u0003"+
		"\u000f\u0007\u000021\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u0000"+
		"42\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000056\u0001\u0000\u0000"+
		"\u000067\u0003\u0019\f\u00007\b\u0001\u0000\u0000\u00008:\u0003\r\u0006"+
		"\u000098\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;9\u0001\u0000"+
		"\u0000\u0000;<\u0001\u0000\u0000\u0000<\n\u0001\u0000\u0000\u0000=?\u0007"+
		"\u0000\u0000\u0000>=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000"+
		"@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000"+
		"\u0000BC\u0006\u0005\u0000\u0000C\f\u0001\u0000\u0000\u0000DE\u0007\u0001"+
		"\u0000\u0000E\u000e\u0001\u0000\u0000\u0000FG\u0007\u0002\u0000\u0000"+
		"G\u0010\u0001\u0000\u0000\u0000HI\u0005>\u0000\u0000I\u0012\u0001\u0000"+
		"\u0000\u0000JK\u0005<\u0000\u0000K\u0014\u0001\u0000\u0000\u0000LM\u0005"+
		"=\u0000\u0000M\u0016\u0001\u0000\u0000\u0000NO\u0005!\u0000\u0000O\u0018"+
		"\u0001\u0000\u0000\u0000PQ\u0007\u0003\u0000\u0000Q\u001a\u0001\u0000"+
		"\u0000\u0000\u0005\u0000.4;@\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}