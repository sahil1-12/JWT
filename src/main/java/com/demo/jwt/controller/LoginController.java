package com.demo.jwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.security.authentication.DisabledException;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.jwt.dto.LoginRequest;
import com.demo.jwt.dto.LoginResponse;
//import com.demo.jwt.services.jwt.CustomerServiceImpl;
//import com.demo.jwt.utils.JwtUtil;
//
//import io.jsonwebtoken.io.IOException;
import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/login")
public class LoginController {

//    private final AuthenticationManager authenticationManager;
//
//    private final CustomerServiceImpl customerService;

//    private final JwtUtil jwtUtil;
//
//
//    @Autowired
//    public LoginController(AuthenticationManager authenticationManager, CustomerServiceImpl customerService, JwtUtil jwtUtil) {
//        this.authenticationManager = authenticationManager;
//        this.customerService = customerService;
//        this.jwtUtil = jwtUtil;
//    }

//    @PostMapping
//    public LoginResponse login(@RequestBody LoginRequest loginRequest, HttpServletResponse response) throws IOException, java.io.IOException {
//        try {
//            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginRequest.getEmail(), loginRequest.getPassword()));
//        } catch (BadCredentialsException e) {
//            throw new BadCredentialsException("Incorrect email or password.");
//        } catch (DisabledException disabledException) {
//            response.sendError(HttpServletResponse.SC_NOT_FOUND, "Customer is not activated");
//            return null;
//        }
//        final UserDetails userDetails = customerService.loadUserByUsername(loginRequest.getEmail());
//        final String jwt = jwtUtil.generateToken(userDetails.getUsername());
//
//        return new LoginResponse(jwt);
//    }
    
    @GetMapping
    public String testing() {
    	return "Hi it is working";
    }

}