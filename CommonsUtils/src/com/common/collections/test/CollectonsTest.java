package com.common.collections.test;

import org.apache.commons.collections.Bag;
import org.apache.commons.collections.bag.TreeBag;
import org.junit.Test;

/**
 * 1.容器类：Collection,List,Map等
 * 2.操作类：Collections，Arrays等
 * 3.辅助类：Iterator，Comparator等
 * @author Administrator
 *
 */
public class CollectonsTest {

	/**
	 * 1.作为容器类的补充可以找到
	 * Bag,Buffer,BidiMap,OrderedMap等等
	 * 2.作为操作类的补充，可以找到CollectionUtils。
	 * IteratorUtils，ListUtils,SetUtils等等
	 * 3.作为辅助类可找到，MapIterator，Closure
	 * Predicate,Transformer等等
	 * 
	 * 
	 */
	
	/**
	 *需要在Collection中存放多个相同对象的拷贝，并且需要很方便的取得
	 *该对象拷贝的个数，Bag提供这样的功能
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
	 * 实现安装一定规则添加删除的序列，如FIFO
	 * 1、UnboundedFifoBuffer:提供先进先出的大小可变的队列
	 * 2、BoundedFifoBuffer:提供对其大小进行了限制，是固定代销的先进先出队列
	 * 3、BlockingBuffer：要在多线程的环境中才能体现价值
	 * 4、ProrityBuffer:提供比一般的先进先出Buffer更强的控制力,我们可以自定义Comparator
	 * 告诉他怎么判定它的成员先后顺序，优先级高的最先走
	 * 
	 */
	@Test
	public void testBuffer(){
		
	}
	
	/**
	 *可通过key找到value,可以通过value找到key,key和value都不能重复
	 */
	public void testBidiMap(){
		
	}
}
