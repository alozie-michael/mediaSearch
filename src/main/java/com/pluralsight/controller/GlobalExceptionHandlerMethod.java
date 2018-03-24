package com.pluralsight.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalExceptionHandlerMethod {
	
	@ExceptionHandler(NoHandlerFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public String handle(NoHandlerFoundException e) {

		System.out.println("Unknown execption occured:" + e);
		
		return "Exception";
	}
	
	@ExceptionHandler(value= Exception.class)
	public String handleException(Exception e){
		
		System.out.println("Unknown execption occured:" + e);
		
		return "Exception";
	}
}
