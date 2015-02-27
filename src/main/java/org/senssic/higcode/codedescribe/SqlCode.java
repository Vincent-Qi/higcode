package org.senssic.higcode.codedescribe;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SqlCode implements ICodeDescribe {

	String[] literalArray = { "ISNULL", "TURE", "FALSE" }; // 字面常量
	String[] keywordArray = { "SELECT", "INSERT", "DELETE", "UPDATE", "CREATE",
			"TABLE", "DROP", "ALTER", "CREATE", "VIEW", "DROP", "INDEX",
			"DROP", "PROCEDURE", "TRIGGER", "SCHEMA", "ALTER", "GRANT",
			"REVOKE", "COMMIT", "ROLLBACK", "SET", "TRANSACTION", "DECLARE",
			"OPEN", "FETCH", "CLOSE", "PREPARE", "EXECUTE", "IN", "ON", "INTO",
			"LEFT", "RIGHT", "JOIN", "UNION", "WHERE", "LIKE", "OR", "AND",
			"DISTINCT", "BETWEEN", "ORDER", "BY", "COUNT", "GROUP", "HAVING",
			"ALIAS", "MINUS" }; // 关键词
	String[] primitiveTypeArray = { "INT", "FLOAT", "CHAR", "SMALLINT",
			"NUMBER", "BIGINT", "NUMERIC", "DECIMAL ", "VARCHAR", "NVARCHAR2",
			"LONG", "NCHAR", "TEXT", "CLOB", "BLOB", "DATETIME", "DATE",
			"TIMESTAMP", "DATETIME" }; // 原始数据类型

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
