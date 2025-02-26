package com.assignments;

public class Teacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
School teacher=new School();
teacher.conduct_exams();
teacher.publish_results(75);
System.out.println("Static school name "+School.school_name);
//System.out.println("private "+teacher.salary);
	}

}
