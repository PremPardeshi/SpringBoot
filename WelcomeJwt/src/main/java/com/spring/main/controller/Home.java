package com.spring.main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

	@RequestMapping(value="welcome",method= RequestMethod.GET)
	public String home() {
		return "<h1>Welcome to Spring boot Authorized page</h1>";
		}
	@RequestMapping(value="/getuser")
	public String getuser() {
		return "{\"name\":\"Prem\"}";
		}
}
