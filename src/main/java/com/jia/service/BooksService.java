package com.jia.service;

import com.jia.pojo.Books;

import java.util.List;

public interface BooksService {
    //添加数据
    int addBooks(Books books);

    //删除数据
    int deleteBookById(int id);

    //更新数据
    int updateBook(Books books);

    //查询一条数据
    Books queryBookById(int id);

    //查询全部数据
    List<Books> queryAllBook();

    //查询指定的书籍
    Books queryBooksByName(String bookName);
}
