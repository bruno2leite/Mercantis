package com.brunoleite.mercantis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Hello {
	
	@GetMapping
	private String hello() {
		return "Mercantis API working!";
	}
}
