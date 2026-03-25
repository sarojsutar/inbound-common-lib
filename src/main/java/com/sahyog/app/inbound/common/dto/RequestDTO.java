package com.sahyog.app.inbound.common.dto;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestDTO implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -7843658329779222105L;


	private BaseDTO serviceDTO;

	private List<BaseDTO> serviceDTOList;


}
