// Generated from /Users/rogelioorozcoavila/Developer/Lenguajes y Autómatas II/milenguaje/junior/src/main/antlr4/com/junior/Ejercicios.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EjerciciosParser}.
 */
public interface EjerciciosListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EjerciciosParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(EjerciciosParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjerciciosParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(EjerciciosParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjerciciosParser#individual}.
	 * @param ctx the parse tree
	 */
	void enterIndividual(EjerciciosParser.IndividualContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjerciciosParser#individual}.
	 * @param ctx the parse tree
	 */
	void exitIndividual(EjerciciosParser.IndividualContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjerciciosParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(EjerciciosParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjerciciosParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(EjerciciosParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjerciciosParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(EjerciciosParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjerciciosParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(EjerciciosParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjerciciosParser#sentencia_if}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_if(EjerciciosParser.Sentencia_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjerciciosParser#sentencia_if}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_if(EjerciciosParser.Sentencia_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjerciciosParser#sentencia_for}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_for(EjerciciosParser.Sentencia_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjerciciosParser#sentencia_for}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_for(EjerciciosParser.Sentencia_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjerciciosParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(EjerciciosParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjerciciosParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(EjerciciosParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjerciciosParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(EjerciciosParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjerciciosParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(EjerciciosParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjerciciosParser#impresion}.
	 * @param ctx the parse tree
	 */
	void enterImpresion(EjerciciosParser.ImpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjerciciosParser#impresion}.
	 * @param ctx the parse tree
	 */
	void exitImpresion(EjerciciosParser.ImpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjerciciosParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(EjerciciosParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjerciciosParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(EjerciciosParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjerciciosParser#incremento}.
	 * @param ctx the parse tree
	 */
	void enterIncremento(EjerciciosParser.IncrementoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjerciciosParser#incremento}.
	 * @param ctx the parse tree
	 */
	void exitIncremento(EjerciciosParser.IncrementoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjerciciosParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(EjerciciosParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjerciciosParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(EjerciciosParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjerciciosParser#expresion_relacional}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_relacional(EjerciciosParser.Expresion_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjerciciosParser#expresion_relacional}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_relacional(EjerciciosParser.Expresion_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjerciciosParser#expresion_aditiva}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_aditiva(EjerciciosParser.Expresion_aditivaContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjerciciosParser#expresion_aditiva}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_aditiva(EjerciciosParser.Expresion_aditivaContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjerciciosParser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(EjerciciosParser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjerciciosParser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(EjerciciosParser.TerminoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjerciciosParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(EjerciciosParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjerciciosParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(EjerciciosParser.FactorContext ctx);
}