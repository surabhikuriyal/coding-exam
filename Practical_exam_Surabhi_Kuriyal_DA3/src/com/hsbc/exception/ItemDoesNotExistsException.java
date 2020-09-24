package com.hsbc.exception;

public class ItemDoesNotExistsException extends Exception{
	private static final long serialVersionUID = 1L;

	public ItemDoesNotExistsException() {
		super("Item does not exist!");
		// TODO Auto-generated constructor stub
	}

	public ItemDoesNotExistException(String msg) {
		super(msg);
	}
	

}
