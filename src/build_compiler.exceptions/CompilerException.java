import org.antlr.v4.runtime.Token;

public abstract class CompilerException extends RuntimeException {
    /**
    	 *
    	 */
    private static final long serialVersionUID = 1L;
    protected int line;
    protected int column;
    protected String varName;

    public CompilerException(Token varNameToken) {
    line= varNameToken.getLine();
    column= varNameToken.getCharPositionInLine();
    varName= varNameToken.getText();
}


}
