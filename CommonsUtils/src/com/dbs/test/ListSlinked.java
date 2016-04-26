package com.dbs.test;

public class ListSlinked implements List {

	private Strategy strategy;// ����Ԫ�رȽϲ���
	private SLNode head;// �������׽ڵ�����
	private int size;// ���Ա�������Ԫ�صĸ���

	public ListSlinked(Strategy strategy) {
		this.strategy = strategy;
		head = new SLNode();
		size = 0;
	}

	public ListSlinked() {
		this(new DefaultStrategy());
	}

	// ������������ȡ����Ԫ��e���ڽڵ��ǰ���ڵ�
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

	// ������������ȡ���Ϊ0<=i<size��Ԫ�����ڽڵ��ǰ���ڵ�
	private SLNode getPreNode(int i) {
		SLNode p = head;
		for (; i > 0; i--) {
			p = p.getNext();
		}
		return p;
	}

	// ��ȡ���Ϊ0<=i<size��Ԫ�����ڵĽڵ�
	private SLNode getNode(int i) {
		SLNode p = head.getNext();
		for (; i > 0; i--) {
			p = p.getNext();
		}
		return p;
	}

	// �������Ա�Ĵ�С��������Ԫ�صĸ���
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
			throw new OutOfBoundaryException("Խ��");
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
			throw new OutOfBoundaryException("Խ��");
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
			throw new OutOfBoundaryException("Խ��");
		}
		SLNode p = getNode(i);
		Object obj = p.getData();
		p.setData(e);
		return obj;
	}

	@Override
	public Object get(int i) throws OutOfBoundaryException {

		if (i < 0 || i >= size) {
			throw new OutOfBoundaryException("Խ��");
		}
		SLNode p = getNode(i);
		return p.getData();
	}

}
