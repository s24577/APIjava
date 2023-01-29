package com.example.client.contract;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class ResultDto {
    private List<ShorterBookDto> books;
}
