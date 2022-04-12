package com.greedy.section01.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.greedy.section01.javaconfig.config.ContextConfiguration1;

public class Application1 {

	public static void main(String[] args) {
		
		/* 여러 개의 bean의 상호 작용(조립) 테스트 */
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration1.class);
		
		MemberDTO member = context.getBean(MemberDTO.class);
		
		System.out.println(member);
		
		System.out.println(member.getPersonalAccount().getBalance());
		System.out.println(member.getPersonalAccount().deposit(10000));
		System.out.println(member.getPersonalAccount().getBalance());
		System.out.println(member.getPersonalAccount().deposit(5000));
		System.out.println(member.getPersonalAccount().withDraw(2000));
		System.out.println(member.getPersonalAccount().getBalance());
		
		
	}
}
