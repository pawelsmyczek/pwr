// $ANTLR 3.5.1 /home/pablito/pwr/miasi_lab/lab1/supergrammar.g 2019-03-01 13:23:04

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class supergrammarLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public supergrammarLexer() {} 
	public supergrammarLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public supergrammarLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/home/pablito/pwr/miasi_lab/lab1/supergrammar.g"; }

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:2:7: ( 'b' )
			// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:2:9: 'b'
			{
			match('b'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:46:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:46:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:46:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:
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
					break loop1;
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
			// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:49:5: ( ( '0' .. '9' )+ )
			// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:49:7: ( '0' .. '9' )+
			{
			// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:49:7: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:
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
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
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
			// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:53:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='/') ) {
				int LA6_1 = input.LA(2);
				if ( (LA6_1=='/') ) {
					alt6=1;
				}
				else if ( (LA6_1=='*') ) {
					alt6=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:53:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:53:14: (~ ( '\\n' | '\\r' ) )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '\uFFFF')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:
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
							break loop3;
						}
					}

					// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:53:28: ( '\\r' )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0=='\r') ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:53:28: '\\r'
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
					// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:54:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:54:14: ( options {greedy=false; } : . )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0=='*') ) {
							int LA5_1 = input.LA(2);
							if ( (LA5_1=='/') ) {
								alt5=2;
							}
							else if ( ((LA5_1 >= '\u0000' && LA5_1 <= '.')||(LA5_1 >= '0' && LA5_1 <= '\uFFFF')) ) {
								alt5=1;
							}

						}
						else if ( ((LA5_0 >= '\u0000' && LA5_0 <= ')')||(LA5_0 >= '+' && LA5_0 <= '\uFFFF')) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:54:42: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop5;
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

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:57:5: ( ( ' ' | '\\t' ) )
			// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:57:9: ( ' ' | '\\t' )
			{
			if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN; skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "NL"
	public final void mNL() throws RecognitionException {
		try {
			int _type = NL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:63:2: ( ( '\\r' )? '\\n' )
			// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:63:4: ( '\\r' )? '\\n'
			{
			// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:63:4: ( '\\r' )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='\r') ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:63:4: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NL"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:67:2: ( '+' )
			// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:67:4: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS"

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:71:2: ( '-' )
			// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:71:4: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS"

	// $ANTLR start "MUL"
	public final void mMUL() throws RecognitionException {
		try {
			int _type = MUL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:75:2: ( '*' )
			// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:75:4: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MUL"

	// $ANTLR start "DIV"
	public final void mDIV() throws RecognitionException {
		try {
			int _type = DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:79:2: ( '/' )
			// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:79:4: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV"

	// $ANTLR start "LP"
	public final void mLP() throws RecognitionException {
		try {
			int _type = LP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:83:2: ( '(' )
			// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:83:4: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LP"

	// $ANTLR start "RP"
	public final void mRP() throws RecognitionException {
		try {
			int _type = RP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:87:2: ( ')' )
			// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:87:4: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RP"

	@Override
	public void mTokens() throws RecognitionException {
		// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:1:8: ( T__15 | ID | INT | COMMENT | WS | NL | PLUS | MINUS | MUL | DIV | LP | RP )
		int alt8=12;
		switch ( input.LA(1) ) {
		case 'b':
			{
			int LA8_1 = input.LA(2);
			if ( ((LA8_1 >= '0' && LA8_1 <= '9')||(LA8_1 >= 'A' && LA8_1 <= 'Z')||LA8_1=='_'||(LA8_1 >= 'a' && LA8_1 <= 'z')) ) {
				alt8=2;
			}

			else {
				alt8=1;
			}

			}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case '_':
		case 'a':
		case 'c':
		case 'd':
		case 'e':
		case 'f':
		case 'g':
		case 'h':
		case 'i':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'p':
		case 'q':
		case 'r':
		case 's':
		case 't':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt8=2;
			}
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt8=3;
			}
			break;
		case '/':
			{
			int LA8_4 = input.LA(2);
			if ( (LA8_4=='*'||LA8_4=='/') ) {
				alt8=4;
			}

			else {
				alt8=10;
			}

			}
			break;
		case '\t':
		case ' ':
			{
			alt8=5;
			}
			break;
		case '\n':
		case '\r':
			{
			alt8=6;
			}
			break;
		case '+':
			{
			alt8=7;
			}
			break;
		case '-':
			{
			alt8=8;
			}
			break;
		case '*':
			{
			alt8=9;
			}
			break;
		case '(':
			{
			alt8=11;
			}
			break;
		case ')':
			{
			alt8=12;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 8, 0, input);
			throw nvae;
		}
		switch (alt8) {
			case 1 :
				// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:1:10: T__15
				{
				mT__15(); 

				}
				break;
			case 2 :
				// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:1:16: ID
				{
				mID(); 

				}
				break;
			case 3 :
				// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:1:19: INT
				{
				mINT(); 

				}
				break;
			case 4 :
				// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:1:23: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 5 :
				// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:1:31: WS
				{
				mWS(); 

				}
				break;
			case 6 :
				// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:1:34: NL
				{
				mNL(); 

				}
				break;
			case 7 :
				// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:1:37: PLUS
				{
				mPLUS(); 

				}
				break;
			case 8 :
				// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:1:42: MINUS
				{
				mMINUS(); 

				}
				break;
			case 9 :
				// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:1:48: MUL
				{
				mMUL(); 

				}
				break;
			case 10 :
				// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:1:52: DIV
				{
				mDIV(); 

				}
				break;
			case 11 :
				// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:1:56: LP
				{
				mLP(); 

				}
				break;
			case 12 :
				// /home/pablito/pwr/miasi_lab/lab1/supergrammar.g:1:59: RP
				{
				mRP(); 

				}
				break;

		}
	}



}
