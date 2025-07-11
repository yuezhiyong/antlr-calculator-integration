package org.example.arrayInit;// Generated from ArrayInit.g4 by ANTLR 4.9.3

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * ANTLR解析器默认会基于输入构建语法树。
 * 通过遍历该树，树遍历器（tree walker）可向我们提供的监听器对象触发"事件"（即回调函数）。
 * ArrayInitListener接口定义了可供实现的所有回调方法，而ArrayInitBaseListener则提供了这些方法的空实现默认类。
 * 该基类使我们能够轻松地仅重写所需关注的回调方法。
 */

/**
 * This class provides an empty implementation of {@link ArrayInitListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class ArrayInitBaseListener implements ArrayInitListener {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInit(ArrayInitParser.InitContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInit(ArrayInitParser.InitContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterValue(ArrayInitParser.ValueContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitValue(ArrayInitParser.ValueContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) { }
}