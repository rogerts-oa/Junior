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
		PR_IF=1, OP_ASIG=2, OP_MAYOR=3, OP_SUMA=4, OP_RESTA=5, OP_MULT=6, OP_DIV=7, 
		PAR_IZQ=8, PAR_DER=9, LLAVE_IZQ=10, LLAVE_DER=11, PUN_COMA=12, ENT=13, 
		ID=14, WS=15;
	public static final int
		RULE_programa = 0, RULE_individual = 1, RULE_instruccion = 2, RULE_sentencia_if = 3, 
		RULE_asignacion = 4, RULE_expresion = 5, RULE_expresion_relacional = 6, 
		RULE_expresion_aditiva = 7, RULE_termino = 8, RULE_factor = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "individual", "instruccion", "sentencia_if", "asignacion", 
			"expresion", "expresion_relacional", "expresion_aditiva", "termino", 
			"factor"
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
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(20);
				instruccion();
				}
				}
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 24834L) != 0) );
			setState(25);
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
			setState(27);
			instruccion();
			setState(28);
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
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public TerminalNode PUN_COMA() { return getToken(EjerciciosParser.PUN_COMA, 0); }
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
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				sentencia_if();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				asignacion();
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUN_COMA) {
					{
					setState(32);
					match(PUN_COMA);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				expresion();
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUN_COMA) {
					{
					setState(36);
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
	public static class Sentencia_ifContext extends ParserRuleContext {
		public TerminalNode PR_IF() { return getToken(EjerciciosParser.PR_IF, 0); }
		public TerminalNode PAR_IZQ() { return getToken(EjerciciosParser.PAR_IZQ, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(EjerciciosParser.PAR_DER, 0); }
		public TerminalNode LLAVE_IZQ() { return getToken(EjerciciosParser.LLAVE_IZQ, 0); }
		public TerminalNode LLAVE_DER() { return getToken(EjerciciosParser.LLAVE_DER, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(PR_IF);
			setState(42);
			match(PAR_IZQ);
			setState(43);
			expresion();
			setState(44);
			match(PAR_DER);
			setState(45);
			match(LLAVE_IZQ);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 24834L) != 0)) {
				{
				{
				setState(46);
				instruccion();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
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
		enterRule(_localctx, 8, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(ID);
			setState(55);
			match(OP_ASIG);
			setState(56);
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
		enterRule(_localctx, 10, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
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
		public Expresion_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_relacional; }
	}

	public final Expresion_relacionalContext expresion_relacional() throws RecognitionException {
		Expresion_relacionalContext _localctx = new Expresion_relacionalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expresion_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			expresion_aditiva();
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_MAYOR) {
				{
				setState(61);
				match(OP_MAYOR);
				setState(62);
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
		enterRule(_localctx, 14, RULE_expresion_aditiva);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			termino();
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_SUMA || _la==OP_RESTA) {
				{
				{
				setState(66);
				_la = _input.LA(1);
				if ( !(_la==OP_SUMA || _la==OP_RESTA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(67);
				termino();
				}
				}
				setState(72);
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
		enterRule(_localctx, 16, RULE_termino);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			factor();
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_MULT || _la==OP_DIV) {
				{
				{
				setState(74);
				_la = _input.LA(1);
				if ( !(_la==OP_MULT || _la==OP_DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(75);
				factor();
				}
				}
				setState(80);
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
		public TerminalNode ID() { return getToken(EjerciciosParser.ID, 0); }
		public TerminalNode PAR_IZQ() { return getToken(EjerciciosParser.PAR_IZQ, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(EjerciciosParser.PAR_DER, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_factor);
		try {
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				match(ENT);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				match(ID);
				}
				break;
			case PAR_IZQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				match(PAR_IZQ);
				setState(84);
				expresion();
				setState(85);
				match(PAR_DER);
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

	public static final String _serializedATN =
		"\u0004\u0001\u000fZ\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0004\u0000\u0016\b\u0000\u000b"+
		"\u0000\f\u0000\u0017\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\"\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002&\b\u0002\u0003\u0002(\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"0\b\u0003\n\u0003\f\u00033\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006@\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007E\b\u0007\n\u0007\f\u0007H\t\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0005\bM\b\b\n\b\f\bP\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\tX\b\t\u0001\t\u0000\u0000\n\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0000\u0002\u0001\u0000\u0004\u0005\u0001\u0000"+
		"\u0006\u0007Z\u0000\u0015\u0001\u0000\u0000\u0000\u0002\u001b\u0001\u0000"+
		"\u0000\u0000\u0004\'\u0001\u0000\u0000\u0000\u0006)\u0001\u0000\u0000"+
		"\u0000\b6\u0001\u0000\u0000\u0000\n:\u0001\u0000\u0000\u0000\f<\u0001"+
		"\u0000\u0000\u0000\u000eA\u0001\u0000\u0000\u0000\u0010I\u0001\u0000\u0000"+
		"\u0000\u0012W\u0001\u0000\u0000\u0000\u0014\u0016\u0003\u0004\u0002\u0000"+
		"\u0015\u0014\u0001\u0000\u0000\u0000\u0016\u0017\u0001\u0000\u0000\u0000"+
		"\u0017\u0015\u0001\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000\u0000"+
		"\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u001a\u0005\u0000\u0000\u0001"+
		"\u001a\u0001\u0001\u0000\u0000\u0000\u001b\u001c\u0003\u0004\u0002\u0000"+
		"\u001c\u001d\u0005\u0000\u0000\u0001\u001d\u0003\u0001\u0000\u0000\u0000"+
		"\u001e(\u0003\u0006\u0003\u0000\u001f!\u0003\b\u0004\u0000 \"\u0005\f"+
		"\u0000\u0000! \u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"(\u0001"+
		"\u0000\u0000\u0000#%\u0003\n\u0005\u0000$&\u0005\f\u0000\u0000%$\u0001"+
		"\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&(\u0001\u0000\u0000\u0000"+
		"\'\u001e\u0001\u0000\u0000\u0000\'\u001f\u0001\u0000\u0000\u0000\'#\u0001"+
		"\u0000\u0000\u0000(\u0005\u0001\u0000\u0000\u0000)*\u0005\u0001\u0000"+
		"\u0000*+\u0005\b\u0000\u0000+,\u0003\n\u0005\u0000,-\u0005\t\u0000\u0000"+
		"-1\u0005\n\u0000\u0000.0\u0003\u0004\u0002\u0000/.\u0001\u0000\u0000\u0000"+
		"03\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000012\u0001\u0000\u0000"+
		"\u000024\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000045\u0005\u000b"+
		"\u0000\u00005\u0007\u0001\u0000\u0000\u000067\u0005\u000e\u0000\u0000"+
		"78\u0005\u0002\u0000\u000089\u0003\n\u0005\u00009\t\u0001\u0000\u0000"+
		"\u0000:;\u0003\f\u0006\u0000;\u000b\u0001\u0000\u0000\u0000<?\u0003\u000e"+
		"\u0007\u0000=>\u0005\u0003\u0000\u0000>@\u0003\u000e\u0007\u0000?=\u0001"+
		"\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@\r\u0001\u0000\u0000\u0000"+
		"AF\u0003\u0010\b\u0000BC\u0007\u0000\u0000\u0000CE\u0003\u0010\b\u0000"+
		"DB\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000"+
		"\u0000FG\u0001\u0000\u0000\u0000G\u000f\u0001\u0000\u0000\u0000HF\u0001"+
		"\u0000\u0000\u0000IN\u0003\u0012\t\u0000JK\u0007\u0001\u0000\u0000KM\u0003"+
		"\u0012\t\u0000LJ\u0001\u0000\u0000\u0000MP\u0001\u0000\u0000\u0000NL\u0001"+
		"\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000O\u0011\u0001\u0000\u0000"+
		"\u0000PN\u0001\u0000\u0000\u0000QX\u0005\r\u0000\u0000RX\u0005\u000e\u0000"+
		"\u0000ST\u0005\b\u0000\u0000TU\u0003\n\u0005\u0000UV\u0005\t\u0000\u0000"+
		"VX\u0001\u0000\u0000\u0000WQ\u0001\u0000\u0000\u0000WR\u0001\u0000\u0000"+
		"\u0000WS\u0001\u0000\u0000\u0000X\u0013\u0001\u0000\u0000\u0000\t\u0017"+
		"!%\'1?FNW";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}