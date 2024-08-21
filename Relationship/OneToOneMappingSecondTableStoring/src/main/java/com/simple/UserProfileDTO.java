package com.simple;

public class UserProfileDTO {
	 private String name;
	    private String email;
	    private String profileBio;
	    private String profilePicture;

	    // Getters and setters
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getProfileBio() {
	        return profileBio;
	    }

	    public void setProfileBio(String profileBio) {
	        this.profileBio = profileBio;
	    }

	    public String getProfilePicture() {
	        return profilePicture;
	    }

	    public void setProfilePicture(String profilePicture) {
	        this.profilePicture = profilePicture;
	    }
}
