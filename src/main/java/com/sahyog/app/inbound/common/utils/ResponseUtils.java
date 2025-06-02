package com.sahyog.app.inbound.common.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


/**
 * This class will add HttpStatus to response and convert them to ResponseEntity
 * objects
 *
 */

public class ResponseUtils {

//	public static ResponseEntity<String> getOKResponse(ResponseDTO obj) {
//		return returnResposne(CommonUtil.getEncryptedResponseMessage(obj), HttpStatus.OK);
//	}
//	
//	public static ResponseEntity<String> getTestOKResponse(ResponseDTO obj) {
//		return returnResposne(CommonUtil.getTestEncryptedResponseMessage(obj), HttpStatus.OK);
//	}
//
//	public static ResponseEntity<String> getCreatedResponse(ResponseDTO obj) {
//		return returnResposne(CommonUtil.getEncryptedResponseMessage(obj), HttpStatus.CREATED);
//	}
//
//	public static ResponseEntity<String> getBadRequestResponse(ResponseDTO obj) {
//		return returnResposne(CommonUtil.getEncryptedResponseMessage(obj), HttpStatus.BAD_REQUEST);
//	}
//
//	public static ResponseEntity<String> getUnAuthorizedResponse(ResponseDTO obj) {
//		return returnResposne(CommonUtil.getEncryptedResponseMessage(obj), HttpStatus.UNAUTHORIZED);
//	}
//
//	public static ResponseEntity<String> getNotFoundResponse(ResponseDTO obj) {
//		return returnResposne(CommonUtil.getEncryptedResponseMessage(obj), HttpStatus.NOT_FOUND);
//	}
//
//	public static ResponseEntity<String> getInternalServerErrorResponse(ResponseDTO obj) {
//		return returnResposne(CommonUtil.getEncryptedResponseMessage(obj), HttpStatus.INTERNAL_SERVER_ERROR);
//	}
//
//	public static ResponseEntity<String> getNoContentResponse(ResponseDTO obj) {
//		return returnResposne(CommonUtil.getEncryptedResponseMessage(obj), HttpStatus.NO_CONTENT);
//	}
//
//	public static ResponseEntity<String> getAcceptedResponse(ResponseDTO obj) {
//		return returnResposne(CommonUtil.getEncryptedResponseMessage(obj), HttpStatus.ACCEPTED);
//	}
//
//	private static ResponseEntity<String> returnResposne(String obj, HttpStatus status) {
//		return new ResponseEntity<String>(obj, status);
//	}
//	
	
	public static <T> ResponseEntity<T> getOKResponse(T obj) {
		return returnResposne(obj, HttpStatus.OK);
	}
	
	public static <T> ResponseEntity<T> getTestOKResponse(T obj) {
		return returnResposne(obj, HttpStatus.OK);
	}

	public static <T> ResponseEntity<T> getCreatedResponse(T obj) {
		return returnResposne(obj, HttpStatus.CREATED);
	}

	public static <T> ResponseEntity<T> getBadRequestResponse(T obj) {
		return returnResposne(obj, HttpStatus.BAD_REQUEST);
	}

	public static <T> ResponseEntity<T> getUnAuthorizedResponse(T obj) {
		return returnResposne(obj, HttpStatus.UNAUTHORIZED);
	}

	public static <T> ResponseEntity<T> getNotFoundResponse(T obj) {
		return returnResposne(obj, HttpStatus.NOT_FOUND);
	}

	public static <T> ResponseEntity<T> getInternalServerErrorResponse(T obj) {
		return returnResposne(obj, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	public static <T> ResponseEntity<T> getNoContentResponse(T obj) {
		return returnResposne(obj, HttpStatus.NO_CONTENT);
	}

	public static <T> ResponseEntity<T> getAcceptedResponse(T obj) {
		return returnResposne(obj, HttpStatus.ACCEPTED);
	}

	private static <T> ResponseEntity<T> returnResposne(T obj, HttpStatus status) {
//		return new ResponseEntity<T>(obj, status);
        return ResponseEntity.status(status).body(obj);
	}


}