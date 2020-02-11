import org.antlr.v4.runtime.Token;

public class UndeclaredVariableException extends CompilerException {

    /**
    	 *
    	 */
    private static final long serialVersionUID = 1L;

    public UndeclaredVariableException(Token varNameToken) {
  super(varNameToken);
}

@Override
public String getMessage() {
    return line+":"+column+" undefined variable <"+varName+">";
}
}
