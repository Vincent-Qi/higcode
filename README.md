Welcome to higcode!
===================


Hey!Welcome to my site. Through the use of higcode you can make your code more beautiful and colorful.You can <i class="icon-cog"></i> **customize** the code style not only but also on their own terms formatting code (future versions will increase), have a good time.

----------


Documents
-------------
You can choose their own needs to change the code.At present mainly provide are **java,javascript,sql,xml,html,python**,We also provide in the future with **C#,C/C++/Objectiv-C,CSS,Delphi,Perl,...**


> **Note:**

> - java,javascript,sql,xml,html,python Be allowed
> - C#,C/C++/Objectiv-C,CSS,Delphi,Perl,... will be provide in the future.
> - format code function Has not been implemented but it will be created soon .

#####The source code#####
*class AppTest {*
we use **higcode** to make it gorgeous

    IProcess iProcess=new SenCodeManager().getProcessByName("java");
    CodeTemplete cTemplete=new CodeTemplete();
    cTemplete.setKeywordStyle("<div class=\"KeywordStyle\">");
    System.out.println(iProcess.process(string,cTemplete));
and then we will see the change of the source code

    <div class="KeywordStyle">class</div>  TestCase {


> The programming steps

 1. we use **SenCodeManager** class get the type of the programming language
 2. set the code template of the code
 3. use the interface **IProcess** to change the source code

