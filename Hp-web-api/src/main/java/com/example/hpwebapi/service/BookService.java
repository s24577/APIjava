package com.example.hpwebapi.service;

import com.example.data.model.Artist;
import com.example.data.model.Book;
import com.example.data.repositories.ICatalogData;
import com.example.hpwebapi.contract.ArtistDto;
import com.example.hpwebapi.contract.BookDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService implements IBookService{

    private final ICatalogData db;
    private final ICatalogDtoMappers mapper;


    @Autowired
    public BookService(ICatalogData db, ICatalogDtoMappers mapper){
        this.db = db;
        this.mapper = mapper;
    }



    @Override
    public List<BookDto> getAll() {
        List<BookDto> all = new ArrayList<>();
        List<Book> books = db.getBook().findAll();
        for (Book book: books){

            List<ArtistDto> artistDtos =  new ArrayList<>();
//            for (Artist artist : book.getBookArtists())
                artistDtos.add(new ArtistDto());
                        //mapper.forArtists().map(artist));

            BookDto bookDto = new BookDto(
                    book.getTitle(),
                    book.getImageUrl(),
                    artistDtos,
                    book.getPages(),
                    book.getReleaseDate()


                    );
            all.add(bookDto);
        }
        return all;
    }
}
