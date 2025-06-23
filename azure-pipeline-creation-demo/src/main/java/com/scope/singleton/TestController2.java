//package com.scope.singleton;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import jakarta.annotation.PostConstruct;
//
//@RestController
//public class TestController2 {
//	
//	@Autowired
//	User user;
//	
//	
//	public TestController2() {
//		
//		System.out.println("TestController2 instance initializing ");
//		
//	}
//	
//	@PostConstruct
//	public void init() {
//		System.out.println("TestController2 obj hashcode : "+this.hashCode() +
//				" User obj hashcode : "+ user.hashCode());
//		
//	}
//	
//	@GetMapping(path="/fetchUser2")
//	public ResponseEntity<String> fetchUser2() {
//		System.out.println("fetchUser2 invoked");
//		return ResponseEntity.status(HttpStatus.OK).body("");
//		
//	}
//
//}
