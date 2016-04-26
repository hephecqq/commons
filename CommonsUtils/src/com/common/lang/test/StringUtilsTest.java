package com.common.lang.test;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class StringUtilsTest {

	/**
	 * StringUtils����м򵥶�ǿ��Ĵ�������,�Ӽ��մ�(��null���������ܵ���) ���ָ��Ӵ�,�����ɸ�ʽ�����ַ���,�ܼ��
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
		 * BitField:�ṩc�г�������λ����
		 * 
		 */

		/**
		 * BooleanUtils ��boolean����һЩ����
		 */

		/**
		 * CharRange �������ַ����������󣬱����ж�H�Ƿ���A��W֮��,����A-F֮��������ַ���
		 * 
		 */

		/**
		 * CharUtils �ж�char�Ĵ�Сд���Ƿ������֣��Ƿ�ɴ�ӡ��ת��Ϊunicode���ַ���
		 * 
		 */

		/**
		 * ClassUtils ������Class��ClassName֮��ת��,��õ�Class��Interfaces
		 * ��supercass,packageName������
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
	 * RandomStringUtils ���ɹ̶�����\���͵�����ַ���
	 */
	@Test
	public void testRandomStringUtils() {
		System.out.println(RandomStringUtils.random(100, "agaga"));

	}

	/**
	 * SerializationUtils ͨ����Ż�����ȫ����һ�����Ӷ����Լ�����һЩ��ǿ 1.clone() 2.deserialize����
	 * 3.serialize()
	 */

	/**
	 * StringEscapeUtils �ַ���ת�幤�ߣ�֧��Java��javascript��XML,SQL esacpeHtml(String
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
	 * ���JavaHome,Version,userDir,userHome�ȵ�
	 */
	
	/**
	 * Validate
	 * ���ڼ�if�ж�������������ʱ���׳�IllegalArgumentException
	 */
	
	/**
	 * WordUtils:
	 * ��Ӣ�ĵ��ʵĴ����������ִ�д����ת�ȒO
	 */
	
}
