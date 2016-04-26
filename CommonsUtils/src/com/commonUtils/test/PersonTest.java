package com.commonUtils.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PersonTest {

	@Before
	public void before() {
		System.out.println("before");
	}

	@After
	public void after() {
		System.out.println("after");
	}

	@BeforeClass
	public static void beforeClass() {
		System.out.println("BeforeClass");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("AfterClass");
	}

	@Test
	public void testFun1() {
		Person p = new Person("xiazdong", 20);
		//Assert.assertEquals("xiazdong", p.getName());
		//Assert.assertEquals(20, p.getAge());
	}

	@Test
	public void testFun2() {
		Person p = new Person("xiazdong", 20);
		//Assert.assertEquals("xiazdong", p.getName());
		//Assert.assertEquals(20, p.getAge());
	}

}
