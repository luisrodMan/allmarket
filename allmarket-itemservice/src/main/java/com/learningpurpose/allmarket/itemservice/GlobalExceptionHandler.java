package com.learningpurpose.allmarket.itemservice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.learningpurpose.allmarket.core.ResourceNotFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<String> handleResourceNotFound(ResourceNotFoundException e) {
		ResponseEntity<String> response = new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
		return response;
	}
	
}
