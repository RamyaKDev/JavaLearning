package com.first;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student[] student=new Student[5];	
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter Student Name");
			String studentName=scanner.next();
			System.out.println("Enter department");
			String department=scanner.next();
			
			student[i]=new Student(studentName,department);
		}
		
		for(Student students:student){
			System.out.println(students);
		}

	}

}
