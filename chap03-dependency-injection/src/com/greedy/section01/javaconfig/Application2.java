package com.greedy.section01.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.greedy.section01.javaconfig.config.ContextConfiguration2;

public class Application2 {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration2.class);
		
		MemberDTO member = context.getBean(MemberDTO.class);
		
		System.out.println(member);
		
		System.out.println(member.getPersonalAccount().getBalance());
		System.out.println(member.getPersonalAccount().deposit(10000));
		System.out.println(member.getPersonalAccount().getBalance());
		System.out.println(member.getPersonalAccount().withDraw(5000));
		System.out.println(member.getPersonalAccount().getBalance());
	}
}
