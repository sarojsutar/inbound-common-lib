package com.sahyog.app.inbound.common.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BaseDTO implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 3336170070470350470L;

	private String userMobileNo;

	private String authToken;

	private String password;

}
