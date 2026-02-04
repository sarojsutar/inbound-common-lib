package com.sahyog.app.outbound.common.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListResponseDTO<T> extends ResponseDTO{
	List<T> responseList;

}
