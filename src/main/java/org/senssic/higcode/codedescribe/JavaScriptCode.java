package org.senssic.higcode.codedescribe;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class JavaScriptCode implements ICodeDescribe {

	String[] literalArray = { "null", "true", "false" }; // 字面常量
	String[] keywordArray = { "break", "delete", "function", "return",
			"typeof", "case", "do", "if", "switch", "var", "catch", "else",
			"in", "this", "void", "continue", "instanceof", "throw", "while",
			"debugger", "finally", "new", "with", "default", "for", "try" }; // 关键词
	String[] primitiveTypeArray = { "undefined", "boolean", "number", "string",
			"object" }; // 原始数据类型
	String[] builtInObjectArray = { "Arguments", "Array", "Boolean", "Date",
			"Error", "Function", "Math", "Number", "Object", "RegExp", "String" };// 内置对象

	public Set<String> literal() {
		return new HashSet<String>(Arrays.asList(literalArray));
	}

	public Set<String> keyword() {
		return new HashSet<String>(Arrays.asList(keywordArray));
	}

	public Set<String> primitiveType() {
		return new HashSet<String>(Arrays.asList(primitiveTypeArray));
	}

	public Set<String> builtInObject() {
		return new HashSet<String>(Arrays.asList(builtInObjectArray));
	}

}
