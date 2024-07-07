package com.employeemanagementweb.service;

import com.employeemanagementweb.dto.UserRegistrationDto;
import com.employeemanagementweb.entity.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto userRegistrationDto);
}
