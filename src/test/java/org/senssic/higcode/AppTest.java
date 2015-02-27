package org.senssic.higcode;

import java.io.File;
import java.io.FileInputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		try {

			IProcess iProcess = new SenCodeManager().getProcessByName("html");

			FileInputStream fStream = new FileInputStream(new File("d:\\1.txt"));
			byte[] by = new byte[1024];
			String strin = "";
			while (fStream.read(by) != -1) {
				strin += new String(by);

			}
			fStream.close();
			CodeTemplete cTemplete = new CodeTemplete();
			cTemplete.setConstantStyle("<div class=\"ConstantStyle\">");
			cTemplete.setDoubleQuoteStyle("<div class=\"DoubleQuoteStyle\">");
			cTemplete.setKeywordStyle("<div class=\"KeywordStyle\">");
			cTemplete.setLineNumberStyle("<div class=\"LineNumberStyle\">");
			cTemplete.setLiteralStyle("<div class=\"LiteralStyle\">");
			cTemplete
					.setMultiLineCommentStyle("<div class=\"MultiLineCommentStyle\">");
			cTemplete
					.setNonPrimitiveTypeStyle("<div class=\"NonPrimitiveTypeStyle\">");
			cTemplete
					.setPrimitiveTypeStyle("<div class=\"PrimitiveTypeStyle\">");
			cTemplete
					.setSingleLineCommentStyle("<div class=\"SingleLineCommentStyle\">");
			cTemplete.setSingleQuoteStyle("<div class=\"SingleQuoteStyle\">");
			cTemplete.setBuiltInObject("<div class=\"BuiltInObject\">");
			iProcess.setEnableEscaping(false);
			iProcess.setEnableLineNumber(false);
			System.out.println(iProcess.process(strin, cTemplete));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
