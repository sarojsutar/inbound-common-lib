package com.sahyog.app.inbound.common.utils;

import java.util.Map;

public class StringUtils {
	
	public static String EMPTY = "";

	public static String append(String seperator, String... strings) {
		return String.join(seperator, strings);
	}
	
	public static String toStringFormat(Map<String, String> fieldMapping){
		StringBuilder sb = new StringBuilder();
		for(String key : fieldMapping.keySet()){
			sb.append(key).append(Constants.COLON_WITH_SPACES).append(fieldMapping.get(key)).append("\n");
		}
		return sb.toString();
	}

	public static String append(String... strings) {
		return String.join(EMPTY, strings);
	}

}
