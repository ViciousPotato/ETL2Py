import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        AbiDMLLexer lex = new AbiDMLLexer(new ANTLRFileStream("/Users/zhou/Desktop/Graduation/dw_se.stg_se_email_trigger_w/dw_se.stg_se_email_trigger_w.reformat.xfr", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        AbiDMLParser g = new AbiDMLParser(tokens, 49100, null);
        try {
            g.top_level();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}