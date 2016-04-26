package com.dbs.test;

/**
 * ������������List�Ķ���
 * 
 * @author Administrator
 *
 */
public interface List {

	// �������Ա�Ĵ�С,������Ԫ�صĸ���
	public int getSize();

	// ������Ա�Ϊnull,����true,���򷵻�false
	public boolean isEmtpy();

	// �ж����Ա��Ƿ��������Ԫ��
	public boolean contains(Object e);

	// ��������Ԫ��e�����Ա��е����
	public int indexOf(Object e);

	// ������Ԫ��e���뵽���Ա�i��λ��
	public void insert(int i, Object e) throws OutOfBoundaryException;

	// ������Ԫ��e1���뵽Ԫ��e2֮��
	public boolean insertAfter(Object e1, Object e2);

	// ������Ԫ��e1���뵽Ԫ��e2֮ǰ
	public boolean insertBefore(Object e1, Object e2);

	// ɾ�����Ա������Ϊi��Ԫ��,������
	public Object remove(int i) throws OutOfBoundaryException;

	// ɾ���߱��е�һ����e��ͬ��Ԫ��
	public boolean remove(Object e);

	// �滻���Ա������Ϊi������Ԫ��Ϊe,����ԭ����
	public Object replace(int i, Object e) throws OutOfBoundaryException;

	// �������Ա������Ϊi������Ԫ��
	public Object get(int i) throws OutOfBoundaryException;

}
