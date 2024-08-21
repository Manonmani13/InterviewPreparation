package com.simple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {
	@Autowired
    private UserService userService;

	  @PostMapping
	    public User createUser(@RequestBody UserProfileDTO userProfileDTO) {
	        User user = new User();
	        user.setUsername(userProfileDTO.getName());

	        UserProfile profile = new UserProfile();
	        profile.setBio(userProfileDTO.getProfileBio());

	        return userService.createUserWithProfile(user, profile);
	    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }

}
