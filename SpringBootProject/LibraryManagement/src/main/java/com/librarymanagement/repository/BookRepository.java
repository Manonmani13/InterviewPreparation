package com.librarymanagement.repository;

import com.librarymanagement.entity.Book;
import com.librarymanagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
