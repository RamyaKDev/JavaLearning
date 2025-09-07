package com.shristi.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Automain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext("com.shristi.autowire");
		CourseFactory factory=context.getBean(CourseFactory.class);
		factory.printcourses();
	}

}
