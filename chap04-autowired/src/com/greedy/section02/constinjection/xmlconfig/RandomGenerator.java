package com.greedy.section02.constinjection.xmlconfig;

public interface RandomGenerator {

	//난수 발생 메소드
	int getRandomNumber();
	
	//난수 시작 값 가져오는 메소드
	int getStartNum();
	
	//난수 종료 값 가져오는 메소드
	int getEndNum();
}
