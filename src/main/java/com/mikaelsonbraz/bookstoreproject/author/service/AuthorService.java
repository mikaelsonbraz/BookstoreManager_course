package com.mikaelsonbraz.bookstoreproject.author.service;

import com.mikaelsonbraz.bookstoreproject.author.mapper.AuthorMapper;
import com.mikaelsonbraz.bookstoreproject.author.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    private final static AuthorMapper authorMapper = AuthorMapper.INSTANCE;

    private AuthorRepository authorRepository;

    @Autowired
    public AuthorService(AuthorRepository authorRepository){
        this.authorRepository = authorRepository;
    }
}
