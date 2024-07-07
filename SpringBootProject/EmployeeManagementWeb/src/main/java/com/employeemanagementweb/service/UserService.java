package com.employeemanagementweb.service;

import com.employeemanagementweb.dto.UserRegistrationDto;
import com.employeemanagementweb.entity.User;

public interface UserService{
    User save(UserRegistrationDto userRegistrationDto);
}
