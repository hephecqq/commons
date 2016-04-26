package com.dbs.test;

public interface Strategy {

	//判断两个数据元素是否相等
	public boolean equals(Object o1,Object o2);
	
	public int compare(Object obj1,Object obj2);
	
}
