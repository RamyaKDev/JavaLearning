package com.patterns;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int no=4;
//int result=fact(no);//recursive approach
int result=fact1(no);//iterative approach
System.out.println(result);
	}

	private static int fact1(int no) {
		int factno=1;
			for(int i=1;i<=no;i++) {
				factno=factno*i;
				
			}
		
		return factno;
	}

	private static int fact(int no) {
		if(no==1)
			return 1;
		else
		return no*fact(no-1);
				
	}

}
