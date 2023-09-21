package com.BikkadIT.RestfulFirstApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcomeController")
public class WelcomeController {

	@GetMapping("/wel")
	public String welcome() {
		String msg = "Welcome to Bikkad IT";
		return msg;
	}

	@GetMapping("/wel1")
	public String welcome1() {
		String msg = "Welcome to IT Field";
		return msg;
	}
}
