package com.jia.mapper;

import org.apache.ibatis.annotations.Param;
import com.jia.pojo.Books;

import java.util.List;

/**
 * @author ： jiachuixun
 * @date ： 2020-04-24 15:21
 */
public interface BookMapper {
    //添加数据
    int addBooks(Books books);

    //删除数据
    int deleteBookById(@Param("bookId") int id);

    //更新数据
    int updateBook(Books books);

    //查询一条数据
    Books queryBookById(@Param("bookId") int id);

    //查询全部数据
    List<Books> queryAllBook();

    //查询指定的书籍
    Books queryBooksByName(@Param("bookName") String bookName);
}
