package org.senssic.higcode.process;

import org.senssic.higcode.CodeTemplete;
import org.senssic.higcode.IProcess;
import org.senssic.higcode.codedescribe.PythonCode;

public class PythonProcess implements IProcess {
	private PythonCode iCodeDescribe;

	public PythonProcess(PythonCode iCodeDescribe) {
		this.iCodeDescribe = iCodeDescribe;
	}
	public String process(String src,
			CodeTemplete ct) {
		// TODO Auto-generated method stub
		return null;
	}

}
