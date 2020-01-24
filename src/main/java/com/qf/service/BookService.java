package com.qf.service;

import com.qf.entity.Book;

import java.util.List;

public interface BookService {

    public List<Book> findAllBook();

    public int updateBookById(Book book);

    public int delBook(Integer id);

    public int addBook(Book book);

    public Book selBookById(Integer id);
}
