package com.example.hpwebapi.controller;

import com.example.hpwebapi.contract.BookDto;
import com.example.hpwebapi.service.IBookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
//@Log4j2
public class BookController {
    private final IBookService bookService;

    @GetMapping("/artist")
    public List<BookDto> getAll(){
        //log.warn("Exposing all data.");
        return bookService.getAll();
    }
}
