package com.common.lang.test;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * 测试的主要实用类： 1.ArrayUtils 2.BitField 3.BooleanUtils 4.CharEncoding 5.CharRange
 * 
 * 6.CharSet 7.CharSetUtils 8.CharUtils 9.ClassUtils 10.ObjectUtils
 * 
 * 11.RandomStringUtils 12.SerializationUtils 13.StringEscapeUtils
 * 
 * 14.StringUtils 15.SystemUtils 16.Validate 17.WordUtils
 * 
 * @author Administrator
 *
 */

/**
 * ArrayUtils用于对数组的操作,如添加,查找,删除,子数组,倒序，元素类型转换等
 * 给int[],String[]等基本类型或者基本包装类型的Array加上类似的Collection API提供的
 * add,remove,reverse,subarray,indexOf, lastIndexOf,isEmpty,close,把null认为是空数组
 */
@RunWith(JUnit4.class)
public class ArrayUtilsTest {

	/**
	 * 在数组的某个位置或者最后插入一个值，相当于对System.arraycopy做了一个封装，数组可以是null add(Object[]
	 * 1.array,int index,Object element)
	 * 2.add(Object[] array,Object element)
	 * 
	 */
	@Test
	public void testAdd() {
		int[] arr1 = new int[] { 10, 203, 40, 543, 4320, 432, 66 };
		int[] arr2 = ArrayUtils.add(arr1, 90);
		System.out.println("arr1: " + Arrays.toString(arr1));
		System.out.println("arr2: " + Arrays.toString(arr2));
	}
	/**
	 * 两个同类型数组叠加，相当于对System.copyarray做了一个封装(数组可以是null)
	 * addAll(Object[] array1,Object[] array2)
	 */
	@Test
	public void testAddAll(){
		int[] arr1 = new int[] { 10, 203, 40, 543, 4320, 432, 66 };
		int[] arr2 = ArrayUtils.add(arr1, 90);
		int[] arr3=ArrayUtils.addAll(arr1, arr2);
		System.out.println("arr3"+Arrays.toString(arr3));
	}
	/**
	 * 拷贝一个数组(数组可以是null类型)
	 * clone(Object[] array)
	 */
	@Test
	public void testClone(){
		int[] arr1 = new int[] { 10, 203, 40, 543, 4320, 432, 66 };
		System.out.println("clone: "+Arrays.toString(ArrayUtils.clone(arr1)));
	}
	
	/**
	 * 检查值是否在数组中,数组可以是null,值如果是null,这插数组内为null这一项
	 * contains(Object[] array,Object objectToFind)
	 */
	@Test
	public void testContains(){
		int[] arr1 = new int[] { 10, 203, 40, 543, 4320, 432, 66 };
		boolean isContains=ArrayUtils.contains(arr1,10);
		System.out.println(isContains);
	}
	/**
	 * 测试其他方法
	 * toString():
	 * indexOf()
	 * lastIndexOf()
	 * reverse()方法
	 * toMap()方法
	 * 
	 */
	@Test
	public void testOthers(){
		
	}
	
}
