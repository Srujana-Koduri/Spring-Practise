package com.dbs.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler {
	
//	@ExceptionHandler(value = InvalidEmployeeException.class)
//	public ResponseEntity<String> method1(InvalidEmployeeException invalidEmployeeException){
//		String message = invalidEmployeeException.getMessage();
//		return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
//	}
	
	@ExceptionHandler(value = InvalidEmployeeException.class)
	public ResponseEntity<ErrorResponse> method1(InvalidEmployeeException invalidEmployeeException){
		HttpStatus status = HttpStatus.NOT_FOUND;
		String message = invalidEmployeeException.getMessage();
		ErrorResponse errorMessage = new ErrorResponse(status, message);
		return new ResponseEntity<ErrorResponse>(errorMessage, status);
	}
	
	@ExceptionHandler(value = InvalidDepartmentException.class)
	public ResponseEntity<ErrorResponse> method2(InvalidDepartmentException invalidDepartmentException){
		HttpStatus status = HttpStatus.NOT_FOUND;
		String message = invalidDepartmentException.getMessage();
		ErrorResponse errorMessage = new ErrorResponse(status, message);
		return new ResponseEntity<ErrorResponse>(errorMessage, status);
	}
	
	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<ErrorResponse> method3(Exception exception){
		HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
		String message = exception.getMessage();
		ErrorResponse errorMessage = new ErrorResponse(status, message);
		return new ResponseEntity<ErrorResponse>(errorMessage, status);
	}
	
}
