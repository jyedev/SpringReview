package com.greedy.section02.constinjection.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MakeRandomString {

	private RandomGenerator random;

	
	//public MakeRandomString(){}
	
	/* 생성자 주입의 장점
	 * 1. 필드에 final 키워드 사용이 가능 따라서 변경 불가능하게 사용 할 수 있다.
	 * 2. 순환 참조 방지 (필드 주입이나 세터 주입은 메소드 실행 시점에만 오류 발생하지만 생성자 주입의 경우 애플리케이션 실행 시점에서 확인 가능 
	 * 3. DI 컨테이너와 결합도가 낮기 때문에 테스트하기 좋다. (스프링 컨테이너 없이 테스트 가능) */
	
	@Autowired
	public MakeRandomString(RandomGenerator random) {
		//@Autowired를 주석해도 정상 동작 함
		//스프링 4.3 이후로는 생성자에 주입할 시 생성자가 한 개 뿐이라면 해당 생성자에 @Autowired 어노테이션을 생략해도 자동으로 주입해준다.
		//기본 생성자를 추가해보면 어노테이션 생략 시 오류가 발생하는 것을 확인할 수 있음
		this.random = random;
	}
	
	public String getRandomLengthString() {
		
		StringBuilder sb = new StringBuilder();
		
		int randomNumber =  random.getRandomNumber();
		for(int i = random.getStartNum(); i <= randomNumber; i++) {
			sb.append("*");
		}
		
		return sb.toString();
	}
	
	
	
}
