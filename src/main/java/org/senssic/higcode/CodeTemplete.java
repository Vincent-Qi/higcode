package org.senssic.higcode;

public class CodeTemplete {
	// 通用
	private String literalStyle;// 字面常量[null,true,false]
	private String keywordStyle;// 关键词[super,import...]
	private String primitiveTypeStyle;// 原始数据类型[int,boolean...]
	private String constantStyle;// 常量[即大写,private String STRING_IMG="..."]
	private String nonPrimitiveTypeStyle;// 非原始数据类型[String,类等]
	private String doubleQuoteStyle;// 双引号内容
	private String singleQuoteStyle;// 单引号内容
	private String multiLineCommentStyle;// 多行注释
	private String singleLineCommentStyle;// 单行注释
	private String lineNumberStyle;// 行号
	// javascript
	private String builtInObject;// 内置对象[Date,Array]

	public String getBuiltInObject() {
		return builtInObject;
	}

	public void setBuiltInObject(String builtInObject) {
		this.builtInObject = builtInObject;
	}

	public String getLiteralStyle() {
		return literalStyle;
	}

	public void setLiteralStyle(String literalStyle) {
		this.literalStyle = literalStyle;
	}

	public String getKeywordStyle() {
		return keywordStyle;
	}

	public void setKeywordStyle(String keywordStyle) {
		this.keywordStyle = keywordStyle;
	}

	public String getPrimitiveTypeStyle() {
		return primitiveTypeStyle;
	}

	public void setPrimitiveTypeStyle(String primitiveTypeStyle) {
		this.primitiveTypeStyle = primitiveTypeStyle;
	}

	public String getConstantStyle() {
		return constantStyle;
	}

	public void setConstantStyle(String constantStyle) {
		this.constantStyle = constantStyle;
	}

	public String getNonPrimitiveTypeStyle() {
		return nonPrimitiveTypeStyle;
	}

	public void setNonPrimitiveTypeStyle(String nonPrimitiveTypeStyle) {
		this.nonPrimitiveTypeStyle = nonPrimitiveTypeStyle;
	}

	public String getDoubleQuoteStyle() {
		return doubleQuoteStyle;
	}

	public void setDoubleQuoteStyle(String doubleQuoteStyle) {
		this.doubleQuoteStyle = doubleQuoteStyle;
	}

	public String getSingleQuoteStyle() {
		return singleQuoteStyle;
	}

	public void setSingleQuoteStyle(String singleQuoteStyle) {
		this.singleQuoteStyle = singleQuoteStyle;
	}

	public String getMultiLineCommentStyle() {
		return multiLineCommentStyle;
	}

	public void setMultiLineCommentStyle(String multiLineCommentStyle) {
		this.multiLineCommentStyle = multiLineCommentStyle;
	}

	public String getSingleLineCommentStyle() {
		return singleLineCommentStyle;
	}

	public void setSingleLineCommentStyle(String singleLineCommentStyle) {
		this.singleLineCommentStyle = singleLineCommentStyle;
	}

	public String getLineNumberStyle() {
		return lineNumberStyle;
	}

	public void setLineNumberStyle(String lineNumberStyle) {
		this.lineNumberStyle = lineNumberStyle;
	}

}
