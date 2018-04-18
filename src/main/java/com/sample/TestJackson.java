package com.sample;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestJackson {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		Car car = mapper.readValue(TestJackson.class.getResourceAsStream("/sample.json"), Car.class);
		System.out.println("car properties: color=" + car.getColor() + ", type=" + car.getType());
		
	}
}
