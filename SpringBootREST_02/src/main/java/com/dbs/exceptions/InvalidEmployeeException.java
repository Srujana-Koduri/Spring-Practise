package com.dbs.exceptions;

public class InvalidEmployeeException extends Exception{
	String message;
	public InvalidEmployeeException() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public InvalidEmployeeException(String message) {
		super();
		this.message=message;
		// TODO Auto-generated constructor stub
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public InvalidEmployeeException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public InvalidEmployeeException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	

}
