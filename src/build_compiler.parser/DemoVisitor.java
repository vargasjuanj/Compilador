// Generated from grammar/Demo.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DemoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DemoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DemoParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(DemoParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(DemoParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MainSentences}
	 * labeled alternative in {@link DemoParser#programPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainSentences(DemoParser.MainSentencesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDeclarations}
	 * labeled alternative in {@link DemoParser#programPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclarations(DemoParser.FunctionDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(DemoParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(DemoParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#var_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_assign(DemoParser.Var_assignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(DemoParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(DemoParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(DemoParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunCallExpression}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunCallExpression(DemoParser.FunCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(DemoParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(DemoParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(DemoParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#println}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln(DemoParser.PrintlnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(DemoParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(DemoParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaration(DemoParser.ParameterDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(DemoParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#statementsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementsList(DemoParser.StatementsListContext ctx);
}