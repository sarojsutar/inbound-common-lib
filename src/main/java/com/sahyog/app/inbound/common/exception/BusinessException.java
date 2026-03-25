package com.sahyog.app.inbound.common.exception;


/**
 * @author Interwork Software
 *
 * This is the custom runtime exception class.
 */
public class BusinessException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public BusinessException(String message) {
        super(message);
    }

}
