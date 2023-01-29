package com.example.hpwebapi.contract;

import com.example.client.contract.BookDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ArtistDto {
    private Long id;
    private String name;
    private String role;
    private List<BookDto> booksDto;
}
