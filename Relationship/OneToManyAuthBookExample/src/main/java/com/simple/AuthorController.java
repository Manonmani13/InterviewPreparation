package com.simple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authors")
public class AuthorController {
	@Autowired
    private AuthorService authorService;

    @PostMapping
    public Author createAuthor(@RequestBody Author authorDTO) {
        List<Book> books = authorDTO.getBooks(); // Assume this DTO properly maps to Book entities
        return authorService.createAuthor(authorDTO.getName(), books);
    }

    @GetMapping("/{id}")
    public Author getAuthor(@PathVariable Long id) {
        return authorService.getAuthor(id);
    }

    @GetMapping("/{id}/books")
    public List<Book> getBooksByAuthor(@PathVariable Long id) {
        return authorService.getBooksByAuthor(id);
    }
}
