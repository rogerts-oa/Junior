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
		RULE_programa = 0, RULE_individual = 1, RULE_instruccion = 2, RULE_bloque = 3, 
		RULE_sentencia_if = 4, RULE_sentencia_for = 5, RULE_declaracion = 6, RULE_tipo = 7, 
		RULE_impresion = 8, RULE_asignacion = 9, RULE_incremento = 10, RULE_expresion = 11, 
		RULE_expresion_relacional = 12, RULE_expresion_aditiva = 13, RULE_termino = 14, 
		RULE_factor = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "individual", "instruccion", "bloque", "sentencia_if", "sentencia_for", 
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
		public TerminalNode EOF() { return getToken(EjerciciosParser.EOF, 0); }
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
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32);
				instruccion();
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4036497394L) != 0) );
			setState(37);
			match(EOF);
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
	public static class IndividualContext extends ParserRuleContext {
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(EjerciciosParser.EOF, 0); }
		public IndividualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_individual; }
	}

	public final IndividualContext individual() throws RecognitionException {
		IndividualContext _localctx = new IndividualContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_individual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			instruccion();
			setState(40);
			match(EOF);
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
		enterRule(_localctx, 4, RULE_instruccion);
		int _la;
		try {
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				sentencia_if();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				sentencia_for();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				declaracion();
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUN_COMA) {
					{
					setState(45);
					match(PUN_COMA);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(48);
				impresion();
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUN_COMA) {
					{
					setState(49);
					match(PUN_COMA);
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(52);
				asignacion();
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUN_COMA) {
					{
					setState(53);
					match(PUN_COMA);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(56);
				expresion();
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUN_COMA) {
					{
					setState(57);
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
		enterRule(_localctx, 6, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(LLAVE_IZQ);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4036497394L) != 0)) {
				{
				{
				setState(63);
				instruccion();
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
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
		enterRule(_localctx, 8, RULE_sentencia_if);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(PR_IF);
			setState(72);
			match(PAR_IZQ);
			setState(73);
			expresion();
			setState(74);
			match(PAR_DER);
			setState(75);
			bloque();
			setState(88);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(79);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case PR_ELSE_IF:
						{
						setState(76);
						match(PR_ELSE_IF);
						}
						break;
					case PR_ELSE:
						{
						setState(77);
						match(PR_ELSE);
						setState(78);
						match(PR_IF);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(81);
					match(PAR_IZQ);
					setState(82);
					expresion();
					setState(83);
					match(PAR_DER);
					setState(84);
					bloque();
					}
					} 
				}
				setState(90);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PR_ELSE) {
				{
				setState(91);
				match(PR_ELSE);
				setState(92);
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
		enterRule(_localctx, 10, RULE_sentencia_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(PR_FOR);
			setState(96);
			match(PAR_IZQ);
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PR_INT:
			case PR_FLOAT:
			case PR_BOOL:
			case PR_STR:
				{
				setState(97);
				declaracion();
				}
				break;
			case ID:
				{
				setState(98);
				asignacion();
				}
				break;
			case PUN_COMA:
				break;
			default:
				break;
			}
			setState(101);
			match(PUN_COMA);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4036496384L) != 0)) {
				{
				setState(102);
				expresion();
				}
			}

			setState(105);
			match(PUN_COMA);
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(106);
				asignacion();
				}
				break;
			case 2:
				{
				setState(107);
				incremento();
				}
				break;
			}
			setState(110);
			match(PAR_DER);
			setState(111);
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
		enterRule(_localctx, 12, RULE_declaracion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			tipo();
			setState(114);
			match(ID);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ASIG) {
				{
				setState(115);
				match(OP_ASIG);
				setState(116);
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
		enterRule(_localctx, 14, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
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
		enterRule(_localctx, 16, RULE_impresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(PR_PRINT);
			setState(122);
			match(PAR_IZQ);
			setState(123);
			expresion();
			setState(124);
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
		enterRule(_localctx, 18, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(ID);
			setState(127);
			match(OP_ASIG);
			setState(128);
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
		enterRule(_localctx, 20, RULE_incremento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(ID);
			setState(131);
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
		enterRule(_localctx, 22, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
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
		enterRule(_localctx, 24, RULE_expresion_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			expresion_aditiva();
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 253952L) != 0)) {
				{
				setState(136);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 253952L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(137);
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
		enterRule(_localctx, 26, RULE_expresion_aditiva);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			termino();
			setState(145);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(141);
					_la = _input.LA(1);
					if ( !(_la==OP_SUMA || _la==OP_RESTA) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(142);
					termino();
					}
					} 
				}
				setState(147);
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
		enterRule(_localctx, 28, RULE_termino);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			factor();
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_MULT || _la==OP_DIV) {
				{
				{
				setState(149);
				_la = _input.LA(1);
				if ( !(_la==OP_MULT || _la==OP_DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(150);
				factor();
				}
				}
				setState(155);
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
		enterRule(_localctx, 30, RULE_factor);
		int _la;
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				match(ENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				match(FLOT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				match(CADENA);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
				match(PR_TRUE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(160);
				match(PR_FALSE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(161);
				incremento();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(162);
				match(ID);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(163);
				match(PAR_IZQ);
				setState(164);
				expresion();
				setState(165);
				match(PAR_DER);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(167);
				_la = _input.LA(1);
				if ( !(_la==OP_SUMA || _la==OP_RESTA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(168);
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
		"\u0004\u0001 \u00ac\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0001\u0000\u0004\u0000\"\b\u0000\u000b\u0000\f\u0000#\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002/\b\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u00023\b\u0002\u0001\u0002\u0001\u0002\u0003\u00027\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002;\b\u0002\u0003\u0002=\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0005\u0003A\b\u0003\n\u0003\f\u0003D\t\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004P\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004W\b\u0004\n\u0004"+
		"\f\u0004Z\t\u0004\u0001\u0004\u0001\u0004\u0003\u0004^\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005d\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005h\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005m\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006v\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u008b\b\f\u0001\r\u0001\r\u0001\r\u0005\r\u0090\b\r"+
		"\n\r\f\r\u0093\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0098"+
		"\b\u000e\n\u000e\f\u000e\u009b\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00aa\b\u000f"+
		"\u0001\u000f\u0000\u0000\u0010\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0000\u0004\u0001\u0000\u0005"+
		"\b\u0001\u0000\r\u0011\u0001\u0000\u0013\u0014\u0001\u0000\u0015\u0016"+
		"\u00ba\u0000!\u0001\u0000\u0000\u0000\u0002\'\u0001\u0000\u0000\u0000"+
		"\u0004<\u0001\u0000\u0000\u0000\u0006>\u0001\u0000\u0000\u0000\bG\u0001"+
		"\u0000\u0000\u0000\n_\u0001\u0000\u0000\u0000\fq\u0001\u0000\u0000\u0000"+
		"\u000ew\u0001\u0000\u0000\u0000\u0010y\u0001\u0000\u0000\u0000\u0012~"+
		"\u0001\u0000\u0000\u0000\u0014\u0082\u0001\u0000\u0000\u0000\u0016\u0085"+
		"\u0001\u0000\u0000\u0000\u0018\u0087\u0001\u0000\u0000\u0000\u001a\u008c"+
		"\u0001\u0000\u0000\u0000\u001c\u0094\u0001\u0000\u0000\u0000\u001e\u00a9"+
		"\u0001\u0000\u0000\u0000 \"\u0003\u0004\u0002\u0000! \u0001\u0000\u0000"+
		"\u0000\"#\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000#$\u0001\u0000"+
		"\u0000\u0000$%\u0001\u0000\u0000\u0000%&\u0005\u0000\u0000\u0001&\u0001"+
		"\u0001\u0000\u0000\u0000\'(\u0003\u0004\u0002\u0000()\u0005\u0000\u0000"+
		"\u0001)\u0003\u0001\u0000\u0000\u0000*=\u0003\b\u0004\u0000+=\u0003\n"+
		"\u0005\u0000,.\u0003\f\u0006\u0000-/\u0005\u001b\u0000\u0000.-\u0001\u0000"+
		"\u0000\u0000./\u0001\u0000\u0000\u0000/=\u0001\u0000\u0000\u000002\u0003"+
		"\u0010\b\u000013\u0005\u001b\u0000\u000021\u0001\u0000\u0000\u000023\u0001"+
		"\u0000\u0000\u00003=\u0001\u0000\u0000\u000046\u0003\u0012\t\u000057\u0005"+
		"\u001b\u0000\u000065\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u0000"+
		"7=\u0001\u0000\u0000\u00008:\u0003\u0016\u000b\u00009;\u0005\u001b\u0000"+
		"\u0000:9\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;=\u0001\u0000"+
		"\u0000\u0000<*\u0001\u0000\u0000\u0000<+\u0001\u0000\u0000\u0000<,\u0001"+
		"\u0000\u0000\u0000<0\u0001\u0000\u0000\u0000<4\u0001\u0000\u0000\u0000"+
		"<8\u0001\u0000\u0000\u0000=\u0005\u0001\u0000\u0000\u0000>B\u0005\u0019"+
		"\u0000\u0000?A\u0003\u0004\u0002\u0000@?\u0001\u0000\u0000\u0000AD\u0001"+
		"\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000"+
		"CE\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000EF\u0005\u001a\u0000"+
		"\u0000F\u0007\u0001\u0000\u0000\u0000GH\u0005\u0001\u0000\u0000HI\u0005"+
		"\u0017\u0000\u0000IJ\u0003\u0016\u000b\u0000JK\u0005\u0018\u0000\u0000"+
		"KX\u0003\u0006\u0003\u0000LP\u0005\u0002\u0000\u0000MN\u0005\u0003\u0000"+
		"\u0000NP\u0005\u0001\u0000\u0000OL\u0001\u0000\u0000\u0000OM\u0001\u0000"+
		"\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0005\u0017\u0000\u0000RS\u0003"+
		"\u0016\u000b\u0000ST\u0005\u0018\u0000\u0000TU\u0003\u0006\u0003\u0000"+
		"UW\u0001\u0000\u0000\u0000VO\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000"+
		"\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y]\u0001\u0000"+
		"\u0000\u0000ZX\u0001\u0000\u0000\u0000[\\\u0005\u0003\u0000\u0000\\^\u0003"+
		"\u0006\u0003\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000"+
		"^\t\u0001\u0000\u0000\u0000_`\u0005\u0004\u0000\u0000`c\u0005\u0017\u0000"+
		"\u0000ad\u0003\f\u0006\u0000bd\u0003\u0012\t\u0000ca\u0001\u0000\u0000"+
		"\u0000cb\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000de\u0001\u0000"+
		"\u0000\u0000eg\u0005\u001b\u0000\u0000fh\u0003\u0016\u000b\u0000gf\u0001"+
		"\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000"+
		"il\u0005\u001b\u0000\u0000jm\u0003\u0012\t\u0000km\u0003\u0014\n\u0000"+
		"lj\u0001\u0000\u0000\u0000lk\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000"+
		"\u0000mn\u0001\u0000\u0000\u0000no\u0005\u0018\u0000\u0000op\u0003\u0006"+
		"\u0003\u0000p\u000b\u0001\u0000\u0000\u0000qr\u0003\u000e\u0007\u0000"+
		"ru\u0005\u001f\u0000\u0000st\u0005\f\u0000\u0000tv\u0003\u0016\u000b\u0000"+
		"us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000v\r\u0001\u0000\u0000"+
		"\u0000wx\u0007\u0000\u0000\u0000x\u000f\u0001\u0000\u0000\u0000yz\u0005"+
		"\t\u0000\u0000z{\u0005\u0017\u0000\u0000{|\u0003\u0016\u000b\u0000|}\u0005"+
		"\u0018\u0000\u0000}\u0011\u0001\u0000\u0000\u0000~\u007f\u0005\u001f\u0000"+
		"\u0000\u007f\u0080\u0005\f\u0000\u0000\u0080\u0081\u0003\u0016\u000b\u0000"+
		"\u0081\u0013\u0001\u0000\u0000\u0000\u0082\u0083\u0005\u001f\u0000\u0000"+
		"\u0083\u0084\u0005\u0012\u0000\u0000\u0084\u0015\u0001\u0000\u0000\u0000"+
		"\u0085\u0086\u0003\u0018\f\u0000\u0086\u0017\u0001\u0000\u0000\u0000\u0087"+
		"\u008a\u0003\u001a\r\u0000\u0088\u0089\u0007\u0001\u0000\u0000\u0089\u008b"+
		"\u0003\u001a\r\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001"+
		"\u0000\u0000\u0000\u008b\u0019\u0001\u0000\u0000\u0000\u008c\u0091\u0003"+
		"\u001c\u000e\u0000\u008d\u008e\u0007\u0002\u0000\u0000\u008e\u0090\u0003"+
		"\u001c\u000e\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u0090\u0093\u0001"+
		"\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001"+
		"\u0000\u0000\u0000\u0092\u001b\u0001\u0000\u0000\u0000\u0093\u0091\u0001"+
		"\u0000\u0000\u0000\u0094\u0099\u0003\u001e\u000f\u0000\u0095\u0096\u0007"+
		"\u0003\u0000\u0000\u0096\u0098\u0003\u001e\u000f\u0000\u0097\u0095\u0001"+
		"\u0000\u0000\u0000\u0098\u009b\u0001\u0000\u0000\u0000\u0099\u0097\u0001"+
		"\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u001d\u0001"+
		"\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009c\u00aa\u0005"+
		"\u001c\u0000\u0000\u009d\u00aa\u0005\u001d\u0000\u0000\u009e\u00aa\u0005"+
		"\u001e\u0000\u0000\u009f\u00aa\u0005\n\u0000\u0000\u00a0\u00aa\u0005\u000b"+
		"\u0000\u0000\u00a1\u00aa\u0003\u0014\n\u0000\u00a2\u00aa\u0005\u001f\u0000"+
		"\u0000\u00a3\u00a4\u0005\u0017\u0000\u0000\u00a4\u00a5\u0003\u0016\u000b"+
		"\u0000\u00a5\u00a6\u0005\u0018\u0000\u0000\u00a6\u00aa\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a8\u0007\u0002\u0000\u0000\u00a8\u00aa\u0003\u001e\u000f"+
		"\u0000\u00a9\u009c\u0001\u0000\u0000\u0000\u00a9\u009d\u0001\u0000\u0000"+
		"\u0000\u00a9\u009e\u0001\u0000\u0000\u0000\u00a9\u009f\u0001\u0000\u0000"+
		"\u0000\u00a9\u00a0\u0001\u0000\u0000\u0000\u00a9\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a9\u00a2\u0001\u0000\u0000\u0000\u00a9\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa\u001f\u0001\u0000\u0000"+
		"\u0000\u0012#.26:<BOX]cglu\u008a\u0091\u0099\u00a9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}