package com.common.lang.test;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * ���Ե���Ҫʵ���ࣺ 1.ArrayUtils 2.BitField 3.BooleanUtils 4.CharEncoding 5.CharRange
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
 * ArrayUtils���ڶ�����Ĳ���,�����,����,ɾ��,������,����Ԫ������ת����
 * ��int[],String[]�Ȼ������ͻ��߻�����װ���͵�Array�������Ƶ�Collection API�ṩ��
 * add,remove,reverse,subarray,indexOf, lastIndexOf,isEmpty,close,��null��Ϊ�ǿ�����
 */
@RunWith(JUnit4.class)
public class ArrayUtilsTest {

	/**
	 * �������ĳ��λ�û���������һ��ֵ���൱�ڶ�System.arraycopy����һ����װ�����������null add(Object[]
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
	 * ����ͬ����������ӣ��൱�ڶ�System.copyarray����һ����װ(���������null)
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
	 * ����һ������(���������null����)
	 * clone(Object[] array)
	 */
	@Test
	public void testClone(){
		int[] arr1 = new int[] { 10, 203, 40, 543, 4320, 432, 66 };
		System.out.println("clone: "+Arrays.toString(ArrayUtils.clone(arr1)));
	}
	
	/**
	 * ���ֵ�Ƿ���������,���������null,ֵ�����null,���������Ϊnull��һ��
	 * contains(Object[] array,Object objectToFind)
	 */
	@Test
	public void testContains(){
		int[] arr1 = new int[] { 10, 203, 40, 543, 4320, 432, 66 };
		boolean isContains=ArrayUtils.contains(arr1,10);
		System.out.println(isContains);
	}
	/**
	 * ������������
	 * toString():
	 * indexOf()
	 * lastIndexOf()
	 * reverse()����
	 * toMap()����
	 * 
	 */
	@Test
	public void testOthers(){
		
	}
	
}
