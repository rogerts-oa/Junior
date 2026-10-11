// Generated from com/junior/Junior.g4 by ANTLR 4.9.2
package com.junior;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link JuniorVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class JuniorBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements JuniorVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitStart(JuniorParser.StartContext ctx) { return visitChildren(ctx); }
}