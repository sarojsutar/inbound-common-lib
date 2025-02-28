package com.sahyog.app.inbound.common.exception;



/**
 * @author Interwork Software
 *
 * This is the custom checked exception class.
 */
public class InvalidEventStateException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public InvalidEventStateException(String message) {
        super(message);
    }
    
    public InvalidEventStateException(Throwable t){
    	super(t);
    }
}
