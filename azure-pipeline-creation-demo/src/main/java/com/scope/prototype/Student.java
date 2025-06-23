package com.scope.prototype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class Student {
	
	@Autowired
	Users users;
	
	public Student() {
		System.out.println("Student instance initialization");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Student obj hashcode : "+this.hashCode()
		+ " User obj hashcode : "+ users.hashCode());
	}

}
