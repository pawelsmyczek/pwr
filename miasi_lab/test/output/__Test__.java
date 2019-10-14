import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        ParLexer lex = new ParLexer(new ANTLRFileStream("/home/pablito/pwr/miasi_lab/test/output/__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        ParParser g = new ParParser(tokens, 49100, null);
        try {
            g.r1();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}