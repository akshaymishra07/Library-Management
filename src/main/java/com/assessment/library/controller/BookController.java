package com.assessment.library.controller;


import com.assessment.library.model.Book;
import com.assessment.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    private final BookService BookService;

    @Autowired
    public BookController(BookService BookService) {
        this.BookService = BookService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Book> getAllBooks() {
        return BookService.getAllBooks();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Book getBookById(@PathVariable String id) {
        return BookService.getBookById(Long.parseLong(id));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteBookById(@PathVariable String id) {
        BookService.deleteBookById(Long.parseLong(id));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Book createBook(@RequestBody Book Book) {
        return BookService.createNewBook(Book);
    }

    @PatchMapping
    @ResponseStatus(HttpStatus.OK)
    public  Book update() {return new Book();
    }
}
