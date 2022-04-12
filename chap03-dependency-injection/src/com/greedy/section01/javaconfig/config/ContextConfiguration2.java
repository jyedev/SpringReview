package com.greedy.section01.javaconfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.greedy.section01.javaconfig.Account;
import com.greedy.section01.javaconfig.MemberDTO;
import com.greedy.section01.javaconfig.PersonalAccount;

@Configuration
public class ContextConfiguration2 {

	@Bean
	public Account accountGenerator() {
		
		return new PersonalAccount(20, "110-123-123456", "1234");
		
	}
	
	@Bean
	public MemberDTO memberGenerator() {
		
		MemberDTO member = new MemberDTO();
		
		member.setSequence(2);
		member.setName("유관순");
		member.setPhone("010-1234-1234");
		member.setEmail("yoo@yoo.com");
		member.setPersonalAccount(accountGenerator());
		
		return member;
	}
	
	/* Container가 bean들을 생성할 때 의존 관계에 있는 다른 bean을 다른 bean을 먼저 생성 후에 조립 시 사용한다.
	 * 이런 것을 의존 관계 주입 또는 의존성 주입이라고 한다. */
	
}
