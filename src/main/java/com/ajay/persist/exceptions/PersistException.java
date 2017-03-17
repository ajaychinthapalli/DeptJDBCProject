package com.ajay.persist.exceptions;

public class PersistException extends Exception {

	private static final long serialVersionUID = 2552670740804374951L;

	public PersistException() {
		super();
	}

	public PersistException(String arg0, Throwable arg1, boolean arg2,
			boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public PersistException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public PersistException(String arg0) {
		super(arg0);
	}

	public PersistException(Throwable arg0) {
		super(arg0);
	}

}
