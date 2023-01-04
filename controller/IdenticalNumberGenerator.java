package com.java.controller;

import java.util.UUID;

public class IdenticalNumberGenerator {
	public static String getIdenticalNumber() {
		String uuid = UUID.randomUUID().toString();		
		uuid = uuid.replace("-", "").substring(0,9);
		
		return uuid;
	}
	
}
