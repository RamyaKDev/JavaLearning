package com.shristi.constr;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
	private String studentName;
	private Dept dept;
	//No default constructor
	//Add parameterized constructor for dependency
	//No setter based DI
	//No need @Autowired for constructor DI
	
	
	public Student( Dept dept) {
		super();		
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", dept=" + dept + "]";
	}
	public String getStudentName() {
		return studentName;
	}
	@Value("RAMYA")
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
}
