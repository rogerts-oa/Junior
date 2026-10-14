// Generated from /Users/rogelioorozcoavila/Developer/Lenguajes y Autómatas II/milenguaje/junior/src/main/antlr4/com/junior/Ejercicios.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class EjerciciosParser extends Parser {
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
	public static final int
		RULE_programa = 0, RULE_instruccion = 1, RULE_bloque = 2, RULE_sentencia_if = 3, 
		RULE_sentencia_for = 4, RULE_declaracion = 5, RULE_tipo = 6, RULE_impresion = 7, 
		RULE_asignacion = 8, RULE_incremento = 9, RULE_expresion = 10, RULE_expresion_relacional = 11, 
		RULE_expresion_aditiva = 12, RULE_termino = 13, RULE_factor = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "instruccion", "bloque", "sentencia_if", "sentencia_for", 
			"declaracion", "tipo", "impresion", "asignacion", "incremento", "expresion", 
			"expresion_relacional", "expresion_aditiva", "termino", "factor"
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

	@Override
	public String getGrammarFileName() { return "Ejercicios.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EjerciciosParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30);
				instruccion();
				}
				}
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4036497394L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionContext extends ParserRuleContext {
		public Sentencia_ifContext sentencia_if() {
			return getRuleContext(Sentencia_ifContext.class,0);
		}
		public Sentencia_forContext sentencia_for() {
			return getRuleContext(Sentencia_forContext.class,0);
		}
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public TerminalNode PUN_COMA() { return getToken(EjerciciosParser.PUN_COMA, 0); }
		public ImpresionContext impresion() {
			return getRuleContext(ImpresionContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruccion);
		int _la;
		try {
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				sentencia_if();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				sentencia_for();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				declaracion();
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUN_COMA) {
					{
					setState(38);
					match(PUN_COMA);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(41);
				impresion();
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUN_COMA) {
					{
					setState(42);
					match(PUN_COMA);
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(45);
				asignacion();
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUN_COMA) {
					{
					setState(46);
					match(PUN_COMA);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(49);
				expresion();
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUN_COMA) {
					{
					setState(50);
					match(PUN_COMA);
					}
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

	@SuppressWarnings("CheckReturnValue")
	public static class BloqueContext extends ParserRuleContext {
		public TerminalNode LLAVE_IZQ() { return getToken(EjerciciosParser.LLAVE_IZQ, 0); }
		public TerminalNode LLAVE_DER() { return getToken(EjerciciosParser.LLAVE_DER, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(LLAVE_IZQ);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4036497394L) != 0)) {
				{
				{
				setState(56);
				instruccion();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			match(LLAVE_DER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Sentencia_ifContext extends ParserRuleContext {
		public List<TerminalNode> PR_IF() { return getTokens(EjerciciosParser.PR_IF); }
		public TerminalNode PR_IF(int i) {
			return getToken(EjerciciosParser.PR_IF, i);
		}
		public List<TerminalNode> PAR_IZQ() { return getTokens(EjerciciosParser.PAR_IZQ); }
		public TerminalNode PAR_IZQ(int i) {
			return getToken(EjerciciosParser.PAR_IZQ, i);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<TerminalNode> PAR_DER() { return getTokens(EjerciciosParser.PAR_DER); }
		public TerminalNode PAR_DER(int i) {
			return getToken(EjerciciosParser.PAR_DER, i);
		}
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public List<TerminalNode> PR_ELSE() { return getTokens(EjerciciosParser.PR_ELSE); }
		public TerminalNode PR_ELSE(int i) {
			return getToken(EjerciciosParser.PR_ELSE, i);
		}
		public List<TerminalNode> PR_ELSE_IF() { return getTokens(EjerciciosParser.PR_ELSE_IF); }
		public TerminalNode PR_ELSE_IF(int i) {
			return getToken(EjerciciosParser.PR_ELSE_IF, i);
		}
		public Sentencia_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_if; }
	}

	public final Sentencia_ifContext sentencia_if() throws RecognitionException {
		Sentencia_ifContext _localctx = new Sentencia_ifContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sentencia_if);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(PR_IF);
			setState(65);
			match(PAR_IZQ);
			setState(66);
			expresion();
			setState(67);
			match(PAR_DER);
			setState(68);
			bloque();
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(72);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case PR_ELSE_IF:
						{
						setState(69);
						match(PR_ELSE_IF);
						}
						break;
					case PR_ELSE:
						{
						setState(70);
						match(PR_ELSE);
						setState(71);
						match(PR_IF);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(74);
					match(PAR_IZQ);
					setState(75);
					expresion();
					setState(76);
					match(PAR_DER);
					setState(77);
					bloque();
					}
					} 
				}
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PR_ELSE) {
				{
				setState(84);
				match(PR_ELSE);
				setState(85);
				bloque();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Sentencia_forContext extends ParserRuleContext {
		public TerminalNode PR_FOR() { return getToken(EjerciciosParser.PR_FOR, 0); }
		public TerminalNode PAR_IZQ() { return getToken(EjerciciosParser.PAR_IZQ, 0); }
		public List<TerminalNode> PUN_COMA() { return getTokens(EjerciciosParser.PUN_COMA); }
		public TerminalNode PUN_COMA(int i) {
			return getToken(EjerciciosParser.PUN_COMA, i);
		}
		public TerminalNode PAR_DER() { return getToken(EjerciciosParser.PAR_DER, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public IncrementoContext incremento() {
			return getRuleContext(IncrementoContext.class,0);
		}
		public Sentencia_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_for; }
	}

	public final Sentencia_forContext sentencia_for() throws RecognitionException {
		Sentencia_forContext _localctx = new Sentencia_forContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sentencia_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(PR_FOR);
			setState(89);
			match(PAR_IZQ);
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PR_INT:
			case PR_FLOAT:
			case PR_BOOL:
			case PR_STR:
				{
				setState(90);
				declaracion();
				}
				break;
			case ID:
				{
				setState(91);
				asignacion();
				}
				break;
			case PUN_COMA:
				break;
			default:
				break;
			}
			setState(94);
			match(PUN_COMA);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4036496384L) != 0)) {
				{
				setState(95);
				expresion();
				}
			}

			setState(98);
			match(PUN_COMA);
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(99);
				asignacion();
				}
				break;
			case 2:
				{
				setState(100);
				incremento();
				}
				break;
			}
			setState(103);
			match(PAR_DER);
			setState(104);
			bloque();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(EjerciciosParser.ID, 0); }
		public TerminalNode OP_ASIG() { return getToken(EjerciciosParser.OP_ASIG, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaracion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			tipo();
			setState(107);
			match(ID);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ASIG) {
				{
				setState(108);
				match(OP_ASIG);
				setState(109);
				expresion();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TerminalNode PR_INT() { return getToken(EjerciciosParser.PR_INT, 0); }
		public TerminalNode PR_FLOAT() { return getToken(EjerciciosParser.PR_FLOAT, 0); }
		public TerminalNode PR_BOOL() { return getToken(EjerciciosParser.PR_BOOL, 0); }
		public TerminalNode PR_STR() { return getToken(EjerciciosParser.PR_STR, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 480L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImpresionContext extends ParserRuleContext {
		public TerminalNode PR_PRINT() { return getToken(EjerciciosParser.PR_PRINT, 0); }
		public TerminalNode PAR_IZQ() { return getToken(EjerciciosParser.PAR_IZQ, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(EjerciciosParser.PAR_DER, 0); }
		public ImpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impresion; }
	}

	public final ImpresionContext impresion() throws RecognitionException {
		ImpresionContext _localctx = new ImpresionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_impresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(PR_PRINT);
			setState(115);
			match(PAR_IZQ);
			setState(116);
			expresion();
			setState(117);
			match(PAR_DER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EjerciciosParser.ID, 0); }
		public TerminalNode OP_ASIG() { return getToken(EjerciciosParser.OP_ASIG, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(ID);
			setState(120);
			match(OP_ASIG);
			setState(121);
			expresion();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IncrementoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EjerciciosParser.ID, 0); }
		public TerminalNode OP_INCREMENTO() { return getToken(EjerciciosParser.OP_INCREMENTO, 0); }
		public IncrementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incremento; }
	}

	public final IncrementoContext incremento() throws RecognitionException {
		IncrementoContext _localctx = new IncrementoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_incremento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(ID);
			setState(124);
			match(OP_INCREMENTO);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionContext extends ParserRuleContext {
		public Expresion_relacionalContext expresion_relacional() {
			return getRuleContext(Expresion_relacionalContext.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			expresion_relacional();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expresion_relacionalContext extends ParserRuleContext {
		public List<Expresion_aditivaContext> expresion_aditiva() {
			return getRuleContexts(Expresion_aditivaContext.class);
		}
		public Expresion_aditivaContext expresion_aditiva(int i) {
			return getRuleContext(Expresion_aditivaContext.class,i);
		}
		public TerminalNode OP_MAYOR() { return getToken(EjerciciosParser.OP_MAYOR, 0); }
		public TerminalNode OP_MENOR() { return getToken(EjerciciosParser.OP_MENOR, 0); }
		public TerminalNode OP_IGUAL() { return getToken(EjerciciosParser.OP_IGUAL, 0); }
		public TerminalNode OP_MENOR_IGUAL() { return getToken(EjerciciosParser.OP_MENOR_IGUAL, 0); }
		public TerminalNode OP_MAYOR_IGUAL() { return getToken(EjerciciosParser.OP_MAYOR_IGUAL, 0); }
		public Expresion_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_relacional; }
	}

	public final Expresion_relacionalContext expresion_relacional() throws RecognitionException {
		Expresion_relacionalContext _localctx = new Expresion_relacionalContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expresion_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			expresion_aditiva();
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 253952L) != 0)) {
				{
				setState(129);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 253952L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(130);
				expresion_aditiva();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expresion_aditivaContext extends ParserRuleContext {
		public List<TerminoContext> termino() {
			return getRuleContexts(TerminoContext.class);
		}
		public TerminoContext termino(int i) {
			return getRuleContext(TerminoContext.class,i);
		}
		public List<TerminalNode> OP_SUMA() { return getTokens(EjerciciosParser.OP_SUMA); }
		public TerminalNode OP_SUMA(int i) {
			return getToken(EjerciciosParser.OP_SUMA, i);
		}
		public List<TerminalNode> OP_RESTA() { return getTokens(EjerciciosParser.OP_RESTA); }
		public TerminalNode OP_RESTA(int i) {
			return getToken(EjerciciosParser.OP_RESTA, i);
		}
		public Expresion_aditivaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_aditiva; }
	}

	public final Expresion_aditivaContext expresion_aditiva() throws RecognitionException {
		Expresion_aditivaContext _localctx = new Expresion_aditivaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expresion_aditiva);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			termino();
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(134);
					_la = _input.LA(1);
					if ( !(_la==OP_SUMA || _la==OP_RESTA) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(135);
					termino();
					}
					} 
				}
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TerminoContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> OP_MULT() { return getTokens(EjerciciosParser.OP_MULT); }
		public TerminalNode OP_MULT(int i) {
			return getToken(EjerciciosParser.OP_MULT, i);
		}
		public List<TerminalNode> OP_DIV() { return getTokens(EjerciciosParser.OP_DIV); }
		public TerminalNode OP_DIV(int i) {
			return getToken(EjerciciosParser.OP_DIV, i);
		}
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_termino);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			factor();
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_MULT || _la==OP_DIV) {
				{
				{
				setState(142);
				_la = _input.LA(1);
				if ( !(_la==OP_MULT || _la==OP_DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(143);
				factor();
				}
				}
				setState(148);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public TerminalNode ENT() { return getToken(EjerciciosParser.ENT, 0); }
		public TerminalNode FLOT() { return getToken(EjerciciosParser.FLOT, 0); }
		public TerminalNode CADENA() { return getToken(EjerciciosParser.CADENA, 0); }
		public TerminalNode PR_TRUE() { return getToken(EjerciciosParser.PR_TRUE, 0); }
		public TerminalNode PR_FALSE() { return getToken(EjerciciosParser.PR_FALSE, 0); }
		public IncrementoContext incremento() {
			return getRuleContext(IncrementoContext.class,0);
		}
		public TerminalNode ID() { return getToken(EjerciciosParser.ID, 0); }
		public TerminalNode PAR_IZQ() { return getToken(EjerciciosParser.PAR_IZQ, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(EjerciciosParser.PAR_DER, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode OP_SUMA() { return getToken(EjerciciosParser.OP_SUMA, 0); }
		public TerminalNode OP_RESTA() { return getToken(EjerciciosParser.OP_RESTA, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_factor);
		int _la;
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(ENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(FLOT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				match(CADENA);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				match(PR_TRUE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(153);
				match(PR_FALSE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(154);
				incremento();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(155);
				match(ID);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(156);
				match(PAR_IZQ);
				setState(157);
				expresion();
				setState(158);
				match(PAR_DER);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(160);
				_la = _input.LA(1);
				if ( !(_la==OP_SUMA || _la==OP_RESTA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(161);
				factor();
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

	public static final String _serializedATN =
		"\u0004\u0001 \u00a5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0004\u0000"+
		" \b\u0000\u000b\u0000\f\u0000!\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001(\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001,\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u00010\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u00014\b\u0001\u0003\u00016\b\u0001\u0001\u0002\u0001\u0002\u0005"+
		"\u0002:\b\u0002\n\u0002\f\u0002=\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003I\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u0003P\b\u0003\n\u0003\f\u0003S\t"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003W\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004]\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004a\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004f\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005o\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0084\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0005\f\u0089\b\f\n\f\f\f\u008c\t\f\u0001\r\u0001\r\u0001\r"+
		"\u0005\r\u0091\b\r\n\r\f\r\u0094\t\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00a3\b\u000e"+
		"\u0001\u000e\u0000\u0000\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u0000\u0004\u0001\u0000\u0005\b\u0001"+
		"\u0000\r\u0011\u0001\u0000\u0013\u0014\u0001\u0000\u0015\u0016\u00b4\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u00025\u0001\u0000\u0000\u0000\u00047\u0001"+
		"\u0000\u0000\u0000\u0006@\u0001\u0000\u0000\u0000\bX\u0001\u0000\u0000"+
		"\u0000\nj\u0001\u0000\u0000\u0000\fp\u0001\u0000\u0000\u0000\u000er\u0001"+
		"\u0000\u0000\u0000\u0010w\u0001\u0000\u0000\u0000\u0012{\u0001\u0000\u0000"+
		"\u0000\u0014~\u0001\u0000\u0000\u0000\u0016\u0080\u0001\u0000\u0000\u0000"+
		"\u0018\u0085\u0001\u0000\u0000\u0000\u001a\u008d\u0001\u0000\u0000\u0000"+
		"\u001c\u00a2\u0001\u0000\u0000\u0000\u001e \u0003\u0002\u0001\u0000\u001f"+
		"\u001e\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!\u001f\u0001"+
		"\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"\u0001\u0001\u0000\u0000"+
		"\u0000#6\u0003\u0006\u0003\u0000$6\u0003\b\u0004\u0000%\'\u0003\n\u0005"+
		"\u0000&(\u0005\u001b\u0000\u0000\'&\u0001\u0000\u0000\u0000\'(\u0001\u0000"+
		"\u0000\u0000(6\u0001\u0000\u0000\u0000)+\u0003\u000e\u0007\u0000*,\u0005"+
		"\u001b\u0000\u0000+*\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000"+
		",6\u0001\u0000\u0000\u0000-/\u0003\u0010\b\u0000.0\u0005\u001b\u0000\u0000"+
		"/.\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u000006\u0001\u0000\u0000"+
		"\u000013\u0003\u0014\n\u000024\u0005\u001b\u0000\u000032\u0001\u0000\u0000"+
		"\u000034\u0001\u0000\u0000\u000046\u0001\u0000\u0000\u00005#\u0001\u0000"+
		"\u0000\u00005$\u0001\u0000\u0000\u00005%\u0001\u0000\u0000\u00005)\u0001"+
		"\u0000\u0000\u00005-\u0001\u0000\u0000\u000051\u0001\u0000\u0000\u0000"+
		"6\u0003\u0001\u0000\u0000\u00007;\u0005\u0019\u0000\u00008:\u0003\u0002"+
		"\u0001\u000098\u0001\u0000\u0000\u0000:=\u0001\u0000\u0000\u0000;9\u0001"+
		"\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<>\u0001\u0000\u0000\u0000"+
		"=;\u0001\u0000\u0000\u0000>?\u0005\u001a\u0000\u0000?\u0005\u0001\u0000"+
		"\u0000\u0000@A\u0005\u0001\u0000\u0000AB\u0005\u0017\u0000\u0000BC\u0003"+
		"\u0014\n\u0000CD\u0005\u0018\u0000\u0000DQ\u0003\u0004\u0002\u0000EI\u0005"+
		"\u0002\u0000\u0000FG\u0005\u0003\u0000\u0000GI\u0005\u0001\u0000\u0000"+
		"HE\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000"+
		"\u0000JK\u0005\u0017\u0000\u0000KL\u0003\u0014\n\u0000LM\u0005\u0018\u0000"+
		"\u0000MN\u0003\u0004\u0002\u0000NP\u0001\u0000\u0000\u0000OH\u0001\u0000"+
		"\u0000\u0000PS\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001"+
		"\u0000\u0000\u0000RV\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000"+
		"TU\u0005\u0003\u0000\u0000UW\u0003\u0004\u0002\u0000VT\u0001\u0000\u0000"+
		"\u0000VW\u0001\u0000\u0000\u0000W\u0007\u0001\u0000\u0000\u0000XY\u0005"+
		"\u0004\u0000\u0000Y\\\u0005\u0017\u0000\u0000Z]\u0003\n\u0005\u0000[]"+
		"\u0003\u0010\b\u0000\\Z\u0001\u0000\u0000\u0000\\[\u0001\u0000\u0000\u0000"+
		"\\]\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^`\u0005\u001b\u0000"+
		"\u0000_a\u0003\u0014\n\u0000`_\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000"+
		"\u0000ab\u0001\u0000\u0000\u0000be\u0005\u001b\u0000\u0000cf\u0003\u0010"+
		"\b\u0000df\u0003\u0012\t\u0000ec\u0001\u0000\u0000\u0000ed\u0001\u0000"+
		"\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gh\u0005"+
		"\u0018\u0000\u0000hi\u0003\u0004\u0002\u0000i\t\u0001\u0000\u0000\u0000"+
		"jk\u0003\f\u0006\u0000kn\u0005\u001f\u0000\u0000lm\u0005\f\u0000\u0000"+
		"mo\u0003\u0014\n\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000"+
		"o\u000b\u0001\u0000\u0000\u0000pq\u0007\u0000\u0000\u0000q\r\u0001\u0000"+
		"\u0000\u0000rs\u0005\t\u0000\u0000st\u0005\u0017\u0000\u0000tu\u0003\u0014"+
		"\n\u0000uv\u0005\u0018\u0000\u0000v\u000f\u0001\u0000\u0000\u0000wx\u0005"+
		"\u001f\u0000\u0000xy\u0005\f\u0000\u0000yz\u0003\u0014\n\u0000z\u0011"+
		"\u0001\u0000\u0000\u0000{|\u0005\u001f\u0000\u0000|}\u0005\u0012\u0000"+
		"\u0000}\u0013\u0001\u0000\u0000\u0000~\u007f\u0003\u0016\u000b\u0000\u007f"+
		"\u0015\u0001\u0000\u0000\u0000\u0080\u0083\u0003\u0018\f\u0000\u0081\u0082"+
		"\u0007\u0001\u0000\u0000\u0082\u0084\u0003\u0018\f\u0000\u0083\u0081\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0017\u0001"+
		"\u0000\u0000\u0000\u0085\u008a\u0003\u001a\r\u0000\u0086\u0087\u0007\u0002"+
		"\u0000\u0000\u0087\u0089\u0003\u001a\r\u0000\u0088\u0086\u0001\u0000\u0000"+
		"\u0000\u0089\u008c\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u0019\u0001\u0000\u0000"+
		"\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008d\u0092\u0003\u001c\u000e"+
		"\u0000\u008e\u008f\u0007\u0003\u0000\u0000\u008f\u0091\u0003\u001c\u000e"+
		"\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0091\u0094\u0001\u0000\u0000"+
		"\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000"+
		"\u0000\u0093\u001b\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000"+
		"\u0000\u0095\u00a3\u0005\u001c\u0000\u0000\u0096\u00a3\u0005\u001d\u0000"+
		"\u0000\u0097\u00a3\u0005\u001e\u0000\u0000\u0098\u00a3\u0005\n\u0000\u0000"+
		"\u0099\u00a3\u0005\u000b\u0000\u0000\u009a\u00a3\u0003\u0012\t\u0000\u009b"+
		"\u00a3\u0005\u001f\u0000\u0000\u009c\u009d\u0005\u0017\u0000\u0000\u009d"+
		"\u009e\u0003\u0014\n\u0000\u009e\u009f\u0005\u0018\u0000\u0000\u009f\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a1\u0007\u0002\u0000\u0000\u00a1\u00a3"+
		"\u0003\u001c\u000e\u0000\u00a2\u0095\u0001\u0000\u0000\u0000\u00a2\u0096"+
		"\u0001\u0000\u0000\u0000\u00a2\u0097\u0001\u0000\u0000\u0000\u00a2\u0098"+
		"\u0001\u0000\u0000\u0000\u00a2\u0099\u0001\u0000\u0000\u0000\u00a2\u009a"+
		"\u0001\u0000\u0000\u0000\u00a2\u009b\u0001\u0000\u0000\u0000\u00a2\u009c"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a3\u001d"+
		"\u0001\u0000\u0000\u0000\u0012!\'+/35;HQV\\`en\u0083\u008a\u0092\u00a2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}