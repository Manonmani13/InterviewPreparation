package com.librarymanagement.controller;

import com.librarymanagement.entity.Book;
import com.librarymanagement.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/books")
public class BookController {
    @Autowired
    public BookService bookService;

    @GetMapping
    public List<Book> getAllBooks()
    {
        return bookService.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Book> getBook(@PathVariable Long id)
    {
        return bookService.findById(id);
    }

    @PostMapping
    public Book saveBook(@RequestBody Book book)
    {
        return bookService.save(book);
    }

}
