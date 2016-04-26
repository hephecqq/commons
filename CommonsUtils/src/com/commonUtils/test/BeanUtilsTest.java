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
		//System.out.println(beanUtils.getClass().getSimpleName()+" ����ʼ����...");
	}
	
	/**
	 * ����cloneBean(Object bean) ����
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
	 * ����copyProperties(Object dest, Object orig) ����
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
	
	/**����copyProperty(Object bean, String name, Object value) ����
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
	 * ����createCache����
	 */
	@Test
	public void testCreateCache(){
		Map map=BeanUtils.createCache();
		System.out.println(map);
	}
	
	/**
	 * ����describe����
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
