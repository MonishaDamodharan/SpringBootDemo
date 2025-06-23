package com.scope.prototype;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
@Scope("prototype")
public class Users {
	
	public Users() {
		System.out.println("User instance Initialization");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("User obj hashcode : "+ this.hashCode());
	}

}
