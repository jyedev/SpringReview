package com.greedy.section01.primary;

import org.springframework.stereotype.Component;

@Component
public class Squirtle implements Pokemon{

	@Override
	public void attack() {
		System.out.println("꼬북꼬북");
	}

}
