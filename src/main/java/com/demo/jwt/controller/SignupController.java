//package com.demo.jwt.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.demo.jwt.dto.SignupRequest;
//import com.demo.jwt.entities.Customer;
//import com.demo.jwt.services.AuthService;
//
//@RestController
//@RequestMapping("/signup")
//public class SignupController {
//	
//	 private final AuthService authService;
//
//	    @Autowired
//	    public SignupController(AuthService authService) {
//	        this.authService = authService;
//	    }
//
//	    @PostMapping
//	    public ResponseEntity<?> signupCustomer(@RequestBody SignupRequest signupRequest) {
//	        Customer createdCustomer = authService.createCustomer(signupRequest);
//	        if (createdCustomer != null) {
//	            return ResponseEntity.status(HttpStatus.CREATED).body(createdCustomer);
//	        } else {
//	            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Failed to create customer");
//	        }
//	    }
//
//}
