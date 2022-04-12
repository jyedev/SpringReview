package com.greedy.section01.fieldinjection.javaconfig;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

	//BookDAO 타입의 빈으로 생성된 객체를 이 프로퍼티에 자동으로 연결
	@Autowired
	private BookDAO bookDAO;
	
	public List<BookDTO> selectAllBooks() {
		return bookDAO.selectBookList();
	}
	
	public BookDTO searchBookBySequence(int sequence) {
		return bookDAO.selectOneBookd(sequence);
	}
	
}
