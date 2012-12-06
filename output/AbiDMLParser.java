// $ANTLR 3.4 /Users/zhou/Projects/ETL2Py/AbiDML.g 2012-12-06 10:38:42

import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class AbiDMLParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "ESC_SEQ", "EXPONENT", "FLOAT", "HEX_DIGIT", "ID", "INT", "OCTAL_ESC", "STRING", "UNICODE_ESC", "WS", "'!'", "'!='", "'$'", "'%'", "'&&'", "'&'", "'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "':'", "'::'", "';'", "'<'", "'<<'", "'<='", "'='", "'=='", "'>'", "'>='", "'>>'", "'?'", "'NULL'", "'['", "']'", "'^'", "'and'", "'ascii'", "'begin'", "'big'", "'case'", "'char'", "'date'", "'datetime'", "'decimal'", "'default'", "'delimiter'", "'double'", "'ebcdic'", "'else'", "'end'", "'endian'", "'float'", "'for'", "'ibm'", "'ieee'", "'if'", "'int'", "'integer'", "'iso_8859_2'", "'iso_8859_3'", "'iso_8859_4'", "'iso_8859_5'", "'iso_8859_6'", "'iso_8859_7'", "'iso_8859_8'", "'iso_8859_9'", "'jis_201'", "'jis_208_euc'", "'jis_208_sjis'", "'let'", "'little'", "'long'", "'or'", "'packed'", "'real'", "'record'", "'reinterpret_as'", "'short'", "'signed'", "'string'", "'switch'", "'this_record'", "'unicode'", "'unsigned'", "'utf8'", "'vector'", "'void'", "'while'", "'|'", "'||'", "'~'"
    };

    public static final int EOF=-1;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__90=90;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__99=99;
    public static final int T__100=100;
    public static final int COMMENT=4;
    public static final int ESC_SEQ=5;
    public static final int EXPONENT=6;
    public static final int FLOAT=7;
    public static final int HEX_DIGIT=8;
    public static final int ID=9;
    public static final int INT=10;
    public static final int OCTAL_ESC=11;
    public static final int STRING=12;
    public static final int UNICODE_ESC=13;
    public static final int WS=14;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "field_name", "synpred130_AbiDML", "synpred38_AbiDML", 
    "synpred65_AbiDML", "top_level", "synpred39_AbiDML", "synpred4_AbiDML", 
    "procedural_statement_list", "synpred41_AbiDML", "synpred59_AbiDML", 
    "synpred18_AbiDML", "param_list", "unarycall", "conditional", "synpred49_AbiDML", 
    "synpred94_AbiDML", "assignment", "variable_declaration", "synpred34_AbiDML", 
    "synpred17_AbiDML", "synpred26_AbiDML", "synpred113_AbiDML", "synpred8_AbiDML", 
    "param", "vector_type", "synpred50_AbiDML", "declaration", "synpred139_AbiDML", 
    "synpred142_AbiDML", "synpred16_AbiDML", "synpred78_AbiDML", "synpred148_AbiDML", 
    "synpred6_AbiDML", "synpred162_AbiDML", "synpred163_AbiDML", "case_actions", 
    "varstring_length_type", "endian_spec", "synpred86_AbiDML", "synpred99_AbiDML", 
    "synpred68_AbiDML", "synpred12_AbiDML", "unop", "conditionalop", "synpred144_AbiDML", 
    "synpred10_AbiDML", "synpred74_AbiDML", "synpred124_AbiDML", "synpred20_AbiDML", 
    "synpred42_AbiDML", "binary_integer_type", "synpred149_AbiDML", "out_expr", 
    "synpred3_AbiDML", "synpred7_AbiDML", "synpred155_AbiDML", "synpred95_AbiDML", 
    "opt_statement", "synpred140_AbiDML", "synpred2_AbiDML", "funcall_expr", 
    "synpred121_AbiDML", "name_list", "synpred141_AbiDML", "synpred91_AbiDML", 
    "synpred53_AbiDML", "synpred73_AbiDML", "synpred133_AbiDML", "void_type", 
    "synpred36_AbiDML", "synpred123_AbiDML", "synpred88_AbiDML", "synpred70_AbiDML", 
    "for_statement", "synpred13_AbiDML", "out_expr_list", "native_type", 
    "synpred22_AbiDML", "synpred43_AbiDML", "synpred103_AbiDML", "synpred28_AbiDML", 
    "synpred32_AbiDML", "synpred62_AbiDML", "match_list", "synpred116_AbiDML", 
    "synpred61_AbiDML", "synpred77_AbiDML", "synpred143_AbiDML", "real_type", 
    "cast_expr", "synpred98_AbiDML", "synpred89_AbiDML", "synpred152_AbiDML", 
    "slot", "synpred97_AbiDML", "synpred156_AbiDML", "datetime_type", "synpred21_AbiDML", 
    "synpred161_AbiDML", "synpred24_AbiDML", "make_record_expr", "synpred104_AbiDML", 
    "rule", "record_type", "synpred69_AbiDML", "character_family", "synpred71_AbiDML", 
    "synpred137_AbiDML", "synpred164_AbiDML", "synpred150_AbiDML", "synpred90_AbiDML", 
    "synpred109_AbiDML", "synpred134_AbiDML", "reinterpret_expr", "synpred66_AbiDML", 
    "if_statement", "synpred55_AbiDML", "synpred87_AbiDML", "element_expr", 
    "synpred93_AbiDML", "synpred132_AbiDML", "binop", "name", "synpred64_AbiDML", 
    "synpred119_AbiDML", "synpred147_AbiDML", "synpred9_AbiDML", "synpred151_AbiDML", 
    "base_type", "synpred111_AbiDML", "getenv_expr", "optional_priority", 
    "synpred157_AbiDML", "synpred110_AbiDML", "synpred129_AbiDML", "primary_expression", 
    "synpred105_AbiDML", "synpred145_AbiDML", "synpred126_AbiDML", "string_type", 
    "synpred159_AbiDML", "synpred63_AbiDML", "sign_spec", "synpred117_AbiDML", 
    "if_expression", "arg_list", "null_expr", "synpred85_AbiDML", "synpred125_AbiDML", 
    "argument_list", "synpred76_AbiDML", "synpred114_AbiDML", "while_statement", 
    "synpred100_AbiDML", "synpred51_AbiDML", "whole_record_expr", "synpred56_AbiDML", 
    "synpred60_AbiDML", "synpred19_AbiDML", "synpred115_AbiDML", "procedural_statement", 
    "synpred47_AbiDML", "synpred128_AbiDML", "slots", "synpred120_AbiDML", 
    "synpred165_AbiDML", "loop_expr", "synpred11_AbiDML", "synpred57_AbiDML", 
    "synpred23_AbiDML", "synpred112_AbiDML", "block_statement", "synpred5_AbiDML", 
    "synpred92_AbiDML", "arg", "xfr_statement_list", "synpred146_AbiDML", 
    "synpred81_AbiDML", "synpred75_AbiDML", "expression", "delimiter_expr", 
    "date_type", "vector_length_type", "opt_delim", "type", "synpred46_AbiDML", 
    "record_expr_slots", "decl_string", "synpred138_AbiDML", "decimal_type", 
    "xfr_statement", "synpred122_AbiDML", "field_expr", "compounding_type", 
    "switch_statement", "synpred40_AbiDML", "variable_expr", "synpred166_AbiDML", 
    "synpred80_AbiDML", "synpred82_AbiDML", "float_family", "synpred107_AbiDML", 
    "ifr_expression", "synpred84_AbiDML", "opt_semicolon", "synpred31_AbiDML", 
    "synpred30_AbiDML", "binarycall", "synpred33_AbiDML", "synpred58_AbiDML", 
    "synpred136_AbiDML", "var_list", "synpred54_AbiDML", "var", "synpred27_AbiDML", 
    "synpred153_AbiDML", "synpred118_AbiDML", "synpred45_AbiDML", "synpred67_AbiDML", 
    "synpred15_AbiDML", "constant_expr", "synpred96_AbiDML", "transform_declaration", 
    "synpred101_AbiDML", "synpred154_AbiDML", "synpred29_AbiDML", "synpred135_AbiDML", 
    "synpred102_AbiDML", "synpred25_AbiDML", "synpred160_AbiDML", "synpred158_AbiDML", 
    "synpred37_AbiDML", "synpred44_AbiDML", "synpred1_AbiDML", "synpred127_AbiDML", 
    "variable_declaration_list", "synpred83_AbiDML", "synpred131_AbiDML", 
    "opt_init", "make_vector_expr", "declaration_list", "synpred72_AbiDML", 
    "synpred48_AbiDML", "synpred79_AbiDML", "synpred106_AbiDML", "synpred52_AbiDML", 
    "synpred108_AbiDML", "size_expr", "synpred14_AbiDML", "synpred35_AbiDML"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false, false, false, false, false, true, 
        false, false, false, false, false, false, true, false, true, true, 
        false, false, false, false, false, false, false, false, false, true, 
        false, false, false, false, false, false, false, false, false, false, 
        false, false, false, false, false, false, false, false, false, false, 
        false, false, false, false, false, false, false, false, false, false, 
        false, false, false, true, false, false, true, true, true, true, 
        false, false, false, false, false, false, false, false, false, false, 
        false, false, false, false, false, false, false, false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public AbiDMLParser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public AbiDMLParser(TokenStream input, int port, RecognizerSharedState state) {
        super(input, state);
        DebugEventSocketProxy proxy =
            new DebugEventSocketProxy(this, port, null);

        setDebugListener(proxy);
        try {
            proxy.handshake();
        }
        catch (IOException ioe) {
            reportError(ioe);
        }
    }

public AbiDMLParser(TokenStream input, DebugEventListener dbg) {
    super(input, dbg, new RecognizerSharedState());
}

protected boolean evalPredicate(boolean result, String predicate) {
    dbg.semanticPredicate(result, predicate);
    return result;
}

    public String[] getTokenNames() { return AbiDMLParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/zhou/Projects/ETL2Py/AbiDML.g"; }


    HashMap symtable = new HashMap();
    int indentlevel = 0;

    public void output(String s) {
        for (int i = 0; i < indentlevel; i++) {
            System.out.print("    ");
        }
        System.out.println(s);
    }



    // $ANTLR start "top_level"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:23:1: top_level : ( type opt_semicolon | declaration_list );
    public final void top_level() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "top_level");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(23, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:24:2: ( type opt_semicolon | declaration_list )
            int alt1=2;
            try { dbg.enterDecision(1, decisionCanBacktrack[1]);

            int LA1_0 = input.LA(1);

            if ( (LA1_0==46||LA1_0==48||(LA1_0 >= 50 && LA1_0 <= 53)||(LA1_0 >= 56 && LA1_0 <= 57)||LA1_0==61||(LA1_0 >= 63 && LA1_0 <= 64)||(LA1_0 >= 66 && LA1_0 <= 78)||(LA1_0 >= 80 && LA1_0 <= 81)||(LA1_0 >= 83 && LA1_0 <= 85)||(LA1_0 >= 87 && LA1_0 <= 89)||(LA1_0 >= 93 && LA1_0 <= 94)||LA1_0==96) ) {
                alt1=1;
            }
            else if ( (LA1_0==ID) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(1);}

            switch (alt1) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:24:4: type opt_semicolon
                    {
                    dbg.location(24,4);
                    pushFollow(FOLLOW_type_in_top_level36);
                    type();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(24,9);
                    pushFollow(FOLLOW_opt_semicolon_in_top_level38);
                    opt_semicolon();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:24:25: declaration_list
                    {
                    dbg.location(24,25);
                    pushFollow(FOLLOW_declaration_list_in_top_level42);
                    declaration_list();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(25, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "top_level");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "top_level"


    public static class type_return extends ParserRuleReturnScope {
        public String typename;
        public Object value;
        public Object extra;
    };


    // $ANTLR start "type"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:28:1: type returns [String typename, Object value, Object extra] : ( base_type | compounding_type );
    public final AbiDMLParser.type_return type() throws RecognitionException {
        AbiDMLParser.type_return retval = new AbiDMLParser.type_return();
        retval.start = input.LT(1);


        AbiDMLParser.base_type_return base_type1 =null;


        try { dbg.enterRule(getGrammarFileName(), "type");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(28, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:29:2: ( base_type | compounding_type )
            int alt2=2;
            try { dbg.enterDecision(2, decisionCanBacktrack[2]);

            try {
                isCyclicDecision = true;
                alt2 = dfa2.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:29:4: base_type
                    {
                    dbg.location(29,4);
                    pushFollow(FOLLOW_base_type_in_type58);
                    base_type1=base_type();

                    state._fsp--;
                    if (state.failed) return retval;
                    dbg.location(30,3);
                    if ( state.backtracking==0 ) {
                    			retval.typename = (base_type1!=null?base_type1.typename:null);
                    			retval.value = (base_type1!=null?base_type1.value:null);
                    			retval.extra = (base_type1!=null?base_type1.extra:null);
                    		}

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:36:3: compounding_type
                    {
                    dbg.location(36,3);
                    pushFollow(FOLLOW_compounding_type_in_type70);
                    compounding_type();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(37, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "type");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "type"


    public static class base_type_return extends ParserRuleReturnScope {
        public String typename;
        public Object value;
        public Object extra;
    };


    // $ANTLR start "base_type"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:39:1: base_type returns [String typename, Object value, Object extra] : ( native_type | binary_integer_type | decimal_type | real_type | date_type | datetime_type | string_type | void_type );
    public final AbiDMLParser.base_type_return base_type() throws RecognitionException {
        AbiDMLParser.base_type_return retval = new AbiDMLParser.base_type_return();
        retval.start = input.LT(1);


        String native_type2 =null;

        String decimal_type3 =null;

        String string_type4 =null;


        try { dbg.enterRule(getGrammarFileName(), "base_type");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(39, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:40:2: ( native_type | binary_integer_type | decimal_type | real_type | date_type | datetime_type | string_type | void_type )
            int alt3=8;
            try { dbg.enterDecision(3, decisionCanBacktrack[3]);

            switch ( input.LA(1) ) {
            case 88:
            case 93:
                {
                switch ( input.LA(2) ) {
                case 50:
                case 66:
                case 81:
                case 87:
                    {
                    alt3=1;
                    }
                    break;
                case 48:
                    {
                    int LA3_27 = input.LA(3);

                    if ( (LA3_27==60) ) {
                        int LA3_31 = input.LA(4);

                        if ( (LA3_31==67) ) {
                            alt3=2;
                        }
                        else if ( ((LA3_31 >= 63 && LA3_31 <= 64)||LA3_31==84) ) {
                            alt3=4;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 31, input);

                            dbg.recognitionException(nvae);
                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 27, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                    }
                    break;
                case 80:
                    {
                    int LA3_28 = input.LA(3);

                    if ( (LA3_28==60) ) {
                        int LA3_32 = input.LA(4);

                        if ( (LA3_32==67) ) {
                            alt3=2;
                        }
                        else if ( ((LA3_32 >= 63 && LA3_32 <= 64)||LA3_32==84) ) {
                            alt3=4;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 32, input);

                            dbg.recognitionException(nvae);
                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 28, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                    }
                    break;
                case 67:
                    {
                    alt3=2;
                    }
                    break;
                case 63:
                case 64:
                case 84:
                    {
                    alt3=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }

                }
                break;
            case 50:
            case 56:
            case 61:
            case 66:
            case 81:
            case 87:
                {
                alt3=1;
                }
                break;
            case 48:
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3==60) ) {
                    switch ( input.LA(3) ) {
                    case 67:
                        {
                        alt3=2;
                        }
                        break;
                    case 92:
                        {
                        switch ( input.LA(4) ) {
                        case 53:
                            {
                            alt3=3;
                            }
                            break;
                        case 51:
                            {
                            alt3=5;
                            }
                            break;
                        case 52:
                            {
                            alt3=6;
                            }
                            break;
                        case 89:
                            {
                            alt3=7;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 33, input);

                            dbg.recognitionException(nvae);
                            throw nvae;

                        }

                        }
                        break;
                    case 63:
                    case 64:
                    case 84:
                        {
                        alt3=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 29, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 80:
                {
                int LA3_4 = input.LA(2);

                if ( (LA3_4==60) ) {
                    switch ( input.LA(3) ) {
                    case 67:
                        {
                        alt3=2;
                        }
                        break;
                    case 92:
                        {
                        switch ( input.LA(4) ) {
                        case 53:
                            {
                            alt3=3;
                            }
                            break;
                        case 51:
                            {
                            alt3=5;
                            }
                            break;
                        case 52:
                            {
                            alt3=6;
                            }
                            break;
                        case 89:
                            {
                            alt3=7;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 33, input);

                            dbg.recognitionException(nvae);
                            throw nvae;

                        }

                        }
                        break;
                    case 63:
                    case 64:
                    case 84:
                        {
                        alt3=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 30, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 4, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 67:
                {
                alt3=2;
                }
                break;
            case 46:
                {
                switch ( input.LA(2) ) {
                case 53:
                    {
                    alt3=3;
                    }
                    break;
                case 51:
                    {
                    alt3=5;
                    }
                    break;
                case 52:
                    {
                    alt3=6;
                    }
                    break;
                case 89:
                    {
                    alt3=7;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 6, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }

                }
                break;
            case 57:
                {
                switch ( input.LA(2) ) {
                case 53:
                    {
                    alt3=3;
                    }
                    break;
                case 51:
                    {
                    alt3=5;
                    }
                    break;
                case 52:
                    {
                    alt3=6;
                    }
                    break;
                case 89:
                    {
                    alt3=7;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 7, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }

                }
                break;
            case 68:
                {
                switch ( input.LA(2) ) {
                case 53:
                    {
                    alt3=3;
                    }
                    break;
                case 51:
                    {
                    alt3=5;
                    }
                    break;
                case 52:
                    {
                    alt3=6;
                    }
                    break;
                case 89:
                    {
                    alt3=7;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 8, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }

                }
                break;
            case 69:
                {
                switch ( input.LA(2) ) {
                case 53:
                    {
                    alt3=3;
                    }
                    break;
                case 51:
                    {
                    alt3=5;
                    }
                    break;
                case 52:
                    {
                    alt3=6;
                    }
                    break;
                case 89:
                    {
                    alt3=7;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 9, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }

                }
                break;
            case 70:
                {
                switch ( input.LA(2) ) {
                case 53:
                    {
                    alt3=3;
                    }
                    break;
                case 51:
                    {
                    alt3=5;
                    }
                    break;
                case 52:
                    {
                    alt3=6;
                    }
                    break;
                case 89:
                    {
                    alt3=7;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 10, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }

                }
                break;
            case 71:
                {
                switch ( input.LA(2) ) {
                case 53:
                    {
                    alt3=3;
                    }
                    break;
                case 51:
                    {
                    alt3=5;
                    }
                    break;
                case 52:
                    {
                    alt3=6;
                    }
                    break;
                case 89:
                    {
                    alt3=7;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 11, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }

                }
                break;
            case 72:
                {
                switch ( input.LA(2) ) {
                case 53:
                    {
                    alt3=3;
                    }
                    break;
                case 51:
                    {
                    alt3=5;
                    }
                    break;
                case 52:
                    {
                    alt3=6;
                    }
                    break;
                case 89:
                    {
                    alt3=7;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 12, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }

                }
                break;
            case 73:
                {
                switch ( input.LA(2) ) {
                case 53:
                    {
                    alt3=3;
                    }
                    break;
                case 51:
                    {
                    alt3=5;
                    }
                    break;
                case 52:
                    {
                    alt3=6;
                    }
                    break;
                case 89:
                    {
                    alt3=7;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 13, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }

                }
                break;
            case 74:
                {
                switch ( input.LA(2) ) {
                case 53:
                    {
                    alt3=3;
                    }
                    break;
                case 51:
                    {
                    alt3=5;
                    }
                    break;
                case 52:
                    {
                    alt3=6;
                    }
                    break;
                case 89:
                    {
                    alt3=7;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 14, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }

                }
                break;
            case 75:
                {
                switch ( input.LA(2) ) {
                case 53:
                    {
                    alt3=3;
                    }
                    break;
                case 51:
                    {
                    alt3=5;
                    }
                    break;
                case 52:
                    {
                    alt3=6;
                    }
                    break;
                case 89:
                    {
                    alt3=7;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 15, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }

                }
                break;
            case 76:
                {
                switch ( input.LA(2) ) {
                case 53:
                    {
                    alt3=3;
                    }
                    break;
                case 51:
                    {
                    alt3=5;
                    }
                    break;
                case 52:
                    {
                    alt3=6;
                    }
                    break;
                case 89:
                    {
                    alt3=7;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 16, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }

                }
                break;
            case 77:
                {
                switch ( input.LA(2) ) {
                case 53:
                    {
                    alt3=3;
                    }
                    break;
                case 51:
                    {
                    alt3=5;
                    }
                    break;
                case 52:
                    {
                    alt3=6;
                    }
                    break;
                case 89:
                    {
                    alt3=7;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 17, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }

                }
                break;
            case 78:
                {
                switch ( input.LA(2) ) {
                case 53:
                    {
                    alt3=3;
                    }
                    break;
                case 51:
                    {
                    alt3=5;
                    }
                    break;
                case 52:
                    {
                    alt3=6;
                    }
                    break;
                case 89:
                    {
                    alt3=7;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 18, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }

                }
                break;
            case 94:
                {
                switch ( input.LA(2) ) {
                case 53:
                    {
                    alt3=3;
                    }
                    break;
                case 51:
                    {
                    alt3=5;
                    }
                    break;
                case 52:
                    {
                    alt3=6;
                    }
                    break;
                case 89:
                    {
                    alt3=7;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 19, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }

                }
                break;
            case 83:
                {
                switch ( input.LA(2) ) {
                case 53:
                    {
                    alt3=3;
                    }
                    break;
                case 51:
                    {
                    alt3=5;
                    }
                    break;
                case 52:
                    {
                    alt3=6;
                    }
                    break;
                case 89:
                    {
                    alt3=7;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 20, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }

                }
                break;
            case 53:
                {
                alt3=3;
                }
                break;
            case 63:
            case 64:
            case 84:
                {
                alt3=4;
                }
                break;
            case 51:
                {
                alt3=5;
                }
                break;
            case 52:
                {
                alt3=6;
                }
                break;
            case 89:
                {
                alt3=7;
                }
                break;
            case 96:
                {
                alt3=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:40:4: native_type
                    {
                    dbg.location(40,4);
                    pushFollow(FOLLOW_native_type_in_base_type86);
                    native_type2=native_type();

                    state._fsp--;
                    if (state.failed) return retval;
                    dbg.location(41,3);
                    if ( state.backtracking==0 ) {
                    			retval.typename = native_type2;
                    		}

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:45:3: binary_integer_type
                    {
                    dbg.location(45,3);
                    pushFollow(FOLLOW_binary_integer_type_in_base_type97);
                    binary_integer_type();

                    state._fsp--;
                    if (state.failed) return retval;
                    dbg.location(46,3);
                    if ( state.backtracking==0 ) {
                    			retval.typename = "integer";
                    		}

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:50:3: decimal_type
                    {
                    dbg.location(50,3);
                    pushFollow(FOLLOW_decimal_type_in_base_type108);
                    decimal_type3=decimal_type();

                    state._fsp--;
                    if (state.failed) return retval;
                    dbg.location(51,3);
                    if ( state.backtracking==0 ) {
                    			retval.typename = "decimal";
                    			retval.extra = decimal_type3;
                    		}

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:56:3: real_type
                    {
                    dbg.location(56,3);
                    pushFollow(FOLLOW_real_type_in_base_type119);
                    real_type();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:58:3: date_type
                    {
                    dbg.location(58,3);
                    pushFollow(FOLLOW_date_type_in_base_type126);
                    date_type();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:60:10: datetime_type
                    {
                    dbg.location(60,10);
                    pushFollow(FOLLOW_datetime_type_in_base_type140);
                    datetime_type();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:62:10: string_type
                    {
                    dbg.location(62,10);
                    pushFollow(FOLLOW_string_type_in_base_type162);
                    string_type4=string_type();

                    state._fsp--;
                    if (state.failed) return retval;
                    dbg.location(63,10);
                    if ( state.backtracking==0 ) {
                            		retval.typename = "string";
                            		retval.value = "";
                            		retval.extra = string_type4;
                            	}

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:69:10: void_type
                    {
                    dbg.location(69,10);
                    pushFollow(FOLLOW_void_type_in_base_type194);
                    void_type();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(70, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "base_type");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "base_type"



    // $ANTLR start "compounding_type"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:72:1: compounding_type : ( vector_type | record_type );
    public final void compounding_type() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "compounding_type");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(72, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:73:2: ( vector_type | record_type )
            int alt4=2;
            try { dbg.enterDecision(4, decisionCanBacktrack[4]);

            switch ( input.LA(1) ) {
            case 50:
            case 51:
            case 52:
            case 53:
            case 56:
            case 61:
            case 63:
            case 64:
            case 66:
            case 67:
            case 81:
            case 84:
            case 87:
            case 88:
            case 89:
            case 93:
            case 96:
                {
                alt4=1;
                }
                break;
            case 48:
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==60) ) {
                    int LA4_20 = input.LA(3);

                    if ( ((LA4_20 >= 63 && LA4_20 <= 64)||LA4_20==67||LA4_20==84) ) {
                        alt4=1;
                    }
                    else if ( (LA4_20==92) ) {
                        int LA4_22 = input.LA(4);

                        if ( ((LA4_22 >= 51 && LA4_22 <= 53)||LA4_22==89) ) {
                            alt4=1;
                        }
                        else if ( (LA4_22==85) ) {
                            alt4=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 22, input);

                            dbg.recognitionException(nvae);
                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 20, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 80:
                {
                int LA4_3 = input.LA(2);

                if ( (LA4_3==60) ) {
                    int LA4_21 = input.LA(3);

                    if ( ((LA4_21 >= 63 && LA4_21 <= 64)||LA4_21==67||LA4_21==84) ) {
                        alt4=1;
                    }
                    else if ( (LA4_21==92) ) {
                        int LA4_22 = input.LA(4);

                        if ( ((LA4_22 >= 51 && LA4_22 <= 53)||LA4_22==89) ) {
                            alt4=1;
                        }
                        else if ( (LA4_22==85) ) {
                            alt4=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 22, input);

                            dbg.recognitionException(nvae);
                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 21, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 3, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 46:
                {
                int LA4_4 = input.LA(2);

                if ( ((LA4_4 >= 51 && LA4_4 <= 53)||LA4_4==89) ) {
                    alt4=1;
                }
                else if ( (LA4_4==85) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 4, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 57:
                {
                int LA4_5 = input.LA(2);

                if ( ((LA4_5 >= 51 && LA4_5 <= 53)||LA4_5==89) ) {
                    alt4=1;
                }
                else if ( (LA4_5==85) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 5, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 68:
                {
                int LA4_6 = input.LA(2);

                if ( ((LA4_6 >= 51 && LA4_6 <= 53)||LA4_6==89) ) {
                    alt4=1;
                }
                else if ( (LA4_6==85) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 6, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 69:
                {
                int LA4_7 = input.LA(2);

                if ( ((LA4_7 >= 51 && LA4_7 <= 53)||LA4_7==89) ) {
                    alt4=1;
                }
                else if ( (LA4_7==85) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 7, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 70:
                {
                int LA4_8 = input.LA(2);

                if ( ((LA4_8 >= 51 && LA4_8 <= 53)||LA4_8==89) ) {
                    alt4=1;
                }
                else if ( (LA4_8==85) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 8, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 71:
                {
                int LA4_9 = input.LA(2);

                if ( ((LA4_9 >= 51 && LA4_9 <= 53)||LA4_9==89) ) {
                    alt4=1;
                }
                else if ( (LA4_9==85) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 9, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 72:
                {
                int LA4_10 = input.LA(2);

                if ( ((LA4_10 >= 51 && LA4_10 <= 53)||LA4_10==89) ) {
                    alt4=1;
                }
                else if ( (LA4_10==85) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 10, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 73:
                {
                int LA4_11 = input.LA(2);

                if ( ((LA4_11 >= 51 && LA4_11 <= 53)||LA4_11==89) ) {
                    alt4=1;
                }
                else if ( (LA4_11==85) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 11, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 74:
                {
                int LA4_12 = input.LA(2);

                if ( ((LA4_12 >= 51 && LA4_12 <= 53)||LA4_12==89) ) {
                    alt4=1;
                }
                else if ( (LA4_12==85) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 12, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 75:
                {
                int LA4_13 = input.LA(2);

                if ( ((LA4_13 >= 51 && LA4_13 <= 53)||LA4_13==89) ) {
                    alt4=1;
                }
                else if ( (LA4_13==85) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 13, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 76:
                {
                int LA4_14 = input.LA(2);

                if ( ((LA4_14 >= 51 && LA4_14 <= 53)||LA4_14==89) ) {
                    alt4=1;
                }
                else if ( (LA4_14==85) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 14, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 77:
                {
                int LA4_15 = input.LA(2);

                if ( ((LA4_15 >= 51 && LA4_15 <= 53)||LA4_15==89) ) {
                    alt4=1;
                }
                else if ( (LA4_15==85) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 15, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 78:
                {
                int LA4_16 = input.LA(2);

                if ( ((LA4_16 >= 51 && LA4_16 <= 53)||LA4_16==89) ) {
                    alt4=1;
                }
                else if ( (LA4_16==85) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 16, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 94:
                {
                int LA4_17 = input.LA(2);

                if ( ((LA4_17 >= 51 && LA4_17 <= 53)||LA4_17==89) ) {
                    alt4=1;
                }
                else if ( (LA4_17==85) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 17, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 83:
                {
                int LA4_18 = input.LA(2);

                if ( ((LA4_18 >= 51 && LA4_18 <= 53)||LA4_18==89) ) {
                    alt4=1;
                }
                else if ( (LA4_18==85) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 18, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 85:
                {
                alt4=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:73:4: vector_type
                    {
                    dbg.location(73,4);
                    pushFollow(FOLLOW_vector_type_in_compounding_type209);
                    vector_type();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:73:18: record_type
                    {
                    dbg.location(73,18);
                    pushFollow(FOLLOW_record_type_in_compounding_type213);
                    record_type();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(74, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "compounding_type");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "compounding_type"



    // $ANTLR start "vector_length_type"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:76:1: vector_length_type : ( native_type | binary_integer_type | decimal_type | real_type );
    public final void vector_length_type() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "vector_length_type");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(76, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:77:2: ( native_type | binary_integer_type | decimal_type | real_type )
            int alt5=4;
            try { dbg.enterDecision(5, decisionCanBacktrack[5]);

            switch ( input.LA(1) ) {
            case 88:
            case 93:
                {
                switch ( input.LA(2) ) {
                case 50:
                case 66:
                case 81:
                case 87:
                    {
                    alt5=1;
                    }
                    break;
                case 48:
                    {
                    int LA5_8 = input.LA(3);

                    if ( (LA5_8==60) ) {
                        int LA5_12 = input.LA(4);

                        if ( (LA5_12==67) ) {
                            alt5=2;
                        }
                        else if ( ((LA5_12 >= 63 && LA5_12 <= 64)||LA5_12==84) ) {
                            alt5=4;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 12, input);

                            dbg.recognitionException(nvae);
                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 8, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                    }
                    break;
                case 80:
                    {
                    int LA5_9 = input.LA(3);

                    if ( (LA5_9==60) ) {
                        int LA5_13 = input.LA(4);

                        if ( (LA5_13==67) ) {
                            alt5=2;
                        }
                        else if ( ((LA5_13 >= 63 && LA5_13 <= 64)||LA5_13==84) ) {
                            alt5=4;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 13, input);

                            dbg.recognitionException(nvae);
                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 9, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                    }
                    break;
                case 67:
                    {
                    alt5=2;
                    }
                    break;
                case 63:
                case 64:
                case 84:
                    {
                    alt5=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }

                }
                break;
            case 50:
            case 56:
            case 61:
            case 66:
            case 81:
            case 87:
                {
                alt5=1;
                }
                break;
            case 48:
                {
                int LA5_3 = input.LA(2);

                if ( (LA5_3==60) ) {
                    switch ( input.LA(3) ) {
                    case 67:
                        {
                        alt5=2;
                        }
                        break;
                    case 92:
                        {
                        alt5=3;
                        }
                        break;
                    case 63:
                    case 64:
                    case 84:
                        {
                        alt5=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 10, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 3, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 80:
                {
                int LA5_4 = input.LA(2);

                if ( (LA5_4==60) ) {
                    switch ( input.LA(3) ) {
                    case 67:
                        {
                        alt5=2;
                        }
                        break;
                    case 92:
                        {
                        alt5=3;
                        }
                        break;
                    case 63:
                    case 64:
                    case 84:
                        {
                        alt5=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 11, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 4, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 67:
                {
                alt5=2;
                }
                break;
            case 46:
            case 53:
            case 57:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 83:
            case 94:
                {
                alt5=3;
                }
                break;
            case 63:
            case 64:
            case 84:
                {
                alt5=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:77:4: native_type
                    {
                    dbg.location(77,4);
                    pushFollow(FOLLOW_native_type_in_vector_length_type225);
                    native_type();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:77:18: binary_integer_type
                    {
                    dbg.location(77,18);
                    pushFollow(FOLLOW_binary_integer_type_in_vector_length_type229);
                    binary_integer_type();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:77:40: decimal_type
                    {
                    dbg.location(77,40);
                    pushFollow(FOLLOW_decimal_type_in_vector_length_type233);
                    decimal_type();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:77:55: real_type
                    {
                    dbg.location(77,55);
                    pushFollow(FOLLOW_real_type_in_vector_length_type237);
                    real_type();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(78, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vector_length_type");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "vector_length_type"



    // $ANTLR start "vector_type"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:80:1: vector_type : base_type '[' ( constant_expr | size_expr | delimiter_expr | vector_length_type )? ']' ;
    public final void vector_type() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "vector_type");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(80, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:81:2: ( base_type '[' ( constant_expr | size_expr | delimiter_expr | vector_length_type )? ']' )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:81:4: base_type '[' ( constant_expr | size_expr | delimiter_expr | vector_length_type )? ']'
            {
            dbg.location(81,4);
            pushFollow(FOLLOW_base_type_in_vector_type251);
            base_type();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(81,14);
            match(input,42,FOLLOW_42_in_vector_type253); if (state.failed) return ;
            dbg.location(81,18);
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:81:18: ( constant_expr | size_expr | delimiter_expr | vector_length_type )?
            int alt6=5;
            try { dbg.enterSubRule(6);
            try { dbg.enterDecision(6, decisionCanBacktrack[6]);

            switch ( input.LA(1) ) {
                case INT:
                    {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1==43) ) {
                        alt6=1;
                    }
                    else if ( (LA6_1==16||(LA6_1 >= 18 && LA6_1 <= 20)||(LA6_1 >= 23 && LA6_1 <= 24)||(LA6_1 >= 26 && LA6_1 <= 28)||(LA6_1 >= 32 && LA6_1 <= 34)||(LA6_1 >= 36 && LA6_1 <= 40)||LA6_1==42||(LA6_1 >= 44 && LA6_1 <= 45)||LA6_1==82||(LA6_1 >= 98 && LA6_1 <= 99)) ) {
                        alt6=2;
                    }
                    }
                    break;
                case FLOAT:
                    {
                    int LA6_2 = input.LA(2);

                    if ( (LA6_2==43) ) {
                        alt6=1;
                    }
                    else if ( (LA6_2==16||(LA6_2 >= 18 && LA6_2 <= 20)||(LA6_2 >= 23 && LA6_2 <= 24)||(LA6_2 >= 26 && LA6_2 <= 28)||(LA6_2 >= 32 && LA6_2 <= 34)||(LA6_2 >= 36 && LA6_2 <= 40)||LA6_2==42||(LA6_2 >= 44 && LA6_2 <= 45)||LA6_2==82||(LA6_2 >= 98 && LA6_2 <= 99)) ) {
                        alt6=2;
                    }
                    }
                    break;
                case STRING:
                    {
                    int LA6_3 = input.LA(2);

                    if ( (LA6_3==43) ) {
                        alt6=1;
                    }
                    else if ( (LA6_3==16||(LA6_3 >= 18 && LA6_3 <= 20)||(LA6_3 >= 23 && LA6_3 <= 24)||(LA6_3 >= 26 && LA6_3 <= 28)||(LA6_3 >= 32 && LA6_3 <= 34)||(LA6_3 >= 36 && LA6_3 <= 40)||LA6_3==42||(LA6_3 >= 44 && LA6_3 <= 45)||LA6_3==82||(LA6_3 >= 98 && LA6_3 <= 99)) ) {
                        alt6=2;
                    }
                    }
                    break;
                case ID:
                case 15:
                case 17:
                case 21:
                case 24:
                case 41:
                case 42:
                case 62:
                case 65:
                case 86:
                case 91:
                case 97:
                case 100:
                    {
                    alt6=2;
                    }
                    break;
                case 55:
                    {
                    alt6=3;
                    }
                    break;
                case 46:
                case 48:
                case 50:
                case 53:
                case 56:
                case 57:
                case 61:
                case 63:
                case 64:
                case 66:
                case 67:
                case 68:
                case 69:
                case 70:
                case 71:
                case 72:
                case 73:
                case 74:
                case 75:
                case 76:
                case 77:
                case 78:
                case 80:
                case 81:
                case 83:
                case 84:
                case 87:
                case 88:
                case 93:
                case 94:
                    {
                    alt6=4;
                    }
                    break;
            }

            } finally {dbg.exitDecision(6);}

            switch (alt6) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:81:19: constant_expr
                    {
                    dbg.location(81,19);
                    pushFollow(FOLLOW_constant_expr_in_vector_type256);
                    constant_expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:81:35: size_expr
                    {
                    dbg.location(81,35);
                    pushFollow(FOLLOW_size_expr_in_vector_type260);
                    size_expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:81:47: delimiter_expr
                    {
                    dbg.location(81,47);
                    pushFollow(FOLLOW_delimiter_expr_in_vector_type264);
                    delimiter_expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:81:64: vector_length_type
                    {
                    dbg.location(81,64);
                    pushFollow(FOLLOW_vector_length_type_in_vector_type268);
                    vector_length_type();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(6);}

            dbg.location(81,85);
            match(input,43,FOLLOW_43_in_vector_type272); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(82, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vector_type");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "vector_type"



    // $ANTLR start "record_type"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:84:1: record_type : ( character_family )? 'record' ( slots )? 'end' opt_delim ;
    public final void record_type() throws RecognitionException {
        List slots5 =null;


        try { dbg.enterRule(getGrammarFileName(), "record_type");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(84, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:85:5: ( ( character_family )? 'record' ( slots )? 'end' opt_delim )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:85:9: ( character_family )? 'record' ( slots )? 'end' opt_delim
            {
            dbg.location(85,9);
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:85:9: ( character_family )?
            int alt7=2;
            try { dbg.enterSubRule(7);
            try { dbg.enterDecision(7, decisionCanBacktrack[7]);

            int LA7_0 = input.LA(1);

            if ( (LA7_0==46||LA7_0==48||LA7_0==57||(LA7_0 >= 68 && LA7_0 <= 78)||LA7_0==80||LA7_0==83||LA7_0==94) ) {
                alt7=1;
            }
            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:85:9: character_family
                    {
                    dbg.location(85,9);
                    pushFollow(FOLLOW_character_family_in_record_type288);
                    character_family();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(7);}

            dbg.location(85,27);
            match(input,85,FOLLOW_85_in_record_type291); if (state.failed) return ;
            dbg.location(85,36);
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:85:36: ( slots )?
            int alt8=2;
            try { dbg.enterSubRule(8);
            try { dbg.enterDecision(8, decisionCanBacktrack[8]);

            int LA8_0 = input.LA(1);

            if ( (LA8_0==46||LA8_0==48||(LA8_0 >= 50 && LA8_0 <= 53)||(LA8_0 >= 56 && LA8_0 <= 57)||LA8_0==61||(LA8_0 >= 63 && LA8_0 <= 64)||(LA8_0 >= 66 && LA8_0 <= 78)||(LA8_0 >= 80 && LA8_0 <= 81)||(LA8_0 >= 83 && LA8_0 <= 85)||(LA8_0 >= 87 && LA8_0 <= 89)||(LA8_0 >= 93 && LA8_0 <= 94)||LA8_0==96) ) {
                alt8=1;
            }
            } finally {dbg.exitDecision(8);}

            switch (alt8) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:85:36: slots
                    {
                    dbg.location(85,36);
                    pushFollow(FOLLOW_slots_in_record_type293);
                    slots5=slots();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(8);}

            dbg.location(85,43);
            match(input,59,FOLLOW_59_in_record_type296); if (state.failed) return ;
            dbg.location(85,49);
            pushFollow(FOLLOW_opt_delim_in_record_type298);
            opt_delim();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(86,6);
            if ( state.backtracking==0 ) {
                		String cls = "class Test(RecordVarSequence):\n";
                		       cls +="    def __init__(self):\n";
                		       cls +="        RecordVarSequence.__init__(self)\n";
                		for (Object s : slots5) {
                		       cls +="        " + (String)s + "\n";
                		}
                		System.out.println(cls);
                	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(95, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "record_type");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "record_type"



    // $ANTLR start "slots"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:97:1: slots returns [List slots] : s= slot (s= slot )* ;
    public final List slots() throws RecognitionException {
        List slots = null;


        String s =null;


        slots = new ArrayList();
        try { dbg.enterRule(getGrammarFileName(), "slots");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(97, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:98:35: (s= slot (s= slot )* )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:99:2: s= slot (s= slot )*
            {
            dbg.location(99,3);
            pushFollow(FOLLOW_slot_in_slots330);
            s=slot();

            state._fsp--;
            if (state.failed) return slots;
            dbg.location(99,8);
            if ( state.backtracking==0 ) { slots.add(s); }
            dbg.location(99,33);
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:99:33: (s= slot )*
            try { dbg.enterSubRule(9);

            loop9:
            do {
                int alt9=2;
                try { dbg.enterDecision(9, decisionCanBacktrack[9]);

                int LA9_0 = input.LA(1);

                if ( (LA9_0==46||LA9_0==48||(LA9_0 >= 50 && LA9_0 <= 53)||(LA9_0 >= 56 && LA9_0 <= 57)||LA9_0==61||(LA9_0 >= 63 && LA9_0 <= 64)||(LA9_0 >= 66 && LA9_0 <= 78)||(LA9_0 >= 80 && LA9_0 <= 81)||(LA9_0 >= 83 && LA9_0 <= 85)||(LA9_0 >= 87 && LA9_0 <= 89)||(LA9_0 >= 93 && LA9_0 <= 94)||LA9_0==96) ) {
                    alt9=1;
                }


                } finally {dbg.exitDecision(9);}

                switch (alt9) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zhou/Projects/ETL2Py/AbiDML.g:99:34: s= slot
            	    {
            	    dbg.location(99,35);
            	    pushFollow(FOLLOW_slot_in_slots336);
            	    s=slot();

            	    state._fsp--;
            	    if (state.failed) return slots;
            	    dbg.location(99,40);
            	    if ( state.backtracking==0 ) { slots.add(s); }

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);
            } finally {dbg.exitSubRule(9);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(99, 65);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "slots");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return slots;
    }
    // $ANTLR end "slots"



    // $ANTLR start "slot"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:102:1: slot returns [String expr] : type var_list ';' ;
    public final String slot() throws RecognitionException {
        String expr = null;


        try { dbg.enterRule(getGrammarFileName(), "slot");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(102, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:103:2: ( type var_list ';' )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:108:7: type var_list ';'
            {
            dbg.location(108,7);
            pushFollow(FOLLOW_type_in_slot369);
            type();

            state._fsp--;
            if (state.failed) return expr;
            dbg.location(108,12);
            pushFollow(FOLLOW_var_list_in_slot371);
            var_list();

            state._fsp--;
            if (state.failed) return expr;
            dbg.location(108,21);
            match(input,31,FOLLOW_31_in_slot373); if (state.failed) return expr;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(112, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "slot");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return expr;
    }
    // $ANTLR end "slot"



    // $ANTLR start "primary_expression"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:116:1: primary_expression returns [String expr] : ( constant_expr | funcall_expr | variable_expr | unarycall | cast_expr | reinterpret_expr | '(' expression ')' | null_expr | getenv_expr | whole_record_expr | loop_expr | make_record_expr | make_vector_expr );
    public final String primary_expression() throws RecognitionException {
        String expr = null;


        String funcall_expr6 =null;


        try { dbg.enterRule(getGrammarFileName(), "primary_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(116, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:117:2: ( constant_expr | funcall_expr | variable_expr | unarycall | cast_expr | reinterpret_expr | '(' expression ')' | null_expr | getenv_expr | whole_record_expr | loop_expr | make_record_expr | make_vector_expr )
            int alt10=13;
            try { dbg.enterDecision(10, decisionCanBacktrack[10]);

            switch ( input.LA(1) ) {
            case FLOAT:
            case INT:
            case STRING:
                {
                alt10=1;
                }
                break;
            case ID:
                {
                int LA10_4 = input.LA(2);

                if ( (synpred22_AbiDML()) ) {
                    alt10=2;
                }
                else if ( (synpred23_AbiDML()) ) {
                    alt10=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return expr;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 4, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 15:
            case 24:
            case 100:
                {
                alt10=4;
                }
                break;
            case 21:
                {
                int LA10_8 = input.LA(2);

                if ( (synpred25_AbiDML()) ) {
                    alt10=5;
                }
                else if ( (synpred27_AbiDML()) ) {
                    alt10=7;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return expr;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 8, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 86:
                {
                alt10=6;
                }
                break;
            case 41:
                {
                alt10=8;
                }
                break;
            case 17:
                {
                alt10=9;
                }
                break;
            case 91:
                {
                alt10=10;
                }
                break;
            case 62:
            case 97:
                {
                alt10=11;
                }
                break;
            case 42:
                {
                int LA10_15 = input.LA(2);

                if ( (synpred32_AbiDML()) ) {
                    alt10=12;
                }
                else if ( (true) ) {
                    alt10=13;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return expr;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 15, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return expr;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(10);}

            switch (alt10) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:117:4: constant_expr
                    {
                    dbg.location(117,4);
                    pushFollow(FOLLOW_constant_expr_in_primary_expression400);
                    constant_expr();

                    state._fsp--;
                    if (state.failed) return expr;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:118:4: funcall_expr
                    {
                    dbg.location(118,4);
                    pushFollow(FOLLOW_funcall_expr_in_primary_expression405);
                    funcall_expr6=funcall_expr();

                    state._fsp--;
                    if (state.failed) return expr;
                    dbg.location(119,3);
                    if ( state.backtracking==0 ) {
                    			expr = funcall_expr6;
                    		}

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:122:4: variable_expr
                    {
                    dbg.location(122,4);
                    pushFollow(FOLLOW_variable_expr_in_primary_expression414);
                    variable_expr();

                    state._fsp--;
                    if (state.failed) return expr;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:123:4: unarycall
                    {
                    dbg.location(123,4);
                    pushFollow(FOLLOW_unarycall_in_primary_expression419);
                    unarycall();

                    state._fsp--;
                    if (state.failed) return expr;

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:124:4: cast_expr
                    {
                    dbg.location(124,4);
                    pushFollow(FOLLOW_cast_expr_in_primary_expression424);
                    cast_expr();

                    state._fsp--;
                    if (state.failed) return expr;

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:125:4: reinterpret_expr
                    {
                    dbg.location(125,4);
                    pushFollow(FOLLOW_reinterpret_expr_in_primary_expression429);
                    reinterpret_expr();

                    state._fsp--;
                    if (state.failed) return expr;

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:126:4: '(' expression ')'
                    {
                    dbg.location(126,4);
                    match(input,21,FOLLOW_21_in_primary_expression434); if (state.failed) return expr;
                    dbg.location(126,8);
                    pushFollow(FOLLOW_expression_in_primary_expression436);
                    expression();

                    state._fsp--;
                    if (state.failed) return expr;
                    dbg.location(126,19);
                    match(input,22,FOLLOW_22_in_primary_expression438); if (state.failed) return expr;

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:127:4: null_expr
                    {
                    dbg.location(127,4);
                    pushFollow(FOLLOW_null_expr_in_primary_expression443);
                    null_expr();

                    state._fsp--;
                    if (state.failed) return expr;

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:128:4: getenv_expr
                    {
                    dbg.location(128,4);
                    pushFollow(FOLLOW_getenv_expr_in_primary_expression448);
                    getenv_expr();

                    state._fsp--;
                    if (state.failed) return expr;

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:129:4: whole_record_expr
                    {
                    dbg.location(129,4);
                    pushFollow(FOLLOW_whole_record_expr_in_primary_expression453);
                    whole_record_expr();

                    state._fsp--;
                    if (state.failed) return expr;

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:130:4: loop_expr
                    {
                    dbg.location(130,4);
                    pushFollow(FOLLOW_loop_expr_in_primary_expression458);
                    loop_expr();

                    state._fsp--;
                    if (state.failed) return expr;

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:131:4: make_record_expr
                    {
                    dbg.location(131,4);
                    pushFollow(FOLLOW_make_record_expr_in_primary_expression463);
                    make_record_expr();

                    state._fsp--;
                    if (state.failed) return expr;

                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:132:4: make_vector_expr
                    {
                    dbg.location(132,4);
                    pushFollow(FOLLOW_make_vector_expr_in_primary_expression468);
                    make_vector_expr();

                    state._fsp--;
                    if (state.failed) return expr;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(133, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "primary_expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return expr;
    }
    // $ANTLR end "primary_expression"



    // $ANTLR start "cast_expr"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:135:1: cast_expr : '(' type ')' expression ;
    public final void cast_expr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "cast_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(135, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:135:10: ( '(' type ')' expression )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:135:12: '(' type ')' expression
            {
            dbg.location(135,12);
            match(input,21,FOLLOW_21_in_cast_expr477); if (state.failed) return ;
            dbg.location(135,16);
            pushFollow(FOLLOW_type_in_cast_expr479);
            type();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(135,21);
            match(input,22,FOLLOW_22_in_cast_expr481); if (state.failed) return ;
            dbg.location(135,25);
            pushFollow(FOLLOW_expression_in_cast_expr483);
            expression();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(136, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "cast_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "cast_expr"



    // $ANTLR start "reinterpret_expr"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:138:1: reinterpret_expr : 'reinterpret_as' '(' type ',' expression ')' ;
    public final void reinterpret_expr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "reinterpret_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(138, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:139:2: ( 'reinterpret_as' '(' type ',' expression ')' )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:139:4: 'reinterpret_as' '(' type ',' expression ')'
            {
            dbg.location(139,4);
            match(input,86,FOLLOW_86_in_reinterpret_expr495); if (state.failed) return ;
            dbg.location(139,21);
            match(input,21,FOLLOW_21_in_reinterpret_expr497); if (state.failed) return ;
            dbg.location(139,25);
            pushFollow(FOLLOW_type_in_reinterpret_expr499);
            type();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(139,30);
            match(input,25,FOLLOW_25_in_reinterpret_expr501); if (state.failed) return ;
            dbg.location(139,34);
            pushFollow(FOLLOW_expression_in_reinterpret_expr503);
            expression();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(139,45);
            match(input,22,FOLLOW_22_in_reinterpret_expr505); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(140, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "reinterpret_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "reinterpret_expr"



    // $ANTLR start "getenv_expr"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:142:1: getenv_expr : '$' name ;
    public final void getenv_expr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "getenv_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(142, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:143:2: ( '$' name )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:143:4: '$' name
            {
            dbg.location(143,4);
            match(input,17,FOLLOW_17_in_getenv_expr517); if (state.failed) return ;
            dbg.location(143,8);
            pushFollow(FOLLOW_name_in_getenv_expr519);
            name();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(144, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "getenv_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "getenv_expr"



    // $ANTLR start "whole_record_expr"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:146:1: whole_record_expr : 'this_record' ;
    public final void whole_record_expr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "whole_record_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(146, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:147:2: ( 'this_record' )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:147:4: 'this_record'
            {
            dbg.location(147,4);
            match(input,91,FOLLOW_91_in_whole_record_expr531); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(148, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "whole_record_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "whole_record_expr"



    // $ANTLR start "loop_expr"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:150:1: loop_expr : ( 'while' '(' expression ')' ( opt_statement )+ ':' expression | 'for' '(' variable_expr ',' expression ')' ( opt_statement )+ ':' expression );
    public final void loop_expr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "loop_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(150, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:151:2: ( 'while' '(' expression ')' ( opt_statement )+ ':' expression | 'for' '(' variable_expr ',' expression ')' ( opt_statement )+ ':' expression )
            int alt13=2;
            try { dbg.enterDecision(13, decisionCanBacktrack[13]);

            int LA13_0 = input.LA(1);

            if ( (LA13_0==97) ) {
                alt13=1;
            }
            else if ( (LA13_0==62) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(13);}

            switch (alt13) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:151:4: 'while' '(' expression ')' ( opt_statement )+ ':' expression
                    {
                    dbg.location(151,4);
                    match(input,97,FOLLOW_97_in_loop_expr543); if (state.failed) return ;
                    dbg.location(151,12);
                    match(input,21,FOLLOW_21_in_loop_expr545); if (state.failed) return ;
                    dbg.location(151,16);
                    pushFollow(FOLLOW_expression_in_loop_expr547);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(151,27);
                    match(input,22,FOLLOW_22_in_loop_expr549); if (state.failed) return ;
                    dbg.location(151,31);
                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:151:31: ( opt_statement )+
                    int cnt11=0;
                    try { dbg.enterSubRule(11);

                    loop11:
                    do {
                        int alt11=2;
                        try { dbg.enterDecision(11, decisionCanBacktrack[11]);

                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==FLOAT||(LA11_0 >= ID && LA11_0 <= INT)||LA11_0==STRING||LA11_0==15||LA11_0==17||LA11_0==21||LA11_0==24||(LA11_0 >= 41 && LA11_0 <= 42)||LA11_0==47||LA11_0==62||LA11_0==86||LA11_0==91||LA11_0==97||LA11_0==100) ) {
                            alt11=1;
                        }


                        } finally {dbg.exitDecision(11);}

                        switch (alt11) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/zhou/Projects/ETL2Py/AbiDML.g:151:31: opt_statement
                    	    {
                    	    dbg.location(151,31);
                    	    pushFollow(FOLLOW_opt_statement_in_loop_expr551);
                    	    opt_statement();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt11++;
                    } while (true);
                    } finally {dbg.exitSubRule(11);}

                    dbg.location(151,46);
                    match(input,29,FOLLOW_29_in_loop_expr554); if (state.failed) return ;
                    dbg.location(151,50);
                    pushFollow(FOLLOW_expression_in_loop_expr556);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:152:4: 'for' '(' variable_expr ',' expression ')' ( opt_statement )+ ':' expression
                    {
                    dbg.location(152,4);
                    match(input,62,FOLLOW_62_in_loop_expr561); if (state.failed) return ;
                    dbg.location(152,10);
                    match(input,21,FOLLOW_21_in_loop_expr563); if (state.failed) return ;
                    dbg.location(152,14);
                    pushFollow(FOLLOW_variable_expr_in_loop_expr565);
                    variable_expr();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(152,28);
                    match(input,25,FOLLOW_25_in_loop_expr567); if (state.failed) return ;
                    dbg.location(152,32);
                    pushFollow(FOLLOW_expression_in_loop_expr569);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(152,43);
                    match(input,22,FOLLOW_22_in_loop_expr571); if (state.failed) return ;
                    dbg.location(152,47);
                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:152:47: ( opt_statement )+
                    int cnt12=0;
                    try { dbg.enterSubRule(12);

                    loop12:
                    do {
                        int alt12=2;
                        try { dbg.enterDecision(12, decisionCanBacktrack[12]);

                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==FLOAT||(LA12_0 >= ID && LA12_0 <= INT)||LA12_0==STRING||LA12_0==15||LA12_0==17||LA12_0==21||LA12_0==24||(LA12_0 >= 41 && LA12_0 <= 42)||LA12_0==47||LA12_0==62||LA12_0==86||LA12_0==91||LA12_0==97||LA12_0==100) ) {
                            alt12=1;
                        }


                        } finally {dbg.exitDecision(12);}

                        switch (alt12) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/zhou/Projects/ETL2Py/AbiDML.g:152:47: opt_statement
                    	    {
                    	    dbg.location(152,47);
                    	    pushFollow(FOLLOW_opt_statement_in_loop_expr573);
                    	    opt_statement();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt12++;
                    } while (true);
                    } finally {dbg.exitSubRule(12);}

                    dbg.location(152,62);
                    match(input,29,FOLLOW_29_in_loop_expr576); if (state.failed) return ;
                    dbg.location(152,66);
                    pushFollow(FOLLOW_expression_in_loop_expr578);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(153, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "loop_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "loop_expr"



    // $ANTLR start "opt_statement"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:155:1: opt_statement : ( assignment | block_statement );
    public final void opt_statement() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "opt_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(155, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:156:2: ( assignment | block_statement )
            int alt14=2;
            try { dbg.enterDecision(14, decisionCanBacktrack[14]);

            int LA14_0 = input.LA(1);

            if ( (LA14_0==FLOAT||(LA14_0 >= ID && LA14_0 <= INT)||LA14_0==STRING||LA14_0==15||LA14_0==17||LA14_0==21||LA14_0==24||(LA14_0 >= 41 && LA14_0 <= 42)||LA14_0==62||LA14_0==86||LA14_0==91||LA14_0==97||LA14_0==100) ) {
                alt14=1;
            }
            else if ( (LA14_0==47) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(14);}

            switch (alt14) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:156:4: assignment
                    {
                    dbg.location(156,4);
                    pushFollow(FOLLOW_assignment_in_opt_statement590);
                    assignment();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:157:4: block_statement
                    {
                    dbg.location(157,4);
                    pushFollow(FOLLOW_block_statement_in_opt_statement595);
                    block_statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(158, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "opt_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "opt_statement"



    // $ANTLR start "make_record_expr"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:160:1: make_record_expr : '[' 'record' record_expr_slots ']' ;
    public final void make_record_expr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "make_record_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(160, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:161:2: ( '[' 'record' record_expr_slots ']' )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:161:4: '[' 'record' record_expr_slots ']'
            {
            dbg.location(161,4);
            match(input,42,FOLLOW_42_in_make_record_expr607); if (state.failed) return ;
            dbg.location(161,8);
            match(input,85,FOLLOW_85_in_make_record_expr609); if (state.failed) return ;
            dbg.location(161,17);
            pushFollow(FOLLOW_record_expr_slots_in_make_record_expr611);
            record_expr_slots();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(161,35);
            match(input,43,FOLLOW_43_in_make_record_expr613); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(162, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "make_record_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "make_record_expr"



    // $ANTLR start "record_expr_slots"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:164:1: record_expr_slots : field_name expression ( ',' field_name expression )* ;
    public final void record_expr_slots() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "record_expr_slots");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(164, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:165:2: ( field_name expression ( ',' field_name expression )* )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:165:4: field_name expression ( ',' field_name expression )*
            {
            dbg.location(165,4);
            pushFollow(FOLLOW_field_name_in_record_expr_slots624);
            field_name();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(165,15);
            pushFollow(FOLLOW_expression_in_record_expr_slots626);
            expression();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(165,26);
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:165:26: ( ',' field_name expression )*
            try { dbg.enterSubRule(15);

            loop15:
            do {
                int alt15=2;
                try { dbg.enterDecision(15, decisionCanBacktrack[15]);

                int LA15_0 = input.LA(1);

                if ( (LA15_0==25) ) {
                    alt15=1;
                }


                } finally {dbg.exitDecision(15);}

                switch (alt15) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zhou/Projects/ETL2Py/AbiDML.g:165:27: ',' field_name expression
            	    {
            	    dbg.location(165,27);
            	    match(input,25,FOLLOW_25_in_record_expr_slots629); if (state.failed) return ;
            	    dbg.location(165,31);
            	    pushFollow(FOLLOW_field_name_in_record_expr_slots631);
            	    field_name();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    dbg.location(165,42);
            	    pushFollow(FOLLOW_expression_in_record_expr_slots633);
            	    expression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);
            } finally {dbg.exitSubRule(15);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(166, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "record_expr_slots");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "record_expr_slots"



    // $ANTLR start "make_vector_expr"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:168:1: make_vector_expr : '[' 'vector' expression ( ',' expression )* ']' ;
    public final void make_vector_expr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "make_vector_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(168, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:169:2: ( '[' 'vector' expression ( ',' expression )* ']' )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:169:4: '[' 'vector' expression ( ',' expression )* ']'
            {
            dbg.location(169,4);
            match(input,42,FOLLOW_42_in_make_vector_expr647); if (state.failed) return ;
            dbg.location(169,8);
            match(input,95,FOLLOW_95_in_make_vector_expr649); if (state.failed) return ;
            dbg.location(169,17);
            pushFollow(FOLLOW_expression_in_make_vector_expr651);
            expression();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(169,28);
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:169:28: ( ',' expression )*
            try { dbg.enterSubRule(16);

            loop16:
            do {
                int alt16=2;
                try { dbg.enterDecision(16, decisionCanBacktrack[16]);

                int LA16_0 = input.LA(1);

                if ( (LA16_0==25) ) {
                    alt16=1;
                }


                } finally {dbg.exitDecision(16);}

                switch (alt16) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zhou/Projects/ETL2Py/AbiDML.g:169:29: ',' expression
            	    {
            	    dbg.location(169,29);
            	    match(input,25,FOLLOW_25_in_make_vector_expr654); if (state.failed) return ;
            	    dbg.location(169,33);
            	    pushFollow(FOLLOW_expression_in_make_vector_expr656);
            	    expression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);
            } finally {dbg.exitSubRule(16);}

            dbg.location(169,46);
            match(input,43,FOLLOW_43_in_make_vector_expr660); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(170, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "make_vector_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "make_vector_expr"



    // $ANTLR start "expression"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:172:1: expression returns [String expr] : ( ( primary_expression ( ( '.' ( ( name )+ | '*' ) ) | ( binop expression ) | ( '[' expression ']' ) | ( conditionalop expression ) | ( '?' expression ':' expression ) )? ) | 'if' '(' expression ')' expression ( 'else' expression )? );
    public final String expression() throws RecognitionException {
        String expr = null;


        String primary_expression7 =null;


        try { dbg.enterRule(getGrammarFileName(), "expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(172, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:173:2: ( ( primary_expression ( ( '.' ( ( name )+ | '*' ) ) | ( binop expression ) | ( '[' expression ']' ) | ( conditionalop expression ) | ( '?' expression ':' expression ) )? ) | 'if' '(' expression ')' expression ( 'else' expression )? )
            int alt21=2;
            try { dbg.enterDecision(21, decisionCanBacktrack[21]);

            int LA21_0 = input.LA(1);

            if ( (LA21_0==FLOAT||(LA21_0 >= ID && LA21_0 <= INT)||LA21_0==STRING||LA21_0==15||LA21_0==17||LA21_0==21||LA21_0==24||(LA21_0 >= 41 && LA21_0 <= 42)||LA21_0==62||LA21_0==86||LA21_0==91||LA21_0==97||LA21_0==100) ) {
                alt21=1;
            }
            else if ( (LA21_0==65) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return expr;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(21);}

            switch (alt21) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:174:3: ( primary_expression ( ( '.' ( ( name )+ | '*' ) ) | ( binop expression ) | ( '[' expression ']' ) | ( conditionalop expression ) | ( '?' expression ':' expression ) )? )
                    {
                    dbg.location(174,3);
                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:174:3: ( primary_expression ( ( '.' ( ( name )+ | '*' ) ) | ( binop expression ) | ( '[' expression ']' ) | ( conditionalop expression ) | ( '?' expression ':' expression ) )? )
                    dbg.enterAlt(1);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:175:4: primary_expression ( ( '.' ( ( name )+ | '*' ) ) | ( binop expression ) | ( '[' expression ']' ) | ( conditionalop expression ) | ( '?' expression ':' expression ) )?
                    {
                    dbg.location(175,4);
                    pushFollow(FOLLOW_primary_expression_in_expression683);
                    primary_expression7=primary_expression();

                    state._fsp--;
                    if (state.failed) return expr;
                    dbg.location(176,4);
                    if ( state.backtracking==0 ) {expr = primary_expression7;}
                    dbg.location(177,4);
                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:177:4: ( ( '.' ( ( name )+ | '*' ) ) | ( binop expression ) | ( '[' expression ']' ) | ( conditionalop expression ) | ( '?' expression ':' expression ) )?
                    int alt19=6;
                    try { dbg.enterSubRule(19);
                    try { dbg.enterDecision(19, decisionCanBacktrack[19]);

                    switch ( input.LA(1) ) {
                        case 27:
                            {
                            int LA19_1 = input.LA(2);

                            if ( (synpred41_AbiDML()) ) {
                                alt19=1;
                            }
                            }
                            break;
                        case 19:
                        case 45:
                        case 82:
                        case 99:
                            {
                            int LA19_2 = input.LA(2);

                            if ( (synpred42_AbiDML()) ) {
                                alt19=2;
                            }
                            else if ( (synpred44_AbiDML()) ) {
                                alt19=4;
                            }
                            }
                            break;
                        case 42:
                            {
                            int LA19_3 = input.LA(2);

                            if ( (synpred43_AbiDML()) ) {
                                alt19=3;
                            }
                            }
                            break;
                        case 24:
                            {
                            int LA19_4 = input.LA(2);

                            if ( (synpred42_AbiDML()) ) {
                                alt19=2;
                            }
                            }
                            break;
                        case 40:
                            {
                            int LA19_5 = input.LA(2);

                            if ( (synpred45_AbiDML()) ) {
                                alt19=5;
                            }
                            }
                            break;
                        case 16:
                        case 18:
                        case 20:
                        case 23:
                        case 26:
                        case 28:
                        case 32:
                        case 33:
                        case 34:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 44:
                        case 98:
                            {
                            int LA19_7 = input.LA(2);

                            if ( (synpred42_AbiDML()) ) {
                                alt19=2;
                            }
                            }
                            break;
                    }

                    } finally {dbg.exitDecision(19);}

                    switch (alt19) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/zhou/Projects/ETL2Py/AbiDML.g:178:5: ( '.' ( ( name )+ | '*' ) )
                            {
                            dbg.location(178,5);
                            // /Users/zhou/Projects/ETL2Py/AbiDML.g:178:5: ( '.' ( ( name )+ | '*' ) )
                            dbg.enterAlt(1);

                            // /Users/zhou/Projects/ETL2Py/AbiDML.g:178:6: '.' ( ( name )+ | '*' )
                            {
                            dbg.location(178,6);
                            match(input,27,FOLLOW_27_in_expression700); if (state.failed) return expr;
                            dbg.location(178,10);
                            // /Users/zhou/Projects/ETL2Py/AbiDML.g:178:10: ( ( name )+ | '*' )
                            int alt18=2;
                            try { dbg.enterSubRule(18);
                            try { dbg.enterDecision(18, decisionCanBacktrack[18]);

                            int LA18_0 = input.LA(1);

                            if ( (LA18_0==ID) ) {
                                alt18=1;
                            }
                            else if ( (LA18_0==23) ) {
                                alt18=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return expr;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 18, 0, input);

                                dbg.recognitionException(nvae);
                                throw nvae;

                            }
                            } finally {dbg.exitDecision(18);}

                            switch (alt18) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:178:11: ( name )+
                                    {
                                    dbg.location(178,11);
                                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:178:11: ( name )+
                                    int cnt17=0;
                                    try { dbg.enterSubRule(17);

                                    loop17:
                                    do {
                                        int alt17=2;
                                        try { dbg.enterDecision(17, decisionCanBacktrack[17]);

                                        int LA17_0 = input.LA(1);

                                        if ( (LA17_0==ID) ) {
                                            int LA17_2 = input.LA(2);

                                            if ( (synpred39_AbiDML()) ) {
                                                alt17=1;
                                            }


                                        }


                                        } finally {dbg.exitDecision(17);}

                                        switch (alt17) {
                                    	case 1 :
                                    	    dbg.enterAlt(1);

                                    	    // /Users/zhou/Projects/ETL2Py/AbiDML.g:178:11: name
                                    	    {
                                    	    dbg.location(178,11);
                                    	    pushFollow(FOLLOW_name_in_expression703);
                                    	    name();

                                    	    state._fsp--;
                                    	    if (state.failed) return expr;

                                    	    }
                                    	    break;

                                    	default :
                                    	    if ( cnt17 >= 1 ) break loop17;
                                    	    if (state.backtracking>0) {state.failed=true; return expr;}
                                                EarlyExitException eee =
                                                    new EarlyExitException(17, input);
                                                dbg.recognitionException(eee);

                                                throw eee;
                                        }
                                        cnt17++;
                                    } while (true);
                                    } finally {dbg.exitSubRule(17);}


                                    }
                                    break;
                                case 2 :
                                    dbg.enterAlt(2);

                                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:178:19: '*'
                                    {
                                    dbg.location(178,19);
                                    match(input,23,FOLLOW_23_in_expression708); if (state.failed) return expr;

                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(18);}


                            }


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/zhou/Projects/ETL2Py/AbiDML.g:180:5: ( binop expression )
                            {
                            dbg.location(180,5);
                            // /Users/zhou/Projects/ETL2Py/AbiDML.g:180:5: ( binop expression )
                            dbg.enterAlt(1);

                            // /Users/zhou/Projects/ETL2Py/AbiDML.g:180:6: binop expression
                            {
                            dbg.location(180,6);
                            pushFollow(FOLLOW_binop_in_expression724);
                            binop();

                            state._fsp--;
                            if (state.failed) return expr;
                            dbg.location(180,12);
                            pushFollow(FOLLOW_expression_in_expression726);
                            expression();

                            state._fsp--;
                            if (state.failed) return expr;

                            }


                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/zhou/Projects/ETL2Py/AbiDML.g:182:5: ( '[' expression ']' )
                            {
                            dbg.location(182,5);
                            // /Users/zhou/Projects/ETL2Py/AbiDML.g:182:5: ( '[' expression ']' )
                            dbg.enterAlt(1);

                            // /Users/zhou/Projects/ETL2Py/AbiDML.g:182:6: '[' expression ']'
                            {
                            dbg.location(182,6);
                            match(input,42,FOLLOW_42_in_expression740); if (state.failed) return expr;
                            dbg.location(182,10);
                            pushFollow(FOLLOW_expression_in_expression742);
                            expression();

                            state._fsp--;
                            if (state.failed) return expr;
                            dbg.location(182,21);
                            match(input,43,FOLLOW_43_in_expression744); if (state.failed) return expr;

                            }


                            }
                            break;
                        case 4 :
                            dbg.enterAlt(4);

                            // /Users/zhou/Projects/ETL2Py/AbiDML.g:184:5: ( conditionalop expression )
                            {
                            dbg.location(184,5);
                            // /Users/zhou/Projects/ETL2Py/AbiDML.g:184:5: ( conditionalop expression )
                            dbg.enterAlt(1);

                            // /Users/zhou/Projects/ETL2Py/AbiDML.g:184:6: conditionalop expression
                            {
                            dbg.location(184,6);
                            pushFollow(FOLLOW_conditionalop_in_expression758);
                            conditionalop();

                            state._fsp--;
                            if (state.failed) return expr;
                            dbg.location(184,20);
                            pushFollow(FOLLOW_expression_in_expression760);
                            expression();

                            state._fsp--;
                            if (state.failed) return expr;

                            }


                            }
                            break;
                        case 5 :
                            dbg.enterAlt(5);

                            // /Users/zhou/Projects/ETL2Py/AbiDML.g:186:5: ( '?' expression ':' expression )
                            {
                            dbg.location(186,5);
                            // /Users/zhou/Projects/ETL2Py/AbiDML.g:186:5: ( '?' expression ':' expression )
                            dbg.enterAlt(1);

                            // /Users/zhou/Projects/ETL2Py/AbiDML.g:186:6: '?' expression ':' expression
                            {
                            dbg.location(186,6);
                            match(input,40,FOLLOW_40_in_expression776); if (state.failed) return expr;
                            dbg.location(186,10);
                            pushFollow(FOLLOW_expression_in_expression778);
                            expression();

                            state._fsp--;
                            if (state.failed) return expr;
                            dbg.location(186,21);
                            match(input,29,FOLLOW_29_in_expression780); if (state.failed) return expr;
                            dbg.location(186,25);
                            pushFollow(FOLLOW_expression_in_expression782);
                            expression();

                            state._fsp--;
                            if (state.failed) return expr;

                            }


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(19);}


                    }


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:190:3: 'if' '(' expression ')' expression ( 'else' expression )?
                    {
                    dbg.location(190,3);
                    match(input,65,FOLLOW_65_in_expression801); if (state.failed) return expr;
                    dbg.location(190,8);
                    match(input,21,FOLLOW_21_in_expression803); if (state.failed) return expr;
                    dbg.location(190,12);
                    pushFollow(FOLLOW_expression_in_expression805);
                    expression();

                    state._fsp--;
                    if (state.failed) return expr;
                    dbg.location(190,23);
                    match(input,22,FOLLOW_22_in_expression807); if (state.failed) return expr;
                    dbg.location(190,27);
                    pushFollow(FOLLOW_expression_in_expression809);
                    expression();

                    state._fsp--;
                    if (state.failed) return expr;
                    dbg.location(190,38);
                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:190:38: ( 'else' expression )?
                    int alt20=2;
                    try { dbg.enterSubRule(20);
                    try { dbg.enterDecision(20, decisionCanBacktrack[20]);

                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==58) ) {
                        int LA20_1 = input.LA(2);

                        if ( (synpred47_AbiDML()) ) {
                            alt20=1;
                        }
                    }
                    } finally {dbg.exitDecision(20);}

                    switch (alt20) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/zhou/Projects/ETL2Py/AbiDML.g:190:39: 'else' expression
                            {
                            dbg.location(190,39);
                            match(input,58,FOLLOW_58_in_expression812); if (state.failed) return expr;
                            dbg.location(190,46);
                            pushFollow(FOLLOW_expression_in_expression814);
                            expression();

                            state._fsp--;
                            if (state.failed) return expr;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(20);}


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(196, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return expr;
    }
    // $ANTLR end "expression"



    // $ANTLR start "field_expr"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:199:1: field_expr : primary_expression '.' ( ( name )+ | '*' ) ;
    public final void field_expr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "field_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(199, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:200:2: ( primary_expression '.' ( ( name )+ | '*' ) )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:200:4: primary_expression '.' ( ( name )+ | '*' )
            {
            dbg.location(200,4);
            pushFollow(FOLLOW_primary_expression_in_field_expr834);
            primary_expression();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(200,23);
            match(input,27,FOLLOW_27_in_field_expr836); if (state.failed) return ;
            dbg.location(200,27);
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:200:27: ( ( name )+ | '*' )
            int alt23=2;
            try { dbg.enterSubRule(23);
            try { dbg.enterDecision(23, decisionCanBacktrack[23]);

            int LA23_0 = input.LA(1);

            if ( (LA23_0==ID) ) {
                alt23=1;
            }
            else if ( (LA23_0==23) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(23);}

            switch (alt23) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:200:28: ( name )+
                    {
                    dbg.location(200,28);
                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:200:28: ( name )+
                    int cnt22=0;
                    try { dbg.enterSubRule(22);

                    loop22:
                    do {
                        int alt22=2;
                        try { dbg.enterDecision(22, decisionCanBacktrack[22]);

                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==ID) ) {
                            alt22=1;
                        }


                        } finally {dbg.exitDecision(22);}

                        switch (alt22) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/zhou/Projects/ETL2Py/AbiDML.g:200:28: name
                    	    {
                    	    dbg.location(200,28);
                    	    pushFollow(FOLLOW_name_in_field_expr839);
                    	    name();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt22 >= 1 ) break loop22;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(22, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt22++;
                    } while (true);
                    } finally {dbg.exitSubRule(22);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:200:36: '*'
                    {
                    dbg.location(200,36);
                    match(input,23,FOLLOW_23_in_field_expr844); if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(23);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(201, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "field_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "field_expr"



    // $ANTLR start "element_expr"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:203:1: element_expr : primary_expression '[' expression ']' ;
    public final void element_expr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "element_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(203, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:204:2: ( primary_expression '[' expression ']' )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:204:4: primary_expression '[' expression ']'
            {
            dbg.location(204,4);
            pushFollow(FOLLOW_primary_expression_in_element_expr856);
            primary_expression();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(204,23);
            match(input,42,FOLLOW_42_in_element_expr858); if (state.failed) return ;
            dbg.location(204,27);
            pushFollow(FOLLOW_expression_in_element_expr860);
            expression();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(204,38);
            match(input,43,FOLLOW_43_in_element_expr862); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(205, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "element_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "element_expr"



    // $ANTLR start "binarycall"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:208:1: binarycall : primary_expression binop expression ;
    public final void binarycall() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "binarycall");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(208, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:209:2: ( primary_expression binop expression )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:209:4: primary_expression binop expression
            {
            dbg.location(209,4);
            pushFollow(FOLLOW_primary_expression_in_binarycall874);
            primary_expression();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(209,23);
            pushFollow(FOLLOW_binop_in_binarycall876);
            binop();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(209,29);
            pushFollow(FOLLOW_expression_in_binarycall878);
            expression();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(210, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "binarycall");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "binarycall"



    // $ANTLR start "conditionalop"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:212:1: conditionalop : ( '||' | 'or' | '&&' | 'and' );
    public final void conditionalop() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "conditionalop");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(212, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:213:2: ( '||' | 'or' | '&&' | 'and' )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:
            {
            dbg.location(213,2);
            if ( input.LA(1)==19||input.LA(1)==45||input.LA(1)==82||input.LA(1)==99 ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(214, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "conditionalop");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "conditionalop"



    // $ANTLR start "conditional"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:216:1: conditional : ( primary_expression ( conditionalop expression | '?' expression ':' expression ) | 'if' '(' expression ')' expression ( 'else' expression )? );
    public final void conditional() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "conditional");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(216, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:217:2: ( primary_expression ( conditionalop expression | '?' expression ':' expression ) | 'if' '(' expression ')' expression ( 'else' expression )? )
            int alt26=2;
            try { dbg.enterDecision(26, decisionCanBacktrack[26]);

            int LA26_0 = input.LA(1);

            if ( (LA26_0==FLOAT||(LA26_0 >= ID && LA26_0 <= INT)||LA26_0==STRING||LA26_0==15||LA26_0==17||LA26_0==21||LA26_0==24||(LA26_0 >= 41 && LA26_0 <= 42)||LA26_0==62||LA26_0==86||LA26_0==91||LA26_0==97||LA26_0==100) ) {
                alt26=1;
            }
            else if ( (LA26_0==65) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(26);}

            switch (alt26) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:217:4: primary_expression ( conditionalop expression | '?' expression ':' expression )
                    {
                    dbg.location(217,4);
                    pushFollow(FOLLOW_primary_expression_in_conditional912);
                    primary_expression();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(217,23);
                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:217:23: ( conditionalop expression | '?' expression ':' expression )
                    int alt24=2;
                    try { dbg.enterSubRule(24);
                    try { dbg.enterDecision(24, decisionCanBacktrack[24]);

                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==19||LA24_0==45||LA24_0==82||LA24_0==99) ) {
                        alt24=1;
                    }
                    else if ( (LA24_0==40) ) {
                        alt24=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                    } finally {dbg.exitDecision(24);}

                    switch (alt24) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/zhou/Projects/ETL2Py/AbiDML.g:217:24: conditionalop expression
                            {
                            dbg.location(217,24);
                            pushFollow(FOLLOW_conditionalop_in_conditional915);
                            conditionalop();

                            state._fsp--;
                            if (state.failed) return ;
                            dbg.location(217,38);
                            pushFollow(FOLLOW_expression_in_conditional917);
                            expression();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/zhou/Projects/ETL2Py/AbiDML.g:217:51: '?' expression ':' expression
                            {
                            dbg.location(217,51);
                            match(input,40,FOLLOW_40_in_conditional921); if (state.failed) return ;
                            dbg.location(217,55);
                            pushFollow(FOLLOW_expression_in_conditional923);
                            expression();

                            state._fsp--;
                            if (state.failed) return ;
                            dbg.location(217,66);
                            match(input,29,FOLLOW_29_in_conditional925); if (state.failed) return ;
                            dbg.location(217,70);
                            pushFollow(FOLLOW_expression_in_conditional927);
                            expression();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(24);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:218:4: 'if' '(' expression ')' expression ( 'else' expression )?
                    {
                    dbg.location(218,4);
                    match(input,65,FOLLOW_65_in_conditional933); if (state.failed) return ;
                    dbg.location(218,9);
                    match(input,21,FOLLOW_21_in_conditional935); if (state.failed) return ;
                    dbg.location(218,13);
                    pushFollow(FOLLOW_expression_in_conditional937);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(218,24);
                    match(input,22,FOLLOW_22_in_conditional939); if (state.failed) return ;
                    dbg.location(218,28);
                    pushFollow(FOLLOW_expression_in_conditional941);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(218,39);
                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:218:39: ( 'else' expression )?
                    int alt25=2;
                    try { dbg.enterSubRule(25);
                    try { dbg.enterDecision(25, decisionCanBacktrack[25]);

                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==58) ) {
                        alt25=1;
                    }
                    } finally {dbg.exitDecision(25);}

                    switch (alt25) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/zhou/Projects/ETL2Py/AbiDML.g:218:40: 'else' expression
                            {
                            dbg.location(218,40);
                            match(input,58,FOLLOW_58_in_conditional944); if (state.failed) return ;
                            dbg.location(218,47);
                            pushFollow(FOLLOW_expression_in_conditional946);
                            expression();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(25);}


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(219, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "conditional");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "conditional"



    // $ANTLR start "funcall_expr"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:221:1: funcall_expr returns [String expr] : ID '(' argument_list ')' ;
    public final String funcall_expr() throws RecognitionException {
        String expr = null;


        Token ID8=null;
        String argument_list9 =null;


        try { dbg.enterRule(getGrammarFileName(), "funcall_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(221, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:222:2: ( ID '(' argument_list ')' )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:222:4: ID '(' argument_list ')'
            {
            dbg.location(222,4);
            ID8=(Token)match(input,ID,FOLLOW_ID_in_funcall_expr967); if (state.failed) return expr;
            dbg.location(222,7);
            match(input,21,FOLLOW_21_in_funcall_expr969); if (state.failed) return expr;
            dbg.location(222,11);
            pushFollow(FOLLOW_argument_list_in_funcall_expr971);
            argument_list9=argument_list();

            state._fsp--;
            if (state.failed) return expr;
            dbg.location(222,25);
            match(input,22,FOLLOW_22_in_funcall_expr973); if (state.failed) return expr;
            dbg.location(223,3);
            if ( state.backtracking==0 ) {
            			expr = (ID8!=null?ID8.getText():null) + "(" + argument_list9 + ")";
            		}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(226, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "funcall_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return expr;
    }
    // $ANTLR end "funcall_expr"



    // $ANTLR start "variable_expr"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:228:1: variable_expr : name ;
    public final void variable_expr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "variable_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(228, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:229:2: ( name )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:229:4: name
            {
            dbg.location(229,4);
            pushFollow(FOLLOW_name_in_variable_expr988);
            name();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(230, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "variable_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "variable_expr"



    // $ANTLR start "name"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:232:1: name : ID ;
    public final void name() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "name");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(232, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:232:6: ( ID )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:232:8: ID
            {
            dbg.location(232,8);
            match(input,ID,FOLLOW_ID_in_name999); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(233, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "name");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "name"



    // $ANTLR start "unarycall"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:235:1: unarycall : ( '+' expression | '!' expression | '~' expression );
    public final void unarycall() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "unarycall");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(235, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:236:2: ( '+' expression | '!' expression | '~' expression )
            int alt27=3;
            try { dbg.enterDecision(27, decisionCanBacktrack[27]);

            switch ( input.LA(1) ) {
            case 24:
                {
                alt27=1;
                }
                break;
            case 15:
                {
                alt27=2;
                }
                break;
            case 100:
                {
                alt27=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(27);}

            switch (alt27) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:236:4: '+' expression
                    {
                    dbg.location(236,4);
                    match(input,24,FOLLOW_24_in_unarycall1010); if (state.failed) return ;
                    dbg.location(236,8);
                    pushFollow(FOLLOW_expression_in_unarycall1012);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:237:4: '!' expression
                    {
                    dbg.location(237,4);
                    match(input,15,FOLLOW_15_in_unarycall1017); if (state.failed) return ;
                    dbg.location(237,8);
                    pushFollow(FOLLOW_expression_in_unarycall1019);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:238:4: '~' expression
                    {
                    dbg.location(238,4);
                    match(input,100,FOLLOW_100_in_unarycall1024); if (state.failed) return ;
                    dbg.location(238,8);
                    pushFollow(FOLLOW_expression_in_unarycall1026);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(239, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "unarycall");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "unarycall"



    // $ANTLR start "argument_list"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:241:1: argument_list returns [String expr] : e= expression ( ',' e2= expression )* ;
    public final String argument_list() throws RecognitionException {
        String expr = null;


        String e =null;

        String e2 =null;


        try { dbg.enterRule(getGrammarFileName(), "argument_list");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(241, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:242:2: (e= expression ( ',' e2= expression )* )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:242:4: e= expression ( ',' e2= expression )*
            {
            dbg.location(242,5);
            pushFollow(FOLLOW_expression_in_argument_list1043);
            e=expression();

            state._fsp--;
            if (state.failed) return expr;
            dbg.location(242,17);
            if ( state.backtracking==0 ) {expr = e;}
            dbg.location(242,36);
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:242:36: ( ',' e2= expression )*
            try { dbg.enterSubRule(28);

            loop28:
            do {
                int alt28=2;
                try { dbg.enterDecision(28, decisionCanBacktrack[28]);

                int LA28_0 = input.LA(1);

                if ( (LA28_0==25) ) {
                    alt28=1;
                }


                } finally {dbg.exitDecision(28);}

                switch (alt28) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zhou/Projects/ETL2Py/AbiDML.g:242:37: ',' e2= expression
            	    {
            	    dbg.location(242,37);
            	    match(input,25,FOLLOW_25_in_argument_list1048); if (state.failed) return expr;
            	    dbg.location(242,43);
            	    pushFollow(FOLLOW_expression_in_argument_list1052);
            	    e2=expression();

            	    state._fsp--;
            	    if (state.failed) return expr;
            	    dbg.location(242,55);
            	    if ( state.backtracking==0 ) {expr = expr + "," + e2;}

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);
            } finally {dbg.exitSubRule(28);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(243, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "argument_list");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return expr;
    }
    // $ANTLR end "argument_list"



    // $ANTLR start "ifr_expression"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:245:1: ifr_expression : '(' '(' type ')' expression ')' ;
    public final void ifr_expression() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "ifr_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(245, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:246:2: ( '(' '(' type ')' expression ')' )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:246:4: '(' '(' type ')' expression ')'
            {
            dbg.location(246,4);
            match(input,21,FOLLOW_21_in_ifr_expression1067); if (state.failed) return ;
            dbg.location(246,8);
            match(input,21,FOLLOW_21_in_ifr_expression1069); if (state.failed) return ;
            dbg.location(246,12);
            pushFollow(FOLLOW_type_in_ifr_expression1071);
            type();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(246,17);
            match(input,22,FOLLOW_22_in_ifr_expression1073); if (state.failed) return ;
            dbg.location(246,21);
            pushFollow(FOLLOW_expression_in_ifr_expression1075);
            expression();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(246,31);
            match(input,22,FOLLOW_22_in_ifr_expression1076); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(247, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ifr_expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "ifr_expression"



    // $ANTLR start "if_expression"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:249:1: if_expression : 'if' '(' expression ')' ifr_expression ( 'else' ifr_expression )? ;
    public final void if_expression() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "if_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(249, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:250:2: ( 'if' '(' expression ')' ifr_expression ( 'else' ifr_expression )? )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:250:4: 'if' '(' expression ')' ifr_expression ( 'else' ifr_expression )?
            {
            dbg.location(250,4);
            match(input,65,FOLLOW_65_in_if_expression1088); if (state.failed) return ;
            dbg.location(250,9);
            match(input,21,FOLLOW_21_in_if_expression1090); if (state.failed) return ;
            dbg.location(250,13);
            pushFollow(FOLLOW_expression_in_if_expression1092);
            expression();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(250,24);
            match(input,22,FOLLOW_22_in_if_expression1094); if (state.failed) return ;
            dbg.location(250,28);
            pushFollow(FOLLOW_ifr_expression_in_if_expression1096);
            ifr_expression();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(250,43);
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:250:43: ( 'else' ifr_expression )?
            int alt29=2;
            try { dbg.enterSubRule(29);
            try { dbg.enterDecision(29, decisionCanBacktrack[29]);

            int LA29_0 = input.LA(1);

            if ( (LA29_0==58) ) {
                alt29=1;
            }
            } finally {dbg.exitDecision(29);}

            switch (alt29) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:250:44: 'else' ifr_expression
                    {
                    dbg.location(250,44);
                    match(input,58,FOLLOW_58_in_if_expression1099); if (state.failed) return ;
                    dbg.location(250,51);
                    pushFollow(FOLLOW_ifr_expression_in_if_expression1101);
                    ifr_expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(29);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(251, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "if_expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "if_expression"



    // $ANTLR start "binop"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:279:1: binop : ( '+' | '-' | '*' | '/' | '%' | '<' | '<=' | '>' | '>=' | '==' | '!=' | '&' | '^' | '|' | '<<' | '>>' | 'and' | 'or' | '&&' | '||' );
    public final void binop() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "binop");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(279, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:279:7: ( '+' | '-' | '*' | '/' | '%' | '<' | '<=' | '>' | '>=' | '==' | '!=' | '&' | '^' | '|' | '<<' | '>>' | 'and' | 'or' | '&&' | '||' )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:
            {
            dbg.location(279,7);
            if ( input.LA(1)==16||(input.LA(1) >= 18 && input.LA(1) <= 20)||(input.LA(1) >= 23 && input.LA(1) <= 24)||input.LA(1)==26||input.LA(1)==28||(input.LA(1) >= 32 && input.LA(1) <= 34)||(input.LA(1) >= 36 && input.LA(1) <= 39)||(input.LA(1) >= 44 && input.LA(1) <= 45)||input.LA(1)==82||(input.LA(1) >= 98 && input.LA(1) <= 99) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(283, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "binop");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "binop"



    // $ANTLR start "unop"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:285:1: unop : ( '+' | '!' | '~' );
    public final void unop() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "unop");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(285, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:285:6: ( '+' | '!' | '~' )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:
            {
            dbg.location(285,6);
            if ( input.LA(1)==15||input.LA(1)==24||input.LA(1)==100 ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(285, 23);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "unop");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "unop"



    // $ANTLR start "delimiter_expr"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:289:1: delimiter_expr : 'delimiter' '==' expression ;
    public final void delimiter_expr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "delimiter_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(289, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:290:2: ( 'delimiter' '==' expression )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:290:4: 'delimiter' '==' expression
            {
            dbg.location(290,4);
            match(input,55,FOLLOW_55_in_delimiter_expr1234); if (state.failed) return ;
            dbg.location(290,16);
            match(input,36,FOLLOW_36_in_delimiter_expr1236); if (state.failed) return ;
            dbg.location(290,21);
            pushFollow(FOLLOW_expression_in_delimiter_expr1238);
            expression();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(291, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "delimiter_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "delimiter_expr"



    // $ANTLR start "size_expr"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:292:1: size_expr : ( variable_expr | ( funcall_expr )=> funcall_expr | unarycall | ( field_expr )=> field_expr | ( element_expr )=> element_expr | ( binarycall )=> binarycall | ( conditional )=> conditional | ( cast_expr )=> cast_expr | '(' expression ')' );
    public final void size_expr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "size_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(292, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:293:2: ( variable_expr | ( funcall_expr )=> funcall_expr | unarycall | ( field_expr )=> field_expr | ( element_expr )=> element_expr | ( binarycall )=> binarycall | ( conditional )=> conditional | ( cast_expr )=> cast_expr | '(' expression ')' )
            int alt30=9;
            try { dbg.enterDecision(30, decisionCanBacktrack[30]);

            int LA30_0 = input.LA(1);

            if ( (LA30_0==ID) ) {
                int LA30_1 = input.LA(2);

                if ( (synpred81_AbiDML()) ) {
                    alt30=1;
                }
                else if ( (synpred82_AbiDML()) ) {
                    alt30=2;
                }
                else if ( (synpred84_AbiDML()) ) {
                    alt30=4;
                }
                else if ( (synpred85_AbiDML()) ) {
                    alt30=5;
                }
                else if ( (synpred86_AbiDML()) ) {
                    alt30=6;
                }
                else if ( (synpred87_AbiDML()) ) {
                    alt30=7;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else if ( (LA30_0==24) ) {
                int LA30_2 = input.LA(2);

                if ( (synpred83_AbiDML()) ) {
                    alt30=3;
                }
                else if ( (synpred84_AbiDML()) ) {
                    alt30=4;
                }
                else if ( (synpred85_AbiDML()) ) {
                    alt30=5;
                }
                else if ( (synpred86_AbiDML()) ) {
                    alt30=6;
                }
                else if ( (synpred87_AbiDML()) ) {
                    alt30=7;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else if ( (LA30_0==15) ) {
                int LA30_3 = input.LA(2);

                if ( (synpred83_AbiDML()) ) {
                    alt30=3;
                }
                else if ( (synpred84_AbiDML()) ) {
                    alt30=4;
                }
                else if ( (synpred85_AbiDML()) ) {
                    alt30=5;
                }
                else if ( (synpred86_AbiDML()) ) {
                    alt30=6;
                }
                else if ( (synpred87_AbiDML()) ) {
                    alt30=7;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 3, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else if ( (LA30_0==100) ) {
                int LA30_4 = input.LA(2);

                if ( (synpred83_AbiDML()) ) {
                    alt30=3;
                }
                else if ( (synpred84_AbiDML()) ) {
                    alt30=4;
                }
                else if ( (synpred85_AbiDML()) ) {
                    alt30=5;
                }
                else if ( (synpred86_AbiDML()) ) {
                    alt30=6;
                }
                else if ( (synpred87_AbiDML()) ) {
                    alt30=7;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 4, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else if ( (LA30_0==INT) ) {
                int LA30_5 = input.LA(2);

                if ( (synpred84_AbiDML()) ) {
                    alt30=4;
                }
                else if ( (synpred85_AbiDML()) ) {
                    alt30=5;
                }
                else if ( (synpred86_AbiDML()) ) {
                    alt30=6;
                }
                else if ( (synpred87_AbiDML()) ) {
                    alt30=7;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 5, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else if ( (LA30_0==FLOAT) ) {
                int LA30_6 = input.LA(2);

                if ( (synpred84_AbiDML()) ) {
                    alt30=4;
                }
                else if ( (synpred85_AbiDML()) ) {
                    alt30=5;
                }
                else if ( (synpred86_AbiDML()) ) {
                    alt30=6;
                }
                else if ( (synpred87_AbiDML()) ) {
                    alt30=7;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 6, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else if ( (LA30_0==STRING) ) {
                int LA30_7 = input.LA(2);

                if ( (synpred84_AbiDML()) ) {
                    alt30=4;
                }
                else if ( (synpred85_AbiDML()) ) {
                    alt30=5;
                }
                else if ( (synpred86_AbiDML()) ) {
                    alt30=6;
                }
                else if ( (synpred87_AbiDML()) ) {
                    alt30=7;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 7, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else if ( (LA30_0==21) ) {
                int LA30_8 = input.LA(2);

                if ( (synpred84_AbiDML()) ) {
                    alt30=4;
                }
                else if ( (synpred85_AbiDML()) ) {
                    alt30=5;
                }
                else if ( (synpred86_AbiDML()) ) {
                    alt30=6;
                }
                else if ( (synpred87_AbiDML()) ) {
                    alt30=7;
                }
                else if ( (synpred88_AbiDML()) ) {
                    alt30=8;
                }
                else if ( (true) ) {
                    alt30=9;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 8, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else if ( (LA30_0==86) ) {
                int LA30_9 = input.LA(2);

                if ( (synpred84_AbiDML()) ) {
                    alt30=4;
                }
                else if ( (synpred85_AbiDML()) ) {
                    alt30=5;
                }
                else if ( (synpred86_AbiDML()) ) {
                    alt30=6;
                }
                else if ( (synpred87_AbiDML()) ) {
                    alt30=7;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 9, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else if ( (LA30_0==41) ) {
                int LA30_10 = input.LA(2);

                if ( (synpred84_AbiDML()) ) {
                    alt30=4;
                }
                else if ( (synpred85_AbiDML()) ) {
                    alt30=5;
                }
                else if ( (synpred86_AbiDML()) ) {
                    alt30=6;
                }
                else if ( (synpred87_AbiDML()) ) {
                    alt30=7;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 10, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else if ( (LA30_0==17) ) {
                int LA30_11 = input.LA(2);

                if ( (synpred84_AbiDML()) ) {
                    alt30=4;
                }
                else if ( (synpred85_AbiDML()) ) {
                    alt30=5;
                }
                else if ( (synpred86_AbiDML()) ) {
                    alt30=6;
                }
                else if ( (synpred87_AbiDML()) ) {
                    alt30=7;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 11, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else if ( (LA30_0==91) ) {
                int LA30_12 = input.LA(2);

                if ( (synpred84_AbiDML()) ) {
                    alt30=4;
                }
                else if ( (synpred85_AbiDML()) ) {
                    alt30=5;
                }
                else if ( (synpred86_AbiDML()) ) {
                    alt30=6;
                }
                else if ( (synpred87_AbiDML()) ) {
                    alt30=7;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 12, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else if ( (LA30_0==97) ) {
                int LA30_13 = input.LA(2);

                if ( (synpred84_AbiDML()) ) {
                    alt30=4;
                }
                else if ( (synpred85_AbiDML()) ) {
                    alt30=5;
                }
                else if ( (synpred86_AbiDML()) ) {
                    alt30=6;
                }
                else if ( (synpred87_AbiDML()) ) {
                    alt30=7;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 13, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else if ( (LA30_0==62) ) {
                int LA30_14 = input.LA(2);

                if ( (synpred84_AbiDML()) ) {
                    alt30=4;
                }
                else if ( (synpred85_AbiDML()) ) {
                    alt30=5;
                }
                else if ( (synpred86_AbiDML()) ) {
                    alt30=6;
                }
                else if ( (synpred87_AbiDML()) ) {
                    alt30=7;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 14, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else if ( (LA30_0==42) ) {
                int LA30_15 = input.LA(2);

                if ( (synpred84_AbiDML()) ) {
                    alt30=4;
                }
                else if ( (synpred85_AbiDML()) ) {
                    alt30=5;
                }
                else if ( (synpred86_AbiDML()) ) {
                    alt30=6;
                }
                else if ( (synpred87_AbiDML()) ) {
                    alt30=7;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 15, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else if ( (LA30_0==65) && (synpred87_AbiDML())) {
                alt30=7;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(30);}

            switch (alt30) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:293:4: variable_expr
                    {
                    dbg.location(293,4);
                    pushFollow(FOLLOW_variable_expr_in_size_expr1248);
                    variable_expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:294:4: ( funcall_expr )=> funcall_expr
                    {
                    dbg.location(294,22);
                    pushFollow(FOLLOW_funcall_expr_in_size_expr1259);
                    funcall_expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:296:4: unarycall
                    {
                    dbg.location(296,4);
                    pushFollow(FOLLOW_unarycall_in_size_expr1266);
                    unarycall();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:298:4: ( field_expr )=> field_expr
                    {
                    dbg.location(298,22);
                    pushFollow(FOLLOW_field_expr_in_size_expr1281);
                    field_expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:299:4: ( element_expr )=> element_expr
                    {
                    dbg.location(299,22);
                    pushFollow(FOLLOW_element_expr_in_size_expr1292);
                    element_expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:300:4: ( binarycall )=> binarycall
                    {
                    dbg.location(300,22);
                    pushFollow(FOLLOW_binarycall_in_size_expr1305);
                    binarycall();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:301:4: ( conditional )=> conditional
                    {
                    dbg.location(301,22);
                    pushFollow(FOLLOW_conditional_in_size_expr1317);
                    conditional();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:303:4: ( cast_expr )=> cast_expr
                    {
                    dbg.location(303,19);
                    pushFollow(FOLLOW_cast_expr_in_size_expr1330);
                    cast_expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:304:4: '(' expression ')'
                    {
                    dbg.location(304,4);
                    match(input,21,FOLLOW_21_in_size_expr1335); if (state.failed) return ;
                    dbg.location(304,8);
                    pushFollow(FOLLOW_expression_in_size_expr1337);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(304,19);
                    match(input,22,FOLLOW_22_in_size_expr1339); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(305, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "size_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "size_expr"



    // $ANTLR start "constant_expr"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:309:1: constant_expr returns [String text] : ( INT | FLOAT | STRING );
    public final String constant_expr() throws RecognitionException {
        String text = null;


        Token INT10=null;
        Token FLOAT11=null;
        Token STRING12=null;

        try { dbg.enterRule(getGrammarFileName(), "constant_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(309, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:310:5: ( INT | FLOAT | STRING )
            int alt31=3;
            try { dbg.enterDecision(31, decisionCanBacktrack[31]);

            switch ( input.LA(1) ) {
            case INT:
                {
                alt31=1;
                }
                break;
            case FLOAT:
                {
                alt31=2;
                }
                break;
            case STRING:
                {
                alt31=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return text;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(31);}

            switch (alt31) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:310:9: INT
                    {
                    dbg.location(310,9);
                    INT10=(Token)match(input,INT,FOLLOW_INT_in_constant_expr1362); if (state.failed) return text;
                    dbg.location(310,16);
                    if ( state.backtracking==0 ) {text = (INT10!=null?INT10.getText():null);}

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:311:8: FLOAT
                    {
                    dbg.location(311,8);
                    FLOAT11=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_constant_expr1376); if (state.failed) return text;
                    dbg.location(311,15);
                    if ( state.backtracking==0 ) {text = (FLOAT11!=null?FLOAT11.getText():null);}

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:312:8: STRING
                    {
                    dbg.location(312,8);
                    STRING12=(Token)match(input,STRING,FOLLOW_STRING_in_constant_expr1388); if (state.failed) return text;
                    dbg.location(312,15);
                    if ( state.backtracking==0 ) {text = (STRING12!=null?STRING12.getText():null);}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(314, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "constant_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return text;
    }
    // $ANTLR end "constant_expr"



    // $ANTLR start "var_list"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:317:1: var_list : var ( ',' var )* ;
    public final void var_list() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "var_list");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(317, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:317:9: ( var ( ',' var )* )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:317:11: var ( ',' var )*
            {
            dbg.location(317,11);
            pushFollow(FOLLOW_var_in_var_list1413);
            var();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(317,15);
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:317:15: ( ',' var )*
            try { dbg.enterSubRule(32);

            loop32:
            do {
                int alt32=2;
                try { dbg.enterDecision(32, decisionCanBacktrack[32]);

                int LA32_0 = input.LA(1);

                if ( (LA32_0==25) ) {
                    alt32=1;
                }


                } finally {dbg.exitDecision(32);}

                switch (alt32) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zhou/Projects/ETL2Py/AbiDML.g:317:16: ',' var
            	    {
            	    dbg.location(317,16);
            	    match(input,25,FOLLOW_25_in_var_list1416); if (state.failed) return ;
            	    dbg.location(317,20);
            	    pushFollow(FOLLOW_var_in_var_list1418);
            	    var();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);
            } finally {dbg.exitSubRule(32);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(318, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "var_list");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "var_list"



    // $ANTLR start "var"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:320:1: var : ( field_name opt_init | field_name '[' constant_expr ']' opt_init | field_name '[' size_expr ']' opt_init | field_name '[' delimiter_expr ']' opt_init | field_name '[' ']' opt_init );
    public final void var() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "var");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(320, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:320:5: ( field_name opt_init | field_name '[' constant_expr ']' opt_init | field_name '[' size_expr ']' opt_init | field_name '[' delimiter_expr ']' opt_init | field_name '[' ']' opt_init )
            int alt33=5;
            try { dbg.enterDecision(33, decisionCanBacktrack[33]);

            int LA33_0 = input.LA(1);

            if ( (LA33_0==ID) ) {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==EOF||LA33_1==25||LA33_1==31||LA33_1==35) ) {
                    alt33=1;
                }
                else if ( (LA33_1==42) ) {
                    switch ( input.LA(3) ) {
                    case 43:
                        {
                        alt33=5;
                        }
                        break;
                    case INT:
                        {
                        int LA33_5 = input.LA(4);

                        if ( (LA33_5==43) ) {
                            alt33=2;
                        }
                        else if ( (LA33_5==16||(LA33_5 >= 18 && LA33_5 <= 20)||(LA33_5 >= 23 && LA33_5 <= 24)||(LA33_5 >= 26 && LA33_5 <= 28)||(LA33_5 >= 32 && LA33_5 <= 34)||(LA33_5 >= 36 && LA33_5 <= 40)||LA33_5==42||(LA33_5 >= 44 && LA33_5 <= 45)||LA33_5==82||(LA33_5 >= 98 && LA33_5 <= 99)) ) {
                            alt33=3;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 33, 5, input);

                            dbg.recognitionException(nvae);
                            throw nvae;

                        }
                        }
                        break;
                    case FLOAT:
                        {
                        int LA33_6 = input.LA(4);

                        if ( (LA33_6==43) ) {
                            alt33=2;
                        }
                        else if ( (LA33_6==16||(LA33_6 >= 18 && LA33_6 <= 20)||(LA33_6 >= 23 && LA33_6 <= 24)||(LA33_6 >= 26 && LA33_6 <= 28)||(LA33_6 >= 32 && LA33_6 <= 34)||(LA33_6 >= 36 && LA33_6 <= 40)||LA33_6==42||(LA33_6 >= 44 && LA33_6 <= 45)||LA33_6==82||(LA33_6 >= 98 && LA33_6 <= 99)) ) {
                            alt33=3;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 33, 6, input);

                            dbg.recognitionException(nvae);
                            throw nvae;

                        }
                        }
                        break;
                    case STRING:
                        {
                        int LA33_7 = input.LA(4);

                        if ( (LA33_7==43) ) {
                            alt33=2;
                        }
                        else if ( (LA33_7==16||(LA33_7 >= 18 && LA33_7 <= 20)||(LA33_7 >= 23 && LA33_7 <= 24)||(LA33_7 >= 26 && LA33_7 <= 28)||(LA33_7 >= 32 && LA33_7 <= 34)||(LA33_7 >= 36 && LA33_7 <= 40)||LA33_7==42||(LA33_7 >= 44 && LA33_7 <= 45)||LA33_7==82||(LA33_7 >= 98 && LA33_7 <= 99)) ) {
                            alt33=3;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 33, 7, input);

                            dbg.recognitionException(nvae);
                            throw nvae;

                        }
                        }
                        break;
                    case ID:
                    case 15:
                    case 17:
                    case 21:
                    case 24:
                    case 41:
                    case 42:
                    case 62:
                    case 65:
                    case 86:
                    case 91:
                    case 97:
                    case 100:
                        {
                        alt33=3;
                        }
                        break;
                    case 55:
                        {
                        alt33=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 3, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(33);}

            switch (alt33) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:320:7: field_name opt_init
                    {
                    dbg.location(320,7);
                    pushFollow(FOLLOW_field_name_in_var1430);
                    field_name();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(320,18);
                    pushFollow(FOLLOW_opt_init_in_var1432);
                    opt_init();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:321:4: field_name '[' constant_expr ']' opt_init
                    {
                    dbg.location(321,4);
                    pushFollow(FOLLOW_field_name_in_var1437);
                    field_name();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(321,15);
                    match(input,42,FOLLOW_42_in_var1439); if (state.failed) return ;
                    dbg.location(321,19);
                    pushFollow(FOLLOW_constant_expr_in_var1441);
                    constant_expr();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(321,33);
                    match(input,43,FOLLOW_43_in_var1443); if (state.failed) return ;
                    dbg.location(321,37);
                    pushFollow(FOLLOW_opt_init_in_var1445);
                    opt_init();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:322:4: field_name '[' size_expr ']' opt_init
                    {
                    dbg.location(322,4);
                    pushFollow(FOLLOW_field_name_in_var1450);
                    field_name();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(322,15);
                    match(input,42,FOLLOW_42_in_var1452); if (state.failed) return ;
                    dbg.location(322,19);
                    pushFollow(FOLLOW_size_expr_in_var1454);
                    size_expr();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(322,29);
                    match(input,43,FOLLOW_43_in_var1456); if (state.failed) return ;
                    dbg.location(322,33);
                    pushFollow(FOLLOW_opt_init_in_var1458);
                    opt_init();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:323:5: field_name '[' delimiter_expr ']' opt_init
                    {
                    dbg.location(323,5);
                    pushFollow(FOLLOW_field_name_in_var1464);
                    field_name();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(323,16);
                    match(input,42,FOLLOW_42_in_var1466); if (state.failed) return ;
                    dbg.location(323,20);
                    pushFollow(FOLLOW_delimiter_expr_in_var1468);
                    delimiter_expr();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(323,35);
                    match(input,43,FOLLOW_43_in_var1470); if (state.failed) return ;
                    dbg.location(323,39);
                    pushFollow(FOLLOW_opt_init_in_var1472);
                    opt_init();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:324:4: field_name '[' ']' opt_init
                    {
                    dbg.location(324,4);
                    pushFollow(FOLLOW_field_name_in_var1477);
                    field_name();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(324,15);
                    match(input,42,FOLLOW_42_in_var1479); if (state.failed) return ;
                    dbg.location(324,19);
                    match(input,43,FOLLOW_43_in_var1481); if (state.failed) return ;
                    dbg.location(324,23);
                    pushFollow(FOLLOW_opt_init_in_var1483);
                    opt_init();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(325, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "var");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "var"



    // $ANTLR start "arg_list"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:328:1: arg_list : arg ( ',' arg )* ;
    public final void arg_list() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "arg_list");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(328, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:328:9: ( arg ( ',' arg )* )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:328:11: arg ( ',' arg )*
            {
            dbg.location(328,11);
            pushFollow(FOLLOW_arg_in_arg_list1493);
            arg();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(328,15);
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:328:15: ( ',' arg )*
            try { dbg.enterSubRule(34);

            loop34:
            do {
                int alt34=2;
                try { dbg.enterDecision(34, decisionCanBacktrack[34]);

                int LA34_0 = input.LA(1);

                if ( (LA34_0==25) ) {
                    alt34=1;
                }


                } finally {dbg.exitDecision(34);}

                switch (alt34) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zhou/Projects/ETL2Py/AbiDML.g:328:16: ',' arg
            	    {
            	    dbg.location(328,16);
            	    match(input,25,FOLLOW_25_in_arg_list1496); if (state.failed) return ;
            	    dbg.location(328,20);
            	    pushFollow(FOLLOW_arg_in_arg_list1498);
            	    arg();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);
            } finally {dbg.exitSubRule(34);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(329, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "arg_list");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "arg_list"



    // $ANTLR start "arg"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:331:1: arg : type ID ;
    public final void arg() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "arg");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(331, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:331:5: ( type ID )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:331:7: type ID
            {
            dbg.location(331,7);
            pushFollow(FOLLOW_type_in_arg1510);
            type();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(331,12);
            match(input,ID,FOLLOW_ID_in_arg1512); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(332, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "arg");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "arg"



    // $ANTLR start "field_name"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:346:1: field_name : ID ;
    public final void field_name() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "field_name");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(346, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:347:2: ( ID )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:347:4: ID
            {
            dbg.location(347,4);
            match(input,ID,FOLLOW_ID_in_field_name1525); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(347, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "field_name");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "field_name"



    // $ANTLR start "opt_init"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:349:1: opt_init returns [String expr] : ( '=' (e= expression | null_expr '(' expression ')' ) )? ;
    public final String opt_init() throws RecognitionException {
        String expr = null;


        String e =null;


        try { dbg.enterRule(getGrammarFileName(), "opt_init");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(349, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:350:2: ( ( '=' (e= expression | null_expr '(' expression ')' ) )? )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:350:4: ( '=' (e= expression | null_expr '(' expression ')' ) )?
            {
            dbg.location(350,4);
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:350:4: ( '=' (e= expression | null_expr '(' expression ')' ) )?
            int alt36=2;
            try { dbg.enterSubRule(36);
            try { dbg.enterDecision(36, decisionCanBacktrack[36]);

            int LA36_0 = input.LA(1);

            if ( (LA36_0==35) ) {
                alt36=1;
            }
            } finally {dbg.exitDecision(36);}

            switch (alt36) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:350:5: '=' (e= expression | null_expr '(' expression ')' )
                    {
                    dbg.location(350,5);
                    match(input,35,FOLLOW_35_in_opt_init1540); if (state.failed) return expr;
                    dbg.location(350,9);
                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:350:9: (e= expression | null_expr '(' expression ')' )
                    int alt35=2;
                    try { dbg.enterSubRule(35);
                    try { dbg.enterDecision(35, decisionCanBacktrack[35]);

                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==FLOAT||(LA35_0 >= ID && LA35_0 <= INT)||LA35_0==STRING||LA35_0==15||LA35_0==17||LA35_0==21||LA35_0==24||LA35_0==42||LA35_0==62||LA35_0==65||LA35_0==86||LA35_0==91||LA35_0==97||LA35_0==100) ) {
                        alt35=1;
                    }
                    else if ( (LA35_0==41) ) {
                        int LA35_2 = input.LA(2);

                        if ( (LA35_2==EOF||LA35_2==16||(LA35_2 >= 18 && LA35_2 <= 20)||(LA35_2 >= 23 && LA35_2 <= 28)||(LA35_2 >= 31 && LA35_2 <= 34)||(LA35_2 >= 36 && LA35_2 <= 40)||LA35_2==42||(LA35_2 >= 44 && LA35_2 <= 45)||LA35_2==82||(LA35_2 >= 98 && LA35_2 <= 99)) ) {
                            alt35=1;
                        }
                        else if ( (LA35_2==21) ) {
                            alt35=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return expr;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 35, 2, input);

                            dbg.recognitionException(nvae);
                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return expr;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                    } finally {dbg.exitDecision(35);}

                    switch (alt35) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/zhou/Projects/ETL2Py/AbiDML.g:350:10: e= expression
                            {
                            dbg.location(350,11);
                            pushFollow(FOLLOW_expression_in_opt_init1545);
                            e=expression();

                            state._fsp--;
                            if (state.failed) return expr;
                            dbg.location(350,23);
                            if ( state.backtracking==0 ) {expr = e;}

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/zhou/Projects/ETL2Py/AbiDML.g:351:10: null_expr '(' expression ')'
                            {
                            dbg.location(351,10);
                            pushFollow(FOLLOW_null_expr_in_opt_init1558);
                            null_expr();

                            state._fsp--;
                            if (state.failed) return expr;
                            dbg.location(351,20);
                            match(input,21,FOLLOW_21_in_opt_init1560); if (state.failed) return expr;
                            dbg.location(351,24);
                            pushFollow(FOLLOW_expression_in_opt_init1562);
                            expression();

                            state._fsp--;
                            if (state.failed) return expr;
                            dbg.location(351,35);
                            match(input,22,FOLLOW_22_in_opt_init1564); if (state.failed) return expr;
                            dbg.location(351,39);
                            if ( state.backtracking==0 ) {expr = "NULL";}

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(35);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(36);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(352, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "opt_init");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return expr;
    }
    // $ANTLR end "opt_init"



    // $ANTLR start "null_expr"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:354:1: null_expr : 'NULL' ;
    public final void null_expr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "null_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(354, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:355:2: ( 'NULL' )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:355:4: 'NULL'
            {
            dbg.location(355,4);
            match(input,41,FOLLOW_41_in_null_expr1580); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(356, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "null_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "null_expr"



    // $ANTLR start "native_type"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:358:1: native_type returns [String typename] : ( ( sign_spec )? ( 'char' | 'short' | 'int' | 'long' ) | 'float' | 'double' );
    public final String native_type() throws RecognitionException {
        String typename = null;


        try { dbg.enterRule(getGrammarFileName(), "native_type");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(358, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:359:5: ( ( sign_spec )? ( 'char' | 'short' | 'int' | 'long' ) | 'float' | 'double' )
            int alt39=3;
            try { dbg.enterDecision(39, decisionCanBacktrack[39]);

            switch ( input.LA(1) ) {
            case 50:
            case 66:
            case 81:
            case 87:
            case 88:
            case 93:
                {
                alt39=1;
                }
                break;
            case 61:
                {
                alt39=2;
                }
                break;
            case 56:
                {
                alt39=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return typename;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(39);}

            switch (alt39) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:359:9: ( sign_spec )? ( 'char' | 'short' | 'int' | 'long' )
                    {
                    dbg.location(359,9);
                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:359:9: ( sign_spec )?
                    int alt37=2;
                    try { dbg.enterSubRule(37);
                    try { dbg.enterDecision(37, decisionCanBacktrack[37]);

                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==88||LA37_0==93) ) {
                        alt37=1;
                    }
                    } finally {dbg.exitDecision(37);}

                    switch (alt37) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/zhou/Projects/ETL2Py/AbiDML.g:359:9: sign_spec
                            {
                            dbg.location(359,9);
                            pushFollow(FOLLOW_sign_spec_in_native_type1600);
                            sign_spec();

                            state._fsp--;
                            if (state.failed) return typename;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(37);}

                    dbg.location(359,20);
                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:359:20: ( 'char' | 'short' | 'int' | 'long' )
                    int alt38=4;
                    try { dbg.enterSubRule(38);
                    try { dbg.enterDecision(38, decisionCanBacktrack[38]);

                    switch ( input.LA(1) ) {
                    case 50:
                        {
                        alt38=1;
                        }
                        break;
                    case 87:
                        {
                        alt38=2;
                        }
                        break;
                    case 66:
                        {
                        alt38=3;
                        }
                        break;
                    case 81:
                        {
                        alt38=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return typename;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }

                    } finally {dbg.exitDecision(38);}

                    switch (alt38) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/zhou/Projects/ETL2Py/AbiDML.g:359:21: 'char'
                            {
                            dbg.location(359,21);
                            match(input,50,FOLLOW_50_in_native_type1604); if (state.failed) return typename;
                            dbg.location(359,28);
                            if ( state.backtracking==0 ) {typename ="char";}

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/zhou/Projects/ETL2Py/AbiDML.g:359:50: 'short'
                            {
                            dbg.location(359,50);
                            match(input,87,FOLLOW_87_in_native_type1610); if (state.failed) return typename;
                            dbg.location(359,58);
                            if ( state.backtracking==0 ) {typename ="short";}

                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/zhou/Projects/ETL2Py/AbiDML.g:359:81: 'int'
                            {
                            dbg.location(359,81);
                            match(input,66,FOLLOW_66_in_native_type1616); if (state.failed) return typename;
                            dbg.location(359,87);
                            if ( state.backtracking==0 ) {typename ="int";}

                            }
                            break;
                        case 4 :
                            dbg.enterAlt(4);

                            // /Users/zhou/Projects/ETL2Py/AbiDML.g:359:108: 'long'
                            {
                            dbg.location(359,108);
                            match(input,81,FOLLOW_81_in_native_type1622); if (state.failed) return typename;
                            dbg.location(359,115);
                            if ( state.backtracking==0 ) {typename ="long";}

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(38);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:360:15: 'float'
                    {
                    dbg.location(360,15);
                    match(input,61,FOLLOW_61_in_native_type1642); if (state.failed) return typename;
                    dbg.location(360,23);
                    if ( state.backtracking==0 ) {typename = "float";}

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:361:15: 'double'
                    {
                    dbg.location(361,15);
                    match(input,56,FOLLOW_56_in_native_type1660); if (state.failed) return typename;
                    dbg.location(361,24);
                    if ( state.backtracking==0 ) {typename ="double";}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(362, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "native_type");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return typename;
    }
    // $ANTLR end "native_type"



    // $ANTLR start "binary_integer_type"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:364:1: binary_integer_type : ( sign_spec )? ( endian_spec )? 'integer' '(' INT ')' ;
    public final void binary_integer_type() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "binary_integer_type");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(364, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:365:5: ( ( sign_spec )? ( endian_spec )? 'integer' '(' INT ')' )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:365:9: ( sign_spec )? ( endian_spec )? 'integer' '(' INT ')'
            {
            dbg.location(365,9);
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:365:9: ( sign_spec )?
            int alt40=2;
            try { dbg.enterSubRule(40);
            try { dbg.enterDecision(40, decisionCanBacktrack[40]);

            int LA40_0 = input.LA(1);

            if ( (LA40_0==88||LA40_0==93) ) {
                alt40=1;
            }
            } finally {dbg.exitDecision(40);}

            switch (alt40) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:365:9: sign_spec
                    {
                    dbg.location(365,9);
                    pushFollow(FOLLOW_sign_spec_in_binary_integer_type1681);
                    sign_spec();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(40);}

            dbg.location(365,20);
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:365:20: ( endian_spec )?
            int alt41=2;
            try { dbg.enterSubRule(41);
            try { dbg.enterDecision(41, decisionCanBacktrack[41]);

            int LA41_0 = input.LA(1);

            if ( (LA41_0==48||LA41_0==80) ) {
                alt41=1;
            }
            } finally {dbg.exitDecision(41);}

            switch (alt41) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:365:20: endian_spec
                    {
                    dbg.location(365,20);
                    pushFollow(FOLLOW_endian_spec_in_binary_integer_type1684);
                    endian_spec();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(41);}

            dbg.location(365,33);
            match(input,67,FOLLOW_67_in_binary_integer_type1687); if (state.failed) return ;
            dbg.location(365,43);
            match(input,21,FOLLOW_21_in_binary_integer_type1689); if (state.failed) return ;
            dbg.location(365,47);
            match(input,INT,FOLLOW_INT_in_binary_integer_type1691); if (state.failed) return ;
            dbg.location(365,51);
            match(input,22,FOLLOW_22_in_binary_integer_type1693); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(366, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "binary_integer_type");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "binary_integer_type"



    // $ANTLR start "decimal_type"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:368:1: decimal_type returns [String sep] : ( character_family )? 'decimal' '(' ( INT | decl_string ) ')' ;
    public final String decimal_type() throws RecognitionException {
        String sep = null;


        AbiDMLParser.decl_string_return decl_string13 =null;


        try { dbg.enterRule(getGrammarFileName(), "decimal_type");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(368, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:369:5: ( ( character_family )? 'decimal' '(' ( INT | decl_string ) ')' )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:369:9: ( character_family )? 'decimal' '(' ( INT | decl_string ) ')'
            {
            dbg.location(369,9);
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:369:9: ( character_family )?
            int alt42=2;
            try { dbg.enterSubRule(42);
            try { dbg.enterDecision(42, decisionCanBacktrack[42]);

            int LA42_0 = input.LA(1);

            if ( (LA42_0==46||LA42_0==48||LA42_0==57||(LA42_0 >= 68 && LA42_0 <= 78)||LA42_0==80||LA42_0==83||LA42_0==94) ) {
                alt42=1;
            }
            } finally {dbg.exitDecision(42);}

            switch (alt42) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:369:9: character_family
                    {
                    dbg.location(369,9);
                    pushFollow(FOLLOW_character_family_in_decimal_type1720);
                    character_family();

                    state._fsp--;
                    if (state.failed) return sep;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(42);}

            dbg.location(369,27);
            match(input,53,FOLLOW_53_in_decimal_type1723); if (state.failed) return sep;
            dbg.location(369,37);
            match(input,21,FOLLOW_21_in_decimal_type1725); if (state.failed) return sep;
            dbg.location(369,41);
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:369:41: ( INT | decl_string )
            int alt43=2;
            try { dbg.enterSubRule(43);
            try { dbg.enterDecision(43, decisionCanBacktrack[43]);

            int LA43_0 = input.LA(1);

            if ( (LA43_0==INT) ) {
                alt43=1;
            }
            else if ( (LA43_0==STRING) ) {
                alt43=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return sep;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(43);}

            switch (alt43) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:369:43: INT
                    {
                    dbg.location(369,43);
                    match(input,INT,FOLLOW_INT_in_decimal_type1729); if (state.failed) return sep;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:369:49: decl_string
                    {
                    dbg.location(369,49);
                    pushFollow(FOLLOW_decl_string_in_decimal_type1733);
                    decl_string13=decl_string();

                    state._fsp--;
                    if (state.failed) return sep;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(43);}

            dbg.location(369,62);
            match(input,22,FOLLOW_22_in_decimal_type1736); if (state.failed) return sep;
            dbg.location(370,6);
            if ( state.backtracking==0 ) {
                		// judge INT size = 4 or 8
                		sep = (decl_string13!=null?input.toString(decl_string13.start,decl_string13.stop):null);
                	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(374, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "decimal_type");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return sep;
    }
    // $ANTLR end "decimal_type"



    // $ANTLR start "date_type"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:376:1: date_type : ( character_family )? 'date' '(' decl_string ( ',' param )* ')' opt_delim ;
    public final void date_type() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "date_type");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(376, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:377:5: ( ( character_family )? 'date' '(' decl_string ( ',' param )* ')' opt_delim )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:377:9: ( character_family )? 'date' '(' decl_string ( ',' param )* ')' opt_delim
            {
            dbg.location(377,9);
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:377:9: ( character_family )?
            int alt44=2;
            try { dbg.enterSubRule(44);
            try { dbg.enterDecision(44, decisionCanBacktrack[44]);

            int LA44_0 = input.LA(1);

            if ( (LA44_0==46||LA44_0==48||LA44_0==57||(LA44_0 >= 68 && LA44_0 <= 78)||LA44_0==80||LA44_0==83||LA44_0==94) ) {
                alt44=1;
            }
            } finally {dbg.exitDecision(44);}

            switch (alt44) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:377:9: character_family
                    {
                    dbg.location(377,9);
                    pushFollow(FOLLOW_character_family_in_date_type1766);
                    character_family();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(44);}

            dbg.location(377,27);
            match(input,51,FOLLOW_51_in_date_type1769); if (state.failed) return ;
            dbg.location(377,34);
            match(input,21,FOLLOW_21_in_date_type1771); if (state.failed) return ;
            dbg.location(377,38);
            pushFollow(FOLLOW_decl_string_in_date_type1773);
            decl_string();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(377,50);
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:377:50: ( ',' param )*
            try { dbg.enterSubRule(45);

            loop45:
            do {
                int alt45=2;
                try { dbg.enterDecision(45, decisionCanBacktrack[45]);

                int LA45_0 = input.LA(1);

                if ( (LA45_0==25) ) {
                    alt45=1;
                }


                } finally {dbg.exitDecision(45);}

                switch (alt45) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zhou/Projects/ETL2Py/AbiDML.g:377:51: ',' param
            	    {
            	    dbg.location(377,51);
            	    match(input,25,FOLLOW_25_in_date_type1776); if (state.failed) return ;
            	    dbg.location(377,55);
            	    pushFollow(FOLLOW_param_in_date_type1778);
            	    param();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);
            } finally {dbg.exitSubRule(45);}

            dbg.location(377,63);
            match(input,22,FOLLOW_22_in_date_type1782); if (state.failed) return ;
            dbg.location(377,67);
            pushFollow(FOLLOW_opt_delim_in_date_type1784);
            opt_delim();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(378, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "date_type");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "date_type"



    // $ANTLR start "datetime_type"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:380:1: datetime_type : ( character_family )? 'datetime' '(' decl_string ( ',' param )* ')' opt_delim ;
    public final void datetime_type() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "datetime_type");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(380, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:381:5: ( ( character_family )? 'datetime' '(' decl_string ( ',' param )* ')' opt_delim )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:381:9: ( character_family )? 'datetime' '(' decl_string ( ',' param )* ')' opt_delim
            {
            dbg.location(381,9);
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:381:9: ( character_family )?
            int alt46=2;
            try { dbg.enterSubRule(46);
            try { dbg.enterDecision(46, decisionCanBacktrack[46]);

            int LA46_0 = input.LA(1);

            if ( (LA46_0==46||LA46_0==48||LA46_0==57||(LA46_0 >= 68 && LA46_0 <= 78)||LA46_0==80||LA46_0==83||LA46_0==94) ) {
                alt46=1;
            }
            } finally {dbg.exitDecision(46);}

            switch (alt46) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:381:9: character_family
                    {
                    dbg.location(381,9);
                    pushFollow(FOLLOW_character_family_in_datetime_type1803);
                    character_family();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(46);}

            dbg.location(381,27);
            match(input,52,FOLLOW_52_in_datetime_type1806); if (state.failed) return ;
            dbg.location(381,38);
            match(input,21,FOLLOW_21_in_datetime_type1808); if (state.failed) return ;
            dbg.location(381,42);
            pushFollow(FOLLOW_decl_string_in_datetime_type1810);
            decl_string();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(381,54);
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:381:54: ( ',' param )*
            try { dbg.enterSubRule(47);

            loop47:
            do {
                int alt47=2;
                try { dbg.enterDecision(47, decisionCanBacktrack[47]);

                int LA47_0 = input.LA(1);

                if ( (LA47_0==25) ) {
                    alt47=1;
                }


                } finally {dbg.exitDecision(47);}

                switch (alt47) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zhou/Projects/ETL2Py/AbiDML.g:381:55: ',' param
            	    {
            	    dbg.location(381,55);
            	    match(input,25,FOLLOW_25_in_datetime_type1813); if (state.failed) return ;
            	    dbg.location(381,59);
            	    pushFollow(FOLLOW_param_in_datetime_type1815);
            	    param();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);
            } finally {dbg.exitSubRule(47);}

            dbg.location(381,67);
            match(input,22,FOLLOW_22_in_datetime_type1819); if (state.failed) return ;
            dbg.location(381,71);
            pushFollow(FOLLOW_opt_delim_in_datetime_type1821);
            opt_delim();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(382, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "datetime_type");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "datetime_type"



    // $ANTLR start "real_type"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:384:1: real_type : ( sign_spec )? ( endian_spec )? ( float_family )? 'real' '(' INT ')' ;
    public final void real_type() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "real_type");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(384, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:385:5: ( ( sign_spec )? ( endian_spec )? ( float_family )? 'real' '(' INT ')' )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:385:9: ( sign_spec )? ( endian_spec )? ( float_family )? 'real' '(' INT ')'
            {
            dbg.location(385,9);
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:385:9: ( sign_spec )?
            int alt48=2;
            try { dbg.enterSubRule(48);
            try { dbg.enterDecision(48, decisionCanBacktrack[48]);

            int LA48_0 = input.LA(1);

            if ( (LA48_0==88||LA48_0==93) ) {
                alt48=1;
            }
            } finally {dbg.exitDecision(48);}

            switch (alt48) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:385:9: sign_spec
                    {
                    dbg.location(385,9);
                    pushFollow(FOLLOW_sign_spec_in_real_type1844);
                    sign_spec();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(48);}

            dbg.location(385,20);
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:385:20: ( endian_spec )?
            int alt49=2;
            try { dbg.enterSubRule(49);
            try { dbg.enterDecision(49, decisionCanBacktrack[49]);

            int LA49_0 = input.LA(1);

            if ( (LA49_0==48||LA49_0==80) ) {
                alt49=1;
            }
            } finally {dbg.exitDecision(49);}

            switch (alt49) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:385:20: endian_spec
                    {
                    dbg.location(385,20);
                    pushFollow(FOLLOW_endian_spec_in_real_type1847);
                    endian_spec();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(49);}

            dbg.location(385,33);
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:385:33: ( float_family )?
            int alt50=2;
            try { dbg.enterSubRule(50);
            try { dbg.enterDecision(50, decisionCanBacktrack[50]);

            int LA50_0 = input.LA(1);

            if ( ((LA50_0 >= 63 && LA50_0 <= 64)) ) {
                alt50=1;
            }
            } finally {dbg.exitDecision(50);}

            switch (alt50) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:385:33: float_family
                    {
                    dbg.location(385,33);
                    pushFollow(FOLLOW_float_family_in_real_type1850);
                    float_family();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(50);}

            dbg.location(385,47);
            match(input,84,FOLLOW_84_in_real_type1853); if (state.failed) return ;
            dbg.location(385,54);
            match(input,21,FOLLOW_21_in_real_type1855); if (state.failed) return ;
            dbg.location(385,58);
            match(input,INT,FOLLOW_INT_in_real_type1857); if (state.failed) return ;
            dbg.location(385,62);
            match(input,22,FOLLOW_22_in_real_type1859); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(386, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "real_type");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "real_type"



    // $ANTLR start "varstring_length_type"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:388:1: varstring_length_type : ( native_type | binary_integer_type | decimal_type | real_type );
    public final void varstring_length_type() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "varstring_length_type");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(388, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:389:5: ( native_type | binary_integer_type | decimal_type | real_type )
            int alt51=4;
            try { dbg.enterDecision(51, decisionCanBacktrack[51]);

            switch ( input.LA(1) ) {
            case 88:
            case 93:
                {
                switch ( input.LA(2) ) {
                case 50:
                case 66:
                case 81:
                case 87:
                    {
                    alt51=1;
                    }
                    break;
                case 48:
                    {
                    int LA51_8 = input.LA(3);

                    if ( (LA51_8==60) ) {
                        int LA51_12 = input.LA(4);

                        if ( (LA51_12==67) ) {
                            alt51=2;
                        }
                        else if ( ((LA51_12 >= 63 && LA51_12 <= 64)||LA51_12==84) ) {
                            alt51=4;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 51, 12, input);

                            dbg.recognitionException(nvae);
                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 8, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                    }
                    break;
                case 80:
                    {
                    int LA51_9 = input.LA(3);

                    if ( (LA51_9==60) ) {
                        int LA51_13 = input.LA(4);

                        if ( (LA51_13==67) ) {
                            alt51=2;
                        }
                        else if ( ((LA51_13 >= 63 && LA51_13 <= 64)||LA51_13==84) ) {
                            alt51=4;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 51, 13, input);

                            dbg.recognitionException(nvae);
                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 9, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                    }
                    break;
                case 67:
                    {
                    alt51=2;
                    }
                    break;
                case 63:
                case 64:
                case 84:
                    {
                    alt51=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }

                }
                break;
            case 50:
            case 56:
            case 61:
            case 66:
            case 81:
            case 87:
                {
                alt51=1;
                }
                break;
            case 48:
                {
                int LA51_3 = input.LA(2);

                if ( (LA51_3==60) ) {
                    switch ( input.LA(3) ) {
                    case 67:
                        {
                        alt51=2;
                        }
                        break;
                    case 92:
                        {
                        alt51=3;
                        }
                        break;
                    case 63:
                    case 64:
                    case 84:
                        {
                        alt51=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 10, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 3, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 80:
                {
                int LA51_4 = input.LA(2);

                if ( (LA51_4==60) ) {
                    switch ( input.LA(3) ) {
                    case 67:
                        {
                        alt51=2;
                        }
                        break;
                    case 92:
                        {
                        alt51=3;
                        }
                        break;
                    case 63:
                    case 64:
                    case 84:
                        {
                        alt51=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 11, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 4, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 67:
                {
                alt51=2;
                }
                break;
            case 46:
            case 53:
            case 57:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 83:
            case 94:
                {
                alt51=3;
                }
                break;
            case 63:
            case 64:
            case 84:
                {
                alt51=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(51);}

            switch (alt51) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:389:9: native_type
                    {
                    dbg.location(389,9);
                    pushFollow(FOLLOW_native_type_in_varstring_length_type1878);
                    native_type();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:389:23: binary_integer_type
                    {
                    dbg.location(389,23);
                    pushFollow(FOLLOW_binary_integer_type_in_varstring_length_type1882);
                    binary_integer_type();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:389:45: decimal_type
                    {
                    dbg.location(389,45);
                    pushFollow(FOLLOW_decimal_type_in_varstring_length_type1886);
                    decimal_type();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:389:60: real_type
                    {
                    dbg.location(389,60);
                    pushFollow(FOLLOW_real_type_in_varstring_length_type1890);
                    real_type();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(390, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "varstring_length_type");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "varstring_length_type"



    // $ANTLR start "string_type"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:392:1: string_type returns [String sep] : ( character_family )? 'string' '(' ( INT | decl_string | varstring_length_type ) ')' ;
    public final String string_type() throws RecognitionException {
        String sep = null;


        AbiDMLParser.decl_string_return decl_string14 =null;


        try { dbg.enterRule(getGrammarFileName(), "string_type");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(392, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:393:5: ( ( character_family )? 'string' '(' ( INT | decl_string | varstring_length_type ) ')' )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:393:9: ( character_family )? 'string' '(' ( INT | decl_string | varstring_length_type ) ')'
            {
            dbg.location(393,9);
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:393:9: ( character_family )?
            int alt52=2;
            try { dbg.enterSubRule(52);
            try { dbg.enterDecision(52, decisionCanBacktrack[52]);

            int LA52_0 = input.LA(1);

            if ( (LA52_0==46||LA52_0==48||LA52_0==57||(LA52_0 >= 68 && LA52_0 <= 78)||LA52_0==80||LA52_0==83||LA52_0==94) ) {
                alt52=1;
            }
            } finally {dbg.exitDecision(52);}

            switch (alt52) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:393:9: character_family
                    {
                    dbg.location(393,9);
                    pushFollow(FOLLOW_character_family_in_string_type1917);
                    character_family();

                    state._fsp--;
                    if (state.failed) return sep;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(52);}

            dbg.location(393,27);
            match(input,89,FOLLOW_89_in_string_type1920); if (state.failed) return sep;
            dbg.location(393,36);
            match(input,21,FOLLOW_21_in_string_type1922); if (state.failed) return sep;
            dbg.location(393,40);
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:393:40: ( INT | decl_string | varstring_length_type )
            int alt53=3;
            try { dbg.enterSubRule(53);
            try { dbg.enterDecision(53, decisionCanBacktrack[53]);

            switch ( input.LA(1) ) {
            case INT:
                {
                alt53=1;
                }
                break;
            case STRING:
                {
                alt53=2;
                }
                break;
            case 46:
            case 48:
            case 50:
            case 53:
            case 56:
            case 57:
            case 61:
            case 63:
            case 64:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 80:
            case 81:
            case 83:
            case 84:
            case 87:
            case 88:
            case 93:
            case 94:
                {
                alt53=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return sep;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(53);}

            switch (alt53) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:393:41: INT
                    {
                    dbg.location(393,41);
                    match(input,INT,FOLLOW_INT_in_string_type1925); if (state.failed) return sep;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:393:47: decl_string
                    {
                    dbg.location(393,47);
                    pushFollow(FOLLOW_decl_string_in_string_type1929);
                    decl_string14=decl_string();

                    state._fsp--;
                    if (state.failed) return sep;
                    dbg.location(393,59);
                    if ( state.backtracking==0 ) {sep = (decl_string14!=null?input.toString(decl_string14.start,decl_string14.stop):null);}

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:393:89: varstring_length_type
                    {
                    dbg.location(393,89);
                    pushFollow(FOLLOW_varstring_length_type_in_string_type1935);
                    varstring_length_type();

                    state._fsp--;
                    if (state.failed) return sep;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(53);}

            dbg.location(393,112);
            match(input,22,FOLLOW_22_in_string_type1938); if (state.failed) return sep;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(394, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "string_type");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return sep;
    }
    // $ANTLR end "string_type"



    // $ANTLR start "character_family"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:396:1: character_family : ( 'ascii' | 'ebcdic' | 'iso_8859_2' | 'iso_8859_3' | 'iso_8859_4' | 'iso_8859_5' | 'iso_8859_6' | 'iso_8859_7' | 'iso_8859_8' | 'iso_8859_9' | 'jis_201' | 'jis_208_euc' | 'jis_208_sjis' | 'utf8' | endian_spec 'unicode' | 'packed' );
    public final void character_family() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "character_family");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(396, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:397:5: ( 'ascii' | 'ebcdic' | 'iso_8859_2' | 'iso_8859_3' | 'iso_8859_4' | 'iso_8859_5' | 'iso_8859_6' | 'iso_8859_7' | 'iso_8859_8' | 'iso_8859_9' | 'jis_201' | 'jis_208_euc' | 'jis_208_sjis' | 'utf8' | endian_spec 'unicode' | 'packed' )
            int alt54=16;
            try { dbg.enterDecision(54, decisionCanBacktrack[54]);

            switch ( input.LA(1) ) {
            case 46:
                {
                alt54=1;
                }
                break;
            case 57:
                {
                alt54=2;
                }
                break;
            case 68:
                {
                alt54=3;
                }
                break;
            case 69:
                {
                alt54=4;
                }
                break;
            case 70:
                {
                alt54=5;
                }
                break;
            case 71:
                {
                alt54=6;
                }
                break;
            case 72:
                {
                alt54=7;
                }
                break;
            case 73:
                {
                alt54=8;
                }
                break;
            case 74:
                {
                alt54=9;
                }
                break;
            case 75:
                {
                alt54=10;
                }
                break;
            case 76:
                {
                alt54=11;
                }
                break;
            case 77:
                {
                alt54=12;
                }
                break;
            case 78:
                {
                alt54=13;
                }
                break;
            case 94:
                {
                alt54=14;
                }
                break;
            case 48:
            case 80:
                {
                alt54=15;
                }
                break;
            case 83:
                {
                alt54=16;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(54);}

            switch (alt54) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:397:9: 'ascii'
                    {
                    dbg.location(397,9);
                    match(input,46,FOLLOW_46_in_character_family1961); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:397:19: 'ebcdic'
                    {
                    dbg.location(397,19);
                    match(input,57,FOLLOW_57_in_character_family1965); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:397:30: 'iso_8859_2'
                    {
                    dbg.location(397,30);
                    match(input,68,FOLLOW_68_in_character_family1969); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:397:45: 'iso_8859_3'
                    {
                    dbg.location(397,45);
                    match(input,69,FOLLOW_69_in_character_family1973); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:397:60: 'iso_8859_4'
                    {
                    dbg.location(397,60);
                    match(input,70,FOLLOW_70_in_character_family1977); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:397:75: 'iso_8859_5'
                    {
                    dbg.location(397,75);
                    match(input,71,FOLLOW_71_in_character_family1981); if (state.failed) return ;

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:397:90: 'iso_8859_6'
                    {
                    dbg.location(397,90);
                    match(input,72,FOLLOW_72_in_character_family1985); if (state.failed) return ;

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:398:9: 'iso_8859_7'
                    {
                    dbg.location(398,9);
                    match(input,73,FOLLOW_73_in_character_family1997); if (state.failed) return ;

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:398:24: 'iso_8859_8'
                    {
                    dbg.location(398,24);
                    match(input,74,FOLLOW_74_in_character_family2001); if (state.failed) return ;

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:398:39: 'iso_8859_9'
                    {
                    dbg.location(398,39);
                    match(input,75,FOLLOW_75_in_character_family2005); if (state.failed) return ;

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:398:54: 'jis_201'
                    {
                    dbg.location(398,54);
                    match(input,76,FOLLOW_76_in_character_family2009); if (state.failed) return ;

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:398:66: 'jis_208_euc'
                    {
                    dbg.location(398,66);
                    match(input,77,FOLLOW_77_in_character_family2013); if (state.failed) return ;

                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:398:82: 'jis_208_sjis'
                    {
                    dbg.location(398,82);
                    match(input,78,FOLLOW_78_in_character_family2017); if (state.failed) return ;

                    }
                    break;
                case 14 :
                    dbg.enterAlt(14);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:399:9: 'utf8'
                    {
                    dbg.location(399,9);
                    match(input,94,FOLLOW_94_in_character_family2029); if (state.failed) return ;

                    }
                    break;
                case 15 :
                    dbg.enterAlt(15);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:399:18: endian_spec 'unicode'
                    {
                    dbg.location(399,18);
                    pushFollow(FOLLOW_endian_spec_in_character_family2033);
                    endian_spec();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(399,30);
                    match(input,92,FOLLOW_92_in_character_family2035); if (state.failed) return ;

                    }
                    break;
                case 16 :
                    dbg.enterAlt(16);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:399:42: 'packed'
                    {
                    dbg.location(399,42);
                    match(input,83,FOLLOW_83_in_character_family2039); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(400, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "character_family");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "character_family"



    // $ANTLR start "void_type"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:402:1: void_type : 'void' '(' INT ')' ;
    public final void void_type() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "void_type");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(402, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:403:5: ( 'void' '(' INT ')' )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:403:9: 'void' '(' INT ')'
            {
            dbg.location(403,9);
            match(input,96,FOLLOW_96_in_void_type2058); if (state.failed) return ;
            dbg.location(403,16);
            match(input,21,FOLLOW_21_in_void_type2060); if (state.failed) return ;
            dbg.location(403,20);
            match(input,INT,FOLLOW_INT_in_void_type2062); if (state.failed) return ;
            dbg.location(403,24);
            match(input,22,FOLLOW_22_in_void_type2064); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(404, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "void_type");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "void_type"



    // $ANTLR start "param_list"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:406:1: param_list : param ( ',' param )* ;
    public final void param_list() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "param_list");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(406, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:407:2: ( param ( ',' param )* )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:407:4: param ( ',' param )*
            {
            dbg.location(407,4);
            pushFollow(FOLLOW_param_in_param_list2078);
            param();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(407,10);
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:407:10: ( ',' param )*
            try { dbg.enterSubRule(55);

            loop55:
            do {
                int alt55=2;
                try { dbg.enterDecision(55, decisionCanBacktrack[55]);

                int LA55_0 = input.LA(1);

                if ( (LA55_0==25) ) {
                    alt55=1;
                }


                } finally {dbg.exitDecision(55);}

                switch (alt55) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zhou/Projects/ETL2Py/AbiDML.g:407:11: ',' param
            	    {
            	    dbg.location(407,11);
            	    match(input,25,FOLLOW_25_in_param_list2081); if (state.failed) return ;
            	    dbg.location(407,15);
            	    pushFollow(FOLLOW_param_in_param_list2083);
            	    param();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);
            } finally {dbg.exitSubRule(55);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(408, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "param_list");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "param_list"



    // $ANTLR start "param"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:410:1: param : ID '=' decl_string ;
    public final void param() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "param");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(410, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:410:7: ( ID '=' decl_string )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:410:9: ID '=' decl_string
            {
            dbg.location(410,9);
            match(input,ID,FOLLOW_ID_in_param2095); if (state.failed) return ;
            dbg.location(410,12);
            match(input,35,FOLLOW_35_in_param2097); if (state.failed) return ;
            dbg.location(410,16);
            pushFollow(FOLLOW_decl_string_in_param2099);
            decl_string();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(411, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "param");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "param"



    // $ANTLR start "opt_delim"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:414:1: opt_delim : ( '(' decl_string ')' )? ;
    public final void opt_delim() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "opt_delim");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(414, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:415:5: ( ( '(' decl_string ')' )? )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:415:9: ( '(' decl_string ')' )?
            {
            dbg.location(415,9);
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:415:9: ( '(' decl_string ')' )?
            int alt56=2;
            try { dbg.enterSubRule(56);
            try { dbg.enterDecision(56, decisionCanBacktrack[56]);

            int LA56_0 = input.LA(1);

            if ( (LA56_0==21) ) {
                alt56=1;
            }
            } finally {dbg.exitDecision(56);}

            switch (alt56) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:415:10: '(' decl_string ')'
                    {
                    dbg.location(415,10);
                    match(input,21,FOLLOW_21_in_opt_delim2117); if (state.failed) return ;
                    dbg.location(415,14);
                    pushFollow(FOLLOW_decl_string_in_opt_delim2119);
                    decl_string();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(415,26);
                    match(input,22,FOLLOW_22_in_opt_delim2121); if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(56);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(416, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "opt_delim");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "opt_delim"



    // $ANTLR start "sign_spec"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:418:1: sign_spec : ( 'signed' | 'unsigned' );
    public final void sign_spec() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "sign_spec");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(418, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:419:5: ( 'signed' | 'unsigned' )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:
            {
            dbg.location(419,5);
            if ( input.LA(1)==88||input.LA(1)==93 ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(420, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "sign_spec");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "sign_spec"



    // $ANTLR start "endian_spec"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:422:1: endian_spec : ( 'big' 'endian' | 'little' 'endian' );
    public final void endian_spec() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "endian_spec");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(422, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:423:5: ( 'big' 'endian' | 'little' 'endian' )
            int alt57=2;
            try { dbg.enterDecision(57, decisionCanBacktrack[57]);

            int LA57_0 = input.LA(1);

            if ( (LA57_0==48) ) {
                alt57=1;
            }
            else if ( (LA57_0==80) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(57);}

            switch (alt57) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:423:9: 'big' 'endian'
                    {
                    dbg.location(423,9);
                    match(input,48,FOLLOW_48_in_endian_spec2166); if (state.failed) return ;
                    dbg.location(423,15);
                    match(input,60,FOLLOW_60_in_endian_spec2168); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:423:26: 'little' 'endian'
                    {
                    dbg.location(423,26);
                    match(input,80,FOLLOW_80_in_endian_spec2172); if (state.failed) return ;
                    dbg.location(423,35);
                    match(input,60,FOLLOW_60_in_endian_spec2174); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(424, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "endian_spec");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "endian_spec"



    // $ANTLR start "float_family"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:426:1: float_family : ( 'ieee' | 'ibm' );
    public final void float_family() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "float_family");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(426, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:427:5: ( 'ieee' | 'ibm' )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:
            {
            dbg.location(427,5);
            if ( (input.LA(1) >= 63 && input.LA(1) <= 64) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(428, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "float_family");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "float_family"


    public static class decl_string_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "decl_string"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:430:1: decl_string : STRING ;
    public final AbiDMLParser.decl_string_return decl_string() throws RecognitionException {
        AbiDMLParser.decl_string_return retval = new AbiDMLParser.decl_string_return();
        retval.start = input.LT(1);


        try { dbg.enterRule(getGrammarFileName(), "decl_string");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(430, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:431:5: ( STRING )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:431:9: STRING
            {
            dbg.location(431,9);
            match(input,STRING,FOLLOW_STRING_in_decl_string2218); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(432, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "decl_string");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "decl_string"



    // $ANTLR start "opt_semicolon"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:442:1: opt_semicolon : ( ';' )? ;
    public final void opt_semicolon() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "opt_semicolon");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(442, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:443:2: ( ( ';' )? )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:443:4: ( ';' )?
            {
            dbg.location(443,4);
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:443:4: ( ';' )?
            int alt58=2;
            try { dbg.enterSubRule(58);
            try { dbg.enterDecision(58, decisionCanBacktrack[58]);

            int LA58_0 = input.LA(1);

            if ( (LA58_0==31) ) {
                alt58=1;
            }
            } finally {dbg.exitDecision(58);}

            switch (alt58) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:443:4: ';'
                    {
                    dbg.location(443,4);
                    match(input,31,FOLLOW_31_in_opt_semicolon2233); if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(58);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(444, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "opt_semicolon");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "opt_semicolon"



    // $ANTLR start "declaration_list"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:447:1: declaration_list : ( declaration )+ ;
    public final void declaration_list() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "declaration_list");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(447, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:448:2: ( ( declaration )+ )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:448:4: ( declaration )+
            {
            dbg.location(448,4);
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:448:4: ( declaration )+
            int cnt59=0;
            try { dbg.enterSubRule(59);

            loop59:
            do {
                int alt59=2;
                try { dbg.enterDecision(59, decisionCanBacktrack[59]);

                int LA59_0 = input.LA(1);

                if ( (LA59_0==ID) ) {
                    alt59=1;
                }


                } finally {dbg.exitDecision(59);}

                switch (alt59) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zhou/Projects/ETL2Py/AbiDML.g:448:4: declaration
            	    {
            	    dbg.location(448,4);
            	    pushFollow(FOLLOW_declaration_in_declaration_list2246);
            	    declaration();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt59 >= 1 ) break loop59;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(59, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt59++;
            } while (true);
            } finally {dbg.exitSubRule(59);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(449, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "declaration_list");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "declaration_list"



    // $ANTLR start "declaration"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:451:1: declaration : transform_declaration ;
    public final void declaration() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "declaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(451, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:452:2: ( transform_declaration )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:452:4: transform_declaration
            {
            dbg.location(452,4);
            pushFollow(FOLLOW_transform_declaration_in_declaration2258);
            transform_declaration();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(453, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "declaration");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "declaration"



    // $ANTLR start "transform_declaration"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:455:1: transform_declaration : name_list '::' ID '(' name_list ')' '=' 'begin' variable_declaration_list xfr_statement_list 'end' opt_semicolon ;
    public final void transform_declaration() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "transform_declaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(455, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:456:5: ( name_list '::' ID '(' name_list ')' '=' 'begin' variable_declaration_list xfr_statement_list 'end' opt_semicolon )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:456:9: name_list '::' ID '(' name_list ')' '=' 'begin' variable_declaration_list xfr_statement_list 'end' opt_semicolon
            {
            dbg.location(456,9);
            pushFollow(FOLLOW_name_list_in_transform_declaration2274);
            name_list();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(456,19);
            match(input,30,FOLLOW_30_in_transform_declaration2276); if (state.failed) return ;
            dbg.location(456,24);
            match(input,ID,FOLLOW_ID_in_transform_declaration2278); if (state.failed) return ;
            dbg.location(456,27);
            match(input,21,FOLLOW_21_in_transform_declaration2280); if (state.failed) return ;
            dbg.location(456,31);
            pushFollow(FOLLOW_name_list_in_transform_declaration2282);
            name_list();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(456,41);
            match(input,22,FOLLOW_22_in_transform_declaration2284); if (state.failed) return ;
            dbg.location(456,45);
            match(input,35,FOLLOW_35_in_transform_declaration2286); if (state.failed) return ;
            dbg.location(456,49);
            match(input,47,FOLLOW_47_in_transform_declaration2288); if (state.failed) return ;
            dbg.location(456,57);
            pushFollow(FOLLOW_variable_declaration_list_in_transform_declaration2290);
            variable_declaration_list();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(456,83);
            pushFollow(FOLLOW_xfr_statement_list_in_transform_declaration2292);
            xfr_statement_list();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(456,102);
            match(input,59,FOLLOW_59_in_transform_declaration2294); if (state.failed) return ;
            dbg.location(456,108);
            pushFollow(FOLLOW_opt_semicolon_in_transform_declaration2296);
            opt_semicolon();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(457, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "transform_declaration");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "transform_declaration"



    // $ANTLR start "name_list"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:459:1: name_list : ( ID ',' )* ID ;
    public final void name_list() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "name_list");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(459, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:460:2: ( ( ID ',' )* ID )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:460:4: ( ID ',' )* ID
            {
            dbg.location(460,4);
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:460:4: ( ID ',' )*
            try { dbg.enterSubRule(60);

            loop60:
            do {
                int alt60=2;
                try { dbg.enterDecision(60, decisionCanBacktrack[60]);

                int LA60_0 = input.LA(1);

                if ( (LA60_0==ID) ) {
                    int LA60_1 = input.LA(2);

                    if ( (LA60_1==25) ) {
                        alt60=1;
                    }


                }


                } finally {dbg.exitDecision(60);}

                switch (alt60) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zhou/Projects/ETL2Py/AbiDML.g:460:5: ID ','
            	    {
            	    dbg.location(460,5);
            	    match(input,ID,FOLLOW_ID_in_name_list2311); if (state.failed) return ;
            	    dbg.location(460,8);
            	    match(input,25,FOLLOW_25_in_name_list2313); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);
            } finally {dbg.exitSubRule(60);}

            dbg.location(460,14);
            match(input,ID,FOLLOW_ID_in_name_list2317); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(461, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "name_list");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "name_list"



    // $ANTLR start "variable_declaration_list"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:463:1: variable_declaration_list : ( variable_declaration )* ;
    public final void variable_declaration_list() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "variable_declaration_list");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(463, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:464:2: ( ( variable_declaration )* )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:464:4: ( variable_declaration )*
            {
            dbg.location(464,4);
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:464:4: ( variable_declaration )*
            try { dbg.enterSubRule(61);

            loop61:
            do {
                int alt61=2;
                try { dbg.enterDecision(61, decisionCanBacktrack[61]);

                int LA61_0 = input.LA(1);

                if ( (LA61_0==79) ) {
                    alt61=1;
                }


                } finally {dbg.exitDecision(61);}

                switch (alt61) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zhou/Projects/ETL2Py/AbiDML.g:464:4: variable_declaration
            	    {
            	    dbg.location(464,4);
            	    pushFollow(FOLLOW_variable_declaration_in_variable_declaration_list2328);
            	    variable_declaration();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);
            } finally {dbg.exitSubRule(61);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(465, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "variable_declaration_list");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "variable_declaration_list"



    // $ANTLR start "variable_declaration"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:467:1: variable_declaration : 'let' t= type ID (a= '=' expression )? ';' ;
    public final void variable_declaration() throws RecognitionException {
        Token a=null;
        Token ID15=null;
        AbiDMLParser.type_return t =null;


        try { dbg.enterRule(getGrammarFileName(), "variable_declaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(467, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:468:2: ( 'let' t= type ID (a= '=' expression )? ';' )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:468:4: 'let' t= type ID (a= '=' expression )? ';'
            {
            dbg.location(468,4);
            match(input,79,FOLLOW_79_in_variable_declaration2340); if (state.failed) return ;
            dbg.location(468,11);
            pushFollow(FOLLOW_type_in_variable_declaration2344);
            t=type();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(468,17);
            ID15=(Token)match(input,ID,FOLLOW_ID_in_variable_declaration2346); if (state.failed) return ;
            dbg.location(468,20);
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:468:20: (a= '=' expression )?
            int alt62=2;
            try { dbg.enterSubRule(62);
            try { dbg.enterDecision(62, decisionCanBacktrack[62]);

            int LA62_0 = input.LA(1);

            if ( (LA62_0==35) ) {
                alt62=1;
            }
            } finally {dbg.exitDecision(62);}

            switch (alt62) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:468:21: a= '=' expression
                    {
                    dbg.location(468,22);
                    a=(Token)match(input,35,FOLLOW_35_in_variable_declaration2351); if (state.failed) return ;
                    dbg.location(468,27);
                    pushFollow(FOLLOW_expression_in_variable_declaration2353);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(62);}

            dbg.location(468,40);
            match(input,31,FOLLOW_31_in_variable_declaration2357); if (state.failed) return ;
            dbg.location(469,3);
            if ( state.backtracking==0 ) {
            			// TODO: get expression value
            			if (a != null) {
            				if ((t!=null?t.typename:null).equals("string")) {
            					output((ID15!=null?ID15.getText():null) + "= StringVar(" + (t!=null?t.extra:null) + ", " + "" + ")");
            				} else if ((t!=null?t.typename:null).equals("decimal")) {
            					output((ID15!=null?ID15.getText():null) + "= DecimalVar(" + (t!=null?t.extra:null) + ", " + "" + ")");
            				} else if ((t!=null?t.typename:null).equals("int")) {
            					output((ID15!=null?ID15.getText():null) + "=0");
            				}
            			
            			} else {
            				if ((t!=null?t.typename:null).equals("string")) {
            					output((ID15!=null?ID15.getText():null) + "= StringVar(" + (t!=null?t.extra:null) + ")");
            				} else if ((t!=null?t.typename:null).equals("decimal")) {
            					output((ID15!=null?ID15.getText():null) + "= DecimalVar(" + (t!=null?t.extra:null) + ")");
            				} else if ((t!=null?t.typename:null).equals("int")) {
            					output((ID15!=null?ID15.getText():null) + "=0");
            				}
            			}
            		}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(490, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "variable_declaration");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "variable_declaration"



    // $ANTLR start "xfr_statement_list"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:492:1: xfr_statement_list : ( xfr_statement )+ ;
    public final void xfr_statement_list() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "xfr_statement_list");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(492, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:493:2: ( ( xfr_statement )+ )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:493:4: ( xfr_statement )+
            {
            dbg.location(493,4);
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:493:4: ( xfr_statement )+
            int cnt63=0;
            try { dbg.enterSubRule(63);

            loop63:
            do {
                int alt63=2;
                try { dbg.enterDecision(63, decisionCanBacktrack[63]);

                int LA63_0 = input.LA(1);

                if ( (LA63_0==FLOAT||(LA63_0 >= ID && LA63_0 <= INT)||LA63_0==STRING||LA63_0==15||LA63_0==17||LA63_0==21||LA63_0==24||(LA63_0 >= 41 && LA63_0 <= 42)||LA63_0==47||LA63_0==62||LA63_0==65||LA63_0==86||LA63_0==91||LA63_0==97||LA63_0==100) ) {
                    alt63=1;
                }


                } finally {dbg.exitDecision(63);}

                switch (alt63) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zhou/Projects/ETL2Py/AbiDML.g:493:4: xfr_statement
            	    {
            	    dbg.location(493,4);
            	    pushFollow(FOLLOW_xfr_statement_in_xfr_statement_list2373);
            	    xfr_statement();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt63 >= 1 ) break loop63;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(63, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt63++;
            } while (true);
            } finally {dbg.exitSubRule(63);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(494, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "xfr_statement_list");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "xfr_statement_list"



    // $ANTLR start "xfr_statement"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:496:1: xfr_statement : ( rule | procedural_statement );
    public final void xfr_statement() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "xfr_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(496, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:497:2: ( rule | procedural_statement )
            int alt64=2;
            try { dbg.enterDecision(64, decisionCanBacktrack[64]);

            switch ( input.LA(1) ) {
            case INT:
                {
                int LA64_1 = input.LA(2);

                if ( (synpred148_AbiDML()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case FLOAT:
                {
                int LA64_2 = input.LA(2);

                if ( (synpred148_AbiDML()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case STRING:
                {
                int LA64_3 = input.LA(2);

                if ( (synpred148_AbiDML()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 3, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case ID:
                {
                int LA64_4 = input.LA(2);

                if ( (synpred148_AbiDML()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 4, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 24:
                {
                int LA64_5 = input.LA(2);

                if ( (synpred148_AbiDML()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 5, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 15:
                {
                int LA64_6 = input.LA(2);

                if ( (synpred148_AbiDML()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 6, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 100:
                {
                int LA64_7 = input.LA(2);

                if ( (synpred148_AbiDML()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 7, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 21:
                {
                int LA64_8 = input.LA(2);

                if ( (synpred148_AbiDML()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 8, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 86:
                {
                int LA64_9 = input.LA(2);

                if ( (synpred148_AbiDML()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 9, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 41:
                {
                int LA64_10 = input.LA(2);

                if ( (synpred148_AbiDML()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 10, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 17:
                {
                int LA64_11 = input.LA(2);

                if ( (synpred148_AbiDML()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 11, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 91:
                {
                int LA64_12 = input.LA(2);

                if ( (synpred148_AbiDML()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 12, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 97:
                {
                int LA64_13 = input.LA(2);

                if ( (synpred148_AbiDML()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 13, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 62:
                {
                int LA64_14 = input.LA(2);

                if ( (synpred148_AbiDML()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 14, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 42:
                {
                int LA64_15 = input.LA(2);

                if ( (synpred148_AbiDML()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 15, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 47:
            case 65:
                {
                alt64=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(64);}

            switch (alt64) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:497:4: rule
                    {
                    dbg.location(497,4);
                    pushFollow(FOLLOW_rule_in_xfr_statement2385);
                    rule();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:497:11: procedural_statement
                    {
                    dbg.location(497,11);
                    pushFollow(FOLLOW_procedural_statement_in_xfr_statement2389);
                    procedural_statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(498, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "xfr_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "xfr_statement"



    // $ANTLR start "rule"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:500:1: rule : out_expr_list ( ':' optional_priority ':' | '::' ) expression ( ',' expression )* ';' ;
    public final void rule() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "rule");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(500, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:500:6: ( out_expr_list ( ':' optional_priority ':' | '::' ) expression ( ',' expression )* ';' )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:500:8: out_expr_list ( ':' optional_priority ':' | '::' ) expression ( ',' expression )* ';'
            {
            dbg.location(500,8);
            pushFollow(FOLLOW_out_expr_list_in_rule2399);
            out_expr_list();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(500,22);
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:500:22: ( ':' optional_priority ':' | '::' )
            int alt65=2;
            try { dbg.enterSubRule(65);
            try { dbg.enterDecision(65, decisionCanBacktrack[65]);

            int LA65_0 = input.LA(1);

            if ( (LA65_0==29) ) {
                alt65=1;
            }
            else if ( (LA65_0==30) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(65);}

            switch (alt65) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:500:23: ':' optional_priority ':'
                    {
                    dbg.location(500,23);
                    match(input,29,FOLLOW_29_in_rule2402); if (state.failed) return ;
                    dbg.location(500,27);
                    pushFollow(FOLLOW_optional_priority_in_rule2404);
                    optional_priority();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(500,45);
                    match(input,29,FOLLOW_29_in_rule2406); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:500:51: '::'
                    {
                    dbg.location(500,51);
                    match(input,30,FOLLOW_30_in_rule2410); if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(65);}

            dbg.location(500,57);
            pushFollow(FOLLOW_expression_in_rule2413);
            expression();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(500,68);
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:500:68: ( ',' expression )*
            try { dbg.enterSubRule(66);

            loop66:
            do {
                int alt66=2;
                try { dbg.enterDecision(66, decisionCanBacktrack[66]);

                int LA66_0 = input.LA(1);

                if ( (LA66_0==25) ) {
                    alt66=1;
                }


                } finally {dbg.exitDecision(66);}

                switch (alt66) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zhou/Projects/ETL2Py/AbiDML.g:500:69: ',' expression
            	    {
            	    dbg.location(500,69);
            	    match(input,25,FOLLOW_25_in_rule2416); if (state.failed) return ;
            	    dbg.location(500,73);
            	    pushFollow(FOLLOW_expression_in_rule2418);
            	    expression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);
            } finally {dbg.exitSubRule(66);}

            dbg.location(500,86);
            match(input,31,FOLLOW_31_in_rule2422); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(501, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "rule");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "rule"



    // $ANTLR start "procedural_statement"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:503:1: procedural_statement : ( if_statement | while_statement | for_statement | block_statement | assignment ) ( ';' )? ;
    public final void procedural_statement() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "procedural_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(503, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:504:2: ( ( if_statement | while_statement | for_statement | block_statement | assignment ) ( ';' )? )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:504:4: ( if_statement | while_statement | for_statement | block_statement | assignment ) ( ';' )?
            {
            dbg.location(504,4);
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:504:4: ( if_statement | while_statement | for_statement | block_statement | assignment )
            int alt67=5;
            try { dbg.enterSubRule(67);
            try { dbg.enterDecision(67, decisionCanBacktrack[67]);

            switch ( input.LA(1) ) {
            case 65:
                {
                alt67=1;
                }
                break;
            case 97:
                {
                int LA67_2 = input.LA(2);

                if ( (synpred152_AbiDML()) ) {
                    alt67=2;
                }
                else if ( (true) ) {
                    alt67=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 67, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 62:
                {
                int LA67_3 = input.LA(2);

                if ( (synpred153_AbiDML()) ) {
                    alt67=3;
                }
                else if ( (true) ) {
                    alt67=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 67, 3, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 47:
                {
                alt67=4;
                }
                break;
            case FLOAT:
            case ID:
            case INT:
            case STRING:
            case 15:
            case 17:
            case 21:
            case 24:
            case 41:
            case 42:
            case 86:
            case 91:
            case 100:
                {
                alt67=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(67);}

            switch (alt67) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:504:5: if_statement
                    {
                    dbg.location(504,5);
                    pushFollow(FOLLOW_if_statement_in_procedural_statement2438);
                    if_statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:504:20: while_statement
                    {
                    dbg.location(504,20);
                    pushFollow(FOLLOW_while_statement_in_procedural_statement2442);
                    while_statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:504:38: for_statement
                    {
                    dbg.location(504,38);
                    pushFollow(FOLLOW_for_statement_in_procedural_statement2446);
                    for_statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:504:54: block_statement
                    {
                    dbg.location(504,54);
                    pushFollow(FOLLOW_block_statement_in_procedural_statement2450);
                    block_statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:504:72: assignment
                    {
                    dbg.location(504,72);
                    pushFollow(FOLLOW_assignment_in_procedural_statement2454);
                    assignment();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(67);}

            dbg.location(504,84);
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:504:84: ( ';' )?
            int alt68=2;
            try { dbg.enterSubRule(68);
            try { dbg.enterDecision(68, decisionCanBacktrack[68]);

            int LA68_0 = input.LA(1);

            if ( (LA68_0==31) ) {
                int LA68_1 = input.LA(2);

                if ( (synpred155_AbiDML()) ) {
                    alt68=1;
                }
            }
            } finally {dbg.exitDecision(68);}

            switch (alt68) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:504:84: ';'
                    {
                    dbg.location(504,84);
                    match(input,31,FOLLOW_31_in_procedural_statement2457); if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(68);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(505, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "procedural_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "procedural_statement"



    // $ANTLR start "assignment"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:507:1: assignment : out_expr '=' expression ;
    public final void assignment() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "assignment");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(507, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:508:2: ( out_expr '=' expression )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:508:4: out_expr '=' expression
            {
            dbg.location(508,4);
            pushFollow(FOLLOW_out_expr_in_assignment2473);
            out_expr();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(508,13);
            match(input,35,FOLLOW_35_in_assignment2475); if (state.failed) return ;
            dbg.location(508,17);
            pushFollow(FOLLOW_expression_in_assignment2477);
            expression();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(509, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "assignment");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "assignment"



    // $ANTLR start "out_expr"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:511:1: out_expr : ( ( field_expr )=> field_expr | ( element_expr )=> element_expr | variable_expr );
    public final void out_expr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "out_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(511, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:512:2: ( ( field_expr )=> field_expr | ( element_expr )=> element_expr | variable_expr )
            int alt69=3;
            try { dbg.enterDecision(69, decisionCanBacktrack[69]);

            switch ( input.LA(1) ) {
            case INT:
                {
                int LA69_1 = input.LA(2);

                if ( (synpred156_AbiDML()) ) {
                    alt69=1;
                }
                else if ( (synpred157_AbiDML()) ) {
                    alt69=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case FLOAT:
                {
                int LA69_2 = input.LA(2);

                if ( (synpred156_AbiDML()) ) {
                    alt69=1;
                }
                else if ( (synpred157_AbiDML()) ) {
                    alt69=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case STRING:
                {
                int LA69_3 = input.LA(2);

                if ( (synpred156_AbiDML()) ) {
                    alt69=1;
                }
                else if ( (synpred157_AbiDML()) ) {
                    alt69=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 3, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case ID:
                {
                int LA69_4 = input.LA(2);

                if ( (synpred156_AbiDML()) ) {
                    alt69=1;
                }
                else if ( (synpred157_AbiDML()) ) {
                    alt69=2;
                }
                else if ( (true) ) {
                    alt69=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 4, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 24:
                {
                int LA69_5 = input.LA(2);

                if ( (synpred156_AbiDML()) ) {
                    alt69=1;
                }
                else if ( (synpred157_AbiDML()) ) {
                    alt69=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 5, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 15:
                {
                int LA69_6 = input.LA(2);

                if ( (synpred156_AbiDML()) ) {
                    alt69=1;
                }
                else if ( (synpred157_AbiDML()) ) {
                    alt69=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 6, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 100:
                {
                int LA69_7 = input.LA(2);

                if ( (synpred156_AbiDML()) ) {
                    alt69=1;
                }
                else if ( (synpred157_AbiDML()) ) {
                    alt69=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 7, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 21:
                {
                int LA69_8 = input.LA(2);

                if ( (synpred156_AbiDML()) ) {
                    alt69=1;
                }
                else if ( (synpred157_AbiDML()) ) {
                    alt69=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 8, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 86:
                {
                int LA69_9 = input.LA(2);

                if ( (synpred156_AbiDML()) ) {
                    alt69=1;
                }
                else if ( (synpred157_AbiDML()) ) {
                    alt69=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 9, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 41:
                {
                int LA69_10 = input.LA(2);

                if ( (synpred156_AbiDML()) ) {
                    alt69=1;
                }
                else if ( (synpred157_AbiDML()) ) {
                    alt69=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 10, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 17:
                {
                int LA69_11 = input.LA(2);

                if ( (synpred156_AbiDML()) ) {
                    alt69=1;
                }
                else if ( (synpred157_AbiDML()) ) {
                    alt69=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 11, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 91:
                {
                int LA69_12 = input.LA(2);

                if ( (synpred156_AbiDML()) ) {
                    alt69=1;
                }
                else if ( (synpred157_AbiDML()) ) {
                    alt69=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 12, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 97:
                {
                int LA69_13 = input.LA(2);

                if ( (synpred156_AbiDML()) ) {
                    alt69=1;
                }
                else if ( (synpred157_AbiDML()) ) {
                    alt69=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 13, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 62:
                {
                int LA69_14 = input.LA(2);

                if ( (synpred156_AbiDML()) ) {
                    alt69=1;
                }
                else if ( (synpred157_AbiDML()) ) {
                    alt69=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 14, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 42:
                {
                int LA69_15 = input.LA(2);

                if ( (synpred156_AbiDML()) ) {
                    alt69=1;
                }
                else if ( (synpred157_AbiDML()) ) {
                    alt69=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 15, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(69);}

            switch (alt69) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:512:4: ( field_expr )=> field_expr
                    {
                    dbg.location(512,20);
                    pushFollow(FOLLOW_field_expr_in_out_expr2494);
                    field_expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:513:4: ( element_expr )=> element_expr
                    {
                    dbg.location(513,22);
                    pushFollow(FOLLOW_element_expr_in_out_expr2505);
                    element_expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:514:4: variable_expr
                    {
                    dbg.location(514,4);
                    pushFollow(FOLLOW_variable_expr_in_out_expr2510);
                    variable_expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(515, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "out_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "out_expr"



    // $ANTLR start "if_statement"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:526:1: if_statement : 'if' '(' expression ')' procedural_statement ( 'else' procedural_statement )? ;
    public final void if_statement() throws RecognitionException {
        String expression16 =null;


        try { dbg.enterRule(getGrammarFileName(), "if_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(526, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:527:5: ( 'if' '(' expression ')' procedural_statement ( 'else' procedural_statement )? )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:527:9: 'if' '(' expression ')' procedural_statement ( 'else' procedural_statement )?
            {
            dbg.location(527,9);
            match(input,65,FOLLOW_65_in_if_statement2528); if (state.failed) return ;
            dbg.location(527,14);
            match(input,21,FOLLOW_21_in_if_statement2530); if (state.failed) return ;
            dbg.location(527,18);
            pushFollow(FOLLOW_expression_in_if_statement2532);
            expression16=expression();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(527,29);
            match(input,22,FOLLOW_22_in_if_statement2534); if (state.failed) return ;
            dbg.location(527,33);
            pushFollow(FOLLOW_procedural_statement_in_if_statement2536);
            procedural_statement();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(527,54);
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:527:54: ( 'else' procedural_statement )?
            int alt70=2;
            try { dbg.enterSubRule(70);
            try { dbg.enterDecision(70, decisionCanBacktrack[70]);

            int LA70_0 = input.LA(1);

            if ( (LA70_0==58) ) {
                int LA70_1 = input.LA(2);

                if ( (synpred158_AbiDML()) ) {
                    alt70=1;
                }
            }
            } finally {dbg.exitDecision(70);}

            switch (alt70) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:527:55: 'else' procedural_statement
                    {
                    dbg.location(527,55);
                    match(input,58,FOLLOW_58_in_if_statement2539); if (state.failed) return ;
                    dbg.location(527,62);
                    pushFollow(FOLLOW_procedural_statement_in_if_statement2541);
                    procedural_statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(70);}

            dbg.location(528,6);
            if ( state.backtracking==0 ) {
                		//System.out.println(expression16);
                	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(531, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "if_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "if_statement"



    // $ANTLR start "while_statement"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:533:1: while_statement : 'while' '(' expression ')' procedural_statement ;
    public final void while_statement() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "while_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(533, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:534:5: ( 'while' '(' expression ')' procedural_statement )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:534:9: 'while' '(' expression ')' procedural_statement
            {
            dbg.location(534,9);
            match(input,97,FOLLOW_97_in_while_statement2569); if (state.failed) return ;
            dbg.location(534,17);
            match(input,21,FOLLOW_21_in_while_statement2571); if (state.failed) return ;
            dbg.location(534,21);
            pushFollow(FOLLOW_expression_in_while_statement2573);
            expression();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(534,32);
            match(input,22,FOLLOW_22_in_while_statement2575); if (state.failed) return ;
            dbg.location(534,36);
            pushFollow(FOLLOW_procedural_statement_in_while_statement2577);
            procedural_statement();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(535, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "while_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "while_statement"



    // $ANTLR start "switch_statement"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:537:1: switch_statement : 'switch' '(' expression ')' case_actions 'end' ';' ;
    public final void switch_statement() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "switch_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(537, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:538:5: ( 'switch' '(' expression ')' case_actions 'end' ';' )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:538:9: 'switch' '(' expression ')' case_actions 'end' ';'
            {
            dbg.location(538,9);
            match(input,90,FOLLOW_90_in_switch_statement2600); if (state.failed) return ;
            dbg.location(538,18);
            match(input,21,FOLLOW_21_in_switch_statement2602); if (state.failed) return ;
            dbg.location(538,22);
            pushFollow(FOLLOW_expression_in_switch_statement2604);
            expression();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(538,33);
            match(input,22,FOLLOW_22_in_switch_statement2606); if (state.failed) return ;
            dbg.location(538,37);
            pushFollow(FOLLOW_case_actions_in_switch_statement2608);
            case_actions();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(538,50);
            match(input,59,FOLLOW_59_in_switch_statement2610); if (state.failed) return ;
            dbg.location(538,56);
            match(input,31,FOLLOW_31_in_switch_statement2612); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(539, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "switch_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "switch_statement"



    // $ANTLR start "case_actions"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:541:1: case_actions : ( 'case' match_list ':' procedural_statement ';' case_actions | 'default' ':' procedural_statement )? ;
    public final void case_actions() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "case_actions");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(541, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:542:5: ( ( 'case' match_list ':' procedural_statement ';' case_actions | 'default' ':' procedural_statement )? )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:542:9: ( 'case' match_list ':' procedural_statement ';' case_actions | 'default' ':' procedural_statement )?
            {
            dbg.location(542,9);
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:542:9: ( 'case' match_list ':' procedural_statement ';' case_actions | 'default' ':' procedural_statement )?
            int alt71=3;
            try { dbg.enterSubRule(71);
            try { dbg.enterDecision(71, decisionCanBacktrack[71]);

            int LA71_0 = input.LA(1);

            if ( (LA71_0==49) ) {
                alt71=1;
            }
            else if ( (LA71_0==54) ) {
                alt71=2;
            }
            } finally {dbg.exitDecision(71);}

            switch (alt71) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:542:10: 'case' match_list ':' procedural_statement ';' case_actions
                    {
                    dbg.location(542,10);
                    match(input,49,FOLLOW_49_in_case_actions2633); if (state.failed) return ;
                    dbg.location(542,17);
                    pushFollow(FOLLOW_match_list_in_case_actions2635);
                    match_list();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(542,28);
                    match(input,29,FOLLOW_29_in_case_actions2637); if (state.failed) return ;
                    dbg.location(542,32);
                    pushFollow(FOLLOW_procedural_statement_in_case_actions2639);
                    procedural_statement();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(542,53);
                    match(input,31,FOLLOW_31_in_case_actions2641); if (state.failed) return ;
                    dbg.location(542,57);
                    pushFollow(FOLLOW_case_actions_in_case_actions2643);
                    case_actions();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:542:72: 'default' ':' procedural_statement
                    {
                    dbg.location(542,72);
                    match(input,54,FOLLOW_54_in_case_actions2647); if (state.failed) return ;
                    dbg.location(542,82);
                    match(input,29,FOLLOW_29_in_case_actions2649); if (state.failed) return ;
                    dbg.location(542,86);
                    pushFollow(FOLLOW_procedural_statement_in_case_actions2651);
                    procedural_statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(71);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(543, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "case_actions");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "case_actions"



    // $ANTLR start "match_list"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:545:1: match_list : expression ( ',' match_list )? ;
    public final void match_list() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "match_list");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(545, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:546:5: ( expression ( ',' match_list )? )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:546:9: expression ( ',' match_list )?
            {
            dbg.location(546,9);
            pushFollow(FOLLOW_expression_in_match_list2672);
            expression();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(546,21);
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:546:21: ( ',' match_list )?
            int alt72=2;
            try { dbg.enterSubRule(72);
            try { dbg.enterDecision(72, decisionCanBacktrack[72]);

            int LA72_0 = input.LA(1);

            if ( (LA72_0==25) ) {
                alt72=1;
            }
            } finally {dbg.exitDecision(72);}

            switch (alt72) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:546:22: ',' match_list
                    {
                    dbg.location(546,22);
                    match(input,25,FOLLOW_25_in_match_list2676); if (state.failed) return ;
                    dbg.location(546,26);
                    pushFollow(FOLLOW_match_list_in_match_list2678);
                    match_list();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(72);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(547, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "match_list");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "match_list"



    // $ANTLR start "for_statement"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:549:1: for_statement : 'for' '(' ID ',' expression ')' procedural_statement ;
    public final void for_statement() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "for_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(549, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:550:5: ( 'for' '(' ID ',' expression ')' procedural_statement )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:550:9: 'for' '(' ID ',' expression ')' procedural_statement
            {
            dbg.location(550,9);
            match(input,62,FOLLOW_62_in_for_statement2703); if (state.failed) return ;
            dbg.location(550,15);
            match(input,21,FOLLOW_21_in_for_statement2705); if (state.failed) return ;
            dbg.location(550,19);
            match(input,ID,FOLLOW_ID_in_for_statement2707); if (state.failed) return ;
            dbg.location(550,22);
            match(input,25,FOLLOW_25_in_for_statement2709); if (state.failed) return ;
            dbg.location(550,26);
            pushFollow(FOLLOW_expression_in_for_statement2711);
            expression();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(550,37);
            match(input,22,FOLLOW_22_in_for_statement2713); if (state.failed) return ;
            dbg.location(550,41);
            pushFollow(FOLLOW_procedural_statement_in_for_statement2715);
            procedural_statement();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(551, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "for_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "for_statement"



    // $ANTLR start "block_statement"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:553:1: block_statement : 'begin' variable_declaration_list procedural_statement_list 'end' ;
    public final void block_statement() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "block_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(553, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:554:5: ( 'begin' variable_declaration_list procedural_statement_list 'end' )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:554:9: 'begin' variable_declaration_list procedural_statement_list 'end'
            {
            dbg.location(554,9);
            match(input,47,FOLLOW_47_in_block_statement2734); if (state.failed) return ;
            dbg.location(554,17);
            pushFollow(FOLLOW_variable_declaration_list_in_block_statement2736);
            variable_declaration_list();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(554,43);
            pushFollow(FOLLOW_procedural_statement_list_in_block_statement2738);
            procedural_statement_list();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(554,69);
            match(input,59,FOLLOW_59_in_block_statement2740); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(555, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "block_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "block_statement"



    // $ANTLR start "procedural_statement_list"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:557:1: procedural_statement_list : ( ( procedural_statement )+ | switch_statement )? ;
    public final void procedural_statement_list() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "procedural_statement_list");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(557, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:558:5: ( ( ( procedural_statement )+ | switch_statement )? )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:558:9: ( ( procedural_statement )+ | switch_statement )?
            {
            dbg.location(558,9);
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:558:9: ( ( procedural_statement )+ | switch_statement )?
            int alt74=3;
            try { dbg.enterSubRule(74);
            try { dbg.enterDecision(74, decisionCanBacktrack[74]);

            int LA74_0 = input.LA(1);

            if ( (LA74_0==FLOAT||(LA74_0 >= ID && LA74_0 <= INT)||LA74_0==STRING||LA74_0==15||LA74_0==17||LA74_0==21||LA74_0==24||(LA74_0 >= 41 && LA74_0 <= 42)||LA74_0==47||LA74_0==62||LA74_0==65||LA74_0==86||LA74_0==91||LA74_0==97||LA74_0==100) ) {
                alt74=1;
            }
            else if ( (LA74_0==90) ) {
                alt74=2;
            }
            } finally {dbg.exitDecision(74);}

            switch (alt74) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:558:10: ( procedural_statement )+
                    {
                    dbg.location(558,10);
                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:558:10: ( procedural_statement )+
                    int cnt73=0;
                    try { dbg.enterSubRule(73);

                    loop73:
                    do {
                        int alt73=2;
                        try { dbg.enterDecision(73, decisionCanBacktrack[73]);

                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==FLOAT||(LA73_0 >= ID && LA73_0 <= INT)||LA73_0==STRING||LA73_0==15||LA73_0==17||LA73_0==21||LA73_0==24||(LA73_0 >= 41 && LA73_0 <= 42)||LA73_0==47||LA73_0==62||LA73_0==65||LA73_0==86||LA73_0==91||LA73_0==97||LA73_0==100) ) {
                            alt73=1;
                        }


                        } finally {dbg.exitDecision(73);}

                        switch (alt73) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/zhou/Projects/ETL2Py/AbiDML.g:558:10: procedural_statement
                    	    {
                    	    dbg.location(558,10);
                    	    pushFollow(FOLLOW_procedural_statement_in_procedural_statement_list2760);
                    	    procedural_statement();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt73 >= 1 ) break loop73;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(73, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt73++;
                    } while (true);
                    } finally {dbg.exitSubRule(73);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:558:34: switch_statement
                    {
                    dbg.location(558,34);
                    pushFollow(FOLLOW_switch_statement_in_procedural_statement_list2765);
                    switch_statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(74);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(559, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "procedural_statement_list");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "procedural_statement_list"



    // $ANTLR start "out_expr_list"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:561:1: out_expr_list : out_expr ( ',' out_expr )* ;
    public final void out_expr_list() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "out_expr_list");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(561, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:562:5: ( out_expr ( ',' out_expr )* )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:562:9: out_expr ( ',' out_expr )*
            {
            dbg.location(562,9);
            pushFollow(FOLLOW_out_expr_in_out_expr_list2790);
            out_expr();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(562,18);
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:562:18: ( ',' out_expr )*
            try { dbg.enterSubRule(75);

            loop75:
            do {
                int alt75=2;
                try { dbg.enterDecision(75, decisionCanBacktrack[75]);

                int LA75_0 = input.LA(1);

                if ( (LA75_0==25) ) {
                    alt75=1;
                }


                } finally {dbg.exitDecision(75);}

                switch (alt75) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/zhou/Projects/ETL2Py/AbiDML.g:562:19: ',' out_expr
            	    {
            	    dbg.location(562,19);
            	    match(input,25,FOLLOW_25_in_out_expr_list2793); if (state.failed) return ;
            	    dbg.location(562,23);
            	    pushFollow(FOLLOW_out_expr_in_out_expr_list2795);
            	    out_expr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);
            } finally {dbg.exitSubRule(75);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(563, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "out_expr_list");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "out_expr_list"



    // $ANTLR start "optional_priority"
    // /Users/zhou/Projects/ETL2Py/AbiDML.g:565:1: optional_priority : ( INT )? ;
    public final void optional_priority() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "optional_priority");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(565, 0);

        try {
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:566:5: ( ( INT )? )
            dbg.enterAlt(1);

            // /Users/zhou/Projects/ETL2Py/AbiDML.g:566:7: ( INT )?
            {
            dbg.location(566,7);
            // /Users/zhou/Projects/ETL2Py/AbiDML.g:566:7: ( INT )?
            int alt76=2;
            try { dbg.enterSubRule(76);
            try { dbg.enterDecision(76, decisionCanBacktrack[76]);

            int LA76_0 = input.LA(1);

            if ( (LA76_0==INT) ) {
                alt76=1;
            }
            } finally {dbg.exitDecision(76);}

            switch (alt76) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/zhou/Projects/ETL2Py/AbiDML.g:566:7: INT
                    {
                    dbg.location(566,7);
                    match(input,INT,FOLLOW_INT_in_optional_priority2818); if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(76);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(567, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "optional_priority");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "optional_priority"

    // $ANTLR start synpred22_AbiDML
    public final void synpred22_AbiDML_fragment() throws RecognitionException {
        // /Users/zhou/Projects/ETL2Py/AbiDML.g:118:4: ( funcall_expr )
        dbg.enterAlt(1);

        // /Users/zhou/Projects/ETL2Py/AbiDML.g:118:4: funcall_expr
        {
        dbg.location(118,4);
        pushFollow(FOLLOW_funcall_expr_in_synpred22_AbiDML405);
        funcall_expr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred22_AbiDML

    // $ANTLR start synpred23_AbiDML
    public final void synpred23_AbiDML_fragment() throws RecognitionException {
        // /Users/zhou/Projects/ETL2Py/AbiDML.g:122:4: ( variable_expr )
        dbg.enterAlt(1);

        // /Users/zhou/Projects/ETL2Py/AbiDML.g:122:4: variable_expr
        {
        dbg.location(122,4);
        pushFollow(FOLLOW_variable_expr_in_synpred23_AbiDML414);
        variable_expr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred23_AbiDML

    // $ANTLR start synpred25_AbiDML
    public final void synpred25_AbiDML_fragment() throws RecognitionException {
        // /Users/zhou/Projects/ETL2Py/AbiDML.g:124:4: ( cast_expr )
        dbg.enterAlt(1);

        // /Users/zhou/Projects/ETL2Py/AbiDML.g:124:4: cast_expr
        {
        dbg.location(124,4);
        pushFollow(FOLLOW_cast_expr_in_synpred25_AbiDML424);
        cast_expr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred25_AbiDML

    // $ANTLR start synpred27_AbiDML
    public final void synpred27_AbiDML_fragment() throws RecognitionException {
        // /Users/zhou/Projects/ETL2Py/AbiDML.g:126:4: ( '(' expression ')' )
        dbg.enterAlt(1);

        // /Users/zhou/Projects/ETL2Py/AbiDML.g:126:4: '(' expression ')'
        {
        dbg.location(126,4);
        match(input,21,FOLLOW_21_in_synpred27_AbiDML434); if (state.failed) return ;
        dbg.location(126,8);
        pushFollow(FOLLOW_expression_in_synpred27_AbiDML436);
        expression();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(126,19);
        match(input,22,FOLLOW_22_in_synpred27_AbiDML438); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred27_AbiDML

    // $ANTLR start synpred32_AbiDML
    public final void synpred32_AbiDML_fragment() throws RecognitionException {
        // /Users/zhou/Projects/ETL2Py/AbiDML.g:131:4: ( make_record_expr )
        dbg.enterAlt(1);

        // /Users/zhou/Projects/ETL2Py/AbiDML.g:131:4: make_record_expr
        {
        dbg.location(131,4);
        pushFollow(FOLLOW_make_record_expr_in_synpred32_AbiDML463);
        make_record_expr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred32_AbiDML

    // $ANTLR start synpred39_AbiDML
    public final void synpred39_AbiDML_fragment() throws RecognitionException {
        // /Users/zhou/Projects/ETL2Py/AbiDML.g:178:11: ( name )
        dbg.enterAlt(1);

        // /Users/zhou/Projects/ETL2Py/AbiDML.g:178:11: name
        {
        dbg.location(178,11);
        pushFollow(FOLLOW_name_in_synpred39_AbiDML703);
        name();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred39_AbiDML

    // $ANTLR start synpred41_AbiDML
    public final void synpred41_AbiDML_fragment() throws RecognitionException {
        // /Users/zhou/Projects/ETL2Py/AbiDML.g:178:5: ( ( '.' ( ( name )+ | '*' ) ) )
        dbg.enterAlt(1);

        // /Users/zhou/Projects/ETL2Py/AbiDML.g:178:5: ( '.' ( ( name )+ | '*' ) )
        {
        dbg.location(178,5);
        // /Users/zhou/Projects/ETL2Py/AbiDML.g:178:5: ( '.' ( ( name )+ | '*' ) )
        dbg.enterAlt(1);

        // /Users/zhou/Projects/ETL2Py/AbiDML.g:178:6: '.' ( ( name )+ | '*' )
        {
        dbg.location(178,6);
        match(input,27,FOLLOW_27_in_synpred41_AbiDML700); if (state.failed) return ;
        dbg.location(178,10);
        // /Users/zhou/Projects/ETL2Py/AbiDML.g:178:10: ( ( name )+ | '*' )
        int alt80=2;
        try { dbg.enterSubRule(80);
        try { dbg.enterDecision(80, decisionCanBacktrack[80]);

        int LA80_0 = input.LA(1);

        if ( (LA80_0==ID) ) {
            alt80=1;
        }
        else if ( (LA80_0==23) ) {
            alt80=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 80, 0, input);

            dbg.recognitionException(nvae);
            throw nvae;

        }
        } finally {dbg.exitDecision(80);}

        switch (alt80) {
            case 1 :
                dbg.enterAlt(1);

                // /Users/zhou/Projects/ETL2Py/AbiDML.g:178:11: ( name )+
                {
                dbg.location(178,11);
                // /Users/zhou/Projects/ETL2Py/AbiDML.g:178:11: ( name )+
                int cnt79=0;
                try { dbg.enterSubRule(79);

                loop79:
                do {
                    int alt79=2;
                    try { dbg.enterDecision(79, decisionCanBacktrack[79]);

                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==ID) ) {
                        alt79=1;
                    }


                    } finally {dbg.exitDecision(79);}

                    switch (alt79) {
                	case 1 :
                	    dbg.enterAlt(1);

                	    // /Users/zhou/Projects/ETL2Py/AbiDML.g:178:11: name
                	    {
                	    dbg.location(178,11);
                	    pushFollow(FOLLOW_name_in_synpred41_AbiDML703);
                	    name();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    if ( cnt79 >= 1 ) break loop79;
                	    if (state.backtracking>0) {state.failed=true; return ;}
                            EarlyExitException eee =
                                new EarlyExitException(79, input);
                            dbg.recognitionException(eee);

                            throw eee;
                    }
                    cnt79++;
                } while (true);
                } finally {dbg.exitSubRule(79);}


                }
                break;
            case 2 :
                dbg.enterAlt(2);

                // /Users/zhou/Projects/ETL2Py/AbiDML.g:178:19: '*'
                {
                dbg.location(178,19);
                match(input,23,FOLLOW_23_in_synpred41_AbiDML708); if (state.failed) return ;

                }
                break;

        }
        } finally {dbg.exitSubRule(80);}


        }


        }

    }
    // $ANTLR end synpred41_AbiDML

    // $ANTLR start synpred42_AbiDML
    public final void synpred42_AbiDML_fragment() throws RecognitionException {
        // /Users/zhou/Projects/ETL2Py/AbiDML.g:180:5: ( ( binop expression ) )
        dbg.enterAlt(1);

        // /Users/zhou/Projects/ETL2Py/AbiDML.g:180:5: ( binop expression )
        {
        dbg.location(180,5);
        // /Users/zhou/Projects/ETL2Py/AbiDML.g:180:5: ( binop expression )
        dbg.enterAlt(1);

        // /Users/zhou/Projects/ETL2Py/AbiDML.g:180:6: binop expression
        {
        dbg.location(180,6);
        pushFollow(FOLLOW_binop_in_synpred42_AbiDML724);
        binop();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(180,12);
        pushFollow(FOLLOW_expression_in_synpred42_AbiDML726);
        expression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

    }
    // $ANTLR end synpred42_AbiDML

    // $ANTLR start synpred43_AbiDML
    public final void synpred43_AbiDML_fragment() throws RecognitionException {
        // /Users/zhou/Projects/ETL2Py/AbiDML.g:182:5: ( ( '[' expression ']' ) )
        dbg.enterAlt(1);

        // /Users/zhou/Projects/ETL2Py/AbiDML.g:182:5: ( '[' expression ']' )
        {
        dbg.location(182,5);
        // /Users/zhou/Projects/ETL2Py/AbiDML.g:182:5: ( '[' expression ']' )
        dbg.enterAlt(1);

        // /Users/zhou/Projects/ETL2Py/AbiDML.g:182:6: '[' expression ']'
        {
        dbg.location(182,6);
        match(input,42,FOLLOW_42_in_synpred43_AbiDML740); if (state.failed) return ;
        dbg.location(182,10);
        pushFollow(FOLLOW_expression_in_synpred43_AbiDML742);
        expression();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(182,21);
        match(input,43,FOLLOW_43_in_synpred43_AbiDML744); if (state.failed) return ;

        }


        }

    }
    // $ANTLR end synpred43_AbiDML

    // $ANTLR start synpred44_AbiDML
    public final void synpred44_AbiDML_fragment() throws RecognitionException {
        // /Users/zhou/Projects/ETL2Py/AbiDML.g:184:5: ( ( conditionalop expression ) )
        dbg.enterAlt(1);

        // /Users/zhou/Projects/ETL2Py/AbiDML.g:184:5: ( conditionalop expression )
        {
        dbg.location(184,5);
        // /Users/zhou/Projects/ETL2Py/AbiDML.g:184:5: ( conditionalop expression )
        dbg.enterAlt(1);

        // /Users/zhou/Projects/ETL2Py/AbiDML.g:184:6: conditionalop expression
        {
        dbg.location(184,6);
        pushFollow(FOLLOW_conditionalop_in_synpred44_AbiDML758);
        conditionalop();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(184,20);
        pushFollow(FOLLOW_expression_in_synpred44_AbiDML760);
        expression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

    }
    // $ANTLR end synpred44_AbiDML

    // $ANTLR start synpred45_AbiDML
    public final void synpred45_AbiDML_fragment() throws RecognitionException {
        // /Users/zhou/Projects/ETL2Py/AbiDML.g:186:5: ( ( '?' expression ':' expression ) )
        dbg.enterAlt(1);

        // /Users/zhou/Projects/ETL2Py/AbiDML.g:186:5: ( '?' expression ':' expression )
        {
        dbg.location(186,5);
        // /Users/zhou/Projects/ETL2Py/AbiDML.g:186:5: ( '?' expression ':' expression )
        dbg.enterAlt(1);

        // /Users/zhou/Projects/ETL2Py/AbiDML.g:186:6: '?' expression ':' expression
        {
        dbg.location(186,6);
        match(input,40,FOLLOW_40_in_synpred45_AbiDML776); if (state.failed) return ;
        dbg.location(186,10);
        pushFollow(FOLLOW_expression_in_synpred45_AbiDML778);
        expression();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(186,21);
        match(input,29,FOLLOW_29_in_synpred45_AbiDML780); if (state.failed) return ;
        dbg.location(186,25);
        pushFollow(FOLLOW_expression_in_synpred45_AbiDML782);
        expression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

    }
    // $ANTLR end synpred45_AbiDML

    // $ANTLR start synpred47_AbiDML
    public final void synpred47_AbiDML_fragment() throws RecognitionException {
        // /Users/zhou/Projects/ETL2Py/AbiDML.g:190:39: ( 'else' expression )
        dbg.enterAlt(1);

        // /Users/zhou/Projects/ETL2Py/AbiDML.g:190:39: 'else' expression
        {
        dbg.location(190,39);
        match(input,58,FOLLOW_58_in_synpred47_AbiDML812); if (state.failed) return ;
        dbg.location(190,46);
        pushFollow(FOLLOW_expression_in_synpred47_AbiDML814);
        expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred47_AbiDML

    // $ANTLR start synpred81_AbiDML
    public final void synpred81_AbiDML_fragment() throws RecognitionException {
        // /Users/zhou/Projects/ETL2Py/AbiDML.g:293:4: ( variable_expr )
        dbg.enterAlt(1);

        // /Users/zhou/Projects/ETL2Py/AbiDML.g:293:4: variable_expr
        {
        dbg.location(293,4);
        pushFollow(FOLLOW_variable_expr_in_synpred81_AbiDML1248);
        variable_expr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred81_AbiDML

    // $ANTLR start synpred82_AbiDML
    public final void synpred82_AbiDML_fragment() throws RecognitionException {
        // /Users/zhou/Projects/ETL2Py/AbiDML.g:294:4: ( funcall_expr )
        dbg.enterAlt(1);

        // /Users/zhou/Projects/ETL2Py/AbiDML.g:294:5: funcall_expr
        {
        dbg.location(294,5);
        pushFollow(FOLLOW_funcall_expr_in_synpred82_AbiDML1254);
        funcall_expr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred82_AbiDML

    // $ANTLR start synpred83_AbiDML
    public final void synpred83_AbiDML_fragment() throws RecognitionException {
        // /Users/zhou/Projects/ETL2Py/AbiDML.g:296:4: ( unarycall )
        dbg.enterAlt(1);

        // /Users/zhou/Projects/ETL2Py/AbiDML.g:296:4: unarycall
        {
        dbg.location(296,4);
        pushFollow(FOLLOW_unarycall_in_synpred83_AbiDML1266);
        unarycall();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred83_AbiDML

    // $ANTLR start synpred84_AbiDML
    public final void synpred84_AbiDML_fragment() throws RecognitionException {
        // /Users/zhou/Projects/ETL2Py/AbiDML.g:298:4: ( field_expr )
        dbg.enterAlt(1);

        // /Users/zhou/Projects/ETL2Py/AbiDML.g:298:5: field_expr
        {
        dbg.location(298,5);
        pushFollow(FOLLOW_field_expr_in_synpred84_AbiDML1274);
        field_expr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred84_AbiDML

    // $ANTLR start synpred85_AbiDML
    public final void synpred85_AbiDML_fragment() throws RecognitionException {
        // /Users/zhou/Projects/ETL2Py/AbiDML.g:299:4: ( element_expr )
        dbg.enterAlt(1);

        // /Users/zhou/Projects/ETL2Py/AbiDML.g:299:5: element_expr
        {
        dbg.location(299,5);
        pushFollow(FOLLOW_element_expr_in_synpred85_AbiDML1287);
        element_expr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred85_AbiDML

    // $ANTLR start synpred86_AbiDML
    public final void synpred86_AbiDML_fragment() throws RecognitionException {
        // /Users/zhou/Projects/ETL2Py/AbiDML.g:300:4: ( binarycall )
        dbg.enterAlt(1);

        // /Users/zhou/Projects/ETL2Py/AbiDML.g:300:5: binarycall
        {
        dbg.location(300,5);
        pushFollow(FOLLOW_binarycall_in_synpred86_AbiDML1298);
        binarycall();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred86_AbiDML

    // $ANTLR start synpred87_AbiDML
    public final void synpred87_AbiDML_fragment() throws RecognitionException {
        // /Users/zhou/Projects/ETL2Py/AbiDML.g:301:4: ( conditional )
        dbg.enterAlt(1);

        // /Users/zhou/Projects/ETL2Py/AbiDML.g:301:5: conditional
        {
        dbg.location(301,5);
        pushFollow(FOLLOW_conditional_in_synpred87_AbiDML1311);
        conditional();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred87_AbiDML

    // $ANTLR start synpred88_AbiDML
    public final void synpred88_AbiDML_fragment() throws RecognitionException {
        // /Users/zhou/Projects/ETL2Py/AbiDML.g:303:4: ( cast_expr )
        dbg.enterAlt(1);

        // /Users/zhou/Projects/ETL2Py/AbiDML.g:303:5: cast_expr
        {
        dbg.location(303,5);
        pushFollow(FOLLOW_cast_expr_in_synpred88_AbiDML1325);
        cast_expr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred88_AbiDML

    // $ANTLR start synpred148_AbiDML
    public final void synpred148_AbiDML_fragment() throws RecognitionException {
        // /Users/zhou/Projects/ETL2Py/AbiDML.g:497:4: ( rule )
        dbg.enterAlt(1);

        // /Users/zhou/Projects/ETL2Py/AbiDML.g:497:4: rule
        {
        dbg.location(497,4);
        pushFollow(FOLLOW_rule_in_synpred148_AbiDML2385);
        rule();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred148_AbiDML

    // $ANTLR start synpred152_AbiDML
    public final void synpred152_AbiDML_fragment() throws RecognitionException {
        // /Users/zhou/Projects/ETL2Py/AbiDML.g:504:20: ( while_statement )
        dbg.enterAlt(1);

        // /Users/zhou/Projects/ETL2Py/AbiDML.g:504:20: while_statement
        {
        dbg.location(504,20);
        pushFollow(FOLLOW_while_statement_in_synpred152_AbiDML2442);
        while_statement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred152_AbiDML

    // $ANTLR start synpred153_AbiDML
    public final void synpred153_AbiDML_fragment() throws RecognitionException {
        // /Users/zhou/Projects/ETL2Py/AbiDML.g:504:38: ( for_statement )
        dbg.enterAlt(1);

        // /Users/zhou/Projects/ETL2Py/AbiDML.g:504:38: for_statement
        {
        dbg.location(504,38);
        pushFollow(FOLLOW_for_statement_in_synpred153_AbiDML2446);
        for_statement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred153_AbiDML

    // $ANTLR start synpred155_AbiDML
    public final void synpred155_AbiDML_fragment() throws RecognitionException {
        // /Users/zhou/Projects/ETL2Py/AbiDML.g:504:84: ( ';' )
        dbg.enterAlt(1);

        // /Users/zhou/Projects/ETL2Py/AbiDML.g:504:84: ';'
        {
        dbg.location(504,84);
        match(input,31,FOLLOW_31_in_synpred155_AbiDML2457); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred155_AbiDML

    // $ANTLR start synpred156_AbiDML
    public final void synpred156_AbiDML_fragment() throws RecognitionException {
        // /Users/zhou/Projects/ETL2Py/AbiDML.g:512:4: ( field_expr )
        dbg.enterAlt(1);

        // /Users/zhou/Projects/ETL2Py/AbiDML.g:512:5: field_expr
        {
        dbg.location(512,5);
        pushFollow(FOLLOW_field_expr_in_synpred156_AbiDML2489);
        field_expr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred156_AbiDML

    // $ANTLR start synpred157_AbiDML
    public final void synpred157_AbiDML_fragment() throws RecognitionException {
        // /Users/zhou/Projects/ETL2Py/AbiDML.g:513:4: ( element_expr )
        dbg.enterAlt(1);

        // /Users/zhou/Projects/ETL2Py/AbiDML.g:513:5: element_expr
        {
        dbg.location(513,5);
        pushFollow(FOLLOW_element_expr_in_synpred157_AbiDML2500);
        element_expr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred157_AbiDML

    // $ANTLR start synpred158_AbiDML
    public final void synpred158_AbiDML_fragment() throws RecognitionException {
        // /Users/zhou/Projects/ETL2Py/AbiDML.g:527:55: ( 'else' procedural_statement )
        dbg.enterAlt(1);

        // /Users/zhou/Projects/ETL2Py/AbiDML.g:527:55: 'else' procedural_statement
        {
        dbg.location(527,55);
        match(input,58,FOLLOW_58_in_synpred158_AbiDML2539); if (state.failed) return ;
        dbg.location(527,62);
        pushFollow(FOLLOW_procedural_statement_in_synpred158_AbiDML2541);
        procedural_statement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred158_AbiDML

    // Delegated rules

    public final boolean synpred43_AbiDML() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred43_AbiDML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred41_AbiDML() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred41_AbiDML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred81_AbiDML() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred81_AbiDML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_AbiDML() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred39_AbiDML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred82_AbiDML() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred82_AbiDML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_AbiDML() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred22_AbiDML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred156_AbiDML() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred156_AbiDML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_AbiDML() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred23_AbiDML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred47_AbiDML() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred47_AbiDML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred85_AbiDML() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred85_AbiDML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred88_AbiDML() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred88_AbiDML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred42_AbiDML() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred42_AbiDML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred84_AbiDML() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred84_AbiDML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred157_AbiDML() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred157_AbiDML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_AbiDML() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred25_AbiDML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred153_AbiDML() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred153_AbiDML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred158_AbiDML() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred158_AbiDML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred86_AbiDML() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred86_AbiDML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred83_AbiDML() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred83_AbiDML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred148_AbiDML() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred148_AbiDML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_AbiDML() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred32_AbiDML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred87_AbiDML() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred87_AbiDML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred152_AbiDML() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred152_AbiDML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred44_AbiDML() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred44_AbiDML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred45_AbiDML() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred45_AbiDML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred155_AbiDML() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred155_AbiDML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_AbiDML() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred27_AbiDML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA2_eotS =
        "\174\uffff";
    static final String DFA2_eofS =
        "\2\uffff\6\44\116\uffff\3\44\1\uffff\1\44\1\uffff\2\44\7\uffff\1"+
        "\44\23\uffff\1\44\1\uffff\1\44";
    static final String DFA2_minS =
        "\1\56\1\60\6\11\2\74\1\25\17\63\1\25\1\124\5\25\1\uffff\2\74\1\uffff"+
        "\2\77\3\12\2\14\2\12\2\77\1\63\10\26\1\60\6\26\2\74\1\25\17\65\1"+
        "\25\1\124\1\25\1\26\10\11\2\74\2\77\3\12\1\11\1\43\1\14\1\43\1\14"+
        "\2\77\1\65\4\26\1\14\1\26\1\14\5\26\1\11\1\26\1\11";
    static final String DFA2_maxS =
        "\1\140\1\127\6\52\2\74\1\25\17\131\1\25\1\124\5\25\1\uffff\2\74"+
        "\1\uffff\2\134\1\12\1\14\1\12\2\14\1\136\1\12\2\124\1\131\4\26\2"+
        "\31\2\26\1\127\6\26\2\74\1\25\17\65\1\25\1\124\1\25\1\26\3\52\1"+
        "\11\1\52\1\11\2\52\2\74\2\134\1\12\1\14\1\12\1\52\1\43\1\14\1\43"+
        "\1\14\2\124\1\65\4\26\1\14\1\26\1\14\4\26\1\31\1\52\1\31\1\52";
    static final String DFA2_acceptS =
        "\41\uffff\1\2\2\uffff\1\1\127\uffff";
    static final String DFA2_specialS =
        "\174\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\13\1\uffff\1\10\1\uffff\1\2\1\35\1\36\1\32\2\uffff\1\7\1"+
            "\14\3\uffff\1\6\1\uffff\2\33\1\uffff\1\4\1\12\1\15\1\16\1\17"+
            "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\uffff\1\11\1\5\1"+
            "\uffff\1\31\1\34\1\41\1\uffff\1\3\1\1\1\37\3\uffff\1\1\1\30"+
            "\1\uffff\1\40",
            "\1\42\1\uffff\1\2\14\uffff\2\33\1\uffff\1\4\1\12\14\uffff\1"+
            "\43\1\5\2\uffff\1\34\2\uffff\1\3",
            "\1\44\14\uffff\1\44\2\uffff\1\44\5\uffff\1\44\12\uffff\1\41",
            "\1\44\14\uffff\1\44\2\uffff\1\44\5\uffff\1\44\12\uffff\1\41",
            "\1\44\14\uffff\1\44\2\uffff\1\44\5\uffff\1\44\12\uffff\1\41",
            "\1\44\14\uffff\1\44\2\uffff\1\44\5\uffff\1\44\12\uffff\1\41",
            "\1\44\14\uffff\1\44\2\uffff\1\44\5\uffff\1\44\12\uffff\1\41",
            "\1\44\14\uffff\1\44\2\uffff\1\44\5\uffff\1\44\12\uffff\1\41",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\35\1\36\1\32\37\uffff\1\41\3\uffff\1\37",
            "\1\35\1\36\1\32\37\uffff\1\41\3\uffff\1\37",
            "\1\35\1\36\1\32\37\uffff\1\41\3\uffff\1\37",
            "\1\35\1\36\1\32\37\uffff\1\41\3\uffff\1\37",
            "\1\35\1\36\1\32\37\uffff\1\41\3\uffff\1\37",
            "\1\35\1\36\1\32\37\uffff\1\41\3\uffff\1\37",
            "\1\35\1\36\1\32\37\uffff\1\41\3\uffff\1\37",
            "\1\35\1\36\1\32\37\uffff\1\41\3\uffff\1\37",
            "\1\35\1\36\1\32\37\uffff\1\41\3\uffff\1\37",
            "\1\35\1\36\1\32\37\uffff\1\41\3\uffff\1\37",
            "\1\35\1\36\1\32\37\uffff\1\41\3\uffff\1\37",
            "\1\35\1\36\1\32\37\uffff\1\41\3\uffff\1\37",
            "\1\35\1\36\1\32\37\uffff\1\41\3\uffff\1\37",
            "\1\35\1\36\1\32\37\uffff\1\41\3\uffff\1\37",
            "\1\35\1\36\1\32\37\uffff\1\41\3\uffff\1\37",
            "\1\50",
            "\1\34",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "",
            "\1\56",
            "\1\57",
            "",
            "\2\33\2\uffff\1\12\20\uffff\1\34\7\uffff\1\60",
            "\2\33\2\uffff\1\12\20\uffff\1\34\7\uffff\1\60",
            "\1\61",
            "\1\62\1\uffff\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67\1\uffff\1\70\41\uffff\1\103\1\uffff\1\100\1\uffff\1\72"+
            "\2\uffff\1\122\2\uffff\1\77\1\104\3\uffff\1\76\1\uffff\2\123"+
            "\1\uffff\1\74\1\102\1\105\1\106\1\107\1\110\1\111\1\112\1\113"+
            "\1\114\1\115\1\116\1\117\1\uffff\1\101\1\75\1\uffff\1\121\1"+
            "\124\2\uffff\1\73\1\71\4\uffff\1\71\1\120",
            "\1\125",
            "\2\33\2\uffff\1\12\20\uffff\1\34",
            "\2\33\2\uffff\1\12\20\uffff\1\34",
            "\1\35\1\36\1\32\37\uffff\1\41\3\uffff\1\37",
            "\1\126",
            "\1\127",
            "\1\127",
            "\1\130",
            "\1\132\2\uffff\1\131",
            "\1\134\2\uffff\1\133",
            "\1\135",
            "\1\135",
            "\1\136\1\uffff\1\72\14\uffff\2\123\1\uffff\1\74\1\102\14\uffff"+
            "\1\137\1\75\2\uffff\1\124\2\uffff\1\73",
            "\1\135",
            "\1\135",
            "\1\135",
            "\1\135",
            "\1\135",
            "\1\135",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\122",
            "\1\122",
            "\1\122",
            "\1\122",
            "\1\122",
            "\1\122",
            "\1\122",
            "\1\122",
            "\1\122",
            "\1\122",
            "\1\122",
            "\1\122",
            "\1\122",
            "\1\122",
            "\1\122",
            "\1\143",
            "\1\124",
            "\1\144",
            "\1\145",
            "\1\44\14\uffff\1\44\2\uffff\1\44\5\uffff\1\44\12\uffff\1\41",
            "\1\44\14\uffff\1\44\2\uffff\1\44\5\uffff\1\44\12\uffff\1\41",
            "\1\44\14\uffff\1\44\2\uffff\1\44\5\uffff\1\44\12\uffff\1\41",
            "\1\146",
            "\1\44\13\uffff\1\147\1\44\2\uffff\1\44\5\uffff\1\44\12\uffff"+
            "\1\41",
            "\1\150",
            "\1\44\13\uffff\1\151\1\44\2\uffff\1\44\5\uffff\1\44\12\uffff"+
            "\1\41",
            "\1\44\14\uffff\1\44\2\uffff\1\44\5\uffff\1\44\12\uffff\1\41",
            "\1\152",
            "\1\153",
            "\2\123\2\uffff\1\102\20\uffff\1\124\7\uffff\1\154",
            "\2\123\2\uffff\1\102\20\uffff\1\124\7\uffff\1\154",
            "\1\155",
            "\1\156\1\uffff\1\157",
            "\1\160",
            "\1\44\14\uffff\1\44\2\uffff\1\44\5\uffff\1\44\12\uffff\1\41",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\2\123\2\uffff\1\102\20\uffff\1\124",
            "\2\123\2\uffff\1\102\20\uffff\1\124",
            "\1\122",
            "\1\165",
            "\1\166",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\135",
            "\1\135",
            "\1\135",
            "\1\132\2\uffff\1\131",
            "\1\44\14\uffff\1\44\2\uffff\1\44\5\uffff\1\44\12\uffff\1\41",
            "\1\134\2\uffff\1\133",
            "\1\44\14\uffff\1\44\2\uffff\1\44\5\uffff\1\44\12\uffff\1\41"
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "28:1: type returns [String typename, Object value, Object extra] : ( base_type | compounding_type );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
 

    public static final BitSet FOLLOW_type_in_top_level36 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_opt_semicolon_in_top_level38 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_list_in_top_level42 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base_type_in_type58 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compounding_type_in_type70 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_native_type_in_base_type86 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binary_integer_type_in_base_type97 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decimal_type_in_base_type108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_real_type_in_base_type119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_type_in_base_type126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datetime_type_in_base_type140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_type_in_base_type162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_void_type_in_base_type194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vector_type_in_compounding_type209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_record_type_in_compounding_type213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_native_type_in_vector_length_type225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binary_integer_type_in_vector_length_type229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decimal_type_in_vector_length_type233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_real_type_in_vector_length_type237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base_type_in_vector_type251 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_vector_type253 = new BitSet(new long[]{0xE3A54E0001229680L,0x0000001269DB7FFFL});
    public static final BitSet FOLLOW_constant_expr_in_vector_type256 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_size_expr_in_vector_type260 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_delimiter_expr_in_vector_type264 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_vector_length_type_in_vector_type268 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_vector_type272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_character_family_in_record_type288 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_record_type291 = new BitSet(new long[]{0xAB3D400000000000L,0x0000000163BB7FFDL});
    public static final BitSet FOLLOW_slots_in_record_type293 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_record_type296 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_opt_delim_in_record_type298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slot_in_slots330 = new BitSet(new long[]{0xA33D400000000002L,0x0000000163BB7FFDL});
    public static final BitSet FOLLOW_slot_in_slots336 = new BitSet(new long[]{0xA33D400000000002L,0x0000000163BB7FFDL});
    public static final BitSet FOLLOW_type_in_slot369 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_var_list_in_slot371 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_slot373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_expr_in_primary_expression400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_expr_in_primary_expression405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_expr_in_primary_expression414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unarycall_in_primary_expression419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cast_expr_in_primary_expression424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reinterpret_expr_in_primary_expression429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_primary_expression434 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_expression_in_primary_expression436 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_primary_expression438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_null_expr_in_primary_expression443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_getenv_expr_in_primary_expression448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whole_record_expr_in_primary_expression453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loop_expr_in_primary_expression458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_make_record_expr_in_primary_expression463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_make_vector_expr_in_primary_expression468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_cast_expr477 = new BitSet(new long[]{0xA33D400000000000L,0x0000000163BB7FFDL});
    public static final BitSet FOLLOW_type_in_cast_expr479 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_cast_expr481 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_expression_in_cast_expr483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_reinterpret_expr495 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_reinterpret_expr497 = new BitSet(new long[]{0xA33D400000000000L,0x0000000163BB7FFDL});
    public static final BitSet FOLLOW_type_in_reinterpret_expr499 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_reinterpret_expr501 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_expression_in_reinterpret_expr503 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_reinterpret_expr505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_getenv_expr517 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_name_in_getenv_expr519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_whole_record_expr531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_loop_expr543 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_loop_expr545 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_expression_in_loop_expr547 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_loop_expr549 = new BitSet(new long[]{0x4000860001229680L,0x0000001208400000L});
    public static final BitSet FOLLOW_opt_statement_in_loop_expr551 = new BitSet(new long[]{0x4000860021229680L,0x0000001208400000L});
    public static final BitSet FOLLOW_29_in_loop_expr554 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_expression_in_loop_expr556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_loop_expr561 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_loop_expr563 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_variable_expr_in_loop_expr565 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_loop_expr567 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_expression_in_loop_expr569 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_loop_expr571 = new BitSet(new long[]{0x4000860001229680L,0x0000001208400000L});
    public static final BitSet FOLLOW_opt_statement_in_loop_expr573 = new BitSet(new long[]{0x4000860021229680L,0x0000001208400000L});
    public static final BitSet FOLLOW_29_in_loop_expr576 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_expression_in_loop_expr578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_opt_statement590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_statement_in_opt_statement595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_make_record_expr607 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_make_record_expr609 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_record_expr_slots_in_make_record_expr611 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_make_record_expr613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_name_in_record_expr_slots624 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_expression_in_record_expr_slots626 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_record_expr_slots629 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_field_name_in_record_expr_slots631 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_expression_in_record_expr_slots633 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_42_in_make_vector_expr647 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_make_vector_expr649 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_expression_in_make_vector_expr651 = new BitSet(new long[]{0x0000080002000000L});
    public static final BitSet FOLLOW_25_in_make_vector_expr654 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_expression_in_make_vector_expr656 = new BitSet(new long[]{0x0000080002000000L});
    public static final BitSet FOLLOW_43_in_make_vector_expr660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expression_in_expression683 = new BitSet(new long[]{0x000035F71D9D0002L,0x0000000C00040000L});
    public static final BitSet FOLLOW_27_in_expression700 = new BitSet(new long[]{0x0000000000800200L});
    public static final BitSet FOLLOW_name_in_expression703 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_23_in_expression708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binop_in_expression724 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_expression_in_expression726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_expression740 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_expression_in_expression742 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_expression744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalop_in_expression758 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_expression_in_expression760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_expression776 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_expression_in_expression778 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_expression780 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_expression_in_expression782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_expression801 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_expression803 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_expression_in_expression805 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_expression807 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_expression_in_expression809 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_expression812 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_expression_in_expression814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expression_in_field_expr834 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_field_expr836 = new BitSet(new long[]{0x0000000000800200L});
    public static final BitSet FOLLOW_name_in_field_expr839 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_23_in_field_expr844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expression_in_element_expr856 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_element_expr858 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_expression_in_element_expr860 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_element_expr862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expression_in_binarycall874 = new BitSet(new long[]{0x000030F7159D0000L,0x0000000C00040000L});
    public static final BitSet FOLLOW_binop_in_binarycall876 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_expression_in_binarycall878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expression_in_conditional912 = new BitSet(new long[]{0x0000210000080000L,0x0000000800040000L});
    public static final BitSet FOLLOW_conditionalop_in_conditional915 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_expression_in_conditional917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_conditional921 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_expression_in_conditional923 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_conditional925 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_expression_in_conditional927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_conditional933 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_conditional935 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_expression_in_conditional937 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_conditional939 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_expression_in_conditional941 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_conditional944 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_expression_in_conditional946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall_expr967 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_funcall_expr969 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_argument_list_in_funcall_expr971 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_funcall_expr973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_variable_expr988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_name999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_unarycall1010 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_expression_in_unarycall1012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_unarycall1017 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_expression_in_unarycall1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_unarycall1024 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_expression_in_unarycall1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_argument_list1043 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_argument_list1048 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_expression_in_argument_list1052 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_21_in_ifr_expression1067 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ifr_expression1069 = new BitSet(new long[]{0xA33D400000000000L,0x0000000163BB7FFDL});
    public static final BitSet FOLLOW_type_in_ifr_expression1071 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ifr_expression1073 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_expression_in_ifr_expression1075 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ifr_expression1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_if_expression1088 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_if_expression1090 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_expression_in_if_expression1092 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_if_expression1094 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ifr_expression_in_if_expression1096 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_if_expression1099 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ifr_expression_in_if_expression1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_delimiter_expr1234 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_delimiter_expr1236 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_expression_in_delimiter_expr1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_expr_in_size_expr1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_expr_in_size_expr1259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unarycall_in_size_expr1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_expr_in_size_expr1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_element_expr_in_size_expr1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binarycall_in_size_expr1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_in_size_expr1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cast_expr_in_size_expr1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_size_expr1335 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_expression_in_size_expr1337 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_size_expr1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_constant_expr1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_constant_expr1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_constant_expr1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_var_list1413 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_var_list1416 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_var_in_var_list1418 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_field_name_in_var1430 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_opt_init_in_var1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_name_in_var1437 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_var1439 = new BitSet(new long[]{0x0000000000001480L});
    public static final BitSet FOLLOW_constant_expr_in_var1441 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_var1443 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_opt_init_in_var1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_name_in_var1450 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_var1452 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_size_expr_in_var1454 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_var1456 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_opt_init_in_var1458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_name_in_var1464 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_var1466 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_delimiter_expr_in_var1468 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_var1470 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_opt_init_in_var1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_name_in_var1477 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_var1479 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_var1481 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_opt_init_in_var1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arg_in_arg_list1493 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_arg_list1496 = new BitSet(new long[]{0xA33D400000000000L,0x0000000163BB7FFDL});
    public static final BitSet FOLLOW_arg_in_arg_list1498 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_type_in_arg1510 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_arg1512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_field_name1525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_opt_init1540 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_expression_in_opt_init1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_null_expr_in_opt_init1558 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_opt_init1560 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_expression_in_opt_init1562 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_opt_init1564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_null_expr1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sign_spec_in_native_type1600 = new BitSet(new long[]{0x0004000000000000L,0x0000000000820004L});
    public static final BitSet FOLLOW_50_in_native_type1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_native_type1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_native_type1616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_native_type1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_native_type1642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_native_type1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sign_spec_in_binary_integer_type1681 = new BitSet(new long[]{0x0001000000000000L,0x0000000000010008L});
    public static final BitSet FOLLOW_endian_spec_in_binary_integer_type1684 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_binary_integer_type1687 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_binary_integer_type1689 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_INT_in_binary_integer_type1691 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_binary_integer_type1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_character_family_in_decimal_type1720 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_decimal_type1723 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_decimal_type1725 = new BitSet(new long[]{0x0000000000001400L});
    public static final BitSet FOLLOW_INT_in_decimal_type1729 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_decl_string_in_decimal_type1733 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_decimal_type1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_character_family_in_date_type1766 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_date_type1769 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_date_type1771 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_decl_string_in_date_type1773 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_25_in_date_type1776 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_param_in_date_type1778 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_22_in_date_type1782 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_opt_delim_in_date_type1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_character_family_in_datetime_type1803 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_datetime_type1806 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_datetime_type1808 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_decl_string_in_datetime_type1810 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_25_in_datetime_type1813 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_param_in_datetime_type1815 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_22_in_datetime_type1819 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_opt_delim_in_datetime_type1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sign_spec_in_real_type1844 = new BitSet(new long[]{0x8001000000000000L,0x0000000000110001L});
    public static final BitSet FOLLOW_endian_spec_in_real_type1847 = new BitSet(new long[]{0x8000000000000000L,0x0000000000100001L});
    public static final BitSet FOLLOW_float_family_in_real_type1850 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_real_type1853 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_real_type1855 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_INT_in_real_type1857 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_real_type1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_native_type_in_varstring_length_type1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binary_integer_type_in_varstring_length_type1882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decimal_type_in_varstring_length_type1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_real_type_in_varstring_length_type1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_character_family_in_string_type1917 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_string_type1920 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_string_type1922 = new BitSet(new long[]{0xA325400000001400L,0x00000000619B7FFDL});
    public static final BitSet FOLLOW_INT_in_string_type1925 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_decl_string_in_string_type1929 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_varstring_length_type_in_string_type1935 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_string_type1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_character_family1961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_character_family1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_character_family1969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_character_family1973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_character_family1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_character_family1981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_character_family1985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_character_family1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_character_family2001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_character_family2005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_character_family2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_character_family2013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_character_family2017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_character_family2029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_endian_spec_in_character_family2033 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_character_family2035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_character_family2039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_void_type2058 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_void_type2060 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_INT_in_void_type2062 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_void_type2064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_param_list2078 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_param_list2081 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_param_in_param_list2083 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ID_in_param2095 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_param2097 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_decl_string_in_param2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_opt_delim2117 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_decl_string_in_opt_delim2119 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_opt_delim2121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_endian_spec2166 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_endian_spec2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_endian_spec2172 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_endian_spec2174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_decl_string2218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_opt_semicolon2233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_declaration_list2246 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_transform_declaration_in_declaration2258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_list_in_transform_declaration2274 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_transform_declaration2276 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_transform_declaration2278 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_transform_declaration2280 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_name_list_in_transform_declaration2282 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_transform_declaration2284 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_transform_declaration2286 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_transform_declaration2288 = new BitSet(new long[]{0x4000860001229680L,0x0000001208408002L});
    public static final BitSet FOLLOW_variable_declaration_list_in_transform_declaration2290 = new BitSet(new long[]{0x4000860001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_xfr_statement_list_in_transform_declaration2292 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_transform_declaration2294 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_opt_semicolon_in_transform_declaration2296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_name_list2311 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_name_list2313 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_name_list2317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_declaration_in_variable_declaration_list2328 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_variable_declaration2340 = new BitSet(new long[]{0xA33D400000000000L,0x0000000163BB7FFDL});
    public static final BitSet FOLLOW_type_in_variable_declaration2344 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_variable_declaration2346 = new BitSet(new long[]{0x0000000880000000L});
    public static final BitSet FOLLOW_35_in_variable_declaration2351 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_expression_in_variable_declaration2353 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_variable_declaration2357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xfr_statement_in_xfr_statement_list2373 = new BitSet(new long[]{0x4000860001229682L,0x0000001208400002L});
    public static final BitSet FOLLOW_rule_in_xfr_statement2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedural_statement_in_xfr_statement2389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_out_expr_list_in_rule2399 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_29_in_rule2402 = new BitSet(new long[]{0x0000000020000400L});
    public static final BitSet FOLLOW_optional_priority_in_rule2404 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_rule2406 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_30_in_rule2410 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_expression_in_rule2413 = new BitSet(new long[]{0x0000000082000000L});
    public static final BitSet FOLLOW_25_in_rule2416 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_expression_in_rule2418 = new BitSet(new long[]{0x0000000082000000L});
    public static final BitSet FOLLOW_31_in_rule2422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_statement_in_procedural_statement2438 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_while_statement_in_procedural_statement2442 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_for_statement_in_procedural_statement2446 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_block_statement_in_procedural_statement2450 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_assignment_in_procedural_statement2454 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_procedural_statement2457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_out_expr_in_assignment2473 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_assignment2475 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_expression_in_assignment2477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_expr_in_out_expr2494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_element_expr_in_out_expr2505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_expr_in_out_expr2510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_if_statement2528 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_if_statement2530 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_expression_in_if_statement2532 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_if_statement2534 = new BitSet(new long[]{0x4000860001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_procedural_statement_in_if_statement2536 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_if_statement2539 = new BitSet(new long[]{0x4000860001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_procedural_statement_in_if_statement2541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_while_statement2569 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_while_statement2571 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_expression_in_while_statement2573 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_while_statement2575 = new BitSet(new long[]{0x4000860001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_procedural_statement_in_while_statement2577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_switch_statement2600 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_switch_statement2602 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_expression_in_switch_statement2604 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_switch_statement2606 = new BitSet(new long[]{0x0842000000000000L});
    public static final BitSet FOLLOW_case_actions_in_switch_statement2608 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_switch_statement2610 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_switch_statement2612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_case_actions2633 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_match_list_in_case_actions2635 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_case_actions2637 = new BitSet(new long[]{0x4000860001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_procedural_statement_in_case_actions2639 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_case_actions2641 = new BitSet(new long[]{0x0042000000000000L});
    public static final BitSet FOLLOW_case_actions_in_case_actions2643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_case_actions2647 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_case_actions2649 = new BitSet(new long[]{0x4000860001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_procedural_statement_in_case_actions2651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_match_list2672 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_match_list2676 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_match_list_in_match_list2678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_for_statement2703 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_for_statement2705 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_for_statement2707 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_for_statement2709 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_expression_in_for_statement2711 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_for_statement2713 = new BitSet(new long[]{0x4000860001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_procedural_statement_in_for_statement2715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_block_statement2734 = new BitSet(new long[]{0x4800860001229680L,0x000000120C408002L});
    public static final BitSet FOLLOW_variable_declaration_list_in_block_statement2736 = new BitSet(new long[]{0x4800860001229680L,0x000000120C400002L});
    public static final BitSet FOLLOW_procedural_statement_list_in_block_statement2738 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_block_statement2740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedural_statement_in_procedural_statement_list2760 = new BitSet(new long[]{0x4000860001229682L,0x0000001208400002L});
    public static final BitSet FOLLOW_switch_statement_in_procedural_statement_list2765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_out_expr_in_out_expr_list2790 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_out_expr_list2793 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400000L});
    public static final BitSet FOLLOW_out_expr_in_out_expr_list2795 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_INT_in_optional_priority2818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_expr_in_synpred22_AbiDML405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_expr_in_synpred23_AbiDML414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cast_expr_in_synpred25_AbiDML424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_synpred27_AbiDML434 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_expression_in_synpred27_AbiDML436 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_synpred27_AbiDML438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_make_record_expr_in_synpred32_AbiDML463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_synpred39_AbiDML703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_synpred41_AbiDML700 = new BitSet(new long[]{0x0000000000800200L});
    public static final BitSet FOLLOW_name_in_synpred41_AbiDML703 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_23_in_synpred41_AbiDML708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binop_in_synpred42_AbiDML724 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_expression_in_synpred42_AbiDML726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred43_AbiDML740 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_expression_in_synpred43_AbiDML742 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_synpred43_AbiDML744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalop_in_synpred44_AbiDML758 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_expression_in_synpred44_AbiDML760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred45_AbiDML776 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_expression_in_synpred45_AbiDML778 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_synpred45_AbiDML780 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_expression_in_synpred45_AbiDML782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_synpred47_AbiDML812 = new BitSet(new long[]{0x4000060001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_expression_in_synpred47_AbiDML814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_expr_in_synpred81_AbiDML1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_expr_in_synpred82_AbiDML1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unarycall_in_synpred83_AbiDML1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_expr_in_synpred84_AbiDML1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_element_expr_in_synpred85_AbiDML1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binarycall_in_synpred86_AbiDML1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_in_synpred87_AbiDML1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cast_expr_in_synpred88_AbiDML1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule_in_synpred148_AbiDML2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_statement_in_synpred152_AbiDML2442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_statement_in_synpred153_AbiDML2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_synpred155_AbiDML2457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_expr_in_synpred156_AbiDML2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_element_expr_in_synpred157_AbiDML2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_synpred158_AbiDML2539 = new BitSet(new long[]{0x4000860001229680L,0x0000001208400002L});
    public static final BitSet FOLLOW_procedural_statement_in_synpred158_AbiDML2541 = new BitSet(new long[]{0x0000000000000002L});

}