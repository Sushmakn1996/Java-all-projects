package com.technoelevate.javabasics.exception;

public class InSufficientBalanceException extends RuntimeException{
	private String msg;
	
	public InSufficientBalanceException(String msg) {
		this.msg=msg;
	}
	@Override
	public String getMessage() {
		return this.msg;
	}
	
}
