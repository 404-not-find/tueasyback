package com.hiyun.tueasy.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {

	private final static ObjectMapper objectMapper = new ObjectMapper();
	
	public static String Object2Json(Object obj){
		String json = "";
		
		try {
			json = objectMapper.writeValueAsString(obj);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return json;
	}
}
