package com.greedy.section01.fieldinjection.javaconfig;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

/* 현재 이 클래스를 스프링 빈으로 등록한다.
 * bean으로 생성 시 고유한 이름을 지정할 수 있다. */
@Repository("bookDAO")
public class BookDAOImpl implements BookDAO {

	private Map<Integer, BookDTO> bookList;
	
	public BookDAOImpl() {
		bookList = new HashMap<>();
		bookList.put(1, new BookDTO(1, 123456, "자바의 정석", "남궁성", "도우출판", new java.util.Date()));
		bookList.put(2, new BookDTO(2, 654321, "칭찬은 고래도 춤추게 한다", "고래", "고래출판", new java.util.Date()));
	}

	@Override
	public List<BookDTO> selectBookList() {

		return new ArrayList<BookDTO>(bookList.values());
	}

	@Override
	public BookDTO selectOneBookd(int sequence) {
		
		return bookList.get(sequence);
	}

	
}
