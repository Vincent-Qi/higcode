
<h1>描述：</h1>
致力于将所有代码高亮
<h1>用法：</h1>
<h2>输入文本：</h2>
<code>
package org.senssic.higcode;<br/>
import junit.framework.Test;<br/>
import junit.framework.TestCase;<br/>
import junit.framework.TestSuite;<br/>

import org.senssic.higcode.codedescribe.JavaCode;<br/>
import org.senssic.higcode.process.IProcess;<br/>
import org.senssic.higcode.process.JavaProcess;<br/>

import java.util.Scanner;<br/>


/**<br/>
 * Unit test for simple App.<br/>
 */<br/>
public class AppTest extends TestCase {<br/>
    /**<br/>
     * Create the test case<br/>
     *<br/>
     * @param testName name of the test case<br/>
     */<br/>
    public AppTest(String testName) {<br/>
        super(testName);<br/>
    }<br/>

    /**<br/>
     * @return the suite of tests being tested<br/>
     */<br/>
    public static Test suite() {<br/>
        return new TestSuite(AppTest.class);<br/>
    }<br/>

    /**<br/>
     * Rigourous Test :-)<br/>
     */<br/>
    public void testApp() {<br/>
        IProcess iProcess = new JavaProcess();<br/>
        Scanner scanner = new Scanner("");<br/>
        iProcess.process("", new JavaCode());<br/>
    }<br/>
}<br/>

</code><br/>
<code>
 IProcess iProcess=new SenCodeManager().getProcessByName("java");//支持java,javascript,未来支持xml,html,python,sql...<br/>
          //设置模版<br/>
        CodeTemplete cTemplete=new CodeTemplete();<br/>
        cTemplete.setConstantStyle("<div class=\"ConstantStyle\">");<br/>
        cTemplete.setDoubleQuoteStyle("<div class=\"DoubleQuoteStyle\">");<br/>
        cTemplete.setKeywordStyle("<div class=\"KeywordStyle\">");<br/>
        cTemplete.setLineNumberStyle("<div class=\"LineNumberStyle\">");<br/>
        cTemplete.setLiteralStyle("<div class=\"LiteralStyle\">");<br/>
        cTemplete.setMultiLineCommentStyle("<div class=\"MultiLineCommentStyle\">");<br/>
        cTemplete.setNonPrimitiveTypeStyle("<div class=\"NonPrimitiveTypeStyle\">");<br/>
        cTemplete.setPrimitiveTypeStyle("<div class=\"PrimitiveTypeStyle\">");<br/>
        cTemplete.setSingleLineCommentStyle("<div class=\"SingleLineCommentStyle\">");<br/>
        cTemplete.setSingleQuoteStyle("<div class=\"SingleQuoteStyle\">");<br/>
        cTemplete.setBuiltInObject("<div class=\"BuiltInObject\">");<br/>
        //转换string为输入文本<br/>
          System.out.println(iProcess.process(string,cTemplete));<br/>
</code><br/>
<h2>输出高亮文本：</h2>
<code>
<div class="LineNumberStyle">1.</div><div class="KeywordStyle">package</div> org.senssic.higcode;<br/>
<div class="LineNumberStyle">2.</div><br/>
<div class="LineNumberStyle">3.</div><div class="KeywordStyle">import</div> junit.framework.<div class="NonPrimitiveTypeStyle">Test</div>;<br/>
<div class="LineNumberStyle">4.</div><div class="KeywordStyle">import</div> junit.framework.<div class="NonPrimitiveTypeStyle">TestCase</div>;<br/>
<div class="LineNumberStyle">5.</div><div class="KeywordStyle">import</div> junit.framework.<div class="NonPrimitiveTypeStyle">TestSuite</div>;<br/>
<div class="LineNumberStyle">6.</div><br/>
<div class="LineNumberStyle">7.</div><div class="KeywordStyle">import</div> org.senssic.higcode.codedescribe.<div class="NonPrimitiveTypeStyle">JavaCode</div>;<br/>
<div class="LineNumberStyle">8.</div><div class="KeywordStyle">import</div> org.senssic.higcode.process.<div class="NonPrimitiveTypeStyle">IProcess</div>;<br/>
<div class="LineNumberStyle">9.</div><div class="KeywordStyle">import</div> org.senssic.higcode.process.<div class="NonPrimitiveTypeStyle">JavaProcess</div>;<br/>
<div class="LineNumberStyle">10.</div><br/>
<div class="LineNumberStyle">11.</div><div class="KeywordStyle">import</div> java.util.<div class="NonPrimitiveTypeStyle">Scanner</div>;<br/>
<div class="LineNumberStyle">12.</div><br/>
<div class="LineNumberStyle">13.</div><br/>
<div class="LineNumberStyle">14.</div><div class="MultiLineCommentStyle">/**<br/>
<div class="LineNumberStyle">15.</div> * Unit test for simple App.<br/>
<div class="LineNumberStyle">16.</div> */</div><br/>
<div class="LineNumberStyle">17.</div><div class="KeywordStyle">public</div> <div class="KeywordStyle">class</div> <div class="NonPrimitiveTypeStyle">AppTest</div> <div class="KeywordStyle">extends</div> <div class="NonPrimitiveTypeStyle">TestCase</div> {<br/>
<div class="LineNumberStyle">18.</div>    <div class="MultiLineCommentStyle">/**<br/>
<div class="LineNumberStyle">19.</div>     * Create the test case<br/>
<div class="LineNumberStyle">20.</div>     *<br/>
<div class="LineNumberStyle">21.</div>     * @param testName name of the test case<br/>
<div class="LineNumberStyle">22.</div>     */</div><br/>
<div class="LineNumberStyle">23.</div>    <div class="KeywordStyle">public</div> <div class="NonPrimitiveTypeStyle">AppTest</div>(<div class="NonPrimitiveTypeStyle">String</div> testName) {<br/>
<div class="LineNumberStyle">24.</div>        <div class="KeywordStyle">super</div>(testName);<br/>
<div class="LineNumberStyle">25.</div>    }<br/>
<div class="LineNumberStyle">26.</div><br/>
<div class="LineNumberStyle">27.</div>    <div class="MultiLineCommentStyle">/**<br/>
<div class="LineNumberStyle">28.</div>     * @return the suite of tests being tested<br/>
<div class="LineNumberStyle">29.</div>     */</div><br/>
<div class="LineNumberStyle">30.</div>    <div class="KeywordStyle">public</div> <div class="KeywordStyle">static</div> <div class="NonPrimitiveTypeStyle">Test</div> suite() {
<div class="LineNumberStyle">31.</div>        <div class="KeywordStyle">return</div> <div class="KeywordStyle">new</div> <div class="NonPrimitiveTypeStyle">TestSuite</div>(<div class="NonPrimitiveTypeStyle">AppTest</div>.<div class="KeywordStyle">class</div>);<br/>
<div class="LineNumberStyle">32.</div>    }<br/>
<div class="LineNumberStyle">33.</div><br/>
<div class="LineNumberStyle">34.</div>    <div class="MultiLineCommentStyle">/**<br/>
<div class="LineNumberStyle">35.</div>     * Rigourous Test :-)<br/>
<div class="LineNumberStyle">36.</div>     */</div><br/>
<div class="LineNumberStyle">37.</div>    <div class="KeywordStyle">public</div> <div class="PrimitiveTypeStyle">void</div> testApp() {<br/>
<div class="LineNumberStyle">38.</div>        <div class="NonPrimitiveTypeStyle">IProcess</div> iProcess = <div class="KeywordStyle">new</div> <div class="NonPrimitiveTypeStyle">JavaProcess</div>();<br/>
<div class="LineNumberStyle">39.</div>        <div class="NonPrimitiveTypeStyle">Scanner</div> scanner = <div class="KeywordStyle">new</div> <div class="NonPrimitiveTypeStyle">Scanner</div>(<div class="DoubleQuoteStyle">""</div>);<br/>
<div class="LineNumberStyle">40.</div>        iProcess.process(<div class="DoubleQuoteStyle">""</div>, <div class="KeywordStyle">new</div> <div class="NonPrimitiveTypeStyle">JavaCode</div>());<br/>
<div class="LineNumberStyle">41.</div>    }<br/>
<div class="LineNumberStyle">42.</div>}<br/>

</code><br/>