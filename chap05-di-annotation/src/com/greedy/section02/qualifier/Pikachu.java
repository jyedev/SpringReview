package com.greedy.section02.qualifier;

import org.springframework.stereotype.Component;

@Component
public class Pikachu implements Pokemon {

	@Override
	public void attack() {
		System.out.println("피카츄 백만볼트~~~찌지지지ㅣㄱ~~");
	}
	
}
