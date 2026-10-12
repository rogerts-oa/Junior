// Generated from com/junior/Ejercicios.g4 by ANTLR 4.9.2
package com.junior;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EjerciciosLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21M\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\16\6\16<\n\16\r\16\16\16=\3\17\3\17\7\17B\n\17\f\17\16"+
		"\17E\13\17\3\20\6\20H\n\20\r\20\16\20I\3\20\3\20\2\2\21\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21\3\2\6\3"+
		"\2\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\16\17\"\"\2O\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5$\3\2\2\2\7&\3\2\2\2\t"+
		"(\3\2\2\2\13*\3\2\2\2\r,\3\2\2\2\17.\3\2\2\2\21\60\3\2\2\2\23\62\3\2\2"+
		"\2\25\64\3\2\2\2\27\66\3\2\2\2\318\3\2\2\2\33;\3\2\2\2\35?\3\2\2\2\37"+
		"G\3\2\2\2!\"\7k\2\2\"#\7h\2\2#\4\3\2\2\2$%\7?\2\2%\6\3\2\2\2&\'\7@\2\2"+
		"\'\b\3\2\2\2()\7-\2\2)\n\3\2\2\2*+\7/\2\2+\f\3\2\2\2,-\7,\2\2-\16\3\2"+
		"\2\2./\7\61\2\2/\20\3\2\2\2\60\61\7*\2\2\61\22\3\2\2\2\62\63\7+\2\2\63"+
		"\24\3\2\2\2\64\65\7}\2\2\65\26\3\2\2\2\66\67\7\177\2\2\67\30\3\2\2\28"+
		"9\7=\2\29\32\3\2\2\2:<\t\2\2\2;:\3\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3\2\2\2"+
		">\34\3\2\2\2?C\t\3\2\2@B\t\4\2\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2"+
		"\2D\36\3\2\2\2EC\3\2\2\2FH\t\5\2\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2"+
		"\2\2JK\3\2\2\2KL\b\20\2\2L \3\2\2\2\6\2=CI\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}