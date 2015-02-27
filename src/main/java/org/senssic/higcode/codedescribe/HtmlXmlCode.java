package org.senssic.higcode.codedescribe;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HtmlXmlCode implements ICodeDescribe {

	String[] literalArray = {}; // 字面常量
	String[] keywordArray = { "DOCTYPE", "a", "abbr", "acronym", "address",
			"applet", "area", "article", "aside", "audio", "b", "base",
			"basefont", "bdi", "bdo", "big", "blockquote", "body", "br",
			"button", "canvas", "caption", "center", "cite", "code", "col",
			"colgroup", "command", "datalist", "dd", "del", "details", "dir",
			"div", "dfn", "dialog", "dl", "dt", "em", "embed", "fieldset",
			"figcaption", "figure", "font", "footer", "form", "frame",
			"frameset", "h1", "h6", "head", "header", "hr", "html", "i",
			"iframe", "img", "input", "ins", "isindex", "kbd", "keygen",
			"label", "legend", "li", "link", "map", "mark", "menu", "menuitem",
			"meta", "meter", "nav", "noframes", "noscript", "object", "ol",
			"optgroup", "option", "output", "p", "param", "pre", "progress",
			"q", "rp", "rt", "ruby", "s", "samp", "script", "section",
			"select", "small", "source", "span", "strike", "strong", "style",
			"sub", "summary", "sup", "table", "tbody", "td", "textarea",
			"tfoot", "th", "thead", "time", "title", "tr", "track", "tt", "u",
			"ul", "var", "video", "wbr", "xmp" }; // 关键词
	String[] primitiveTypeArray = {}; // 原始数据类型

	public Set<String> literal() {
		return new HashSet<String>(Arrays.asList(literalArray));
	}

	public Set<String> keyword() {
		return new HashSet<String>(Arrays.asList(keywordArray));
	}

	public Set<String> primitiveType() {
		return new HashSet<String>(Arrays.asList(primitiveTypeArray));
	}

}
