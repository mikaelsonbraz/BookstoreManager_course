package com.mikaelsonbraz.bookstoreproject.publisher.entity;

import com.mikaelsonbraz.bookstoreproject.books.entity.Book;
import com.mikaelsonbraz.bookstoreproject.entity.Auditable;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class Publisher extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, length = 100)
    private String code;

    @Column(nullable = false, columnDefinition = "TIMESTAMP")
    private LocalDate foundationDate;

    @OneToMany(mappedBy = "publisher", fetch = FetchType.LAZY)
    private List<Book> books;
}
