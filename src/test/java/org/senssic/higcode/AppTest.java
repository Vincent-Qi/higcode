package org.senssic.higcode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        IProcess iProcess=new SenCodeManager().getProcessByName("java");
        Scanner scanner=null;
		try {
			scanner = new Scanner(new File("d:\\1.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        scanner.useDelimiter("\n");
        String string="";
        while (scanner.hasNext()) {
			string+=scanner.next();
			
		}
        scanner.close();
        CodeTemplete cTemplete=new CodeTemplete();
        cTemplete.setConstantStyle("<div class=\"ConstantStyle\">");
        cTemplete.setDoubleQuoteStyle("<div class=\"DoubleQuoteStyle\">");
        cTemplete.setKeywordStyle("<div class=\"KeywordStyle\">");
        cTemplete.setLineNumberStyle("<div class=\"LineNumberStyle\">");
        cTemplete.setLiteralStyle("<div class=\"LiteralStyle\">");
        cTemplete.setMultiLineCommentStyle("<div class=\"MultiLineCommentStyle\">");
        cTemplete.setNonPrimitiveTypeStyle("<div class=\"NonPrimitiveTypeStyle\">");
        cTemplete.setPrimitiveTypeStyle("<div class=\"PrimitiveTypeStyle\">");
        cTemplete.setSingleLineCommentStyle("<div class=\"SingleLineCommentStyle\">");
        cTemplete.setSingleQuoteStyle("<div class=\"SingleQuoteStyle\">");
        cTemplete.setBuiltInObject("<div class=\"BuiltInObject\">");
        
        System.out.println(iProcess.process(string,cTemplete));
    }
}
