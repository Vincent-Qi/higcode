package org.senssic.higcode;

public interface IProcess {
	public String process(String src, CodeTemplete ct);

	public void setEnableLineNumber(boolean enableLineNumber);

	public void setEnableEscaping(boolean EnableEscaping);
}
