package com.dbs.exceptions;

public class InvalidDepartmentException extends Exception {

	String message;
	public InvalidDepartmentException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InvalidDepartmentException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public InvalidDepartmentException(String message) {
		super(message);
		this.message = message;
		// TODO Auto-generated constructor stub
	}

	public InvalidDepartmentException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
	

}
