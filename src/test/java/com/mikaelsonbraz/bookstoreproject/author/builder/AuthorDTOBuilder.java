package com.mikaelsonbraz.bookstoreproject.author.builder;

import com.mikaelsonbraz.bookstoreproject.author.dto.AuthorDTO;
import lombok.Builder;

@Builder
public class AuthorDTOBuilder {

    @Builder.Default
    private final Long id = 1L;

    @Builder.Default
    private final String name = "Mikaelson Braz";

    @Builder.Default
    private final int age = 32;

    public AuthorDTO buildAuthorDTO(){
        return new AuthorDTO(id, name, age);
    }
}
