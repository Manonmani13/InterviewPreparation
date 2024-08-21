package com.simple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserService {
	@Autowired
    private UserRepository userRepository;

    @Autowired
    private UserProfileRepository userProfileRepository;

    public User createUserWithProfile(User user, UserProfile profile) {
        // Set the bidirectional relationship
        user.setUserProfile(profile);
        profile.setUser(user);

        // Save the user (which also saves the profile due to CascadeType.ALL)
        return userRepository.save(user);
    }
    public User getUser(Long id) {
        return userRepository.findById(id).orElse(null);
    }
}
