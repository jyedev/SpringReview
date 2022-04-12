package com.greedy.section01.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class Application {

	public static void main(String[] args) {
		
		/* 여러 개의 bean의 상호 작용(조립) 테스트 */
		
		ApplicationContext context = new GenericXmlApplicationContext("com/greedy/section01/xmlconfig/config/spring-context.xml");
		
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
