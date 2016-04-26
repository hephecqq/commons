package com.dbs.test;

public class StudentStrategy implements Strategy {

	@Override
	public boolean equals(Object o1, Object o2) {
		if (o1 instanceof Student && o2 instanceof Student) {
			Student s1 = (Student) o1;
			Student s2 = (Student) o2;
			return s1.getId().equals(s2.getId());
		}
		return false;
	}

	@Override
	public int compare(Object obj1, Object obj2) {
		if (obj1 instanceof Student && obj2 instanceof Student) {
			Student s1 = (Student) obj1;
			Student s2 = (Student) obj2;
			return s1.getId().compareTo(s2.getId());
		}

		return obj1.toString().compareTo(obj2.toString());
	}

}
