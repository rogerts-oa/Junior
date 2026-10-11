// Generated from com/junior/Junior.g4 by ANTLR 4.9.2
package com.junior;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JuniorParser}.
 */
public interface JuniorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JuniorParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(JuniorParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuniorParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(JuniorParser.StartContext ctx);
}