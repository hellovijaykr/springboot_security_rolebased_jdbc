package com.spring.rolebased.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

	@GetMapping("/")
	public String welcome() {
		return "<h1> Welcome to Spring security</h1>";
	}
	
	@GetMapping("/admin")
	public String adminProcess() {
		return "<h2>Welcome admin</h2>";
	}
	

	@GetMapping("/user")
	public String userProcess() {
		return "<h2>Welcome user</h2>";
	}

}
