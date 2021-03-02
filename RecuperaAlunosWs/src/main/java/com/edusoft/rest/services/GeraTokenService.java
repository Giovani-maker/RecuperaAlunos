package com.edusoft.rest.services;

import java.nio.charset.Charset;
import java.util.Random;
import java.util.UUID;

import org.springframework.stereotype.Service;



@Service
public class GeraTokenService {

	public String geraToken() {
		String cod = geraString();
		return cod;
	}
	
	public String geraString() {
	    UUID uuid = UUID.randomUUID();
	    String myRandom = uuid.toString();
	    System.out.println(myRandom.substring(0,20));

	    return myRandom;
	}
}
