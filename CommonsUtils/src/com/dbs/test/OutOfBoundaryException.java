package com.dbs.test;

public class OutOfBoundaryException extends RuntimeException {

	private static final long serialVersionUID = 8347557873506570418L;

	public OutOfBoundaryException(String err) {
		super(err);
	}
}
