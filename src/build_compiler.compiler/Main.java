import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {
    public static void main(String[] args) throws IOException {
     ANTLRInputStream input = new ANTLRFileStream("code.demo");
     DemoLexer lexer = new DemoLexer(input);
     CommonTokenStream tokens = new CommonTokenStream(lexer);
     DemoParser parser = new DemoParser(tokens);

     ParseTree tree = parser.main();
     System.out.println(createJasminFile( new MyVisitor().visit(tree)));

    
 }

    private static String createJasminFile(String instructions) {
        return ".class public JasminTest\n" +
        ".super java/lang/Object\n" +
        instructions+"\n" ;
    }
}