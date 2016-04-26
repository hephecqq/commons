package com.common.lang.test;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class StringUtilsTest {

	/**
	 * StringUtils类具有简单而强大的处理能力,从检查空串(对null的情况处理很得体) 到分割子串,到生成格式化的字符串,很简洁
	 */
	@Test
	public void test() {
		// data setup
		String str = "";
		String str1 = " ";
		String str2 = " ";
		String str3 = "\t";

		String str4 = null;
		String str5 = "123";
		String str6 = "ABCDEFG";
		String str7 = "It feels goods to use Commons";

		// check for empty strings
		/**
		 * 1.isEmpty()/isBank() checks if a Sring contains text 2.Trim()/Strip()
		 * remove leading and trailing whitespace 3.Equals() compares two
		 * strings null-safe IndexOf()/LastIndexOf()/Contains null-safe index-of
		 * checks IndexOfAny/LastIndexOfAny/ IndexOfBut/LastIndexOfAnyBut()
		 * 4.ContainsOnly()/ContainsNone 5.Substring()/Left/Right/Mid
		 * 6.SubstringBefore/SubstringAfter SubstringBetween 7.Split/Join
		 * 8.Remove/Delete 9.Replace/Overlay 10.Chomp/Chop
		 * 11.LeftPad/RightPad/Center/Repeat 12.UpperCase/LowerCase/SwapCase/
		 * Capitailize/Uncapitalize 13.CountMatches
		 * 14.isAlpha/IsNumeric/IsWhitespace IsAsciiPrintable check the
		 * characters in a String 15.DefaultString() protects againts a null
		 * input String
		 * 
		 * 
		 * 
		 */
		System.out.println("=============");
		System.out.println("Is str blank? " + StringUtils.isBlank(str));
		System.out.println("Is str blank? " + StringUtils.isBlank(str2));
		System.out.println("Is str blank? " + StringUtils.isBlank(str3));
		System.out.println("Is str blank? " + StringUtils.isBlank(str4));

		// check for numerics
		System.out.println("===================");
		System.out.println("Is str5 numerics ?" + StringUtils.isNumeric(str5));
		System.out.println("Is str6 numerics ?" + StringUtils.isNumeric(str6));

		// check string /whole words
		System.out.println("=====================");
		System.out.println("str6:" + str6);
		System.out.println("str6 reversed:" + StringUtils.reverse(str6));
		System.out.println("str7:" + str7);
		String str8 = StringUtils.chomp(str7);
		str8 = StringUtils.reverseDelimited(str8, ' ');
		System.out.println("str7 reversed whole words:\r\n" + str8);

		// build header (useful to print log message that are easy to locate)
		System.out.println("=====================");
		System.out.println("print header");
		String padding = StringUtils.repeat("=", 50);
		System.out.println("padding is: " + padding);
		String msg = StringUtils.center("Customised Header", 50, "%");
		Object[] raw = new Object[] { padding, msg, padding };
		String header = StringUtils.join(raw, "\r\n");
		System.out.println("header:" + header);

		/**
		 * BitField:提供c中常见的置位操作
		 * 
		 */

		/**
		 * BooleanUtils 给boolean附加一些功能
		 */

		/**
		 * CharRange 连续的字符串容器对象，比如判定H是否在A和W之间,生成A-F之间的连续字符串
		 * 
		 */

		/**
		 * CharUtils 判定char的大小写，是否是数字，是否可打印，转换为unicode的字符串
		 * 
		 */

		/**
		 * ClassUtils 用于在Class和ClassName之间转换,获得的Class的Interfaces
		 * 和supercass,packageName，短名
		 * 
		 * 1.getAllInterfaces 2.getAllSuperClasses 3.getPackageName
		 * 4.getShortClassName 5.isAssignable 6.isInnerClass
		 * 7.primtivesToWrappers
		 * 
		 */

		/**
		 * ObjectUtils 1.defaultIfNull() 2.equals() 3.hashCode() 4.toString()
		 * 
		 */

	}

	/**
	 * RandomStringUtils 生成固定长度\类型的随机字符串
	 */
	@Test
	public void testRandomStringUtils() {
		System.out.println(RandomStringUtils.random(100, "agaga"));

	}

	/**
	 * SerializationUtils 通过序号话来完全拷贝一个复杂对象，以及其他一些增强 1.clone() 2.deserialize（）
	 * 3.serialize()
	 */

	/**
	 * StringEscapeUtils 字符串转义工具，支持Java，javascript，XML,SQL esacpeHtml(String
	 * str) escapeJava(String str) escapeJavaScript(String str) escapeSql(String
	 * str) escapeXml(String str)
	 * 
	 */
	public void testStringEscapeUtils(){
		String str="<html><head></head><body>haha</body></html>";
		String test=StringEscapeUtils.escapeHtml3(str);
		System.out.println(test);
	}
	/**
	 * SystemUtils:
	 * 获得JavaHome,Version,userDir,userHome等等
	 */
	
	/**
	 * Validate
	 * 用于简化if判定当不满足条件时，抛出IllegalArgumentException
	 */
	
	/**
	 * WordUtils:
	 * 对英文单词的处理，包括首字大写，反转等扥
	 */
	
}
