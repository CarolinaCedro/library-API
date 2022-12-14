package io.github.CarolinaCedro.libraryapi.api.resource;

import io.github.CarolinaCedro.libraryapi.api.dto.BookDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BookDto create() {
        BookDto dto = new BookDto();
        dto.setAuthor("Autor");
        dto.setTitle("Meu Livro");
        dto.setIsbn("1213212");
        dto.setId(1L);
        return dto;
    }


}
