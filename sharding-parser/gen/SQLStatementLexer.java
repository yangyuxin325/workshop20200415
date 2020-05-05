// Generated from /Users/yangyuxin/IdeaProjects/workshop20200415/sharding-parser/src/main/antlr4/imports/SQLStatement.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQLStatementLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND_=1, OR_=2, NOT_=3, TILDE_=4, VERTICAL_BAR_=5, AMPERSAND_=6, SIGNED_LEFT_SHIFT_=7, 
		SIGNED_RIGHT_SHIFT_=8, CARET_=9, MOD_=10, COLON_=11, PLUS_=12, MINUS_=13, 
		ASTERISK_=14, SLASH_=15, BACKSLASH_=16, DOT_=17, DOT_ASTERISK_=18, SAFE_EQ_=19, 
		DEQ_=20, EQ_=21, NEQ_=22, GT_=23, GTE_=24, LT_=25, LTE_=26, POUND_=27, 
		LP_=28, RP_=29, LBE_=30, RBE_=31, LBT_=32, RBT_=33, COMMA_=34, DQ_=35, 
		SQ_=36, BQ_=37, QUESTION_=38, AT_=39, SEMI_=40, WS=41, USE=42, INSERT=43, 
		SELECT=44, TABLE=45, COLUMN=46, INTO=47, VALUES=48, VALUE=49, FROM=50, 
		WHERE=51, AND=52, OR=53, NOT=54, BETWEEN=55, IN=56, IDENTIFIER_=57, STRING_=58, 
		NUMBER_=59, HEX_DIGIT_=60, BIT_NUM_=61, INT_=62, HEX_=63;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"AND_", "OR_", "NOT_", "TILDE_", "VERTICAL_BAR_", "AMPERSAND_", "SIGNED_LEFT_SHIFT_", 
			"SIGNED_RIGHT_SHIFT_", "CARET_", "MOD_", "COLON_", "PLUS_", "MINUS_", 
			"ASTERISK_", "SLASH_", "BACKSLASH_", "DOT_", "DOT_ASTERISK_", "SAFE_EQ_", 
			"DEQ_", "EQ_", "NEQ_", "GT_", "GTE_", "LT_", "LTE_", "POUND_", "LP_", 
			"RP_", "LBE_", "RBE_", "LBT_", "RBT_", "COMMA_", "DQ_", "SQ_", "BQ_", 
			"QUESTION_", "AT_", "SEMI_", "WS", "USE", "INSERT", "SELECT", "TABLE", 
			"COLUMN", "INTO", "VALUES", "VALUE", "FROM", "WHERE", "AND", "OR", "NOT", 
			"BETWEEN", "IN", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", 
			"L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", 
			"Z", "UL_", "IDENTIFIER_", "STRING_", "NUMBER_", "HEX_DIGIT_", "BIT_NUM_", 
			"INT_", "HEX_"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'&&'", "'||'", "'!'", "'~'", "'|'", "'&'", "'<<'", "'>>'", "'^'", 
			"'%'", "':'", "'+'", "'-'", "'*'", "'/'", "'\\'", "'.'", "'.*'", "'<=>'", 
			"'=='", "'='", null, "'>'", "'>='", "'<'", "'<='", "'#'", "'('", "')'", 
			"'{'", "'}'", "'['", "']'", "','", "'\"'", "'''", "'`'", "'?'", "'@'", 
			"';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AND_", "OR_", "NOT_", "TILDE_", "VERTICAL_BAR_", "AMPERSAND_", 
			"SIGNED_LEFT_SHIFT_", "SIGNED_RIGHT_SHIFT_", "CARET_", "MOD_", "COLON_", 
			"PLUS_", "MINUS_", "ASTERISK_", "SLASH_", "BACKSLASH_", "DOT_", "DOT_ASTERISK_", 
			"SAFE_EQ_", "DEQ_", "EQ_", "NEQ_", "GT_", "GTE_", "LT_", "LTE_", "POUND_", 
			"LP_", "RP_", "LBE_", "RBE_", "LBT_", "RBT_", "COMMA_", "DQ_", "SQ_", 
			"BQ_", "QUESTION_", "AT_", "SEMI_", "WS", "USE", "INSERT", "SELECT", 
			"TABLE", "COLUMN", "INTO", "VALUES", "VALUE", "FROM", "WHERE", "AND", 
			"OR", "NOT", "BETWEEN", "IN", "IDENTIFIER_", "STRING_", "NUMBER_", "HEX_DIGIT_", 
			"BIT_NUM_", "INT_", "HEX_"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public SQLStatementLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SQLStatement.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2A\u0225\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\3\2\3\2\3\2\3\3\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\5\27\u00ee\n\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$"+
		"\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\6*\u0117\n*\r*\16*\u0118\3*\3*"+
		"\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3."+
		"\3.\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\67"+
		"\3\67\3\67\3\67\38\38\38\38\38\38\38\38\39\39\39\3:\3:\3;\3;\3<\3<\3="+
		"\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H"+
		"\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T"+
		"\3T\3U\7U\u01a6\nU\fU\16U\u01a9\13U\3U\6U\u01ac\nU\rU\16U\u01ad\3U\7U"+
		"\u01b1\nU\fU\16U\u01b4\13U\3U\3U\6U\u01b8\nU\rU\16U\u01b9\3U\3U\3U\3U"+
		"\3U\3U\3U\3U\7U\u01c4\nU\fU\16U\u01c7\13U\3U\3U\5U\u01cb\nU\3V\3V\3V\3"+
		"V\3V\3V\7V\u01d3\nV\fV\16V\u01d6\13V\3V\3V\3V\3V\3V\3V\3V\3V\7V\u01e0"+
		"\nV\fV\16V\u01e3\13V\3V\3V\5V\u01e7\nV\3W\5W\u01ea\nW\3W\5W\u01ed\nW\3"+
		"W\3W\3W\3W\5W\u01f3\nW\3W\3W\5W\u01f7\nW\3X\3X\3X\3X\6X\u01fd\nX\rX\16"+
		"X\u01fe\3X\3X\3X\6X\u0204\nX\rX\16X\u0205\3X\3X\5X\u020a\nX\3Y\3Y\3Y\3"+
		"Y\6Y\u0210\nY\rY\16Y\u0211\3Y\3Y\3Y\6Y\u0217\nY\rY\16Y\u0218\3Y\3Y\5Y"+
		"\u021d\nY\3Z\6Z\u0220\nZ\rZ\16Z\u0221\3[\3[\4\u01a7\u01ad\2\\\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s\2u\2"+
		"w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089\2\u008b\2\u008d"+
		"\2\u008f\2\u0091\2\u0093\2\u0095\2\u0097\2\u0099\2\u009b\2\u009d\2\u009f"+
		"\2\u00a1\2\u00a3\2\u00a5\2\u00a7\2\u00a9;\u00ab<\u00ad=\u00af>\u00b1?"+
		"\u00b3@\u00b5A\3\2$\5\2\13\f\17\17\"\"\4\2CCcc\4\2DDdd\4\2EEee\4\2FFf"+
		"f\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2"+
		"OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4"+
		"\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\7\2&&\62;C\\aac|\6\2&&C\\aac"+
		"|\3\2bb\4\2$$^^\4\2))^^\3\2\62;\5\2\62;CHch\2\u0227\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2"+
		"e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3"+
		"\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2"+
		"\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\3\u00b7\3\2\2\2\5\u00ba"+
		"\3\2\2\2\7\u00bd\3\2\2\2\t\u00bf\3\2\2\2\13\u00c1\3\2\2\2\r\u00c3\3\2"+
		"\2\2\17\u00c5\3\2\2\2\21\u00c8\3\2\2\2\23\u00cb\3\2\2\2\25\u00cd\3\2\2"+
		"\2\27\u00cf\3\2\2\2\31\u00d1\3\2\2\2\33\u00d3\3\2\2\2\35\u00d5\3\2\2\2"+
		"\37\u00d7\3\2\2\2!\u00d9\3\2\2\2#\u00db\3\2\2\2%\u00dd\3\2\2\2\'\u00e0"+
		"\3\2\2\2)\u00e4\3\2\2\2+\u00e7\3\2\2\2-\u00ed\3\2\2\2/\u00ef\3\2\2\2\61"+
		"\u00f1\3\2\2\2\63\u00f4\3\2\2\2\65\u00f6\3\2\2\2\67\u00f9\3\2\2\29\u00fb"+
		"\3\2\2\2;\u00fd\3\2\2\2=\u00ff\3\2\2\2?\u0101\3\2\2\2A\u0103\3\2\2\2C"+
		"\u0105\3\2\2\2E\u0107\3\2\2\2G\u0109\3\2\2\2I\u010b\3\2\2\2K\u010d\3\2"+
		"\2\2M\u010f\3\2\2\2O\u0111\3\2\2\2Q\u0113\3\2\2\2S\u0116\3\2\2\2U\u011c"+
		"\3\2\2\2W\u0120\3\2\2\2Y\u0127\3\2\2\2[\u012e\3\2\2\2]\u0134\3\2\2\2_"+
		"\u013b\3\2\2\2a\u0140\3\2\2\2c\u0147\3\2\2\2e\u014d\3\2\2\2g\u0152\3\2"+
		"\2\2i\u0158\3\2\2\2k\u015c\3\2\2\2m\u015f\3\2\2\2o\u0163\3\2\2\2q\u016b"+
		"\3\2\2\2s\u016e\3\2\2\2u\u0170\3\2\2\2w\u0172\3\2\2\2y\u0174\3\2\2\2{"+
		"\u0176\3\2\2\2}\u0178\3\2\2\2\177\u017a\3\2\2\2\u0081\u017c\3\2\2\2\u0083"+
		"\u017e\3\2\2\2\u0085\u0180\3\2\2\2\u0087\u0182\3\2\2\2\u0089\u0184\3\2"+
		"\2\2\u008b\u0186\3\2\2\2\u008d\u0188\3\2\2\2\u008f\u018a\3\2\2\2\u0091"+
		"\u018c\3\2\2\2\u0093\u018e\3\2\2\2\u0095\u0190\3\2\2\2\u0097\u0192\3\2"+
		"\2\2\u0099\u0194\3\2\2\2\u009b\u0196\3\2\2\2\u009d\u0198\3\2\2\2\u009f"+
		"\u019a\3\2\2\2\u00a1\u019c\3\2\2\2\u00a3\u019e\3\2\2\2\u00a5\u01a0\3\2"+
		"\2\2\u00a7\u01a2\3\2\2\2\u00a9\u01ca\3\2\2\2\u00ab\u01e6\3\2\2\2\u00ad"+
		"\u01e9\3\2\2\2\u00af\u0209\3\2\2\2\u00b1\u021c\3\2\2\2\u00b3\u021f\3\2"+
		"\2\2\u00b5\u0223\3\2\2\2\u00b7\u00b8\7(\2\2\u00b8\u00b9\7(\2\2\u00b9\4"+
		"\3\2\2\2\u00ba\u00bb\7~\2\2\u00bb\u00bc\7~\2\2\u00bc\6\3\2\2\2\u00bd\u00be"+
		"\7#\2\2\u00be\b\3\2\2\2\u00bf\u00c0\7\u0080\2\2\u00c0\n\3\2\2\2\u00c1"+
		"\u00c2\7~\2\2\u00c2\f\3\2\2\2\u00c3\u00c4\7(\2\2\u00c4\16\3\2\2\2\u00c5"+
		"\u00c6\7>\2\2\u00c6\u00c7\7>\2\2\u00c7\20\3\2\2\2\u00c8\u00c9\7@\2\2\u00c9"+
		"\u00ca\7@\2\2\u00ca\22\3\2\2\2\u00cb\u00cc\7`\2\2\u00cc\24\3\2\2\2\u00cd"+
		"\u00ce\7\'\2\2\u00ce\26\3\2\2\2\u00cf\u00d0\7<\2\2\u00d0\30\3\2\2\2\u00d1"+
		"\u00d2\7-\2\2\u00d2\32\3\2\2\2\u00d3\u00d4\7/\2\2\u00d4\34\3\2\2\2\u00d5"+
		"\u00d6\7,\2\2\u00d6\36\3\2\2\2\u00d7\u00d8\7\61\2\2\u00d8 \3\2\2\2\u00d9"+
		"\u00da\7^\2\2\u00da\"\3\2\2\2\u00db\u00dc\7\60\2\2\u00dc$\3\2\2\2\u00dd"+
		"\u00de\7\60\2\2\u00de\u00df\7,\2\2\u00df&\3\2\2\2\u00e0\u00e1\7>\2\2\u00e1"+
		"\u00e2\7?\2\2\u00e2\u00e3\7@\2\2\u00e3(\3\2\2\2\u00e4\u00e5\7?\2\2\u00e5"+
		"\u00e6\7?\2\2\u00e6*\3\2\2\2\u00e7\u00e8\7?\2\2\u00e8,\3\2\2\2\u00e9\u00ea"+
		"\7>\2\2\u00ea\u00ee\7@\2\2\u00eb\u00ec\7#\2\2\u00ec\u00ee\7?\2\2\u00ed"+
		"\u00e9\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee.\3\2\2\2\u00ef\u00f0\7@\2\2\u00f0"+
		"\60\3\2\2\2\u00f1\u00f2\7@\2\2\u00f2\u00f3\7?\2\2\u00f3\62\3\2\2\2\u00f4"+
		"\u00f5\7>\2\2\u00f5\64\3\2\2\2\u00f6\u00f7\7>\2\2\u00f7\u00f8\7?\2\2\u00f8"+
		"\66\3\2\2\2\u00f9\u00fa\7%\2\2\u00fa8\3\2\2\2\u00fb\u00fc\7*\2\2\u00fc"+
		":\3\2\2\2\u00fd\u00fe\7+\2\2\u00fe<\3\2\2\2\u00ff\u0100\7}\2\2\u0100>"+
		"\3\2\2\2\u0101\u0102\7\177\2\2\u0102@\3\2\2\2\u0103\u0104\7]\2\2\u0104"+
		"B\3\2\2\2\u0105\u0106\7_\2\2\u0106D\3\2\2\2\u0107\u0108\7.\2\2\u0108F"+
		"\3\2\2\2\u0109\u010a\7$\2\2\u010aH\3\2\2\2\u010b\u010c\7)\2\2\u010cJ\3"+
		"\2\2\2\u010d\u010e\7b\2\2\u010eL\3\2\2\2\u010f\u0110\7A\2\2\u0110N\3\2"+
		"\2\2\u0111\u0112\7B\2\2\u0112P\3\2\2\2\u0113\u0114\7=\2\2\u0114R\3\2\2"+
		"\2\u0115\u0117\t\2\2\2\u0116\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0116"+
		"\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\b*\2\2\u011b"+
		"T\3\2\2\2\u011c\u011d\5\u009bN\2\u011d\u011e\5\u0097L\2\u011e\u011f\5"+
		"{>\2\u011fV\3\2\2\2\u0120\u0121\5\u0083B\2\u0121\u0122\5\u008dG\2\u0122"+
		"\u0123\5\u0097L\2\u0123\u0124\5{>\2\u0124\u0125\5\u0095K\2\u0125\u0126"+
		"\5\u0099M\2\u0126X\3\2\2\2\u0127\u0128\5\u0097L\2\u0128\u0129\5{>\2\u0129"+
		"\u012a\5\u0089E\2\u012a\u012b\5{>\2\u012b\u012c\5w<\2\u012c\u012d\5\u0099"+
		"M\2\u012dZ\3\2\2\2\u012e\u012f\5\u0099M\2\u012f\u0130\5s:\2\u0130\u0131"+
		"\5u;\2\u0131\u0132\5\u0089E\2\u0132\u0133\5{>\2\u0133\\\3\2\2\2\u0134"+
		"\u0135\5w<\2\u0135\u0136\5\u008fH\2\u0136\u0137\5\u0089E\2\u0137\u0138"+
		"\5\u009bN\2\u0138\u0139\5\u008bF\2\u0139\u013a\5\u008dG\2\u013a^\3\2\2"+
		"\2\u013b\u013c\5\u0083B\2\u013c\u013d\5\u008dG\2\u013d\u013e\5\u0099M"+
		"\2\u013e\u013f\5\u008fH\2\u013f`\3\2\2\2\u0140\u0141\5\u009dO\2\u0141"+
		"\u0142\5s:\2\u0142\u0143\5\u0089E\2\u0143\u0144\5\u009bN\2\u0144\u0145"+
		"\5{>\2\u0145\u0146\5\u0097L\2\u0146b\3\2\2\2\u0147\u0148\5\u009dO\2\u0148"+
		"\u0149\5s:\2\u0149\u014a\5\u0089E\2\u014a\u014b\5\u009bN\2\u014b\u014c"+
		"\5{>\2\u014cd\3\2\2\2\u014d\u014e\5}?\2\u014e\u014f\5\u0095K\2\u014f\u0150"+
		"\5\u008fH\2\u0150\u0151\5\u008bF\2\u0151f\3\2\2\2\u0152\u0153\5\u009f"+
		"P\2\u0153\u0154\5\u0081A\2\u0154\u0155\5{>\2\u0155\u0156\5\u0095K\2\u0156"+
		"\u0157\5{>\2\u0157h\3\2\2\2\u0158\u0159\5s:\2\u0159\u015a\5\u008dG\2\u015a"+
		"\u015b\5y=\2\u015bj\3\2\2\2\u015c\u015d\5\u008fH\2\u015d\u015e\5\u0095"+
		"K\2\u015el\3\2\2\2\u015f\u0160\5\u008dG\2\u0160\u0161\5\u008fH\2\u0161"+
		"\u0162\5\u0099M\2\u0162n\3\2\2\2\u0163\u0164\5u;\2\u0164\u0165\5{>\2\u0165"+
		"\u0166\5\u0099M\2\u0166\u0167\5\u009fP\2\u0167\u0168\5{>\2\u0168\u0169"+
		"\5{>\2\u0169\u016a\5\u008dG\2\u016ap\3\2\2\2\u016b\u016c\5\u0083B\2\u016c"+
		"\u016d\5\u008dG\2\u016dr\3\2\2\2\u016e\u016f\t\3\2\2\u016ft\3\2\2\2\u0170"+
		"\u0171\t\4\2\2\u0171v\3\2\2\2\u0172\u0173\t\5\2\2\u0173x\3\2\2\2\u0174"+
		"\u0175\t\6\2\2\u0175z\3\2\2\2\u0176\u0177\t\7\2\2\u0177|\3\2\2\2\u0178"+
		"\u0179\t\b\2\2\u0179~\3\2\2\2\u017a\u017b\t\t\2\2\u017b\u0080\3\2\2\2"+
		"\u017c\u017d\t\n\2\2\u017d\u0082\3\2\2\2\u017e\u017f\t\13\2\2\u017f\u0084"+
		"\3\2\2\2\u0180\u0181\t\f\2\2\u0181\u0086\3\2\2\2\u0182\u0183\t\r\2\2\u0183"+
		"\u0088\3\2\2\2\u0184\u0185\t\16\2\2\u0185\u008a\3\2\2\2\u0186\u0187\t"+
		"\17\2\2\u0187\u008c\3\2\2\2\u0188\u0189\t\20\2\2\u0189\u008e\3\2\2\2\u018a"+
		"\u018b\t\21\2\2\u018b\u0090\3\2\2\2\u018c\u018d\t\22\2\2\u018d\u0092\3"+
		"\2\2\2\u018e\u018f\t\23\2\2\u018f\u0094\3\2\2\2\u0190\u0191\t\24\2\2\u0191"+
		"\u0096\3\2\2\2\u0192\u0193\t\25\2\2\u0193\u0098\3\2\2\2\u0194\u0195\t"+
		"\26\2\2\u0195\u009a\3\2\2\2\u0196\u0197\t\27\2\2\u0197\u009c\3\2\2\2\u0198"+
		"\u0199\t\30\2\2\u0199\u009e\3\2\2\2\u019a\u019b\t\31\2\2\u019b\u00a0\3"+
		"\2\2\2\u019c\u019d\t\32\2\2\u019d\u00a2\3\2\2\2\u019e\u019f\t\33\2\2\u019f"+
		"\u00a4\3\2\2\2\u01a0\u01a1\t\34\2\2\u01a1\u00a6\3\2\2\2\u01a2\u01a3\7"+
		"a\2\2\u01a3\u00a8\3\2\2\2\u01a4\u01a6\t\35\2\2\u01a5\u01a4\3\2\2\2\u01a6"+
		"\u01a9\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a8\u01ab\3\2"+
		"\2\2\u01a9\u01a7\3\2\2\2\u01aa\u01ac\t\36\2\2\u01ab\u01aa\3\2\2\2\u01ac"+
		"\u01ad\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae\u01b2\3\2"+
		"\2\2\u01af\u01b1\t\35\2\2\u01b0\u01af\3\2\2\2\u01b1\u01b4\3\2\2\2\u01b2"+
		"\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01cb\3\2\2\2\u01b4\u01b2\3\2"+
		"\2\2\u01b5\u01b7\5K&\2\u01b6\u01b8\n\37\2\2\u01b7\u01b6\3\2\2\2\u01b8"+
		"\u01b9\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\3\2"+
		"\2\2\u01bb\u01bc\5K&\2\u01bc\u01cb\3\2\2\2\u01bd\u01c5\5G$\2\u01be\u01bf"+
		"\7^\2\2\u01bf\u01c4\13\2\2\2\u01c0\u01c1\7$\2\2\u01c1\u01c4\7$\2\2\u01c2"+
		"\u01c4\n \2\2\u01c3\u01be\3\2\2\2\u01c3\u01c0\3\2\2\2\u01c3\u01c2\3\2"+
		"\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6"+
		"\u01c8\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01c9\5G$\2\u01c9\u01cb\3\2\2"+
		"\2\u01ca\u01a7\3\2\2\2\u01ca\u01b5\3\2\2\2\u01ca\u01bd\3\2\2\2\u01cb\u00aa"+
		"\3\2\2\2\u01cc\u01d4\5G$\2\u01cd\u01ce\7^\2\2\u01ce\u01d3\13\2\2\2\u01cf"+
		"\u01d0\7$\2\2\u01d0\u01d3\7$\2\2\u01d1\u01d3\n \2\2\u01d2\u01cd\3\2\2"+
		"\2\u01d2\u01cf\3\2\2\2\u01d2\u01d1\3\2\2\2\u01d3\u01d6\3\2\2\2\u01d4\u01d2"+
		"\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d7\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d7"+
		"\u01d8\5G$\2\u01d8\u01e7\3\2\2\2\u01d9\u01e1\5I%\2\u01da\u01db\7^\2\2"+
		"\u01db\u01e0\13\2\2\2\u01dc\u01dd\7)\2\2\u01dd\u01e0\7)\2\2\u01de\u01e0"+
		"\n!\2\2\u01df\u01da\3\2\2\2\u01df\u01dc\3\2\2\2\u01df\u01de\3\2\2\2\u01e0"+
		"\u01e3\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e4\3\2"+
		"\2\2\u01e3\u01e1\3\2\2\2\u01e4\u01e5\5I%\2\u01e5\u01e7\3\2\2\2\u01e6\u01cc"+
		"\3\2\2\2\u01e6\u01d9\3\2\2\2\u01e7\u00ac\3\2\2\2\u01e8\u01ea\5\u00b3Z"+
		"\2\u01e9\u01e8\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01ec\3\2\2\2\u01eb\u01ed"+
		"\5#\22\2\u01ec\u01eb\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee"+
		"\u01f6\5\u00b3Z\2\u01ef\u01f2\5{>\2\u01f0\u01f3\5\31\r\2\u01f1\u01f3\5"+
		"\33\16\2\u01f2\u01f0\3\2\2\2\u01f2\u01f1\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3"+
		"\u01f4\3\2\2\2\u01f4\u01f5\5\u00b3Z\2\u01f5\u01f7\3\2\2\2\u01f6\u01ef"+
		"\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u00ae\3\2\2\2\u01f8\u01f9\7\62\2\2"+
		"\u01f9\u01fa\7z\2\2\u01fa\u01fc\3\2\2\2\u01fb\u01fd\5\u00b5[\2\u01fc\u01fb"+
		"\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff"+
		"\u020a\3\2\2\2\u0200\u0201\7Z\2\2\u0201\u0203\5I%\2\u0202\u0204\5\u00b5"+
		"[\2\u0203\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0203\3\2\2\2\u0205"+
		"\u0206\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0208\5I%\2\u0208\u020a\3\2\2"+
		"\2\u0209\u01f8\3\2\2\2\u0209\u0200\3\2\2\2\u020a\u00b0\3\2\2\2\u020b\u020c"+
		"\7\62\2\2\u020c\u020d\7d\2\2\u020d\u020f\3\2\2\2\u020e\u0210\4\62\63\2"+
		"\u020f\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u020f\3\2\2\2\u0211\u0212"+
		"\3\2\2\2\u0212\u021d\3\2\2\2\u0213\u0214\5u;\2\u0214\u0216\5I%\2\u0215"+
		"\u0217\4\62\63\2\u0216\u0215\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u0216\3"+
		"\2\2\2\u0218\u0219\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021b\5I%\2\u021b"+
		"\u021d\3\2\2\2\u021c\u020b\3\2\2\2\u021c\u0213\3\2\2\2\u021d\u00b2\3\2"+
		"\2\2\u021e\u0220\t\"\2\2\u021f\u021e\3\2\2\2\u0220\u0221\3\2\2\2\u0221"+
		"\u021f\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u00b4\3\2\2\2\u0223\u0224\t#"+
		"\2\2\u0224\u00b6\3\2\2\2\34\2\u00ed\u0118\u01a7\u01ad\u01b2\u01b9\u01c3"+
		"\u01c5\u01ca\u01d2\u01d4\u01df\u01e1\u01e6\u01e9\u01ec\u01f2\u01f6\u01fe"+
		"\u0205\u0209\u0211\u0218\u021c\u0221\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}