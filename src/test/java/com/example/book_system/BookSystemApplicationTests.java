package com.example.book_system;

import com.example.book_system.domain.BookInfo;
import com.example.book_system.domain.Pagination;
import com.example.book_system.repository.BookInfoMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookSystemApplicationTests {
	@Autowired
	private BookInfoMapper bookInfoMapper;

	@Test
	public void contextLoads() {
		BookInfo bookInfo = new BookInfo();
		bookInfo.setBookType(8);
		int pageCount = bookInfoMapper.pageCount(bookInfo);
		List<BookInfo> bookInfoList = bookInfoMapper.findBooks(bookInfo,new Pagination());
	}

}
