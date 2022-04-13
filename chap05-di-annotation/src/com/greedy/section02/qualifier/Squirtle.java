package com.greedy.section02.qualifier;

import org.springframework.stereotype.Component;

@Component
public class Squirtle implements Pokemon {

	@Override
	public void attack() {
		System.out.println("꼬북꼬북 물대포 공격~~푸슉~~");
	}

}
