package com.assessment.library.controller;


import com.assessment.library.dto.PriceUpdateRequest;
import com.assessment.library.model.Book;
import com.assessment.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    private final BookService bookService;

    @Autowired
    public BookController(BookService BookService) {
        this.bookService = BookService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Book getBookById(@PathVariable String id) {
        return bookService.getBookById(Long.parseLong(id));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteBookById(@PathVariable String id) {
        bookService.deleteBookById(Long.parseLong(id));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Book createBook(@RequestBody Book Book) {
        return bookService.createNewBook(Book);
    }

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public  Book update(@PathVariable String id, @RequestBody PriceUpdateRequest request) {
        return bookService.updatePriceByBookId(Long.parseLong(id), request.getPrice());
    }
}
