package com.shk.controller;

import com.shk.pojo.Books;
import com.shk.service.BookService;
import com.shk.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    @RequestMapping("/allBook")
    public String list(Model model) {
        List<Books> list = bookService.queryAllBook();
        model.addAttribute("list", list);
        return "allBook";
    }

//@RequestMapping("/hello")
//public String hello(Model model){
//    model.addAttribute("msg","523真帅");
//    return "hello";//会被视图解析器处理
//}
}
