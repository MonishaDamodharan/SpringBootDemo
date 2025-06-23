package com.scope.prototype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;

@RestController
@Scope("prototype")
public class ProxyTestController {
	
	@Autowired
	Users users;
	
	@Autowired
	Student student;
	
	
	public ProxyTestController() {
		System.out.println("instance initialization");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("ProxyTestController hashcode : "+this.hashCode());
		System.out.println("Users hashcode : "+users.hashCode());
		System.out.println("Student hashcode : "+student.hashCode());
	}
	
	@GetMapping(path="/proxyName")
	public ResponseEntity<String> name() {
		
		System.out.println("ProxyTestController instance initialization");
		
		return ResponseEntity.status(HttpStatus.OK).body("");
		
	}

}
