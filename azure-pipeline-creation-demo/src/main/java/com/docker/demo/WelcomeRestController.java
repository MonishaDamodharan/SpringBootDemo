package com.docker.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	@GetMapping(path="/welcome")
	public String welcome() {
		
		return "Welcome to Ashok IT...!!";
		
	}
	
	

}



