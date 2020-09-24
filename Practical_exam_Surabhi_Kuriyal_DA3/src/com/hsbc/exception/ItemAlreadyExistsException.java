package com.hsbc.exception;

public class ItemAlreadyExistsException extends Exception{
	private static final long serialVersionUID = 1L;

	public ItemAlreadyExistsException() {
		super("Item already Exists !!");
		// TODO Auto-generated constructor stub
	}
	public ItemAlreadyExistsException(String msg) {
		super(msg);
	}
	

}
