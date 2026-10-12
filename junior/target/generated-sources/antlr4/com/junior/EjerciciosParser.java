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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PR_IF) | (1L << PAR_IZQ) | (1L << ENT) | (1L << ID))) != 0) );
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PR_IF) | (1L << PAR_IZQ) | (1L << ENT) | (1L << ID))) != 0)) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21\\\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13"+
		"\3\2\6\2\30\n\2\r\2\16\2\31\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\5\4$\n\4\3"+
		"\4\3\4\5\4(\n\4\5\4*\n\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5\62\n\5\f\5\16\5\65"+
		"\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\5\bB\n\b\3\t\3\t\3\t"+
		"\7\tG\n\t\f\t\16\tJ\13\t\3\n\3\n\3\n\7\nO\n\n\f\n\16\nR\13\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13Z\n\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\4"+
		"\3\2\6\7\3\2\b\t\2\\\2\27\3\2\2\2\4\35\3\2\2\2\6)\3\2\2\2\b+\3\2\2\2\n"+
		"8\3\2\2\2\f<\3\2\2\2\16>\3\2\2\2\20C\3\2\2\2\22K\3\2\2\2\24Y\3\2\2\2\26"+
		"\30\5\6\4\2\27\26\3\2\2\2\30\31\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32"+
		"\33\3\2\2\2\33\34\7\2\2\3\34\3\3\2\2\2\35\36\5\6\4\2\36\37\7\2\2\3\37"+
		"\5\3\2\2\2 *\5\b\5\2!#\5\n\6\2\"$\7\16\2\2#\"\3\2\2\2#$\3\2\2\2$*\3\2"+
		"\2\2%\'\5\f\7\2&(\7\16\2\2\'&\3\2\2\2\'(\3\2\2\2(*\3\2\2\2) \3\2\2\2)"+
		"!\3\2\2\2)%\3\2\2\2*\7\3\2\2\2+,\7\3\2\2,-\7\n\2\2-.\5\f\7\2./\7\13\2"+
		"\2/\63\7\f\2\2\60\62\5\6\4\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2"+
		"\63\64\3\2\2\2\64\66\3\2\2\2\65\63\3\2\2\2\66\67\7\r\2\2\67\t\3\2\2\2"+
		"89\7\20\2\29:\7\4\2\2:;\5\f\7\2;\13\3\2\2\2<=\5\16\b\2=\r\3\2\2\2>A\5"+
		"\20\t\2?@\7\5\2\2@B\5\20\t\2A?\3\2\2\2AB\3\2\2\2B\17\3\2\2\2CH\5\22\n"+
		"\2DE\t\2\2\2EG\5\22\n\2FD\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\21\3"+
		"\2\2\2JH\3\2\2\2KP\5\24\13\2LM\t\3\2\2MO\5\24\13\2NL\3\2\2\2OR\3\2\2\2"+
		"PN\3\2\2\2PQ\3\2\2\2Q\23\3\2\2\2RP\3\2\2\2SZ\7\17\2\2TZ\7\20\2\2UV\7\n"+
		"\2\2VW\5\f\7\2WX\7\13\2\2XZ\3\2\2\2YS\3\2\2\2YT\3\2\2\2YU\3\2\2\2Z\25"+
		"\3\2\2\2\13\31#\')\63AHPY";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}