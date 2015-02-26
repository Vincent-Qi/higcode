
<h1>描述：</h1>
致力于将所有代码高亮
<h1>用法：</h1>
<h2>输入文本：</h2>
<code>
package org.senssic.higcode;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.senssic.higcode.codedescribe.JavaCode;
import org.senssic.higcode.process.IProcess;
import org.senssic.higcode.process.JavaProcess;

import java.util.Scanner;


/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
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
        IProcess iProcess = new JavaProcess();
        Scanner scanner = new Scanner("");
        iProcess.process("", new JavaCode());
    }
}

</code><br/>
<code>
 IProcess iProcess=new SenCodeManager().getProcessByName("java");//支持java,javascript,未来支持xml,html,python,sql...
          //设置模版
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
        //转换string为输入文本
          System.out.println(iProcess.process(string,cTemplete));
</code><br/>
<h2>输出高亮文本：</h2>
<code>
<div class="LineNumberStyle">1.</div><div class="KeywordStyle">package</div> org.senssic.higcode;
<div class="LineNumberStyle">2.</div>
<div class="LineNumberStyle">3.</div><div class="KeywordStyle">import</div> junit.framework.<div class="NonPrimitiveTypeStyle">Test</div>;
<div class="LineNumberStyle">4.</div><div class="KeywordStyle">import</div> junit.framework.<div class="NonPrimitiveTypeStyle">TestCase</div>;
<div class="LineNumberStyle">5.</div><div class="KeywordStyle">import</div> junit.framework.<div class="NonPrimitiveTypeStyle">TestSuite</div>;
<div class="LineNumberStyle">6.</div>
<div class="LineNumberStyle">7.</div><div class="KeywordStyle">import</div> org.senssic.higcode.codedescribe.<div class="NonPrimitiveTypeStyle">JavaCode</div>;
<div class="LineNumberStyle">8.</div><div class="KeywordStyle">import</div> org.senssic.higcode.process.<div class="NonPrimitiveTypeStyle">IProcess</div>;
<div class="LineNumberStyle">9.</div><div class="KeywordStyle">import</div> org.senssic.higcode.process.<div class="NonPrimitiveTypeStyle">JavaProcess</div>;
<div class="LineNumberStyle">10.</div>
<div class="LineNumberStyle">11.</div><div class="KeywordStyle">import</div> java.util.<div class="NonPrimitiveTypeStyle">Scanner</div>;
<div class="LineNumberStyle">12.</div>
<div class="LineNumberStyle">13.</div>
<div class="LineNumberStyle">14.</div><div class="MultiLineCommentStyle">/**
<div class="LineNumberStyle">15.</div> * Unit test for simple App.
<div class="LineNumberStyle">16.</div> */</div>
<div class="LineNumberStyle">17.</div><div class="KeywordStyle">public</div> <div class="KeywordStyle">class</div> <div class="NonPrimitiveTypeStyle">AppTest</div> <div class="KeywordStyle">extends</div> <div class="NonPrimitiveTypeStyle">TestCase</div> {
<div class="LineNumberStyle">18.</div>    <div class="MultiLineCommentStyle">/**
<div class="LineNumberStyle">19.</div>     * Create the test case
<div class="LineNumberStyle">20.</div>     *
<div class="LineNumberStyle">21.</div>     * @param testName name of the test case
<div class="LineNumberStyle">22.</div>     */</div>
<div class="LineNumberStyle">23.</div>    <div class="KeywordStyle">public</div> <div class="NonPrimitiveTypeStyle">AppTest</div>(<div class="NonPrimitiveTypeStyle">String</div> testName) {
<div class="LineNumberStyle">24.</div>        <div class="KeywordStyle">super</div>(testName);
<div class="LineNumberStyle">25.</div>    }
<div class="LineNumberStyle">26.</div>
<div class="LineNumberStyle">27.</div>    <div class="MultiLineCommentStyle">/**
<div class="LineNumberStyle">28.</div>     * @return the suite of tests being tested
<div class="LineNumberStyle">29.</div>     */</div>
<div class="LineNumberStyle">30.</div>    <div class="KeywordStyle">public</div> <div class="KeywordStyle">static</div> <div class="NonPrimitiveTypeStyle">Test</div> suite() {
<div class="LineNumberStyle">31.</div>        <div class="KeywordStyle">return</div> <div class="KeywordStyle">new</div> <div class="NonPrimitiveTypeStyle">TestSuite</div>(<div class="NonPrimitiveTypeStyle">AppTest</div>.<div class="KeywordStyle">class</div>);
<div class="LineNumberStyle">32.</div>    }
<div class="LineNumberStyle">33.</div>
<div class="LineNumberStyle">34.</div>    <div class="MultiLineCommentStyle">/**
<div class="LineNumberStyle">35.</div>     * Rigourous Test :-)
<div class="LineNumberStyle">36.</div>     */</div>
<div class="LineNumberStyle">37.</div>    <div class="KeywordStyle">public</div> <div class="PrimitiveTypeStyle">void</div> testApp() {
<div class="LineNumberStyle">38.</div>        <div class="NonPrimitiveTypeStyle">IProcess</div> iProcess = <div class="KeywordStyle">new</div> <div class="NonPrimitiveTypeStyle">JavaProcess</div>();
<div class="LineNumberStyle">39.</div>        <div class="NonPrimitiveTypeStyle">Scanner</div> scanner = <div class="KeywordStyle">new</div> <div class="NonPrimitiveTypeStyle">Scanner</div>(<div class="DoubleQuoteStyle">""</div>);
<div class="LineNumberStyle">40.</div>        iProcess.process(<div class="DoubleQuoteStyle">""</div>, <div class="KeywordStyle">new</div> <div class="NonPrimitiveTypeStyle">JavaCode</div>());
<div class="LineNumberStyle">41.</div>    }
<div class="LineNumberStyle">42.</div>}

</code><br/>