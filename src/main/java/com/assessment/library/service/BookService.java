package com.assessment.library.service;

import com.assessment.library.model.Book;

import java.util.List;

public interface BookService {

    List<Book> getAllBooks();

    Book getBookById(Long bookId);

    Book createNewBook(Book book);

    void deleteBookById(Long bookId);

    void updatePriceByBookId(Long bookId, Double price);
}
