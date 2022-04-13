package com.greedy.section02.constinjection.xmlconfig;

public class MakeRandomString {

	private RandomGenerator random;

	public MakeRandomString(RandomGenerator random) {
		
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
