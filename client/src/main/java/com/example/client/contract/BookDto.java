package com.example.client.contract;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Getter
@Setter
public class BookDto {

    private Long id;
    private String title;
    @JsonProperty("image_url")
    private String imageUrl;
    @JsonProperty("book_artists")
    private List<ArtistDto> bookArtistsDto;

    private int pages;
    @JsonProperty("release_date")
    private Date releaseDate;

}
