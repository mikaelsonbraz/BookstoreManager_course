package com.mikaelsonbraz.bookstoreproject.publisher.repository;

import com.mikaelsonbraz.bookstoreproject.publisher.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
