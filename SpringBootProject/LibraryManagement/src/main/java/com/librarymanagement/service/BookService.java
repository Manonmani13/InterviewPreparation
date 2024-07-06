package com.librarymanagement.service;

import com.librarymanagement.entity.Book;
import com.librarymanagement.entity.User;
import com.librarymanagement.repository.BookRepository;
import com.librarymanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private UserRepository userRepository;

    public List<Book> findAll()
    {
        return bookRepository.findAll();
    }
    public Optional<Book> findById(Long id)
    {
        return bookRepository.findById(id);
    }
    public Book save(Book book)
    {
        return bookRepository.save(book);
    }
    public void deleteById(Long id)
    {
        bookRepository.deleteById(id);
    }
    public Book borrowBook(Long bookId,Long userId)
    {
        Optional<Book> book=findById(bookId);
        User user= findById(userId).get().getBorrowedBy();
        if(book!=null && !book.isEmpty())
        {
            book.get().setBorrowedBy(user);
            book.get().setBorrowed(true);
            return save(book.get());
        }
        return null;
    }

    public Book returnBook(Long id)
    {
        Optional<Book> book=findById(id);
        if(book!=null && book.get().isBorrowed())
        {
            book.get().setBorrowedBy(null);
            book.get().setBorrowed(false);
            return save(book.get());
        }
        return null;

    }



}
