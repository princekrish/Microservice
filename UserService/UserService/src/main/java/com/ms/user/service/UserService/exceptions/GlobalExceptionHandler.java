package com.ms.user.service.UserService.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ms.user.service.UserService.payload.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public  ResponseEntity<ApiResponse> handleResourceNotFoundException(ResourceNotFoundException resourceNotFoundException){
		
		String message=resourceNotFoundException.getMessage();
		
		ApiResponse response=ApiResponse.builder().message(message).succcess(true).status(HttpStatus.OK).build();
		
		return new ResponseEntity<ApiResponse>(response,HttpStatus.NOT_FOUND);
				
	}
}
