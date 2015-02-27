package org.senssic.higcode;

import java.util.Arrays;

import org.senssic.higcode.codedescribe.HtmlXmlCode;
import org.senssic.higcode.codedescribe.JavaCode;
import org.senssic.higcode.codedescribe.JavaScriptCode;
import org.senssic.higcode.codedescribe.PythonCode;
import org.senssic.higcode.codedescribe.SqlCode;
import org.senssic.higcode.process.HtmlXmlProcess;
import org.senssic.higcode.process.JavaProcess;
import org.senssic.higcode.process.JavaScriptProcess;
import org.senssic.higcode.process.PythonProcess;
import org.senssic.higcode.process.SqlProcess;

public class SenCodeManager {
	private String lanagues[] = { "java", "javascript", "sql", "python",
			"html","xml" };

	public IProcess getProcessByName(String language) {
		if (language == null)
			throw new NullPointerException();
		if (Arrays.asList(lanagues).contains(language)) {

			if (language.equals("javascript")) {
				return new JavaScriptProcess(new JavaScriptCode());
			}
			if (language.equals("sql")) {
				return new SqlProcess(new SqlCode());
			}
			if (language.equals("python")) {
				return new PythonProcess(new PythonCode());
			}
			if (language.equals("html") || language.equals("xml")) {
				return new HtmlXmlProcess(new HtmlXmlCode());
			}
		}
		return new JavaProcess(new JavaCode());

	}
}
