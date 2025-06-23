//package com.scope.singleton;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Scope;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import jakarta.annotation.PostConstruct;
//
//// @Scope("singleton") // no need to mention because default scope is singleton
//@RestController
//public class TestController1 {
//	
//	@Autowired
//	User user;
//	
//	public TestController1() {
//		System.out.println("TestController1 instance initialization");
//	}
//	
//	@PostConstruct
//	public void init() {
//		System.out.println("TestController1 obj hashcode : "+this.hashCode() +
//				" User obj hashcode : "+ user.hashCode());
//		
//	}
//	
//	@GetMapping(path="/fetchUser")
//	public ResponseEntity<String> name() {
//		
//		System.out.println("fetchUser api invoked");
//		return ResponseEntity.status(HttpStatus.OK).body("");
//		
//	}
//
//}
