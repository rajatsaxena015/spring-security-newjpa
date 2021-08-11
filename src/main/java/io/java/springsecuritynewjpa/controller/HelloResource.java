package io.java.springsecuritynewjpa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {

	@RequestMapping("/")
	public String home() {
		
		return "Welcome new User";
		
	}
}
