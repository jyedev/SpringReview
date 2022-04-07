package com.greedy.section01.javaconfig.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import com.greedy.section01.javaconfig.MemberDAO;

@Configuration
@ComponentScan(basePackages="com.greedy.section01.javaconfig",
		excludeFilters= {
			@ComponentScan.Filter(
					//1. 타입으로 설정
//					type=FilterType.ASSIGNABLE_TYPE,
//					classes= {MemberDAO.class}
					//2. 어노테이션 종류로 설정
//					type=FilterType.ANNOTATION,
//					classes= {org.springframework.stereotype.Component.class}
					//3. 표현식으로 설정
					type=FilterType.REGEX,
					pattern= {"com.greedy.section01.*"}
					)
		})
public class ContextConfiguration2 {
	
}
