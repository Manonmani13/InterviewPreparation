package com.simple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
	 @Autowired
	    private AuthorRepository authorRepository;

	    @Autowired
	    
	    private BookRepository bookRepository;

	    public Author createAuthor(String name, List<Book> books) {
	        Author author = new Author(name);
	        author.setBooks(books);
	        return authorRepository.save(author);
	    }

	    public Author getAuthor(Long id) {
	        return authorRepository.findById(id).orElse(null);
	    }

	    public List<Book> getBooksByAuthor(Long authorId) {
	        Author author = getAuthor(authorId);
	        return author != null ? author.getBooks() : null;
	    }
}
