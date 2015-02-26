package org.senssic.higcode.process;

import org.senssic.higcode.CodeTemplete;
import org.senssic.higcode.IProcess;
import org.senssic.higcode.codedescribe.SqlCode;

public class SqlProcess implements IProcess {
	private SqlCode iCodeDescribe;

	public SqlProcess(SqlCode iCodeDescribe) {
		this.iCodeDescribe = iCodeDescribe;
	}

	public String process(String src, CodeTemplete ct) {
		// TODO Auto-generated method stub
		return null;
	}

}
