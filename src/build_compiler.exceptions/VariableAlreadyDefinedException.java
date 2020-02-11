import org.antlr.v4.runtime.Token;

public class VariableAlreadyDefinedException extends CompilerException {

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  public VariableAlreadyDefinedException(Token varNameToken) {
  super(varNameToken);
}

@Override
public String getMessage() {
    return line+":"+column+" variable already defined <"+varName+">";
}
}
