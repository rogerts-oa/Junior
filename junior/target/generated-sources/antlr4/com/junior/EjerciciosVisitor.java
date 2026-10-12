// Generated from com/junior/Ejercicios.g4 by ANTLR 4.9.2
package com.junior;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EjerciciosParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EjerciciosVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EjerciciosParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(EjerciciosParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link EjerciciosParser#individual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndividual(EjerciciosParser.IndividualContext ctx);
	/**
	 * Visit a parse tree produced by {@link EjerciciosParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(EjerciciosParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EjerciciosParser#sentencia_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia_if(EjerciciosParser.Sentencia_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link EjerciciosParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(EjerciciosParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EjerciciosParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(EjerciciosParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EjerciciosParser#expresion_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_relacional(EjerciciosParser.Expresion_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link EjerciciosParser#expresion_aditiva}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_aditiva(EjerciciosParser.Expresion_aditivaContext ctx);
	/**
	 * Visit a parse tree produced by {@link EjerciciosParser#termino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermino(EjerciciosParser.TerminoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EjerciciosParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(EjerciciosParser.FactorContext ctx);
}