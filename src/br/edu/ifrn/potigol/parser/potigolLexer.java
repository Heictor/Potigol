// Generated from potigol.g4 by ANTLR 4.5.2
package br.edu.ifrn.potigol.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class potigolLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, ID=58, INT=59, FLOAT=60, 
		STRING=61, BS=62, MS=63, ES=64, CHAR=65, BOOLEANO=66, WS=67, COMMENT=68, 
		NL=69;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
		"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "T__48", 
		"T__49", "T__50", "T__51", "T__52", "T__53", "T__54", "T__55", "T__56", 
		"ID", "ALPHA", "ACENTO", "INT", "FLOAT", "DIGIT", "STRING", "BS", "MS", 
		"ES", "CHAR", "BOOLEANO", "ESC", "WS", "COMMENT", "NL"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'escreva'", "'imprima'", "':='", "'['", "']'", "'='", "'var'", 
		"'('", "')'", "':'", "'fim'", "'tipo'", "'use'", "','", "'Tupla('", "'=>'", 
		"'.'", "'^'", "'::'", "'+'", "'-'", "'*'", "'/'", "'div'", "'mod'", "'formato'", 
		"'>'", "'>='", "'<'", "'<='", "'=='", "'<>'", "'nao'", "'n\\u00e3o'", 
		"'e'", "'ou'", "'_'", "'se'", "'entao'", "'ent\\u00e3o'", "'senaose'", 
		"'sen\\u00e3ose'", "'senao'", "'sen\\u00e3o'", "'escolha'", "'caso'", 
		"'|'", "'para'", "'gere'", "'enquanto'", "'em'", "'de'", "'ate'", "'at\\u00e9'", 
		"'passo'", "'faca'", "'fa\\u00e7a'", null, null, null, null, null, null, 
		null, null, null, null, null, "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "ID", "INT", 
		"FLOAT", "STRING", "BS", "MS", "ES", "CHAR", "BOOLEANO", "WS", "COMMENT", 
		"NL"
	};
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


	public potigolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "potigol.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2G\u01fd\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3"+
		"!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3"+
		"(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3"+
		"/\3/\3/\3/\3/\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3"+
		"\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3"+
		"\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\38\38\38\38\38\38\39"+
		"\39\39\39\39\3:\3:\3:\3:\3:\3;\3;\5;\u017d\n;\3;\3;\3;\7;\u0182\n;\f;"+
		"\16;\u0185\13;\3<\3<\3=\3=\3>\6>\u018c\n>\r>\16>\u018d\3?\6?\u0191\n?"+
		"\r?\16?\u0192\3?\3?\6?\u0197\n?\r?\16?\u0198\3?\3?\6?\u019d\n?\r?\16?"+
		"\u019e\5?\u01a1\n?\3@\3@\3A\3A\3A\7A\u01a8\nA\fA\16A\u01ab\13A\3A\3A\3"+
		"B\3B\7B\u01b1\nB\fB\16B\u01b4\13B\3B\3B\3C\3C\7C\u01ba\nC\fC\16C\u01bd"+
		"\13C\3C\3C\3D\3D\7D\u01c3\nD\fD\16D\u01c6\13D\3D\3D\3E\3E\3E\3E\3F\3F"+
		"\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\5F\u01dd\nF\3G\3G\3G\3G\5G\u01e3"+
		"\nG\3H\6H\u01e6\nH\rH\16H\u01e7\3H\3H\3I\3I\7I\u01ee\nI\fI\16I\u01f1\13"+
		"I\3I\5I\u01f4\nI\3I\3I\3I\3I\3J\3J\3J\3J\7\u01a9\u01b2\u01bb\u01c4\u01ef"+
		"\2K\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67"+
		"m8o9q:s;u<w\2y\2{=}>\177\2\u0081?\u0083@\u0085A\u0087B\u0089C\u008bD\u008d"+
		"\2\u008fE\u0091F\u0093G\3\2\6\5\2C\\aac|\3\2}}\3\2$$\5\2\13\13\17\17\""+
		"\"\u020b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2"+
		"\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2{\3\2\2\2\2}"+
		"\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2"+
		"\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093"+
		"\3\2\2\2\3\u0095\3\2\2\2\5\u009d\3\2\2\2\7\u00a5\3\2\2\2\t\u00a8\3\2\2"+
		"\2\13\u00aa\3\2\2\2\r\u00ac\3\2\2\2\17\u00ae\3\2\2\2\21\u00b2\3\2\2\2"+
		"\23\u00b4\3\2\2\2\25\u00b6\3\2\2\2\27\u00b8\3\2\2\2\31\u00bc\3\2\2\2\33"+
		"\u00c1\3\2\2\2\35\u00c5\3\2\2\2\37\u00c7\3\2\2\2!\u00ce\3\2\2\2#\u00d1"+
		"\3\2\2\2%\u00d3\3\2\2\2\'\u00d5\3\2\2\2)\u00d8\3\2\2\2+\u00da\3\2\2\2"+
		"-\u00dc\3\2\2\2/\u00de\3\2\2\2\61\u00e0\3\2\2\2\63\u00e4\3\2\2\2\65\u00e8"+
		"\3\2\2\2\67\u00f0\3\2\2\29\u00f2\3\2\2\2;\u00f5\3\2\2\2=\u00f7\3\2\2\2"+
		"?\u00fa\3\2\2\2A\u00fd\3\2\2\2C\u0100\3\2\2\2E\u0104\3\2\2\2G\u0108\3"+
		"\2\2\2I\u010a\3\2\2\2K\u010d\3\2\2\2M\u010f\3\2\2\2O\u0112\3\2\2\2Q\u0118"+
		"\3\2\2\2S\u011e\3\2\2\2U\u0126\3\2\2\2W\u012e\3\2\2\2Y\u0134\3\2\2\2["+
		"\u013a\3\2\2\2]\u0142\3\2\2\2_\u0147\3\2\2\2a\u0149\3\2\2\2c\u014e\3\2"+
		"\2\2e\u0153\3\2\2\2g\u015c\3\2\2\2i\u015f\3\2\2\2k\u0162\3\2\2\2m\u0166"+
		"\3\2\2\2o\u016a\3\2\2\2q\u0170\3\2\2\2s\u0175\3\2\2\2u\u017c\3\2\2\2w"+
		"\u0186\3\2\2\2y\u0188\3\2\2\2{\u018b\3\2\2\2}\u01a0\3\2\2\2\177\u01a2"+
		"\3\2\2\2\u0081\u01a4\3\2\2\2\u0083\u01ae\3\2\2\2\u0085\u01b7\3\2\2\2\u0087"+
		"\u01c0\3\2\2\2\u0089\u01c9\3\2\2\2\u008b\u01dc\3\2\2\2\u008d\u01e2\3\2"+
		"\2\2\u008f\u01e5\3\2\2\2\u0091\u01eb\3\2\2\2\u0093\u01f9\3\2\2\2\u0095"+
		"\u0096\7g\2\2\u0096\u0097\7u\2\2\u0097\u0098\7e\2\2\u0098\u0099\7t\2\2"+
		"\u0099\u009a\7g\2\2\u009a\u009b\7x\2\2\u009b\u009c\7c\2\2\u009c\4\3\2"+
		"\2\2\u009d\u009e\7k\2\2\u009e\u009f\7o\2\2\u009f\u00a0\7r\2\2\u00a0\u00a1"+
		"\7t\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7o\2\2\u00a3\u00a4\7c\2\2\u00a4"+
		"\6\3\2\2\2\u00a5\u00a6\7<\2\2\u00a6\u00a7\7?\2\2\u00a7\b\3\2\2\2\u00a8"+
		"\u00a9\7]\2\2\u00a9\n\3\2\2\2\u00aa\u00ab\7_\2\2\u00ab\f\3\2\2\2\u00ac"+
		"\u00ad\7?\2\2\u00ad\16\3\2\2\2\u00ae\u00af\7x\2\2\u00af\u00b0\7c\2\2\u00b0"+
		"\u00b1\7t\2\2\u00b1\20\3\2\2\2\u00b2\u00b3\7*\2\2\u00b3\22\3\2\2\2\u00b4"+
		"\u00b5\7+\2\2\u00b5\24\3\2\2\2\u00b6\u00b7\7<\2\2\u00b7\26\3\2\2\2\u00b8"+
		"\u00b9\7h\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7o\2\2\u00bb\30\3\2\2\2\u00bc"+
		"\u00bd\7v\2\2\u00bd\u00be\7k\2\2\u00be\u00bf\7r\2\2\u00bf\u00c0\7q\2\2"+
		"\u00c0\32\3\2\2\2\u00c1\u00c2\7w\2\2\u00c2\u00c3\7u\2\2\u00c3\u00c4\7"+
		"g\2\2\u00c4\34\3\2\2\2\u00c5\u00c6\7.\2\2\u00c6\36\3\2\2\2\u00c7\u00c8"+
		"\7V\2\2\u00c8\u00c9\7w\2\2\u00c9\u00ca\7r\2\2\u00ca\u00cb\7n\2\2\u00cb"+
		"\u00cc\7c\2\2\u00cc\u00cd\7*\2\2\u00cd \3\2\2\2\u00ce\u00cf\7?\2\2\u00cf"+
		"\u00d0\7@\2\2\u00d0\"\3\2\2\2\u00d1\u00d2\7\60\2\2\u00d2$\3\2\2\2\u00d3"+
		"\u00d4\7`\2\2\u00d4&\3\2\2\2\u00d5\u00d6\7<\2\2\u00d6\u00d7\7<\2\2\u00d7"+
		"(\3\2\2\2\u00d8\u00d9\7-\2\2\u00d9*\3\2\2\2\u00da\u00db\7/\2\2\u00db,"+
		"\3\2\2\2\u00dc\u00dd\7,\2\2\u00dd.\3\2\2\2\u00de\u00df\7\61\2\2\u00df"+
		"\60\3\2\2\2\u00e0\u00e1\7f\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3\7x\2\2\u00e3"+
		"\62\3\2\2\2\u00e4\u00e5\7o\2\2\u00e5\u00e6\7q\2\2\u00e6\u00e7\7f\2\2\u00e7"+
		"\64\3\2\2\2\u00e8\u00e9\7h\2\2\u00e9\u00ea\7q\2\2\u00ea\u00eb\7t\2\2\u00eb"+
		"\u00ec\7o\2\2\u00ec\u00ed\7c\2\2\u00ed\u00ee\7v\2\2\u00ee\u00ef\7q\2\2"+
		"\u00ef\66\3\2\2\2\u00f0\u00f1\7@\2\2\u00f18\3\2\2\2\u00f2\u00f3\7@\2\2"+
		"\u00f3\u00f4\7?\2\2\u00f4:\3\2\2\2\u00f5\u00f6\7>\2\2\u00f6<\3\2\2\2\u00f7"+
		"\u00f8\7>\2\2\u00f8\u00f9\7?\2\2\u00f9>\3\2\2\2\u00fa\u00fb\7?\2\2\u00fb"+
		"\u00fc\7?\2\2\u00fc@\3\2\2\2\u00fd\u00fe\7>\2\2\u00fe\u00ff\7@\2\2\u00ff"+
		"B\3\2\2\2\u0100\u0101\7p\2\2\u0101\u0102\7c\2\2\u0102\u0103\7q\2\2\u0103"+
		"D\3\2\2\2\u0104\u0105\7p\2\2\u0105\u0106\7\u00e5\2\2\u0106\u0107\7q\2"+
		"\2\u0107F\3\2\2\2\u0108\u0109\7g\2\2\u0109H\3\2\2\2\u010a\u010b\7q\2\2"+
		"\u010b\u010c\7w\2\2\u010cJ\3\2\2\2\u010d\u010e\7a\2\2\u010eL\3\2\2\2\u010f"+
		"\u0110\7u\2\2\u0110\u0111\7g\2\2\u0111N\3\2\2\2\u0112\u0113\7g\2\2\u0113"+
		"\u0114\7p\2\2\u0114\u0115\7v\2\2\u0115\u0116\7c\2\2\u0116\u0117\7q\2\2"+
		"\u0117P\3\2\2\2\u0118\u0119\7g\2\2\u0119\u011a\7p\2\2\u011a\u011b\7v\2"+
		"\2\u011b\u011c\7\u00e5\2\2\u011c\u011d\7q\2\2\u011dR\3\2\2\2\u011e\u011f"+
		"\7u\2\2\u011f\u0120\7g\2\2\u0120\u0121\7p\2\2\u0121\u0122\7c\2\2\u0122"+
		"\u0123\7q\2\2\u0123\u0124\7u\2\2\u0124\u0125\7g\2\2\u0125T\3\2\2\2\u0126"+
		"\u0127\7u\2\2\u0127\u0128\7g\2\2\u0128\u0129\7p\2\2\u0129\u012a\7\u00e5"+
		"\2\2\u012a\u012b\7q\2\2\u012b\u012c\7u\2\2\u012c\u012d\7g\2\2\u012dV\3"+
		"\2\2\2\u012e\u012f\7u\2\2\u012f\u0130\7g\2\2\u0130\u0131\7p\2\2\u0131"+
		"\u0132\7c\2\2\u0132\u0133\7q\2\2\u0133X\3\2\2\2\u0134\u0135\7u\2\2\u0135"+
		"\u0136\7g\2\2\u0136\u0137\7p\2\2\u0137\u0138\7\u00e5\2\2\u0138\u0139\7"+
		"q\2\2\u0139Z\3\2\2\2\u013a\u013b\7g\2\2\u013b\u013c\7u\2\2\u013c\u013d"+
		"\7e\2\2\u013d\u013e\7q\2\2\u013e\u013f\7n\2\2\u013f\u0140\7j\2\2\u0140"+
		"\u0141\7c\2\2\u0141\\\3\2\2\2\u0142\u0143\7e\2\2\u0143\u0144\7c\2\2\u0144"+
		"\u0145\7u\2\2\u0145\u0146\7q\2\2\u0146^\3\2\2\2\u0147\u0148\7~\2\2\u0148"+
		"`\3\2\2\2\u0149\u014a\7r\2\2\u014a\u014b\7c\2\2\u014b\u014c\7t\2\2\u014c"+
		"\u014d\7c\2\2\u014db\3\2\2\2\u014e\u014f\7i\2\2\u014f\u0150\7g\2\2\u0150"+
		"\u0151\7t\2\2\u0151\u0152\7g\2\2\u0152d\3\2\2\2\u0153\u0154\7g\2\2\u0154"+
		"\u0155\7p\2\2\u0155\u0156\7s\2\2\u0156\u0157\7w\2\2\u0157\u0158\7c\2\2"+
		"\u0158\u0159\7p\2\2\u0159\u015a\7v\2\2\u015a\u015b\7q\2\2\u015bf\3\2\2"+
		"\2\u015c\u015d\7g\2\2\u015d\u015e\7o\2\2\u015eh\3\2\2\2\u015f\u0160\7"+
		"f\2\2\u0160\u0161\7g\2\2\u0161j\3\2\2\2\u0162\u0163\7c\2\2\u0163\u0164"+
		"\7v\2\2\u0164\u0165\7g\2\2\u0165l\3\2\2\2\u0166\u0167\7c\2\2\u0167\u0168"+
		"\7v\2\2\u0168\u0169\7\u00eb\2\2\u0169n\3\2\2\2\u016a\u016b\7r\2\2\u016b"+
		"\u016c\7c\2\2\u016c\u016d\7u\2\2\u016d\u016e\7u\2\2\u016e\u016f\7q\2\2"+
		"\u016fp\3\2\2\2\u0170\u0171\7h\2\2\u0171\u0172\7c\2\2\u0172\u0173\7e\2"+
		"\2\u0173\u0174\7c\2\2\u0174r\3\2\2\2\u0175\u0176\7h\2\2\u0176\u0177\7"+
		"c\2\2\u0177\u0178\7\u00e9\2\2\u0178\u0179\7c\2\2\u0179t\3\2\2\2\u017a"+
		"\u017d\5w<\2\u017b\u017d\5y=\2\u017c\u017a\3\2\2\2\u017c\u017b\3\2\2\2"+
		"\u017d\u0183\3\2\2\2\u017e\u0182\5w<\2\u017f\u0182\5y=\2\u0180\u0182\5"+
		"\177@\2\u0181\u017e\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0180\3\2\2\2\u0182"+
		"\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184v\3\2\2\2"+
		"\u0185\u0183\3\2\2\2\u0186\u0187\t\2\2\2\u0187x\3\2\2\2\u0188\u0189\4"+
		"\u00a3\ufffe\2\u0189z\3\2\2\2\u018a\u018c\5\177@\2\u018b\u018a\3\2\2\2"+
		"\u018c\u018d\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e|\3"+
		"\2\2\2\u018f\u0191\5\177@\2\u0190\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192"+
		"\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0196\7\60"+
		"\2\2\u0195\u0197\5\177@\2\u0196\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198"+
		"\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u01a1\3\2\2\2\u019a\u019c\7\60"+
		"\2\2\u019b\u019d\5\177@\2\u019c\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e"+
		"\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a1\3\2\2\2\u01a0\u0190\3\2"+
		"\2\2\u01a0\u019a\3\2\2\2\u01a1~\3\2\2\2\u01a2\u01a3\4\62;\2\u01a3\u0080"+
		"\3\2\2\2\u01a4\u01a9\7$\2\2\u01a5\u01a8\5\u008dG\2\u01a6\u01a8\n\3\2\2"+
		"\u01a7\u01a5\3\2\2\2\u01a7\u01a6\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01aa"+
		"\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa\u01ac\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac"+
		"\u01ad\7$\2\2\u01ad\u0082\3\2\2\2\u01ae\u01b2\7$\2\2\u01af\u01b1\n\4\2"+
		"\2\u01b0\u01af\3\2\2\2\u01b1\u01b4\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b2\u01b0"+
		"\3\2\2\2\u01b3\u01b5\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b5\u01b6\7}\2\2\u01b6"+
		"\u0084\3\2\2\2\u01b7\u01bb\7\177\2\2\u01b8\u01ba\n\4\2\2\u01b9\u01b8\3"+
		"\2\2\2\u01ba\u01bd\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc"+
		"\u01be\3\2\2\2\u01bd\u01bb\3\2\2\2\u01be\u01bf\7}\2\2\u01bf\u0086\3\2"+
		"\2\2\u01c0\u01c4\7\177\2\2\u01c1\u01c3\n\3\2\2\u01c2\u01c1\3\2\2\2\u01c3"+
		"\u01c6\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c5\u01c7\3\2"+
		"\2\2\u01c6\u01c4\3\2\2\2\u01c7\u01c8\7$\2\2\u01c8\u0088\3\2\2\2\u01c9"+
		"\u01ca\7)\2\2\u01ca\u01cb\13\2\2\2\u01cb\u01cc\7)\2\2\u01cc\u008a\3\2"+
		"\2\2\u01cd\u01ce\7x\2\2\u01ce\u01cf\7g\2\2\u01cf\u01d0\7t\2\2\u01d0\u01d1"+
		"\7f\2\2\u01d1\u01d2\7c\2\2\u01d2\u01d3\7f\2\2\u01d3\u01d4\7g\2\2\u01d4"+
		"\u01d5\7k\2\2\u01d5\u01d6\7t\2\2\u01d6\u01dd\7q\2\2\u01d7\u01d8\7h\2\2"+
		"\u01d8\u01d9\7c\2\2\u01d9\u01da\7n\2\2\u01da\u01db\7u\2\2\u01db\u01dd"+
		"\7q\2\2\u01dc\u01cd\3\2\2\2\u01dc\u01d7\3\2\2\2\u01dd\u008c\3\2\2\2\u01de"+
		"\u01df\7^\2\2\u01df\u01e3\7$\2\2\u01e0\u01e1\7^\2\2\u01e1\u01e3\7^\2\2"+
		"\u01e2\u01de\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e3\u008e\3\2\2\2\u01e4\u01e6"+
		"\t\5\2\2\u01e5\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7"+
		"\u01e8\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ea\bH\2\2\u01ea\u0090\3\2"+
		"\2\2\u01eb\u01ef\7%\2\2\u01ec\u01ee\13\2\2\2\u01ed\u01ec\3\2\2\2\u01ee"+
		"\u01f1\3\2\2\2\u01ef\u01f0\3\2\2\2\u01ef\u01ed\3\2\2\2\u01f0\u01f3\3\2"+
		"\2\2\u01f1\u01ef\3\2\2\2\u01f2\u01f4\7\17\2\2\u01f3\u01f2\3\2\2\2\u01f3"+
		"\u01f4\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6\7\f\2\2\u01f6\u01f7\3\2"+
		"\2\2\u01f7\u01f8\bI\3\2\u01f8\u0092\3\2\2\2\u01f9\u01fa\7\f\2\2\u01fa"+
		"\u01fb\3\2\2\2\u01fb\u01fc\bJ\4\2\u01fc\u0094\3\2\2\2\25\2\u017c\u0181"+
		"\u0183\u018d\u0192\u0198\u019e\u01a0\u01a7\u01a9\u01b2\u01bb\u01c4\u01dc"+
		"\u01e2\u01e7\u01ef\u01f3\5\b\2\2\2\3\2\2\4\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}