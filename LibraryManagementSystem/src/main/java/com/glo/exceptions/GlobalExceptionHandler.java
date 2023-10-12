package com.glo.exceptions;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.glo.payload.ErrorResponse;

@RestControllerAdvice
public class GlobalExceptionHandler  {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleResourceNotFoundException(ResourceNotFoundException ex,WebRequest webRequest)
	{
		ErrorResponse error=new ErrorResponse(new Date(), ex.getMessage(), webRequest.getDescription(false));
		return new ResponseEntity<ErrorResponse>(error,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<List<ErrorResponse>> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex,WebRequest webRequest)
	{
		List<ErrorResponse> list=new ArrayList<>();
		ex.getBindingResult().getAllErrors().forEach((error)->
		{
		ErrorResponse err=new ErrorResponse(new Date(), error.getDefaultMessage(), webRequest.getDescription(false));	
		list.add(err);
		});
		return new ResponseEntity<>(list,HttpStatus.NOT_FOUND);
	}
	
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleException(Exception ex, WebRequest webRequest)
    {
    	ErrorResponse error=new ErrorResponse(new Date(),ex.getMessage(),webRequest.getDescription(false));
    	return new ResponseEntity<ErrorResponse>(error,HttpStatus.BAD_REQUEST);
    }
}
