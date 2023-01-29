package com.example.hpwebapi.contract;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {

    private String title;
    @JsonProperty("image_url")
    private String imageUrl;
    @JsonProperty("book_artists")
    private List<ArtistDto> bookArtistsDto;
    private int pages;
    @JsonProperty("release_date")
    private Date releaseDate;

}
