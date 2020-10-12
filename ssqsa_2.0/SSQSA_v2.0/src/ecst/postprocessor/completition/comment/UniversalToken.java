package ecst.postprocessor.completition.comment;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenSource;

public class UniversalToken implements Token {
	private int type;
	private String text;
	private int line;
	private int tokenIndex;
	private int charPositionInLine;

	private int channel;
	private CharStream inputStream;
	private TokenSource source;

	public UniversalToken(int type, String text, int line, int index, int column, TokenSource source) {
		this.type = type;
		this.text = text;
		this.line = line;
		this.tokenIndex = index;
		this.charPositionInLine = column;
		this.source = source;
	}

	@Override
	public int getChannel() {
		return channel;
	}

	@Override
	public int getCharPositionInLine() {
		return charPositionInLine;
	}

	@Override
	public CharStream getInputStream() {
		return inputStream;
	}

	@Override
	public int getLine() {
		return line;
	}

	@Override
	public String getText() {
		return text;
	}

	@Override
	public int getTokenIndex() {
		return tokenIndex;
	}

	@Override
	public int getType() {
		return type;
	}

	@Override
	public int getStartIndex() {
		return this.tokenIndex;
	}

	@Override
	public int getStopIndex() {
		return this.tokenIndex + this.text.length();
	}

	@Override
	public TokenSource getTokenSource() {
		return this.source;
	}

}
