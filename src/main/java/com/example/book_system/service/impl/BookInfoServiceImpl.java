package com.example.book_system.service.impl;

import com.example.book_system.domain.BookInfo;
import com.example.book_system.domain.Pagination;
import com.example.book_system.repository.BookInfoMapper;
import com.example.book_system.service.BookInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookInfoServiceImpl implements BookInfoService {

    @Autowired
    private BookInfoMapper bookInfoMapper;

    @Override
    public Pagination findBooks(BookInfo bookInfo, Pagination pagination) {

        int count = bookInfoMapper.pageCount(bookInfo);
        pagination.setPageCount((count % pagination.getPAGESIZE()) == 0 ? count / pagination.getPAGESIZE() : count / pagination.getPAGESIZE() + 1);
        pagination.setResults(bookInfoMapper.findBooks(bookInfo, pagination));
        //pagination.setPageCount(bookInfoMapper.pageCount(bookInfo, pagination));

        return pagination;
    }

}
