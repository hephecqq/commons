package com.commonUtils.test;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeanUtilsTest {
	
	static BeanUtils beanUtils = null;
	
	@BeforeClass
	public static void initBeanUtils(){
		System.out.println("loaded...BeanUtils");
		//System.out.println(beanUtils.getClass().getSimpleName()+" 被初始化了...");
	}
	
	/**
	 * 测试cloneBean(Object bean) 方法
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 * @throws InvocationTargetException
	 * @throws NoSuchMethodException
	 */
	@Test
	public void testCloneBean() throws IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException{
		Object p = (Person) BeanUtils.cloneBean(new Person("lisi",20));
		if(p instanceof Person || p.getClass() == Person.class){
			System.out.println(p.getClass().getName());
		}
	}
	/**
	 * 测试copyProperties(Object dest, Object orig) 方法
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 */
	@Test
	public void testCopyProperty() throws IllegalAccessException, InvocationTargetException{
		Person p1 = new Person();
		Person p2=new Person("lisi",20);
		BeanUtils.copyProperties(p1, p2);
		System.out.println(p1);
		
	}
	
	/**测试copyProperty(Object bean, String name, Object value) 方法
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 */
	@Test
	public void testCopyProperty2() throws IllegalAccessException, InvocationTargetException{
		Person p1 = new Person();
		BeanUtils.copyProperty(p1, "name", "zhangsan");
		System.out.println(p1);
		
	}
	
	/**
	 * 测试createCache方法
	 */
	@Test
	public void testCreateCache(){
		Map map=BeanUtils.createCache();
		System.out.println(map);
	}
	
	/**
	 * 测试describe方法
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 * @throws NoSuchMethodException
	 */
	@Test
	public void testdescribe() throws IllegalAccessException, InvocationTargetException, NoSuchMethodException{
		@SuppressWarnings("unchecked")
		Map<String,String> map=BeanUtils.describe(new Person("lisi",20));
		Iterator<Map.Entry<String, String>> it=map.entrySet().iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterClass
	public static void destroyBeanUtils(){
		beanUtils=null;
	}
	
	
}
