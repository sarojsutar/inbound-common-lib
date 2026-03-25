package com.sahyog.app.inbound.common.exception;



/**
 * @author Interwork Software
 *
 * This is the custom runtime exception class.
 */
public class InvalidUserException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public InvalidUserException(String message) {
        super(message);
    }

}
