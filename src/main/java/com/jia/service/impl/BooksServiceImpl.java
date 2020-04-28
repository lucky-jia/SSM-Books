package com.jia.service.impl;

import com.jia.mapper.BookMapper;
import com.jia.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import com.jia.pojo.Books;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksServiceImpl implements BooksService {

    // 业务层 调用 持久层
    @Autowired
    private BookMapper bookMapper;

    public int addBooks(Books books) {
        return bookMapper.addBooks(books);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }

    public Books queryBooksByName(String bookName) {
        return bookMapper.queryBooksByName(bookName);
    }
}
