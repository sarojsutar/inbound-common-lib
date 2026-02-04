package com.sahyog.app.outbound.common.dto;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO implements Serializable{

	private static final long serialVersionUID = 7643234642529170223L;
	
	private String OprID;
	
	private String responseMessage;
	
	private String responseCode;
	
	private BaseDTO serviceDTO;
	
	private List<BaseDTO> serviceDTOList;

}
