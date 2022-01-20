package com.mikaelsonbraz.bookstoreproject.books.entity;

import com.mikaelsonbraz.bookstoreproject.author.entity.Author;
import com.mikaelsonbraz.bookstoreproject.publisher.entity.Publisher;
import com.mikaelsonbraz.bookstoreproject.user.entity.User;
import lombok.Data;

import javax.persistence.*;


@Data
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 255)
    private String name;

    @Column(nullable = false)
    private String isbn;

    @Column(nullable = false, columnDefinition = "integer default 0")
    private int pages;


    @ManyToOne(cascade = {CascadeType.MERGE})
    private Author author;

    @ManyToOne(cascade = {CascadeType.MERGE})
    private Publisher publisher;

    @ManyToOne(cascade = {CascadeType.MERGE})
    private User user;

}
