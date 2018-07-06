package com.example.book_system.repository;

import com.example.book_system.domain.BookInfo;
import com.example.book_system.domain.Pagination;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BookInfoMapper {

    List<BookInfo> findBooks(@Param("bookInfo") BookInfo bookInfo, @Param("pagination") Pagination pagination);
    Integer pageCount(@Param("bookInfo") BookInfo bookInfo);

}
