package com.shristi.autowire;

import org.springframework.stereotype.Component;

@Component
public class BackEnd implements Icourse{

	@Override
	public void show_courses() {
		// TODO Auto-generated method stub
		System.out.println("JAVA and Springboot");
	}
	
}
