package com.employeemanagementweb.service;

import com.employeemanagementweb.dto.UserRegistrationDto;
import com.employeemanagementweb.entity.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

@Component
public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto userRegistrationDto);
}
