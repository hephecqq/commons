package com.dbs.test;

public class ListArray implements List {

	private final int LEN = 8; // �����Ĭ�ϴ�С
	private Strategy strategy; // ����Ԫ�رȽϲ���
	private int size; // ���Ա�������Ԫ�صĸ���
	private Object[] elements; // ����Ԫ������

	ListArray() {
		this(new DefultStrategy());
	}

	public ListArray(Strategy defultStrategy) {
		this.strategy = defultStrategy;
		size = 0;
		elements = new Object[LEN];
	}

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
		for (int i = 0; i < size; i++) {
			if (strategy.equals(e, elements[i])) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int indexOf(Object e) {
		for (int i = 0; i < size; i++) {
			if (strategy.equals(e, elements[i]))
				return i;
		}
		return -1;
	}

	@Override
	public void insert(int i, Object e) throws OutOfBoundaryException {
		if (i < 0 || i > size) {
			throw new OutOfBoundaryException("����ָ���Ĳ������Խ��");
		}
		if (size >= elements.length) {
			expandSpace();
		}
		for (int j = size; j > i; j--) {
			elements[j] = elements[j - 1];
		}
		elements[i] = e;
		size++;
		return;
	}

	private void expandSpace() {
		Object[] a = new Object[elements.length * 2];
		for (int i = 0; i < elements.length; i++) {
			a[i] = elements[i];
		}
		elements = a;
	}

	@Override
	public boolean insertAfter(Object e1, Object e2) {

		return false;
	}

	@Override
	public boolean insertBefore(Object e1, Object e2) {

		int i = indexOf(e1);
		if (i < 0)
			return false;
		insert(i, e2);
		return true;
	}

	@Override
	public Object remove(int i) throws OutOfBoundaryException {
		if (i < 0 || i >= size) {
			throw new OutOfBoundaryException("i����Խ��...");
		}
		Object obj = elements[i];
		for (int j = i; j < size; j++) {
			elements[j] = elements[j + 1];
		}
		elements[--size] = null;
		return obj;
	}

	@Override
	public boolean remove(Object e) {
		int i = indexOf(e);
		if (i < 0)
			return false;
		remove(i);
		return true;
	}

	@Override
	public Object replace(int i, Object e) throws OutOfBoundaryException {
		if (i < 0 || i > size) {
			throw new OutOfBoundaryException("Խ��");
		}
		Object obj = elements[i];
		elements[i] = e;
		return obj;
	}

	@Override
	public Object get(int i) throws OutOfBoundaryException {
		checkRange(i);
		return elements[i];
	}

	public void checkRange(int i) {
		if (i < 0 || i > size) {
			throw new OutOfBoundaryException("Խ��");
		}
	}
}
