package com.capgemini.exception;

public class InvalidEmployeeIdException extends Exception {
	private static final long serialVersionUID = 5002785498217853671L;

	public InvalidEmployeeIdException(String message) {
		super(message);
	}

	@Override
	public String getMessage() {
		return super.getMessage();
	}

}
