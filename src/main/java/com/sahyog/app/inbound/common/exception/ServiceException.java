package com.sahyog.app.inbound.common.exception;



/**
 * @author Interwork Software
 *
 * This is the custom checked exception class.
 */
public class ServiceException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
    public ServiceException(String message) {
        super(message);
    }
}
