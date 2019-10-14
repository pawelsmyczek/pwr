// $ANTLR 3.5.1 /home/pablito/pwr/miasi_lab/test/Par.g 2019-03-01 14:33:21

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ParLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public ParLexer() {} 
	public ParLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public ParLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/home/pablito/pwr/miasi_lab/test/Par.g"; }

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/pablito/pwr/miasi_lab/test/Par.g:2:7: ( '[' )
			// /home/pablito/pwr/miasi_lab/test/Par.g:2:9: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/pablito/pwr/miasi_lab/test/Par.g:3:7: ( ']' )
			// /home/pablito/pwr/miasi_lab/test/Par.g:3:9: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__13"

	// $ANTLR start "DEC"
	public final void mDEC() throws RecognitionException {
		try {
			int _type = DEC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/pablito/pwr/miasi_lab/test/Par.g:57:9: ( 'Dec' )
			// /home/pablito/pwr/miasi_lab/test/Par.g:57:17: 'Dec'
			{
			match("Dec"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEC"

	// $ANTLR start "PUT"
	public final void mPUT() throws RecognitionException {
		try {
			int _type = PUT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/pablito/pwr/miasi_lab/test/Par.g:58:9: ( '>' )
			// /home/pablito/pwr/miasi_lab/test/Par.g:58:17: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PUT"

	// $ANTLR start "SLOWO"
	public final void mSLOWO() throws RecognitionException {
		try {
			int _type = SLOWO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/pablito/pwr/miasi_lab/test/Par.g:59:9: ( ( 'a' .. 'z' )+ )
			// /home/pablito/pwr/miasi_lab/test/Par.g:59:17: ( 'a' .. 'z' )+
			{
			// /home/pablito/pwr/miasi_lab/test/Par.g:59:17: ( 'a' .. 'z' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /home/pablito/pwr/miasi_lab/test/Par.g:
					{
					if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SLOWO"

	// $ANTLR start "NL"
	public final void mNL() throws RecognitionException {
		try {
			int _type = NL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/pablito/pwr/miasi_lab/test/Par.g:60:9: ( ( '\\r' )? '\\n' )
			// /home/pablito/pwr/miasi_lab/test/Par.g:60:17: ( '\\r' )? '\\n'
			{
			// /home/pablito/pwr/miasi_lab/test/Par.g:60:17: ( '\\r' )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='\r') ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// /home/pablito/pwr/miasi_lab/test/Par.g:60:17: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
			 _channel=HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NL"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/pablito/pwr/miasi_lab/test/Par.g:61:9: ( ( ' ' | '\\t' ) )
			// /home/pablito/pwr/miasi_lab/test/Par.g:61:17: ( ' ' | '\\t' )
			{
			if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			 _channel=HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/pablito/pwr/miasi_lab/test/Par.g:64:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// /home/pablito/pwr/miasi_lab/test/Par.g:64:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/pablito/pwr/miasi_lab/test/Par.g:64:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /home/pablito/pwr/miasi_lab/test/Par.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop3;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/pablito/pwr/miasi_lab/test/Par.g:67:5: ( ( '0' .. '9' )+ )
			// /home/pablito/pwr/miasi_lab/test/Par.g:67:7: ( '0' .. '9' )+
			{
			// /home/pablito/pwr/miasi_lab/test/Par.g:67:7: ( '0' .. '9' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /home/pablito/pwr/miasi_lab/test/Par.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/pablito/pwr/miasi_lab/test/Par.g:71:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='/') ) {
				int LA8_1 = input.LA(2);
				if ( (LA8_1=='/') ) {
					alt8=1;
				}
				else if ( (LA8_1=='*') ) {
					alt8=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// /home/pablito/pwr/miasi_lab/test/Par.g:71:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// /home/pablito/pwr/miasi_lab/test/Par.g:71:14: (~ ( '\\n' | '\\r' ) )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( ((LA5_0 >= '\u0000' && LA5_0 <= '\t')||(LA5_0 >= '\u000B' && LA5_0 <= '\f')||(LA5_0 >= '\u000E' && LA5_0 <= '\uFFFF')) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// /home/pablito/pwr/miasi_lab/test/Par.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop5;
						}
					}

					// /home/pablito/pwr/miasi_lab/test/Par.g:71:28: ( '\\r' )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0=='\r') ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// /home/pablito/pwr/miasi_lab/test/Par.g:71:28: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					_channel=HIDDEN;
					}
					break;
				case 2 :
					// /home/pablito/pwr/miasi_lab/test/Par.g:72:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// /home/pablito/pwr/miasi_lab/test/Par.g:72:14: ( options {greedy=false; } : . )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0=='*') ) {
							int LA7_1 = input.LA(2);
							if ( (LA7_1=='/') ) {
								alt7=2;
							}
							else if ( ((LA7_1 >= '\u0000' && LA7_1 <= '.')||(LA7_1 >= '0' && LA7_1 <= '\uFFFF')) ) {
								alt7=1;
							}

						}
						else if ( ((LA7_0 >= '\u0000' && LA7_0 <= ')')||(LA7_0 >= '+' && LA7_0 <= '\uFFFF')) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// /home/pablito/pwr/miasi_lab/test/Par.g:72:42: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop7;
						}
					}

					match("*/"); 

					_channel=HIDDEN;
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	@Override
	public void mTokens() throws RecognitionException {
		// /home/pablito/pwr/miasi_lab/test/Par.g:1:8: ( T__12 | T__13 | DEC | PUT | SLOWO | NL | WS | ID | INT | COMMENT )
		int alt9=10;
		alt9 = dfa9.predict(input);
		switch (alt9) {
			case 1 :
				// /home/pablito/pwr/miasi_lab/test/Par.g:1:10: T__12
				{
				mT__12(); 

				}
				break;
			case 2 :
				// /home/pablito/pwr/miasi_lab/test/Par.g:1:16: T__13
				{
				mT__13(); 

				}
				break;
			case 3 :
				// /home/pablito/pwr/miasi_lab/test/Par.g:1:22: DEC
				{
				mDEC(); 

				}
				break;
			case 4 :
				// /home/pablito/pwr/miasi_lab/test/Par.g:1:26: PUT
				{
				mPUT(); 

				}
				break;
			case 5 :
				// /home/pablito/pwr/miasi_lab/test/Par.g:1:30: SLOWO
				{
				mSLOWO(); 

				}
				break;
			case 6 :
				// /home/pablito/pwr/miasi_lab/test/Par.g:1:36: NL
				{
				mNL(); 

				}
				break;
			case 7 :
				// /home/pablito/pwr/miasi_lab/test/Par.g:1:39: WS
				{
				mWS(); 

				}
				break;
			case 8 :
				// /home/pablito/pwr/miasi_lab/test/Par.g:1:42: ID
				{
				mID(); 

				}
				break;
			case 9 :
				// /home/pablito/pwr/miasi_lab/test/Par.g:1:45: INT
				{
				mINT(); 

				}
				break;
			case 10 :
				// /home/pablito/pwr/miasi_lab/test/Par.g:1:49: COMMENT
				{
				mCOMMENT(); 

				}
				break;

		}
	}


	protected DFA9 dfa9 = new DFA9(this);
	static final String DFA9_eotS =
		"\3\uffff\1\10\1\uffff\1\14\5\uffff\1\10\1\uffff\1\14\1\17\1\uffff";
	static final String DFA9_eofS =
		"\20\uffff";
	static final String DFA9_minS =
		"\1\11\2\uffff\1\145\1\uffff\1\60\5\uffff\1\143\1\uffff\2\60\1\uffff";
	static final String DFA9_maxS =
		"\1\172\2\uffff\1\145\1\uffff\1\172\5\uffff\1\143\1\uffff\2\172\1\uffff";
	static final String DFA9_acceptS =
		"\1\uffff\1\1\1\2\1\uffff\1\4\1\uffff\1\6\1\7\1\10\1\11\1\12\1\uffff\1"+
		"\5\2\uffff\1\3";
	static final String DFA9_specialS =
		"\20\uffff}>";
	static final String[] DFA9_transitionS = {
			"\1\7\1\6\2\uffff\1\6\22\uffff\1\7\16\uffff\1\12\12\11\4\uffff\1\4\2\uffff"+
			"\3\10\1\3\26\10\1\1\1\uffff\1\2\1\uffff\1\10\1\uffff\32\5",
			"",
			"",
			"\1\13",
			"",
			"\12\10\7\uffff\32\10\4\uffff\1\10\1\uffff\32\15",
			"",
			"",
			"",
			"",
			"",
			"\1\16",
			"",
			"\12\10\7\uffff\32\10\4\uffff\1\10\1\uffff\32\15",
			"\12\10\7\uffff\32\10\4\uffff\1\10\1\uffff\32\10",
			""
	};

	static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
	static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
	static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
	static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
	static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
	static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
	static final short[][] DFA9_transition;

	static {
		int numStates = DFA9_transitionS.length;
		DFA9_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
		}
	}

	protected class DFA9 extends DFA {

		public DFA9(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 9;
			this.eot = DFA9_eot;
			this.eof = DFA9_eof;
			this.min = DFA9_min;
			this.max = DFA9_max;
			this.accept = DFA9_accept;
			this.special = DFA9_special;
			this.transition = DFA9_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__12 | T__13 | DEC | PUT | SLOWO | NL | WS | ID | INT | COMMENT );";
		}
	}

}
