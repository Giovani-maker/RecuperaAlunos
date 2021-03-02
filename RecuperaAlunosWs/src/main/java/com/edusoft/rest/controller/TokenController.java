package com.edusoft.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edusoft.rest.services.GeraTokenService;

@RestController
@RequestMapping(value = "/recuperaalunos")
public class TokenController {

	@Autowired
	private GeraTokenService tokenService;
	
	@GetMapping(path = "/token/gerar")
	public String tokenGerado() {
		return tokenService.geraToken();
	}
	
}
