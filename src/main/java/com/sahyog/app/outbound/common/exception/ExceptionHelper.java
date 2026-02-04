package com.sahyog.app.outbound.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException.Unauthorized;

import com.sahyog.app.outbound.common.dto.ResponseDTO;
import com.sahyog.app.outbound.common.utils.CommonUtil;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class ExceptionHelper {

	@ExceptionHandler(value = { InvalidInputException.class })
	public ResponseEntity<Object> handleInvalidInputException(InvalidInputException ex) {

		log.error("Invalid Input Exception: ", ex.getMessage());

		return new ResponseEntity<Object>(getResponseMessage("200", ex.getMessage()), HttpStatus.OK);

	}

	@ExceptionHandler(value = { Unauthorized.class })
	public ResponseEntity<Object> handleUnauthorizedException(Unauthorized ex) {

		log.error("Unauthorized Exception: ", ex.getMessage());

		return new ResponseEntity<Object>(getResponseMessage("400", ex.getMessage()), HttpStatus.BAD_REQUEST);

	}

	@ExceptionHandler(value = { BusinessException.class })
	public ResponseEntity<Object> handleBusinessException(BusinessException ex) {

		log.error("Business Exception: ", ex.getMessage());

		return new ResponseEntity<Object>(getResponseMessage("404", ex.getMessage()), HttpStatus.OK);

	}
	
	@ExceptionHandler(value = { InvalidUserException.class })
	public ResponseEntity<Object> handleInvalidUserException(InvalidUserException ex) {

		log.error("Invalid User Exception: ", ex.getMessage());

		return new ResponseEntity<Object>(getResponseMessage("400", ex.getMessage()), HttpStatus.OK);

	}

	@ExceptionHandler(value = { Exception.class })
	public ResponseEntity<Object> handleException(Exception ex) {

		log.error("Exception: ", ex.getMessage());

		return new ResponseEntity<Object>(getResponseMessage("500", ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);

	}
	
	

	private String getResponseMessage(String errorCode, String errorMessage) {
		ResponseDTO responseDTO = new ResponseDTO();
		responseDTO.setResponseCode(errorCode);
		responseDTO.setResponseMessage(errorMessage);
		return CommonUtil.getEncryptedResponseMessage(responseDTO);
	}
	
	

}
