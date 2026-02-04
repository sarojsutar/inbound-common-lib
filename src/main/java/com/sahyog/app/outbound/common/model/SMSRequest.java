package com.sahyog.app.outbound.common.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SMSRequest {

	private String templateName;
	private String[] smsTo;
	private String[] variables;

}
