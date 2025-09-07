package com.assessment.library.service.impl;

import com.assessment.library.exception.BadRequestException;
import com.assessment.library.exception.ElementNotFoundException;
import com.assessment.library.model.Book;
import com.assessment.library.repository.BookRepository;
import com.assessment.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultBookService implements BookService {


    private final BookRepository bookRepository;

    @Autowired
    public DefaultBookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBookById(Long bookId) {

        return bookRepository.findById(bookId)
                .orElseThrow(() -> new ElementNotFoundException("Book with "+bookId+" not found"));
    }

    @Override
    public Book createNewBook(Book book) {
        if(null != book.getId()){
            throw new BadRequestException("Id must not be provided when creating new book, to be assigned by the system");
        }

        return bookRepository.save(book);
    }

    @Override
    public void deleteBookById(Long bookId) {
        Book book =  bookRepository.findById(bookId)
                .orElseThrow(() -> new ElementNotFoundException("Book with "+bookId+" not found"));

        if(null != book){
            bookRepository.delete(book);
        }
    }

    @Override
    public Book updatePriceByBookId(Long bookId, Double price) {
        Book book = getBookById(bookId);
        book.setPrice(price);
        return bookRepository.save(book);
    }

}
