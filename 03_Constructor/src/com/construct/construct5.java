package com.construct;

public class construct5 {
	int id;
	String name;
	float salary;

		public construct5(int id,String name,float salary) {
			/*id=eid;
			name=ename;
			salary=esalary;
			
			
			System.out.println("Inside Constructor:"+"id "+eid+" "+"name: "+ename+" "+"salary :"+esalary);
*/
			
			this.id=id;
			this.name=name;
			this.salary=salary;
			System.out.println("id "+id+" "+"name: "+name+" "+"salary :"+salary);
		}
		void display() {
			System.out.println("id "+id+" "+"name: "+name+" "+"salary :"+salary);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new construct5(101,"aaa",100000f). display() ;
		new construct5(102,"bbb",200000f). display() ;
	}

}
