// Generated from grammar/Demo.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DemoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, PRINTLN=2, FUNCTION=3, RETURN=4, BRACKET_OPEN=5, BRACKET_CLOSE=6, 
		PAIR_OPEN=7, PAIR_CLOSE=8, SEMICOLON=9, COMMA=10, PLUS=11, MIN=12, DIV=13, 
		MUL=14, INT=15, STRING=16, ASSIGN=17, NUMBER=18, ID=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PROGRAM", "PRINTLN", "FUNCTION", "RETURN", "BRACKET_OPEN", "BRACKET_CLOSE", 
			"PAIR_OPEN", "PAIR_CLOSE", "SEMICOLON", "COMMA", "PLUS", "MIN", "DIV", 
			"MUL", "INT", "STRING", "ASSIGN", "NUMBER", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "'println'", "'function'", "'return'", "'{'", "'}'", 
			"'('", "')'", "';'", "','", "'+'", "'-'", "'/'", "'*'", "'int'", "'string'", 
			"'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM", "PRINTLN", "FUNCTION", "RETURN", "BRACKET_OPEN", "BRACKET_CLOSE", 
			"PAIR_OPEN", "PAIR_CLOSE", "SEMICOLON", "COMMA", "PLUS", "MIN", "DIV", 
			"MUL", "INT", "STRING", "ASSIGN", "NUMBER", "ID", "WS"
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


	public DemoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Demo.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\177\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\23\6\23n\n\23\r\23\16\23o\3\24\3\24\7"+
		"\24t\n\24\f\24\16\24w\13\24\3\25\6\25z\n\25\r\25\16\25{\3\25\3\25\2\2"+
		"\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26\3\2\6\3\2\62;\4\2C\\c|\5\2\62;C\\c|\5\2"+
		"\13\f\17\17\"\"\2\u0081\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2"+
		"\2\5\63\3\2\2\2\7;\3\2\2\2\tD\3\2\2\2\13K\3\2\2\2\rM\3\2\2\2\17O\3\2\2"+
		"\2\21Q\3\2\2\2\23S\3\2\2\2\25U\3\2\2\2\27W\3\2\2\2\31Y\3\2\2\2\33[\3\2"+
		"\2\2\35]\3\2\2\2\37_\3\2\2\2!c\3\2\2\2#j\3\2\2\2%m\3\2\2\2\'q\3\2\2\2"+
		")y\3\2\2\2+,\7r\2\2,-\7t\2\2-.\7q\2\2./\7i\2\2/\60\7t\2\2\60\61\7c\2\2"+
		"\61\62\7o\2\2\62\4\3\2\2\2\63\64\7r\2\2\64\65\7t\2\2\65\66\7k\2\2\66\67"+
		"\7p\2\2\678\7v\2\289\7n\2\29:\7p\2\2:\6\3\2\2\2;<\7h\2\2<=\7w\2\2=>\7"+
		"p\2\2>?\7e\2\2?@\7v\2\2@A\7k\2\2AB\7q\2\2BC\7p\2\2C\b\3\2\2\2DE\7t\2\2"+
		"EF\7g\2\2FG\7v\2\2GH\7w\2\2HI\7t\2\2IJ\7p\2\2J\n\3\2\2\2KL\7}\2\2L\f\3"+
		"\2\2\2MN\7\177\2\2N\16\3\2\2\2OP\7*\2\2P\20\3\2\2\2QR\7+\2\2R\22\3\2\2"+
		"\2ST\7=\2\2T\24\3\2\2\2UV\7.\2\2V\26\3\2\2\2WX\7-\2\2X\30\3\2\2\2YZ\7"+
		"/\2\2Z\32\3\2\2\2[\\\7\61\2\2\\\34\3\2\2\2]^\7,\2\2^\36\3\2\2\2_`\7k\2"+
		"\2`a\7p\2\2ab\7v\2\2b \3\2\2\2cd\7u\2\2de\7v\2\2ef\7t\2\2fg\7k\2\2gh\7"+
		"p\2\2hi\7i\2\2i\"\3\2\2\2jk\7?\2\2k$\3\2\2\2ln\t\2\2\2ml\3\2\2\2no\3\2"+
		"\2\2om\3\2\2\2op\3\2\2\2p&\3\2\2\2qu\t\3\2\2rt\t\4\2\2sr\3\2\2\2tw\3\2"+
		"\2\2us\3\2\2\2uv\3\2\2\2v(\3\2\2\2wu\3\2\2\2xz\t\5\2\2yx\3\2\2\2z{\3\2"+
		"\2\2{y\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\b\25\2\2~*\3\2\2\2\6\2ou{\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}