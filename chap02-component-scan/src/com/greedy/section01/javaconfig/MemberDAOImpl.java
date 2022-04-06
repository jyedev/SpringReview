package com.greedy.section01.javaconfig;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component(value="memberDAO")
public class MemberDAOImpl implements MemberDAO{

	private final Map<Integer, MemberDTO> memberMap;
	public MemberDAOImpl() {
		memberMap = new HashMap<>();
		
		memberMap.put(1, new MemberDTO(1, "user01", "pass01", "유관순"));
		memberMap.put(2, new MemberDTO(2, "user02", "pass02", "홍길동"));
	}
	
	//매개변수로 전달받은 회원 번호를 map에서 조회 후 회원 정보를 리턴해주는 용도의 메소드
	@Override
	public MemberDTO selectMember(int sequence) {
		
		return memberMap.get(sequence);
	}
	
	//매개변수로 전달 받은 회원 정보를 map에 추가하고 성공 실패 여부를 boolean으로 리턴하는ㅁ ㅔ소드
	@Override
	public boolean insertMember(MemberDTO newMember) {
		
		int before = memberMap.size();
		
		memberMap.put(newMember.getSequence(), newMember);
		
		int after = memberMap.size();
		
		return (after > before) ? true : false;
	}

	
	
}
