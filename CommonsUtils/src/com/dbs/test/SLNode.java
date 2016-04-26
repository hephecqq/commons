package com.dbs.test;

public class SLNode implements Node {

	private Object elements;
	private SLNode next;
	
	public SLNode() {
		this(null,null);
	}
	
	public SLNode(Object ele,SLNode next){
		this.elements=ele;
		this.next=next;
	}
	
	
	
	public Object getElements() {
		return elements;
	}

	public void setElements(Object elements) {
		this.elements = elements;
	}

	public SLNode getNext() {
		return next;
	}

	public void setNext(SLNode next) {
		this.next = next;
	}

	@Override
	public Object getData() {
		return elements;
	}

	@Override
	public void setData(Object obj) {
		elements=obj;
	}

}
