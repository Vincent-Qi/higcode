package org.senssic.higcode.codedescribe;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class JavaCode implements ICodeDescribe {
	String[] literalArray = { "null", "true", "false" }; // 字面常量
	String[] keywordArray = { "abstract", "break", "case", "catch", "class",
			"const", "continue", "default", "do", "else", "extends", "final",
			"finally", "for", "goto", "if", "implements", "import",
			"instanceof", "interface", "native", "new", "package", "private",
			"protected", "public", "return", "static", "strictfp", "super",
			"switch", "synchronized", "this", "throw", "throws", "transient",
			"try", "volatile", "while" }; // 关键词
	String[] primitiveTypeArray = { "boolean", "char", "byte", "short", "int",
			"long", "float", "double", "void" }; // 原始数据类型

	public Set<String> literal() {
		return new HashSet<String>(Arrays.asList(literalArray));
	}

	public Set<String> keyword() {
		return new HashSet<String>(Arrays.asList(keywordArray));
	}

	public Set<String> primitiveType() {
		return new HashSet<String>(Arrays.asList(primitiveTypeArray));
	}

}
