package org.senssic.higcode.codedescribe;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PythonCode implements ICodeDescribe {

	String[] literalArray = { "False", "True", "None" }; // 字面常量
	String[] keywordArray = { "class", "finally", "is", "return", "continue",
			"for", "lambda", "try", "def", "from", "nonlocal", "while", "and",
			"del", "global", "not", "with", "as", "elif", "if", "or", "yield",
			"assert", "else", "import", "pass", "break", "except", "in",
			"raise" }; // 关键词
	String[] primitiveTypeArray = {}; // 原始数据类型

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
