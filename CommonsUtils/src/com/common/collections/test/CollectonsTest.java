package com.common.collections.test;

import org.apache.commons.collections.Bag;
import org.apache.commons.collections.bag.TreeBag;
import org.junit.Test;

/**
 * 1.�����ࣺCollection,List,Map��
 * 2.�����ࣺCollections��Arrays��
 * 3.�����ࣺIterator��Comparator��
 * @author Administrator
 *
 */
public class CollectonsTest {

	/**
	 * 1.��Ϊ������Ĳ�������ҵ�
	 * Bag,Buffer,BidiMap,OrderedMap�ȵ�
	 * 2.��Ϊ������Ĳ��䣬�����ҵ�CollectionUtils��
	 * IteratorUtils��ListUtils,SetUtils�ȵ�
	 * 3.��Ϊ��������ҵ���MapIterator��Closure
	 * Predicate,Transformer�ȵ�
	 * 
	 * 
	 */
	
	/**
	 *��Ҫ��Collection�д�Ŷ����ͬ����Ŀ�����������Ҫ�ܷ����ȡ��
	 *�ö��󿽱��ĸ�����Bag�ṩ�����Ĺ���
	 */
	@Test
	public void testBag(){
		Bag treeBag=new TreeBag();
		treeBag.add(11);
		treeBag.add(12);
		treeBag.add(12);
		System.out.println(treeBag.uniqueSet());
		
	}
	
	/**
	 * ʵ�ְ�װһ���������ɾ�������У���FIFO
	 * 1��UnboundedFifoBuffer:�ṩ�Ƚ��ȳ��Ĵ�С�ɱ�Ķ���
	 * 2��BoundedFifoBuffer:�ṩ�����С���������ƣ��ǹ̶��������Ƚ��ȳ�����
	 * 3��BlockingBuffer��Ҫ�ڶ��̵߳Ļ����в������ּ�ֵ
	 * 4��ProrityBuffer:�ṩ��һ����Ƚ��ȳ�Buffer��ǿ�Ŀ�����,���ǿ����Զ���Comparator
	 * ��������ô�ж����ĳ�Ա�Ⱥ�˳�����ȼ��ߵ�������
	 * 
	 */
	@Test
	public void testBuffer(){
		
	}
	
	/**
	 *��ͨ��key�ҵ�value,����ͨ��value�ҵ�key,key��value�������ظ�
	 */
	public void testBidiMap(){
		
	}
}
