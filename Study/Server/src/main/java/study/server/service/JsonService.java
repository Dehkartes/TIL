package study.server.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonService {
	protected String getJsonString(Object value) throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(value);
	}
}
