package com.example.updater.mappers;

import com.example.client.contract.ShorterBookDto;
import com.example.data.model.Book;
import org.springframework.stereotype.Component;

@Component
public class ShorterBookMapper implements IMapEntities<ShorterBookDto, Book> {

    @Override
    public Book map(ShorterBookDto bookDto) {
        return map(bookDto, new Book());
    }

    @Override
    public Book map(ShorterBookDto bookDto, Book book) {
        book.setId(bookDto.getId());
        book.setTitle(bookDto.getTitle());
        book.setReleaseDate(bookDto.getReleaseDate());
        book.setImageUrl(bookDto.getImageUrl());
        return book;
    }
}
