package org.senssic.higcode.process;

import org.senssic.higcode.IProcess;

public abstract class AbstractProcess implements IProcess {
	private boolean enableLineNumber = true; // 开启行号标志
	private boolean enableEscaping = true;

	public boolean cheak(String string) {
		if (string == null || "".equals(string)) {
			return true;
		}
		return false;
	}

	public void setEnableLineNumber(boolean enableLineNumber) {
		this.enableLineNumber = enableLineNumber;
	}

	public boolean isEnableLineNumber() {
		return enableLineNumber;
	}

	public boolean isEnableEscaping() {
		return enableEscaping;
	}

	public void setEnableEscaping(boolean enableEscaping) {
		this.enableEscaping = enableEscaping;
	}

}
