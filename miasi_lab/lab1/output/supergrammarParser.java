// $ANTLR 3.5.1 /home/pablito/pwr/miasi_lab/lab1/supergrammar.g 2019-03-01 13:23:04

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class supergrammarParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "DIV", "ID", "INT", 
		"LP", "MINUS", "MUL", "NL", "PLUS", "RP", "WS", "'b'"
	};
	public static final int EOF=-1;
	public static final int T__15=15;
	public static final int COMMENT=4;
	public static final int DIV=5;
	public static final int ID=6;
	public static final int INT=7;
	public static final int LP=8;
	public static final int MINUS=9;
	public static final int MUL=10;
	public static final int NL=11;
	public static final int PLUS=12;
	public static final int RP=13;
	public static final int WS=14;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "r3", "atom", "plik", "term", "expr"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public supergrammarParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public supergrammarParser(TokenStream input, int port, RecognizerSharedState state) {
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

	public supergrammarParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg, new RecognizerSharedState());
	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return supergrammarParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/pablito/pwr/miasi_lab/lab1/supergrammar.g"; }


		class MyException extends RuntimeException {
			MyException() {
			System.out.println("Ajajaj!");	
			}
		}



	// $ANTLR start "plik"
	// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:11:1: plik : ( expr )* EOF ;
	public final void plik() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "plik");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(11, 0);

		try {
			// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:12:2: ( ( expr )* EOF )
			dbg.enterAlt(1);

			// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:12:4: ( expr )* EOF
			{
			dbg.location(12,4);
			// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:12:4: ( expr )*
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= INT && LA1_0 <= LP)||LA1_0==15) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:12:4: expr
					{
					dbg.location(12,4);
					pushFollow(FOLLOW_expr_in_plik19);
					expr();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}
			} finally {dbg.exitSubRule(1);}
			dbg.location(12,9);
			match(input,EOF,FOLLOW_EOF_in_plik21); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(13, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "plik");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "plik"



	// $ANTLR start "expr"
	// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:15:1: expr : term ( PLUS term | MINUS term )* ;
	public final void expr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(15, 0);

		try {
			// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:16:2: ( term ( PLUS term | MINUS term )* )
			dbg.enterAlt(1);

			// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:16:4: term ( PLUS term | MINUS term )*
			{
			dbg.location(16,4);
			pushFollow(FOLLOW_term_in_expr33);
			term();
			state._fsp--;
			dbg.location(16,9);
			// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:16:9: ( PLUS term | MINUS term )*
			try { dbg.enterSubRule(2);

			loop2:
			while (true) {
				int alt2=3;
				try { dbg.enterDecision(2, decisionCanBacktrack[2]);

				int LA2_0 = input.LA(1);
				if ( (LA2_0==PLUS) ) {
					alt2=1;
				}
				else if ( (LA2_0==MINUS) ) {
					alt2=2;
				}

				} finally {dbg.exitDecision(2);}

				switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:16:10: PLUS term
					{
					dbg.location(16,10);
					match(input,PLUS,FOLLOW_PLUS_in_expr36); dbg.location(16,15);
					pushFollow(FOLLOW_term_in_expr38);
					term();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:17:4: MINUS term
					{
					dbg.location(17,4);
					match(input,MINUS,FOLLOW_MINUS_in_expr43); dbg.location(17,10);
					pushFollow(FOLLOW_term_in_expr45);
					term();
					state._fsp--;

					}
					break;

				default :
					break loop2;
				}
			}
			} finally {dbg.exitSubRule(2);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(18, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "expr"



	// $ANTLR start "term"
	// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:20:1: term : atom ( MUL atom | DIV atom )* ;
	public final void term() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "term");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(20, 0);

		try {
			// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:21:2: ( atom ( MUL atom | DIV atom )* )
			dbg.enterAlt(1);

			// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:21:4: atom ( MUL atom | DIV atom )*
			{
			dbg.location(21,4);
			pushFollow(FOLLOW_atom_in_term58);
			atom();
			state._fsp--;
			dbg.location(21,9);
			// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:21:9: ( MUL atom | DIV atom )*
			try { dbg.enterSubRule(3);

			loop3:
			while (true) {
				int alt3=3;
				try { dbg.enterDecision(3, decisionCanBacktrack[3]);

				int LA3_0 = input.LA(1);
				if ( (LA3_0==MUL) ) {
					alt3=1;
				}
				else if ( (LA3_0==DIV) ) {
					alt3=2;
				}

				} finally {dbg.exitDecision(3);}

				switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:21:10: MUL atom
					{
					dbg.location(21,10);
					match(input,MUL,FOLLOW_MUL_in_term61); dbg.location(21,14);
					pushFollow(FOLLOW_atom_in_term63);
					atom();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:22:4: DIV atom
					{
					dbg.location(22,4);
					match(input,DIV,FOLLOW_DIV_in_term68); dbg.location(22,8);
					pushFollow(FOLLOW_atom_in_term70);
					atom();
					state._fsp--;

					}
					break;

				default :
					break loop3;
				}
			}
			} finally {dbg.exitSubRule(3);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(23, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "term");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "term"



	// $ANTLR start "atom"
	// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:24:1: atom : ( INT | ( LP expr RP ) |lol= r3[1] );
	public final void atom() throws RecognitionException {
		int lol =0;

		try { dbg.enterRule(getGrammarFileName(), "atom");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(24, 0);

		try {
			// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:25:2: ( INT | ( LP expr RP ) |lol= r3[1] )
			int alt4=3;
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			switch ( input.LA(1) ) {
			case INT:
				{
				alt4=1;
				}
				break;
			case LP:
				{
				alt4=2;
				}
				break;
			case 15:
				{
				alt4=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(4);}

			switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:25:4: INT
					{
					dbg.location(25,4);
					match(input,INT,FOLLOW_INT_in_atom82); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:26:4: ( LP expr RP )
					{
					dbg.location(26,4);
					// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:26:4: ( LP expr RP )
					dbg.enterAlt(1);

					// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:26:5: LP expr RP
					{
					dbg.location(26,5);
					match(input,LP,FOLLOW_LP_in_atom88); dbg.location(26,8);
					pushFollow(FOLLOW_expr_in_atom90);
					expr();
					state._fsp--;
					dbg.location(26,13);
					match(input,RP,FOLLOW_RP_in_atom92); 
					}

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:27:4: lol= r3[1]
					{
					dbg.location(27,7);
					pushFollow(FOLLOW_r3_in_atom100);
					lol=r3(1);
					state._fsp--;
					dbg.location(27,14);
					System.out.println("Zwrocilo sie " +  lol);
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
		dbg.location(28, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "atom");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "atom"



	// $ANTLR start "r3"
	// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:33:1: r3[int par] returns [int wyn] : 'b' ;
	public final int r3(int par) throws RecognitionException {
		int wyn = 0;


		try { dbg.enterRule(getGrammarFileName(), "r3");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(33, 0);

		try {
			// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:34:2: ( 'b' )
			dbg.enterAlt(1);

			// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:35:2: 'b'
			{
			dbg.location(35,2);
			match(input,15,FOLLOW_15_in_r3126); dbg.location(35,6);
			 
					if (par==1) {
						System.out.println("b1");  
						wyn =par+2;
					} else { 
						 System.out.println("b2");
						wyn =par+3;
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
		dbg.location(44, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "r3");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return wyn;
	}
	// $ANTLR end "r3"

	// Delegated rules



	public static final BitSet FOLLOW_expr_in_plik19 = new BitSet(new long[]{0x0000000000008180L});
	public static final BitSet FOLLOW_EOF_in_plik21 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_expr33 = new BitSet(new long[]{0x0000000000001202L});
	public static final BitSet FOLLOW_PLUS_in_expr36 = new BitSet(new long[]{0x0000000000008180L});
	public static final BitSet FOLLOW_term_in_expr38 = new BitSet(new long[]{0x0000000000001202L});
	public static final BitSet FOLLOW_MINUS_in_expr43 = new BitSet(new long[]{0x0000000000008180L});
	public static final BitSet FOLLOW_term_in_expr45 = new BitSet(new long[]{0x0000000000001202L});
	public static final BitSet FOLLOW_atom_in_term58 = new BitSet(new long[]{0x0000000000000422L});
	public static final BitSet FOLLOW_MUL_in_term61 = new BitSet(new long[]{0x0000000000008180L});
	public static final BitSet FOLLOW_atom_in_term63 = new BitSet(new long[]{0x0000000000000422L});
	public static final BitSet FOLLOW_DIV_in_term68 = new BitSet(new long[]{0x0000000000008180L});
	public static final BitSet FOLLOW_atom_in_term70 = new BitSet(new long[]{0x0000000000000422L});
	public static final BitSet FOLLOW_INT_in_atom82 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LP_in_atom88 = new BitSet(new long[]{0x0000000000008180L});
	public static final BitSet FOLLOW_expr_in_atom90 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_RP_in_atom92 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_r3_in_atom100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_r3126 = new BitSet(new long[]{0x0000000000000002L});
}
