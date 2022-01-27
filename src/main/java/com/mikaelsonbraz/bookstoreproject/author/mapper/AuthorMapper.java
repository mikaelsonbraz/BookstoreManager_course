package com.mikaelsonbraz.bookstoreproject.author.mapper;

import com.mikaelsonbraz.bookstoreproject.author.dto.AuthorDTO;
import com.mikaelsonbraz.bookstoreproject.author.entity.Author;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AuthorMapper {

    AuthorMapper INSTANCE = Mappers.getMapper(AuthorMapper.class);

    Author toModel(AuthorDTO authorDTO);

    AuthorDTO toDTO(Author author);
}
