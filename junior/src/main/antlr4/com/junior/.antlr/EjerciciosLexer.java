// Generated from /Users/rogelioorozcoavila/Developer/Lenguajes y Autómatas II/milenguaje/junior/src/main/antlr4/com/junior/Ejercicios.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class EjerciciosLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PR_IF=1, OP_ASIG=2, OP_MAYOR=3, OP_SUMA=4, OP_RESTA=5, OP_MULT=6, OP_DIV=7, 
		PAR_IZQ=8, PAR_DER=9, LLAVE_IZQ=10, LLAVE_DER=11, PUN_COMA=12, ENT=13, 
		ID=14, WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PR_IF", "OP_ASIG", "OP_MAYOR", "OP_SUMA", "OP_RESTA", "OP_MULT", "OP_DIV", 
			"PAR_IZQ", "PAR_DER", "LLAVE_IZQ", "LLAVE_DER", "PUN_COMA", "ENT", "ID", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'='", "'>'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", 
			"'{'", "'}'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PR_IF", "OP_ASIG", "OP_MAYOR", "OP_SUMA", "OP_RESTA", "OP_MULT", 
			"OP_DIV", "PAR_IZQ", "PAR_DER", "LLAVE_IZQ", "LLAVE_DER", "PUN_COMA", 
			"ENT", "ID", "WS"
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


	public EjerciciosLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Ejercicios.g4"; }

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
		"\u0004\u0000\u000fK\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0004"+
		"\f:\b\f\u000b\f\f\f;\u0001\r\u0001\r\u0005\r@\b\r\n\r\f\rC\t\r\u0001\u000e"+
		"\u0004\u000eF\b\u000e\u000b\u000e\f\u000eG\u0001\u000e\u0001\u000e\u0000"+
		"\u0000\u000f\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u0001\u0000\u0004\u0001\u000009\u0003\u0000AZ__az\u0004"+
		"\u000009AZ__az\u0003\u0000\t\n\f\r  M\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0001\u001f"+
		"\u0001\u0000\u0000\u0000\u0003\"\u0001\u0000\u0000\u0000\u0005$\u0001"+
		"\u0000\u0000\u0000\u0007&\u0001\u0000\u0000\u0000\t(\u0001\u0000\u0000"+
		"\u0000\u000b*\u0001\u0000\u0000\u0000\r,\u0001\u0000\u0000\u0000\u000f"+
		".\u0001\u0000\u0000\u0000\u00110\u0001\u0000\u0000\u0000\u00132\u0001"+
		"\u0000\u0000\u0000\u00154\u0001\u0000\u0000\u0000\u00176\u0001\u0000\u0000"+
		"\u0000\u00199\u0001\u0000\u0000\u0000\u001b=\u0001\u0000\u0000\u0000\u001d"+
		"E\u0001\u0000\u0000\u0000\u001f \u0005i\u0000\u0000 !\u0005f\u0000\u0000"+
		"!\u0002\u0001\u0000\u0000\u0000\"#\u0005=\u0000\u0000#\u0004\u0001\u0000"+
		"\u0000\u0000$%\u0005>\u0000\u0000%\u0006\u0001\u0000\u0000\u0000&\'\u0005"+
		"+\u0000\u0000\'\b\u0001\u0000\u0000\u0000()\u0005-\u0000\u0000)\n\u0001"+
		"\u0000\u0000\u0000*+\u0005*\u0000\u0000+\f\u0001\u0000\u0000\u0000,-\u0005"+
		"/\u0000\u0000-\u000e\u0001\u0000\u0000\u0000./\u0005(\u0000\u0000/\u0010"+
		"\u0001\u0000\u0000\u000001\u0005)\u0000\u00001\u0012\u0001\u0000\u0000"+
		"\u000023\u0005{\u0000\u00003\u0014\u0001\u0000\u0000\u000045\u0005}\u0000"+
		"\u00005\u0016\u0001\u0000\u0000\u000067\u0005;\u0000\u00007\u0018\u0001"+
		"\u0000\u0000\u00008:\u0007\u0000\u0000\u000098\u0001\u0000\u0000\u0000"+
		":;\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000"+
		"\u0000<\u001a\u0001\u0000\u0000\u0000=A\u0007\u0001\u0000\u0000>@\u0007"+
		"\u0002\u0000\u0000?>\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000"+
		"A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000B\u001c\u0001\u0000"+
		"\u0000\u0000CA\u0001\u0000\u0000\u0000DF\u0007\u0003\u0000\u0000ED\u0001"+
		"\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000"+
		"GH\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IJ\u0006\u000e\u0000"+
		"\u0000J\u001e\u0001\u0000\u0000\u0000\u0004\u0000;AG\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}