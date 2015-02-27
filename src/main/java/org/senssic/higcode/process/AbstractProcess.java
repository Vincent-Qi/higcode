package org.senssic.higcode.process;

import org.senssic.higcode.IProcess;

public abstract class AbstractProcess implements IProcess {

	public boolean cheak(String string) {
		if (string == null || "".equals(string)) {
			return false;
		}
		return true;
	}

}
