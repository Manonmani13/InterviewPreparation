package com.manytomany;

import java.util.Set;

public class MovieTicketDto {
	private String movieName;
    private Set<UserDto> users;
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public Set<UserDto> getUsers() {
		return users;
	}
	public void setUsers(Set<UserDto> users) {
		this.users = users;
	}

}
