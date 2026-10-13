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
		PR_IF=1, PR_ELSE_IF=2, PR_ELSE=3, PR_FOR=4, PR_INT=5, PR_FLOAT=6, PR_BOOL=7, 
		PR_STR=8, PR_PRINT=9, PR_TRUE=10, PR_FALSE=11, OP_ASIG=12, OP_MAYOR=13, 
		OP_MENOR=14, OP_IGUAL=15, OP_MENOR_IGUAL=16, OP_MAYOR_IGUAL=17, OP_INCREMENTO=18, 
		OP_SUMA=19, OP_RESTA=20, OP_MULT=21, OP_DIV=22, PAR_IZQ=23, PAR_DER=24, 
		LLAVE_IZQ=25, LLAVE_DER=26, PUN_COMA=27, ENT=28, FLOT=29, CADENA=30, ID=31, 
		WS=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PR_IF", "PR_ELSE_IF", "PR_ELSE", "PR_FOR", "PR_INT", "PR_FLOAT", "PR_BOOL", 
			"PR_STR", "PR_PRINT", "PR_TRUE", "PR_FALSE", "OP_ASIG", "OP_MAYOR", "OP_MENOR", 
			"OP_IGUAL", "OP_MENOR_IGUAL", "OP_MAYOR_IGUAL", "OP_INCREMENTO", "OP_SUMA", 
			"OP_RESTA", "OP_MULT", "OP_DIV", "PAR_IZQ", "PAR_DER", "LLAVE_IZQ", "LLAVE_DER", 
			"PUN_COMA", "ENT", "FLOT", "CADENA", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'elseIf'", "'else'", "'for'", "'int'", "'float'", "'bool'", 
			"'str'", "'print'", "'true'", "'false'", "'='", "'>'", "'<'", "'=='", 
			"'<='", "'>='", "'++'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'{'", 
			"'}'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PR_IF", "PR_ELSE_IF", "PR_ELSE", "PR_FOR", "PR_INT", "PR_FLOAT", 
			"PR_BOOL", "PR_STR", "PR_PRINT", "PR_TRUE", "PR_FALSE", "OP_ASIG", "OP_MAYOR", 
			"OP_MENOR", "OP_IGUAL", "OP_MENOR_IGUAL", "OP_MAYOR_IGUAL", "OP_INCREMENTO", 
			"OP_SUMA", "OP_RESTA", "OP_MULT", "OP_DIV", "PAR_IZQ", "PAR_DER", "LLAVE_IZQ", 
			"LLAVE_DER", "PUN_COMA", "ENT", "FLOT", "CADENA", "ID", "WS"
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
		"\u0004\u0000 \u00c5\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0004\u001b\u009e"+
		"\b\u001b\u000b\u001b\f\u001b\u009f\u0001\u001c\u0004\u001c\u00a3\b\u001c"+
		"\u000b\u001c\f\u001c\u00a4\u0001\u001c\u0001\u001c\u0004\u001c\u00a9\b"+
		"\u001c\u000b\u001c\f\u001c\u00aa\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0005\u001d\u00b1\b\u001d\n\u001d\f\u001d\u00b4\t\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0005\u001e\u00ba\b\u001e\n\u001e"+
		"\f\u001e\u00bd\t\u001e\u0001\u001f\u0004\u001f\u00c0\b\u001f\u000b\u001f"+
		"\f\u001f\u00c1\u0001\u001f\u0001\u001f\u0000\u0000 \u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a"+
		"5\u001b7\u001c9\u001d;\u001e=\u001f? \u0001\u0000\u0006\u0001\u000009"+
		"\u0005\u0000\"\"\\\\nnrrtt\u0004\u0000\n\n\r\r\"\"\\\\\u0003\u0000AZ_"+
		"_az\u0004\u000009AZ__az\u0003\u0000\t\n\f\r  \u00cb\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000"+
		"\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000"+
		"\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005"+
		"\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000"+
		"\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000"+
		"\u0000?\u0001\u0000\u0000\u0000\u0001A\u0001\u0000\u0000\u0000\u0003D"+
		"\u0001\u0000\u0000\u0000\u0005K\u0001\u0000\u0000\u0000\u0007P\u0001\u0000"+
		"\u0000\u0000\tT\u0001\u0000\u0000\u0000\u000bX\u0001\u0000\u0000\u0000"+
		"\r^\u0001\u0000\u0000\u0000\u000fc\u0001\u0000\u0000\u0000\u0011g\u0001"+
		"\u0000\u0000\u0000\u0013m\u0001\u0000\u0000\u0000\u0015r\u0001\u0000\u0000"+
		"\u0000\u0017x\u0001\u0000\u0000\u0000\u0019z\u0001\u0000\u0000\u0000\u001b"+
		"|\u0001\u0000\u0000\u0000\u001d~\u0001\u0000\u0000\u0000\u001f\u0081\u0001"+
		"\u0000\u0000\u0000!\u0084\u0001\u0000\u0000\u0000#\u0087\u0001\u0000\u0000"+
		"\u0000%\u008a\u0001\u0000\u0000\u0000\'\u008c\u0001\u0000\u0000\u0000"+
		")\u008e\u0001\u0000\u0000\u0000+\u0090\u0001\u0000\u0000\u0000-\u0092"+
		"\u0001\u0000\u0000\u0000/\u0094\u0001\u0000\u0000\u00001\u0096\u0001\u0000"+
		"\u0000\u00003\u0098\u0001\u0000\u0000\u00005\u009a\u0001\u0000\u0000\u0000"+
		"7\u009d\u0001\u0000\u0000\u00009\u00a2\u0001\u0000\u0000\u0000;\u00ac"+
		"\u0001\u0000\u0000\u0000=\u00b7\u0001\u0000\u0000\u0000?\u00bf\u0001\u0000"+
		"\u0000\u0000AB\u0005i\u0000\u0000BC\u0005f\u0000\u0000C\u0002\u0001\u0000"+
		"\u0000\u0000DE\u0005e\u0000\u0000EF\u0005l\u0000\u0000FG\u0005s\u0000"+
		"\u0000GH\u0005e\u0000\u0000HI\u0005I\u0000\u0000IJ\u0005f\u0000\u0000"+
		"J\u0004\u0001\u0000\u0000\u0000KL\u0005e\u0000\u0000LM\u0005l\u0000\u0000"+
		"MN\u0005s\u0000\u0000NO\u0005e\u0000\u0000O\u0006\u0001\u0000\u0000\u0000"+
		"PQ\u0005f\u0000\u0000QR\u0005o\u0000\u0000RS\u0005r\u0000\u0000S\b\u0001"+
		"\u0000\u0000\u0000TU\u0005i\u0000\u0000UV\u0005n\u0000\u0000VW\u0005t"+
		"\u0000\u0000W\n\u0001\u0000\u0000\u0000XY\u0005f\u0000\u0000YZ\u0005l"+
		"\u0000\u0000Z[\u0005o\u0000\u0000[\\\u0005a\u0000\u0000\\]\u0005t\u0000"+
		"\u0000]\f\u0001\u0000\u0000\u0000^_\u0005b\u0000\u0000_`\u0005o\u0000"+
		"\u0000`a\u0005o\u0000\u0000ab\u0005l\u0000\u0000b\u000e\u0001\u0000\u0000"+
		"\u0000cd\u0005s\u0000\u0000de\u0005t\u0000\u0000ef\u0005r\u0000\u0000"+
		"f\u0010\u0001\u0000\u0000\u0000gh\u0005p\u0000\u0000hi\u0005r\u0000\u0000"+
		"ij\u0005i\u0000\u0000jk\u0005n\u0000\u0000kl\u0005t\u0000\u0000l\u0012"+
		"\u0001\u0000\u0000\u0000mn\u0005t\u0000\u0000no\u0005r\u0000\u0000op\u0005"+
		"u\u0000\u0000pq\u0005e\u0000\u0000q\u0014\u0001\u0000\u0000\u0000rs\u0005"+
		"f\u0000\u0000st\u0005a\u0000\u0000tu\u0005l\u0000\u0000uv\u0005s\u0000"+
		"\u0000vw\u0005e\u0000\u0000w\u0016\u0001\u0000\u0000\u0000xy\u0005=\u0000"+
		"\u0000y\u0018\u0001\u0000\u0000\u0000z{\u0005>\u0000\u0000{\u001a\u0001"+
		"\u0000\u0000\u0000|}\u0005<\u0000\u0000}\u001c\u0001\u0000\u0000\u0000"+
		"~\u007f\u0005=\u0000\u0000\u007f\u0080\u0005=\u0000\u0000\u0080\u001e"+
		"\u0001\u0000\u0000\u0000\u0081\u0082\u0005<\u0000\u0000\u0082\u0083\u0005"+
		"=\u0000\u0000\u0083 \u0001\u0000\u0000\u0000\u0084\u0085\u0005>\u0000"+
		"\u0000\u0085\u0086\u0005=\u0000\u0000\u0086\"\u0001\u0000\u0000\u0000"+
		"\u0087\u0088\u0005+\u0000\u0000\u0088\u0089\u0005+\u0000\u0000\u0089$"+
		"\u0001\u0000\u0000\u0000\u008a\u008b\u0005+\u0000\u0000\u008b&\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0005-\u0000\u0000\u008d(\u0001\u0000\u0000\u0000"+
		"\u008e\u008f\u0005*\u0000\u0000\u008f*\u0001\u0000\u0000\u0000\u0090\u0091"+
		"\u0005/\u0000\u0000\u0091,\u0001\u0000\u0000\u0000\u0092\u0093\u0005("+
		"\u0000\u0000\u0093.\u0001\u0000\u0000\u0000\u0094\u0095\u0005)\u0000\u0000"+
		"\u00950\u0001\u0000\u0000\u0000\u0096\u0097\u0005{\u0000\u0000\u00972"+
		"\u0001\u0000\u0000\u0000\u0098\u0099\u0005}\u0000\u0000\u00994\u0001\u0000"+
		"\u0000\u0000\u009a\u009b\u0005;\u0000\u0000\u009b6\u0001\u0000\u0000\u0000"+
		"\u009c\u009e\u0007\u0000\u0000\u0000\u009d\u009c\u0001\u0000\u0000\u0000"+
		"\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000"+
		"\u009f\u00a0\u0001\u0000\u0000\u0000\u00a08\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a3\u0007\u0000\u0000\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a8\u0005.\u0000\u0000\u00a7\u00a9\u0007\u0000\u0000\u0000\u00a8\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00a8"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab:\u0001"+
		"\u0000\u0000\u0000\u00ac\u00b2\u0005\"\u0000\u0000\u00ad\u00ae\u0005\\"+
		"\u0000\u0000\u00ae\u00b1\u0007\u0001\u0000\u0000\u00af\u00b1\b\u0002\u0000"+
		"\u0000\u00b0\u00ad\u0001\u0000\u0000\u0000\u00b0\u00af\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b4\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005\"\u0000\u0000"+
		"\u00b6<\u0001\u0000\u0000\u0000\u00b7\u00bb\u0007\u0003\u0000\u0000\u00b8"+
		"\u00ba\u0007\u0004\u0000\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000\u00ba"+
		"\u00bd\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb"+
		"\u00bc\u0001\u0000\u0000\u0000\u00bc>\u0001\u0000\u0000\u0000\u00bd\u00bb"+
		"\u0001\u0000\u0000\u0000\u00be\u00c0\u0007\u0005\u0000\u0000\u00bf\u00be"+
		"\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00bf"+
		"\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c4\u0006\u001f\u0000\u0000\u00c4@\u0001"+
		"\u0000\u0000\u0000\b\u0000\u009f\u00a4\u00aa\u00b0\u00b2\u00bb\u00c1\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}