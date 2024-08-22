package com.manytomany;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;

import java.util.Set;

import jakarta.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany
    @JoinTable(
        name = "user_movie_ticket",
        joinColumns = @JoinColumn(name = "user_id"),
        inverseJoinColumns = @JoinColumn(name = "movie_ticket_id")
    )
    private Set<MovieTicket> movieTickets;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<MovieTicket> getMovieTickets() {
		return movieTickets;
	}

	public void setMovieTickets(Set<MovieTicket> movieTickets) {
		this.movieTickets = movieTickets;
	}

	public User(Long id, String name, Set<MovieTicket> movieTickets) {
		super();
		this.id = id;
		this.name = name;
		this.movieTickets = movieTickets;
	}

	public User() {
		super();
	}

    
}
