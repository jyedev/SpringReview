package com.greedy.section01.fieldinjection.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext("com.greedy.section01.fieldinjection.javaconfig");
		
		BookService bookService = context.getBean("bookService", BookService.class);
		
		//전체 목록 조회
		for(BookDTO b : bookService.selectAllBooks()) {
			System.out.println(b);
		}
		
		//시퀀스 검색
		System.out.println(bookService.searchBookBySequence(2));
	}
}
