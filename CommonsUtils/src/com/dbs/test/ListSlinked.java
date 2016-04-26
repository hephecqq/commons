package com.dbs.test;

public class ListSlinked implements List {

	private Strategy strategy;// 数据元素比较策略
	private SLNode head;// 单链表首节点引用
	private int size;// 线性表中数据元素的个数

	public ListSlinked(Strategy strategy) {
		this.strategy = strategy;
		head = new SLNode();
		size = 0;
	}

	public ListSlinked() {
		this(new DefaultStrategy());
	}

	// 辅助方法：获取数据元素e所在节点的前驱节点
	private SLNode getPreNode(Object e) {
		SLNode p = head;
		while (p.getNext() != null) {
			if (strategy.equals(p.getNext().getData(), e)) {
				return p;
			} else {
				p = p.getNext();
			}
		}
		return null;
	}

	// 辅助方法：获取序号为0<=i<size的元素所在节点的前驱节点
	private SLNode getPreNode(int i) {
		SLNode p = head;
		for (; i > 0; i--) {
			p = p.getNext();
		}
		return p;
	}

	// 获取序号为0<=i<size的元素所在的节点
	private SLNode getNode(int i) {
		SLNode p = head.getNext();
		for (; i > 0; i--) {
			p = p.getNext();
		}
		return p;
	}

	// 返回线性表的大小，即数据元素的个数
	@Override
	public int getSize() {
		return size;
	}

	@Override
	public boolean isEmtpy() {
		return size == 0;
	}

	@Override
	public boolean contains(Object e) {
		SLNode p = head.getNext();
		while (p != null) {
			if (strategy.equals(p.getData(), e)) {
				return true;
			} else {
				p = p.getNext();
			}
		}
		return false;
	}

	@Override
	public int indexOf(Object e) {
		SLNode p = head.getNext();
		int index = 0;
		while (p != null) {
			if (strategy.equals(p.getData(), e))
				return index;
			else {
				index++;
				p = p.getNext();
			}
		}
		return -1;
	}

	@Override
	public void insert(int i, Object e) throws OutOfBoundaryException {
		if (i < 0 || i >= size) {
			throw new OutOfBoundaryException("越界");
		}
		SLNode p=getPreNode(i);
		SLNode q=new SLNode(e,p.getNext());
		p.setNext(q);
		size++;
		return;
	}

	@Override
	public boolean insertAfter(Object e1, Object e2) {
		SLNode p=getPreNode(e1);
		if(p!=null){
			SLNode q=new SLNode(e1,p.getNext());
			p.setNext(q);
		}
		
		return false;
	}

	@Override
	public boolean insertBefore(Object e1, Object e2) {
		SLNode p = getPreNode(e1);
		if (p != null) {
			SLNode q = new SLNode(e2, p.getNext());
			p.setNext(q);
			size++;
			return true;
		}

		return false;
	}

	@Override
	public Object remove(int i) throws OutOfBoundaryException {
		if (i < 0 || i >= size) {
			throw new OutOfBoundaryException("越界");
		}
		SLNode p = getNode(i);
		Object obj = p.getNext().getData();
		p.setNext(p.getNext().getNext());
		size--;
		return obj;
	}

	@Override
	public boolean remove(Object e) {
		SLNode p = getPreNode(e);
		if (p != null) {
			p.setNext(p.getNext().getNext());
			size--;
			return true;
		}
		return false;
	}

	@Override
	public Object replace(int i, Object e) throws OutOfBoundaryException {

		if (i < 0 || i >= size) {
			throw new OutOfBoundaryException("越界");
		}
		SLNode p = getNode(i);
		Object obj = p.getData();
		p.setData(e);
		return obj;
	}

	@Override
	public Object get(int i) throws OutOfBoundaryException {

		if (i < 0 || i >= size) {
			throw new OutOfBoundaryException("越界");
		}
		SLNode p = getNode(i);
		return p.getData();
	}

}
