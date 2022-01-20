package com.mikaelsonbraz.bookstoreproject.author.entity;

import com.mikaelsonbraz.bookstoreproject.books.entity.Book;
import com.mikaelsonbraz.bookstoreproject.entity.Auditable;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Author extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int age;

    @OneToMany(mappedBy = "author", fetch = FetchType.LAZY)
    private List<Book> books;

}
