package com.mikaelsonbraz.bookstoreproject.author.service;

import com.mikaelsonbraz.bookstoreproject.author.builder.AuthorDTOBuilder;
import com.mikaelsonbraz.bookstoreproject.author.mapper.AuthorMapper;
import com.mikaelsonbraz.bookstoreproject.author.repository.AuthorRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class AuthorServiceTest {

    private final AuthorMapper authorMapper = AuthorMapper.INSTANCE;

    @Mock
    private AuthorRepository authorRepository;

    @InjectMocks
    private AuthorService authorService;

    private AuthorDTOBuilder authorDTOBuilder;

    @BeforeEach
    void setUp(){
        authorDTOBuilder = AuthorDTOBuilder.builder().build();
        authorDTOBuilder.buildAuthorDTO();
    }

}
