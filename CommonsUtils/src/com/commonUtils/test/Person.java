package com.commonUtils.test;

public class Person {

	private String name;
	private int age;

	private static String sValue = "sValue";
	
	public static void sMethod(){
		System.out.println(sValue);
		System.out.println("sMethod...");
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}


	public Person(){}
}
