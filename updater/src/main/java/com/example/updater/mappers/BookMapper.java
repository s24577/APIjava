package com.example.updater.mappers;

import com.example.client.contract.BookDto;
import com.example.data.model.Book;
import org.springframework.stereotype.Component;

@Component
public class BookMapper implements IMapEntities<BookDto, Book> {
    @Override
    public Book map(BookDto bookDto) {
        return map(bookDto, new Book());
    }

    @Override
    public Book map(BookDto bookDto, Book book) {
        book.setTitle(bookDto.getTitle());
        // book.setPages(bookDto.getPages());
        book.setImageUrl(bookDto.getImageUrl());
        book.setReleaseDate(bookDto.getReleaseDate());
        return book;
    }
    
}
