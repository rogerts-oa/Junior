// Generated from com/junior/Ejercicios.g4 by ANTLR 4.9.2
package com.junior;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EjerciciosParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EjerciciosListener ) ((EjerciciosListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EjerciciosListener ) ((EjerciciosListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EjerciciosVisitor ) return ((EjerciciosVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PR_IF) | (1L << PR_FOR) | (1L << PR_INT) | (1L << PR_FLOAT) | (1L << PR_BOOL) | (1L << PR_STR) | (1L << PR_PRINT) | (1L << PR_TRUE) | (1L << PR_FALSE) | (1L << OP_SUMA) | (1L << OP_RESTA) | (1L << PAR_IZQ) | (1L << ENT) | (1L << FLOT) | (1L << CADENA) | (1L << ID))) != 0) );
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

	public static class IndividualContext extends ParserRuleContext {
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(EjerciciosParser.EOF, 0); }
		public IndividualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_individual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EjerciciosListener ) ((EjerciciosListener)listener).enterIndividual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EjerciciosListener ) ((EjerciciosListener)listener).exitIndividual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EjerciciosVisitor ) return ((EjerciciosVisitor<? extends T>)visitor).visitIndividual(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EjerciciosListener ) ((EjerciciosListener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EjerciciosListener ) ((EjerciciosListener)listener).exitInstruccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EjerciciosVisitor ) return ((EjerciciosVisitor<? extends T>)visitor).visitInstruccion(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EjerciciosListener ) ((EjerciciosListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EjerciciosListener ) ((EjerciciosListener)listener).exitBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EjerciciosVisitor ) return ((EjerciciosVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PR_IF) | (1L << PR_FOR) | (1L << PR_INT) | (1L << PR_FLOAT) | (1L << PR_BOOL) | (1L << PR_STR) | (1L << PR_PRINT) | (1L << PR_TRUE) | (1L << PR_FALSE) | (1L << OP_SUMA) | (1L << OP_RESTA) | (1L << PAR_IZQ) | (1L << ENT) | (1L << FLOT) | (1L << CADENA) | (1L << ID))) != 0)) {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EjerciciosListener ) ((EjerciciosListener)listener).enterSentencia_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EjerciciosListener ) ((EjerciciosListener)listener).exitSentencia_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EjerciciosVisitor ) return ((EjerciciosVisitor<? extends T>)visitor).visitSentencia_if(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EjerciciosListener ) ((EjerciciosListener)listener).enterSentencia_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EjerciciosListener ) ((EjerciciosListener)listener).exitSentencia_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EjerciciosVisitor ) return ((EjerciciosVisitor<? extends T>)visitor).visitSentencia_for(this);
			else return visitor.visitChildren(this);
		}
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PR_TRUE) | (1L << PR_FALSE) | (1L << OP_SUMA) | (1L << OP_RESTA) | (1L << PAR_IZQ) | (1L << ENT) | (1L << FLOT) | (1L << CADENA) | (1L << ID))) != 0)) {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EjerciciosListener ) ((EjerciciosListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EjerciciosListener ) ((EjerciciosListener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EjerciciosVisitor ) return ((EjerciciosVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode PR_INT() { return getToken(EjerciciosParser.PR_INT, 0); }
		public TerminalNode PR_FLOAT() { return getToken(EjerciciosParser.PR_FLOAT, 0); }
		public TerminalNode PR_BOOL() { return getToken(EjerciciosParser.PR_BOOL, 0); }
		public TerminalNode PR_STR() { return getToken(EjerciciosParser.PR_STR, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EjerciciosListener ) ((EjerciciosListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EjerciciosListener ) ((EjerciciosListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EjerciciosVisitor ) return ((EjerciciosVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PR_INT) | (1L << PR_FLOAT) | (1L << PR_BOOL) | (1L << PR_STR))) != 0)) ) {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EjerciciosListener ) ((EjerciciosListener)listener).enterImpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EjerciciosListener ) ((EjerciciosListener)listener).exitImpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EjerciciosVisitor ) return ((EjerciciosVisitor<? extends T>)visitor).visitImpresion(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EjerciciosListener ) ((EjerciciosListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EjerciciosListener ) ((EjerciciosListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EjerciciosVisitor ) return ((EjerciciosVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
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

	public static class IncrementoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EjerciciosParser.ID, 0); }
		public TerminalNode OP_INCREMENTO() { return getToken(EjerciciosParser.OP_INCREMENTO, 0); }
		public IncrementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incremento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EjerciciosListener ) ((EjerciciosListener)listener).enterIncremento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EjerciciosListener ) ((EjerciciosListener)listener).exitIncremento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EjerciciosVisitor ) return ((EjerciciosVisitor<? extends T>)visitor).visitIncremento(this);
			else return visitor.visitChildren(this);
		}
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

	public static class ExpresionContext extends ParserRuleContext {
		public Expresion_relacionalContext expresion_relacional() {
			return getRuleContext(Expresion_relacionalContext.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EjerciciosListener ) ((EjerciciosListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EjerciciosListener ) ((EjerciciosListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EjerciciosVisitor ) return ((EjerciciosVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EjerciciosListener ) ((EjerciciosListener)listener).enterExpresion_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EjerciciosListener ) ((EjerciciosListener)listener).exitExpresion_relacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EjerciciosVisitor ) return ((EjerciciosVisitor<? extends T>)visitor).visitExpresion_relacional(this);
			else return visitor.visitChildren(this);
		}
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_MAYOR) | (1L << OP_MENOR) | (1L << OP_IGUAL) | (1L << OP_MENOR_IGUAL) | (1L << OP_MAYOR_IGUAL))) != 0)) {
				{
				setState(136);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_MAYOR) | (1L << OP_MENOR) | (1L << OP_IGUAL) | (1L << OP_MENOR_IGUAL) | (1L << OP_MAYOR_IGUAL))) != 0)) ) {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EjerciciosListener ) ((EjerciciosListener)listener).enterExpresion_aditiva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EjerciciosListener ) ((EjerciciosListener)listener).exitExpresion_aditiva(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EjerciciosVisitor ) return ((EjerciciosVisitor<? extends T>)visitor).visitExpresion_aditiva(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EjerciciosListener ) ((EjerciciosListener)listener).enterTermino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EjerciciosListener ) ((EjerciciosListener)listener).exitTermino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EjerciciosVisitor ) return ((EjerciciosVisitor<? extends T>)visitor).visitTermino(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EjerciciosListener ) ((EjerciciosListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EjerciciosListener ) ((EjerciciosListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EjerciciosVisitor ) return ((EjerciciosVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u00ae\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\6\2$\n"+
		"\2\r\2\16\2%\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4\61\n\4\3\4\3\4\5"+
		"\4\65\n\4\3\4\3\4\5\49\n\4\3\4\3\4\5\4=\n\4\5\4?\n\4\3\5\3\5\7\5C\n\5"+
		"\f\5\16\5F\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6R\n\6\3\6\3"+
		"\6\3\6\3\6\3\6\7\6Y\n\6\f\6\16\6\\\13\6\3\6\3\6\5\6`\n\6\3\7\3\7\3\7\3"+
		"\7\5\7f\n\7\3\7\3\7\5\7j\n\7\3\7\3\7\3\7\5\7o\n\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\5\bx\n\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\16\5\16\u008d\n\16\3\17\3\17\3\17\7\17\u0092"+
		"\n\17\f\17\16\17\u0095\13\17\3\20\3\20\3\20\7\20\u009a\n\20\f\20\16\20"+
		"\u009d\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\5\21\u00ac\n\21\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \2\6\3\2\7\n\3\2\17\23\3\2\25\26\3\2\27\30\2\u00bc\2#\3\2\2\2\4"+
		")\3\2\2\2\6>\3\2\2\2\b@\3\2\2\2\nI\3\2\2\2\fa\3\2\2\2\16s\3\2\2\2\20y"+
		"\3\2\2\2\22{\3\2\2\2\24\u0080\3\2\2\2\26\u0084\3\2\2\2\30\u0087\3\2\2"+
		"\2\32\u0089\3\2\2\2\34\u008e\3\2\2\2\36\u0096\3\2\2\2 \u00ab\3\2\2\2\""+
		"$\5\6\4\2#\"\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\'\3\2\2\2\'(\7\2\2"+
		"\3(\3\3\2\2\2)*\5\6\4\2*+\7\2\2\3+\5\3\2\2\2,?\5\n\6\2-?\5\f\7\2.\60\5"+
		"\16\b\2/\61\7\35\2\2\60/\3\2\2\2\60\61\3\2\2\2\61?\3\2\2\2\62\64\5\22"+
		"\n\2\63\65\7\35\2\2\64\63\3\2\2\2\64\65\3\2\2\2\65?\3\2\2\2\668\5\24\13"+
		"\2\679\7\35\2\28\67\3\2\2\289\3\2\2\29?\3\2\2\2:<\5\30\r\2;=\7\35\2\2"+
		"<;\3\2\2\2<=\3\2\2\2=?\3\2\2\2>,\3\2\2\2>-\3\2\2\2>.\3\2\2\2>\62\3\2\2"+
		"\2>\66\3\2\2\2>:\3\2\2\2?\7\3\2\2\2@D\7\33\2\2AC\5\6\4\2BA\3\2\2\2CF\3"+
		"\2\2\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2FD\3\2\2\2GH\7\34\2\2H\t\3\2\2\2I"+
		"J\7\3\2\2JK\7\31\2\2KL\5\30\r\2LM\7\32\2\2MZ\5\b\5\2NR\7\4\2\2OP\7\5\2"+
		"\2PR\7\3\2\2QN\3\2\2\2QO\3\2\2\2RS\3\2\2\2ST\7\31\2\2TU\5\30\r\2UV\7\32"+
		"\2\2VW\5\b\5\2WY\3\2\2\2XQ\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[_\3"+
		"\2\2\2\\Z\3\2\2\2]^\7\5\2\2^`\5\b\5\2_]\3\2\2\2_`\3\2\2\2`\13\3\2\2\2"+
		"ab\7\6\2\2be\7\31\2\2cf\5\16\b\2df\5\24\13\2ec\3\2\2\2ed\3\2\2\2ef\3\2"+
		"\2\2fg\3\2\2\2gi\7\35\2\2hj\5\30\r\2ih\3\2\2\2ij\3\2\2\2jk\3\2\2\2kn\7"+
		"\35\2\2lo\5\24\13\2mo\5\26\f\2nl\3\2\2\2nm\3\2\2\2no\3\2\2\2op\3\2\2\2"+
		"pq\7\32\2\2qr\5\b\5\2r\r\3\2\2\2st\5\20\t\2tw\7!\2\2uv\7\16\2\2vx\5\30"+
		"\r\2wu\3\2\2\2wx\3\2\2\2x\17\3\2\2\2yz\t\2\2\2z\21\3\2\2\2{|\7\13\2\2"+
		"|}\7\31\2\2}~\5\30\r\2~\177\7\32\2\2\177\23\3\2\2\2\u0080\u0081\7!\2\2"+
		"\u0081\u0082\7\16\2\2\u0082\u0083\5\30\r\2\u0083\25\3\2\2\2\u0084\u0085"+
		"\7!\2\2\u0085\u0086\7\24\2\2\u0086\27\3\2\2\2\u0087\u0088\5\32\16\2\u0088"+
		"\31\3\2\2\2\u0089\u008c\5\34\17\2\u008a\u008b\t\3\2\2\u008b\u008d\5\34"+
		"\17\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\33\3\2\2\2\u008e\u0093"+
		"\5\36\20\2\u008f\u0090\t\4\2\2\u0090\u0092\5\36\20\2\u0091\u008f\3\2\2"+
		"\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\35"+
		"\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u009b\5 \21\2\u0097\u0098\t\5\2\2\u0098"+
		"\u009a\5 \21\2\u0099\u0097\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2"+
		"\2\2\u009b\u009c\3\2\2\2\u009c\37\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u00ac"+
		"\7\36\2\2\u009f\u00ac\7\37\2\2\u00a0\u00ac\7 \2\2\u00a1\u00ac\7\f\2\2"+
		"\u00a2\u00ac\7\r\2\2\u00a3\u00ac\5\26\f\2\u00a4\u00ac\7!\2\2\u00a5\u00a6"+
		"\7\31\2\2\u00a6\u00a7\5\30\r\2\u00a7\u00a8\7\32\2\2\u00a8\u00ac\3\2\2"+
		"\2\u00a9\u00aa\t\4\2\2\u00aa\u00ac\5 \21\2\u00ab\u009e\3\2\2\2\u00ab\u009f"+
		"\3\2\2\2\u00ab\u00a0\3\2\2\2\u00ab\u00a1\3\2\2\2\u00ab\u00a2\3\2\2\2\u00ab"+
		"\u00a3\3\2\2\2\u00ab\u00a4\3\2\2\2\u00ab\u00a5\3\2\2\2\u00ab\u00a9\3\2"+
		"\2\2\u00ac!\3\2\2\2\24%\60\648<>DQZ_einw\u008c\u0093\u009b\u00ab";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}