package com.demo.jwt.services;

import com.demo.jwt.dto.SignupRequest;
import com.demo.jwt.entities.Customer;

public interface AuthService {
    Customer createCustomer(SignupRequest signupRequest);
}