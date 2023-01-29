package com.example.client.contract;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ArtistDto {
    private Long id;
    private String name;
    private String role;
    private List<BookDto> booksDto;
}


