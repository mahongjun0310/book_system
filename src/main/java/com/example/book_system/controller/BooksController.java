package com.example.book_system.controller;

import com.example.book_system.domain.BookInfo;
import com.example.book_system.domain.Pagination;
import com.example.book_system.service.BookInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BooksController {

    @Autowired
    private BookInfoService bookInfoService;


    @RequestMapping("/")
    public String books(BookInfo bookInfo, Pagination<BookInfo> pagination, Model model){
        model.addAttribute("pagination", bookInfoService.findBooks(bookInfo, pagination));
        return "books";
    }
}
