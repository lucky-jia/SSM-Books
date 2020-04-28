package com.jia.controller;

import com.jia.pojo.Books;
import com.jia.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ： jiachuixun
 * @date ： 2020-04-24 15:20
 */
@Controller
@RequestMapping("/book")
public class BooksController {

    @Autowired
    private BooksService booksService;

    // 查询全部的数据，并且返回到一个数据展示页面
    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> books = booksService.queryAllBook();
        model.addAttribute("books",books);
        return "allBook";
    }

    // 跳转到添加书籍页面
    @RequestMapping("/toAddPaper")
    public String toAddPaper(){
        return "addBook";
    }

    // 添加书籍请求
    @RequestMapping("/addBook")
    public String addBook(Books books){
        System.out.println("addBook-->"+books);
        booksService.addBooks(books);
        return "redirect:/book/allBook";
    }

    // 跳转到修改页面
    @RequestMapping("/toUpdate")
    public String toUpdatePaper(int id,Model model){
        Books books = booksService.queryBookById(id);
        model.addAttribute("Qbook",books);
        return "updateBook";
    }

    // 修改书籍
    @RequestMapping("/updateBook")
    public String updateBook(Books books){
        System.out.println("updateBook-->"+books);
        booksService.updateBook(books);
        return "redirect:/book/allBook";
    }

    // 删除书籍
    @RequestMapping("/deleteBook/{bookId}")
    public String deleteBook(@PathVariable("bookId") int id){
        booksService.deleteBookById(id);
        return "redirect:/book/allBook";
    }

    // 查询名称书籍
    @RequestMapping("/queryBook")
    public String queryBook(String bookName,Model model){
        Books books = booksService.queryBooksByName(bookName);

        List<Books> list = new ArrayList<Books>();
        list.add(books);

        if (books == null){
            list = booksService.queryAllBook();
            model.addAttribute("error","未查到相关内容");
        }

        model.addAttribute( "list", list);
        return "allBook";
    }

}
