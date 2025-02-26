package com.construct;

public class Constructor4 {
	int id;
	String name;
	float salary;

		public Constructor4(int eid,String ename,float esalary) {
			
			System.out.println("id "+eid+" "+"name: "+ename+" "+"salary :"+esalary);
			
		}
		void display() {
			System.out.println("id "+id+" "+"name: "+name+" "+"salary :"+salary);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Constructor4(101,"aaa",100000f). display() ;
	}

}
