package com.shristi.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CourseFactory {
	@Autowired  //autowire by type
	@Qualifier("frontEnd")
	private Icourse course;
	
	@Autowired //autowire by name
	private Icourse backEnd;
	
	//autowire by constructor
	private Icourse cloud;
	
	
	public CourseFactory(@Qualifier("cloud")Icourse cloud) {
		super();
		this.cloud = cloud;
	}


	public void printcourses() {
		course.show_courses();
		backEnd.show_courses();
		cloud.show_courses();
	}
}
