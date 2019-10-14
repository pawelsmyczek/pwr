// $ANTLR 3.5.1 /home/pablito/pwr/miasi_lab/test/Par.g 2019-03-01 14:33:21

        import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class ParParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "DEC", "ID", "INT", 
		"NL", "PUT", "SLOWO", "WS", "'['", "']'"
	};
	public static final int EOF=-1;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int COMMENT=4;
	public static final int DEC=5;
	public static final int ID=6;
	public static final int INT=7;
	public static final int NL=8;
	public static final int PUT=9;
	public static final int SLOWO=10;
	public static final int WS=11;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "r2", "r1", "r3"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public ParParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public ParParser(TokenStream input, int port, RecognizerSharedState state) {
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

	public ParParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg, new RecognizerSharedState());
	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return ParParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/pablito/pwr/miasi_lab/test/Par.g"; }


	        Integer getSymbol (String name) {
	                for (int lv=r2_stack.size()-1; lv >=0; lv--) {
	                        if (r2_stack.elementAt(lv).hm.containsKey(name))
	                                return r2_stack.elementAt(lv).hm.get(name);
	                }
	/*              Obsluga wyjatkow prezentowana byla w poprzednim odcinku
	                throw new NotFoundException(name);   */
	                return -1;
	        }

	        Integer putSymbol (String name, Integer value) {
	                for (int lv=r2_stack.size()-1; lv >=0; lv--) {
	                        if (r2_stack.elementAt(lv).hm.containsKey(name)) {
	                                r2_stack.elementAt(lv).hm.put(name, value);
	                                return value;
	                        }
	                }
	//              throw new NotFoundException(name);   
	                return -1;
	        }

	        void declareSymbol (String name) {
	                if(!r2_stack.peek().hm.containsKey(name))
	                        r2_stack.peek().hm.put(name, -1);
	/*              else
	                        throw new RedeclaredException(name);   */
	        }



	// $ANTLR start "r1"
	// /home/pablito/pwr/miasi_lab/test/Par.g:37:1: r1 : ( r2 )* ;
	public final void r1() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "r1");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(37, 0);

		try {
			// /home/pablito/pwr/miasi_lab/test/Par.g:37:9: ( ( r2 )* )
			dbg.enterAlt(1);

			// /home/pablito/pwr/miasi_lab/test/Par.g:38:9: ( r2 )*
			{
			dbg.location(38,9);
			// /home/pablito/pwr/miasi_lab/test/Par.g:38:9: ( r2 )*
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==12) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// /home/pablito/pwr/miasi_lab/test/Par.g:38:9: r2
					{
					dbg.location(38,9);
					pushFollow(FOLLOW_r2_in_r135);
					r2();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}
			} finally {dbg.exitSubRule(1);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(38, 11);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "r1");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "r1"


	protected static class r2_scope {
		HashMap<String, Integer> hm;
	}
	protected Stack<r2_scope> r2_stack = new Stack<r2_scope>();


	// $ANTLR start "r2"
	// /home/pablito/pwr/miasi_lab/test/Par.g:40:1: r2 : '[' ( r3 )+ ']' ;
	public final void r2() throws RecognitionException {
		r2_stack.push(new r2_scope());
		 r2_stack.peek().hm =new HashMap<String, Integer>(); 
		try { dbg.enterRule(getGrammarFileName(), "r2");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(40, 0);

		try {
			// /home/pablito/pwr/miasi_lab/test/Par.g:43:9: ( '[' ( r3 )+ ']' )
			dbg.enterAlt(1);

			// /home/pablito/pwr/miasi_lab/test/Par.g:44:9: '[' ( r3 )+ ']'
			{
			dbg.location(44,9);
			match(input,12,FOLLOW_12_in_r269); dbg.location(44,13);
			 System.out.println("Entering new scope..."); dbg.location(45,9);
			// /home/pablito/pwr/miasi_lab/test/Par.g:45:9: ( r3 )+
			int cnt2=0;
			try { dbg.enterSubRule(2);

			loop2:
			while (true) {
				int alt2=2;
				try { dbg.enterDecision(2, decisionCanBacktrack[2]);

				int LA2_0 = input.LA(1);
				if ( (LA2_0==DEC||(LA2_0 >= PUT && LA2_0 <= SLOWO)||LA2_0==12) ) {
					alt2=1;
				}

				} finally {dbg.exitDecision(2);}

				switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// /home/pablito/pwr/miasi_lab/test/Par.g:45:9: r3
					{
					dbg.location(45,9);
					pushFollow(FOLLOW_r3_in_r283);
					r3();
					state._fsp--;

					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt2++;
			}
			} finally {dbg.exitSubRule(2);}
			dbg.location(46,9);
			match(input,13,FOLLOW_13_in_r295); dbg.location(46,13);
			 System.out.println("Leaving scope..."); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			r2_stack.pop();
		}
		dbg.location(46, 55);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "r2");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "r2"



	// $ANTLR start "r3"
	// /home/pablito/pwr/miasi_lab/test/Par.g:48:1: r3 : ( r2 | SLOWO | DEC SLOWO | PUT SLOWO );
	public final void r3() throws RecognitionException {
		Token SLOWO1=null;
		Token SLOWO2=null;
		Token SLOWO3=null;

		try { dbg.enterRule(getGrammarFileName(), "r3");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(48, 0);

		try {
			// /home/pablito/pwr/miasi_lab/test/Par.g:48:9: ( r2 | SLOWO | DEC SLOWO | PUT SLOWO )
			int alt3=4;
			try { dbg.enterDecision(3, decisionCanBacktrack[3]);

			switch ( input.LA(1) ) {
			case 12:
				{
				alt3=1;
				}
				break;
			case SLOWO:
				{
				alt3=2;
				}
				break;
			case DEC:
				{
				alt3=3;
				}
				break;
			case PUT:
				{
				alt3=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(3);}

			switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// /home/pablito/pwr/miasi_lab/test/Par.g:49:9: r2
					{
					dbg.location(49,9);
					pushFollow(FOLLOW_r2_in_r3118);
					r2();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/pablito/pwr/miasi_lab/test/Par.g:50:11: SLOWO
					{
					dbg.location(50,11);
					SLOWO1=(Token)match(input,SLOWO,FOLLOW_SLOWO_in_r3130); dbg.location(50,17);

					                System.out.println(getSymbol((SLOWO1!=null?SLOWO1.getText():null)));
					        
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/pablito/pwr/miasi_lab/test/Par.g:53:11: DEC SLOWO
					{
					dbg.location(53,11);
					match(input,DEC,FOLLOW_DEC_in_r3144); dbg.location(53,15);
					SLOWO2=(Token)match(input,SLOWO,FOLLOW_SLOWO_in_r3146); dbg.location(53,21);
					 declareSymbol((SLOWO2!=null?SLOWO2.getText():null));
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/pablito/pwr/miasi_lab/test/Par.g:54:11: PUT SLOWO
					{
					dbg.location(54,11);
					match(input,PUT,FOLLOW_PUT_in_r3160); dbg.location(54,15);
					SLOWO3=(Token)match(input,SLOWO,FOLLOW_SLOWO_in_r3162); dbg.location(54,21);
					putSymbol((SLOWO3!=null?SLOWO3.getText():null), r2_stack.peek().hm.size());
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
		dbg.location(54, 61);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "r3");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "r3"

	// Delegated rules



	public static final BitSet FOLLOW_r2_in_r135 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_12_in_r269 = new BitSet(new long[]{0x0000000000001620L});
	public static final BitSet FOLLOW_r3_in_r283 = new BitSet(new long[]{0x0000000000003620L});
	public static final BitSet FOLLOW_13_in_r295 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_r2_in_r3118 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SLOWO_in_r3130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEC_in_r3144 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_SLOWO_in_r3146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PUT_in_r3160 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_SLOWO_in_r3162 = new BitSet(new long[]{0x0000000000000002L});
}
