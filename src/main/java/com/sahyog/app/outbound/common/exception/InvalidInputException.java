package com.sahyog.app.outbound.common.exception;

import com.sahyog.app.outbound.common.constant.DriverAppConstantUtil;

/**
 * @author Interwork Software
 *
 * This is the custom runtime exception class.
 */
public class InvalidInputException extends RuntimeException {

	private static final long serialVersionUID =DriverAppConstantUtil.LONG_ONE;
    
	public InvalidInputException(String message) {
        super(message);
    }
    
    public InvalidInputException(Throwable t){
    	super(t);
    }
}
