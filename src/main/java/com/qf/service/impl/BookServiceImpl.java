package com.qf.service.impl;

import com.qf.dao.BookMapper;
import com.qf.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookMapper {

    @Autowired
    BookMapper bookMapper;

    @Override
    public List<Book> findAllBook() {
        return bookMapper.findAllBook();
    }

    @Override
    public int updateBookById(Book book) {
        return bookMapper.updateBookById(book);
    }

    @Override
    public int delBook(Integer id) {
        return bookMapper.delBook(id);
    }

    @Override
    public int addBook(Book book) {
        return bookMapper.addBook(book);
    }

    @Override
    public Book selBookById(Integer id) {
        return bookMapper.selBookById(id);
    }
}
