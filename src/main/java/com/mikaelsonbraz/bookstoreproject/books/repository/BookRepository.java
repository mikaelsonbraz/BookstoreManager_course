package com.mikaelsonbraz.bookstoreproject.books.repository;

import com.mikaelsonbraz.bookstoreproject.books.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
