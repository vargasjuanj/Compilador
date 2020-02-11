import java.lang.reflect.UndeclaredThrowableException;
import java.util.HashMap;
import java.util.Map;

import javax.sound.sampled.SourceDataLine;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.stringtemplate.v4.compiler.STParser.argExprList_return;




public class MyVisitor extends DemoBaseVisitor<String> {

    Map<String, Integer> variables = new HashMap<String, Integer>();

    @Override
    public String visitPlus(DemoParser.PlusContext ctx) {
        // Despúes de la raiz tiene otros subnodos visitPlus por eso usamos
        return visitChildren(ctx) + "\n" + "iadd";

    }

    @Override
    public String visitNumber(DemoParser.NumberContext ctx) {
        // VisitChildren invoca a Num, pero este retorno es una linea distinta, queda en
        // null

        return "ldc " + ctx.number.getText();
    }

    @Override
    protected String aggregateResult(String aggregate, String nextResult) {

        if (aggregate == null) {

            return nextResult;

        }
        if (nextResult == null) {

            return aggregate;
        }
        return aggregate + " \n " + nextResult;
    }

    @Override
    public String visitPrintln(DemoParser.PrintlnContext ctx) {
        // TODO Auto-generated method stub
        return "getstatic java/lang/System/out Ljava/io/PrintStream;\n" + visit(ctx.argument) + "\n"
                + "invokevirtual java/io/PrintStream/println(I)V\n";
    }

    @Override
    public String visitMinus(DemoParser.MinusContext ctx) {
        return visitChildren(ctx) + "\n" + "isub";

    }

    @Override
    public String visitMul(DemoParser.MulContext ctx) {
        return visitChildren(ctx) + "\n" + "imul";

    }

    @Override
    public String visitDiv(DemoParser.DivContext ctx) {
        return visitChildren(ctx) + "\n" + "idiv";

    }

    @Override
    public String visitVar_decl(DemoParser.Var_declContext ctx) {
        if (variables.containsKey(ctx.varName.getText())) {
            throw new VariableAlreadyDefinedException(ctx.varName);
        }
        variables.put(ctx.varName.getText(), variables.size());

        return "";
    }

    @Override
    public String visitVar_assign(DemoParser.Var_assignContext ctx) {
        return visit(ctx.exp) + "\n" + "istore " + requireVariableIndex(ctx.varName);

    }

    @Override
    public String visitVariable(DemoParser.VariableContext ctx) {

        return "iload " + requireVariableIndex(ctx.varName);

    }

    private int requireVariableIndex(Token varNameToken) {
        Integer varIndex = variables.get(varNameToken.getText());
        if (varIndex == null) {
            throw new UndeclaredVariableException(varNameToken);
        }
        return varIndex;
    }

    @Override
    public String visitFunctionCall(DemoParser.FunctionCallContext ctx) {
        String instructions ="";
        String argumentsInstructions= visit(ctx.arguments);
        if (!argumentsInstructions.equals(null)) instructions+=argumentsInstructions+"\n";
      instructions+="invokestatic JasminTest/" + ctx.funcName.getText() +"(";
     int numberOfParameters= ctx.arguments.expressions.size();
    instructions+=StringRepeat("I",numberOfParameters);
     instructions+=")"+"I"+"\n" ;
                return instructions;
    }

    @Override
    public String visitFunction(DemoParser.FunctionContext ctx) {
        Map<String,Integer> oldVariables=variables;
variables= new HashMap<>();
visit(ctx.params);
    String statementInstruction= visit(ctx.statements);
        String result= ".method public static "+ctx.funcName.getText()+"(";

        int numberOfParameters= ctx.params.declarations.size();
        result+=StringRepeat("I",numberOfParameters);
        result+=")"+"I"+"\n"+
        ".limit locals 100\n"+
        ".limit stack 100\n"+
    (statementInstruction==null?"":statementInstruction+"\n")+
        visit(ctx.returnValue)+"\n"+
        "ireturn\n"+
        ".end method"
        ;
        variables=oldVariables;
        return result;
    }

    private String StringRepeat(String string, int numberOfParameters) {
        StringBuilder result = new StringBuilder();
        for (int i=0; i<=numberOfParameters; i++){
          result.append(string);
        }
        return result.toString();
    }

    @Override
  public String visitProgram(DemoParser.ProgramContext ctx) {
      String mainCode="";
      String functionsCode="";
     
      for (int i=0; i<ctx.getChildCount(); ++i){

          ParseTree child = ctx.getChild(i);
          String instructions = visit(child);
        if(child instanceof DemoParser.MainSentencesContext){
mainCode+=instructions+"\n";
        }else{
          functionsCode+=instructions+"\n";
        }
      }
      return functionsCode+"\n"+
        ".method public static  main([Ljava/lang/String;)V\n" +
      "    .limit stack 100\n" +
      "    .limit locals 100\n" +
      mainCode+"\n" +

      "return\n" +
      ".end method";
  }

}