package com.sahyog.app.inbound.common.model;

import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmailRequest {

	private String recipientName;
	private String offer;
	private String templateName;
	private List<String> emailToList;
	private List<String> emailccList;
	private List<String> emailBccList;
	private String emailSubject;
	private String emailBody;
	Map<String, Object> variables;
	private List<?> objectDTOList;
	private Object objectDTO;
}
