package org.senssic.higcode.process;

import org.senssic.higcode.CodeTemplete;
import org.senssic.higcode.codedescribe.ICodeDescribe;

public class JavaProcess extends AbstractProcess {
	private int STATE_TEXT = 1; // 普通文本
	private int STATE_DOUBLE_QUOTE = 2; // 双引号
	private int STATE_SINGLE_QUOTE = 3; // 单引号
	private int STATE_MULTI_LINE_COMMENT = 4; // 多行注释
	private int STATE_LINE_COMMENT = 5; // 单行注释
	private int lineNumber; // 行号
	private boolean enableLineNumber = true; // 开启行号标志
	private CodeTemplete ct;

	private String endPrex(String temp) {
		return temp.substring(0, temp.indexOf(" ")).replaceFirst("<", "</")
				+ ">";
	}

	public String process(String src, ICodeDescribe iCodeDescribe) {
		int currentState = STATE_TEXT;
		int identifierLength = 0;
		int currentIndex = -1;
		char currentChar = 0;
		String identifier = "";
		StringBuffer out = new StringBuffer();
		String temp = "";
		while (++currentIndex != src.length() - 1) {
			currentChar = src.charAt(currentIndex);
			if (Character.isJavaIdentifierPart(currentChar)) {
				out.append(currentChar);
				++identifierLength;
				continue;
			}
			if (identifierLength > 0) {
				identifier = out.substring(out.length() - identifierLength);
				if (currentState == STATE_TEXT) {
					if (iCodeDescribe.literal().contains(identifier)) {
						temp = ct.getLiteralStyle();
						out.insert(out.length() - identifierLength, temp);
						out.append(endPrex(temp));
					} else if (iCodeDescribe.keyword().contains(identifier)) {
						temp = ct.getKeywordStyle();
						out.insert(out.length() - identifierLength, temp);
						out.append(endPrex(temp));
					} else if (iCodeDescribe.primitiveType().contains(
							identifier)) {
						temp = ct.getPrimitiveTypeStyle();
						out.insert(out.length() - identifierLength, temp);
						out.append(endPrex(temp));
					} else if (identifier.equals(identifier.toUpperCase())
							&& !Character.isDigit(identifier.charAt(0))) {
						temp = ct.getConstantStyle();
						out.insert(out.length() - identifierLength, temp);
						out.append(endPrex(temp));
					} else if (Character.isUpperCase(identifier.charAt(0))) {
						temp = ct.getNonPrimitiveTypeStyle();
						out.insert(out.length() - identifierLength, temp);
						out.append(endPrex(temp));
					}
				}
			}

			switch (currentChar) {

			case '<':
				out.append("&lt;");
				break;
			case '>':
				out.append("&gt;");
				break;
			case '&':
				out.append("&amp;");
				break;
			case '\"':
				out.append('\"');
				temp=ct.getDoubleQuoteStyle();
				if (currentState == STATE_TEXT) {
					currentState = STATE_DOUBLE_QUOTE;
					out.insert(out.length() - ("\"").length(),
							temp);
				} else if (currentState == STATE_DOUBLE_QUOTE) {
					currentState = STATE_TEXT;
					out.append(endPrex(temp));
				}
				break;
			case '\'':
				out.append("\'");
				temp=ct.getSingleLineCommentStyle();
				if (currentState == STATE_TEXT) {
					
					currentState = STATE_SINGLE_QUOTE;
					out.insert(out.length() - ("\'").length(),
							temp);
				} else if (currentState == STATE_SINGLE_QUOTE) {
					currentState = STATE_TEXT;
					out.append(endPrex(temp));
				}
				break;
			case '\\':
				out.append("\\");
				if (currentState == STATE_DOUBLE_QUOTE
						|| currentState == STATE_SINGLE_QUOTE) {
					// treat as a character escape sequence
					out.append(src.charAt(++currentIndex));
				}
				break;
			case '\t':
				for (int i = 0; i < 4; i++)
					out.append("&nbsp;&nbsp;&nbsp;&nbsp;");
				break;
			case '*':
				out.append('*');
				temp=ct.getMultiLineCommentStyle();
				if (currentState == STATE_TEXT && currentIndex > 0
						&& src.charAt(currentIndex - 1) == '/') {
					out.insert(out.length() - ("/*").length(),
							temp);
					currentState = STATE_MULTI_LINE_COMMENT;
				}
				break;
			case '/':
				out.append("/");
				temp=ct.getSingleLineCommentStyle();
				if (currentState == STATE_TEXT && currentIndex > 0
						&& src.charAt(currentIndex - 1) == '/') {
					out.insert(out.length() - ("//").length(),
							temp);
					currentState = STATE_LINE_COMMENT;
				} else if (currentState == STATE_MULTI_LINE_COMMENT) {
					out.append(endPrex(temp));
					currentState = STATE_TEXT;
				}
				break;
			case '\r':
			case '\n':
				if (currentState == STATE_LINE_COMMENT) {
					out.insert(out.length() - 1, endPrex(temp));
					currentState = STATE_TEXT;
				}
				if (currentChar == '\r' && currentIndex < src.length() - 1) {
					out.append("\r\n");
					++currentIndex;
				} else
					out.append('\n');

				if (enableLineNumber)
					temp=ct.getLineNumberStyle();
					out.append(temp
							+ (++lineNumber) + "."+endPrex(temp));
				break;
			case 0:
				if (currentState == STATE_LINE_COMMENT
						&& currentIndex == (src.length() - 1))
					out.append(endPrex(temp));
				break;
			default:
				out.append(currentChar);
			}
			identifierLength = 0;
		}
		return out.toString();
	}

}
