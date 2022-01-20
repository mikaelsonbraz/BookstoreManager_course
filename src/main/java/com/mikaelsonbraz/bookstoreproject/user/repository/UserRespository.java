package com.mikaelsonbraz.bookstoreproject.user.repository;

import com.mikaelsonbraz.bookstoreproject.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespository extends JpaRepository<User, Long> {
}
