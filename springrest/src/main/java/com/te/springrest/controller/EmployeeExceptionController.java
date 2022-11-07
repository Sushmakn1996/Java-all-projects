package com.te.springrest.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.te.springrest.exception.EmployeeNotPresentException;

@RestControllerAdvice
public class EmployeeExceptionController {
	@ExceptionHandler(EmployeeNotPresentException.class)
	public String excepHandler(HttpServletRequest request , EmployeeNotPresentException employeeNotPresentException) {
		return employeeNotPresentException.getMessage();
		 
	}
	

}
