package com.employeemanagementweb.dto;

public class UserRegistrationDto {

    private String firstName;

    private  String lastName;

    private String email;

    private String password;

    public UserRegistrationDto(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public UserRegistrationDto() {
    }
}
