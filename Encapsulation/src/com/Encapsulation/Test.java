package com.Encapsulation;
class Student{
	private String name;
	private int no;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}
	
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		
		s.setName("AAA");
		s.setNo(10);
		System.out.println(s.getName());
		System.out.println(s.getNo());
		
	}

}
