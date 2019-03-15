package com.capgemini.exception;

public class NoDataFoundException extends Exception {
	private static final long serialVersionUID = -3771524605423364446L;

	public NoDataFoundException(String message) {
		super(message);
	}

	@Override
	public String getMessage() {
		return super.getMessage();
	}

}
