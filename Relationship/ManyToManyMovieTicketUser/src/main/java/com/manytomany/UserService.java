package com.manytomany;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

public class UserService {
	 @Autowired
	    private UserRepository userRepository;

	    public User saveUser(User user) {
	        return userRepository.save(user);
	    }

	    public Optional<User> findUserById(Long id) {
	        return userRepository.findById(id);
	    }

}
