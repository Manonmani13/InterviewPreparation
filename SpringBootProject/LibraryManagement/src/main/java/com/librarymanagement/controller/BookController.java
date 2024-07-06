package com.librarymanagement.controller;

import com.librarymanagement.entity.Book;
import com.librarymanagement.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    @DeleteMapping("/{id}")
    public void saveBook(@PathVariable Long id)
    {
         bookService.deleteById(id);
    }
    @PostMapping("/{bookId}/borrow/{userID}")
    public ResponseEntity<Book> borrowBook(@PathVariable Long bookId,@PathVariable Long userId)
    {
        Book borrow=bookService.borrowBook(bookId,userId);
        if(borrow!=null)
            return ResponseEntity.ok(borrow);
        else
            return ResponseEntity.badRequest().build();
    }

    @PostMapping("/{bookId}/return")
    public ResponseEntity<Book> returnBook(@PathVariable Long bookId)
    {
        Book returnbook= bookService.returnBook(bookId);
        if(returnbook!=null)
         return    ResponseEntity.ok(returnbook);
        else
         return    ResponseEntity.badRequest().build();
    }
}
