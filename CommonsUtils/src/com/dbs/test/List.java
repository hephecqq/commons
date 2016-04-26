package com.dbs.test;

/**
 * 抽象数据类型List的定义
 * 
 * @author Administrator
 *
 */
public interface List {

	// 返回线性表的大小,及数据元素的个数
	public int getSize();

	// 如果线性表为null,返回true,否则返回false
	public boolean isEmtpy();

	// 判断线性表是否包含数据元素
	public boolean contains(Object e);

	// 返回数据元素e在线性表中的序号
	public int indexOf(Object e);

	// 将数据元素e插入到线性表i号位置
	public void insert(int i, Object e) throws OutOfBoundaryException;

	// 将数据元素e1插入到元素e2之后
	public boolean insertAfter(Object e1, Object e2);

	// 将数据元素e1插入到元素e2之前
	public boolean insertBefore(Object e1, Object e2);

	// 删除线性表中序号为i的元素,并返回
	public Object remove(int i) throws OutOfBoundaryException;

	// 删除线表中第一个与e相同的元素
	public boolean remove(Object e);

	// 替换线性表中序号为i的数据元素为e,返回原数据
	public Object replace(int i, Object e) throws OutOfBoundaryException;

	// 返回线性表中序号为i的数据元素
	public Object get(int i) throws OutOfBoundaryException;

}
