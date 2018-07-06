package com.example.book_system.service;

import com.example.book_system.domain.BookInfo;
import com.example.book_system.domain.Pagination;

public interface BookInfoService {

    Pagination findBooks(BookInfo bookInfo, Pagination pagination);
}
