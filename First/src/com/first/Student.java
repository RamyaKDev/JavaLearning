package com.first;

public class Student {
	
	String studentName;
	String department;
	public Student(String studentName, String department) {
		super();
		this.studentName = studentName;
		this.department = department;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", department=" + department + "]";
	}
	
}
