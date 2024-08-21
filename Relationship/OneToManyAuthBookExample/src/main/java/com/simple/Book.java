package com.simple;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class Book {
	 	@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;

	    private String title;

//	    @ManyToOne
//	   
//	    @JoinColumn(name = "author_id")
//	    private Author author;

	    // Constructors, getters, and setters

	    public Book() {
	    }

	    public Book(String title) {
	        this.title = title;
//	        this.author = author;
	    }

	    // Getters and setters
	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public void setTitle(String title) {
	        this.title = title;
	    }

	   
}
