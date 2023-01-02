package com.express.controllers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = NullPointerException.class)
	public String handleNullPointException() {

		return "nullpointerexception";
	}

	@ExceptionHandler(value = Exception.class)
	public String handleException() {

		return "exception";
	}

}
