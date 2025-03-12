package com.loop;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int no=5;
int result=fact(no);
System.out.println(result);
	}

public static int fact(int no) {
	if(no==0)
		return 1;
	else
	return no*fact(no-1);
		
		
	}

}
