package com.shristi.setter;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create the IOCContainer-
		//spring beans are created
		
		ApplicationContext context=new AnnotationConfigApplicationContext("com.shristi");
		Arrays.stream(context.getBeanDefinitionNames())
		.forEach(bean->System.out.println(bean));
		
		//getting the bean from the IOC Container
		Employee employee=(Employee) context.getBean("employee");
		System.out.println(employee);
	}

}
