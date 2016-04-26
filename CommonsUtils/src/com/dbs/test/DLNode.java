package com.dbs.test;

public class DLNode implements Node{
	private Object elements;

	@Override
	public Object getData() {
		return elements;
	}

	@Override
	public void setData(Object obj) {
		elements=obj;
	}
	private DLNode pre;
	private DLNode next;
	
	public DLNode(Object ele,DLNode pre,DLNode next){
		this.elements=ele;
		this.pre=pre;
		this.next=next;
	}

	
	public DLNode getPre() {
		return pre;
	}

	public void setPre(DLNode pre) {
		this.pre = pre;
	}

	public DLNode getNext() {
		return next;
	}

	public void setNext(DLNode next) {
		this.next = next;
	}

}
