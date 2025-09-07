package com.shristi.constr;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class StudMain {

	public static void main(String[] args) {
	
				//create the IOCContainer-
				//spring beans are created
				
				ApplicationContext context=new AnnotationConfigApplicationContext("com.shristi.constr");
				Arrays.stream(context.getBeanDefinitionNames())
				.forEach(bean->System.out.println(bean));
				
				//getting the bean from the IOC Container
				Student student=(Student) context.getBean("student");
				System.out.println(student);
				System.out.println(student.getStudentName());
				
				
				Student student1=(Student) context.getBean(Student.class);
				student1.setStudentName("ADHITHI");
				System.out.println(student1.getStudentName());
				
			}

		


	}


