package com.shristi.autowire;

import org.springframework.stereotype.Component;

@Component
public class FrontEnd implements Icourse{

	@Override
	public void show_courses() {
		System.out.println("HTML,CSS and JS");
		
	}

}
