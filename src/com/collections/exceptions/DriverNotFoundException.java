package com.collections.exceptions;

public class DriverNotFoundException extends RuntimeException{
	private String message;
	
	public DriverNotFoundException(String message){
		super(message);
		this.message = message;		
	}
	
	@Override
	public String toString() {
		
		return "com.collections.DriverNotFoundException : "+message;
	}
}
