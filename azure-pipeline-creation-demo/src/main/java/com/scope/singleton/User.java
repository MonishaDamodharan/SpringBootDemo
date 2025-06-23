//package com.scope.singleton;
//
//
//
//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Component;
//
//import jakarta.annotation.PostConstruct;
//
//@Scope("singleton")
//@Component
//public class User {
//	
//	public User() {
//		System.out.println("User initialization");
//	}
//	
//	@PostConstruct
//	public void init() {
//		
//		System.out.println("User obj hashcode : "+this.hashCode());
//		
//	}
//
//}
