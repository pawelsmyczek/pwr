import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        supergrammarLexer lex = new supergrammarLexer(new ANTLRFileStream("/home/pablito/pwr/miasi_lab/lab1/output/__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        supergrammarParser g = new supergrammarParser(tokens, 49100, null);
        try {
            g.plik();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}