package com.patterns;

public class FibonacciRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int no=0;no<10;no++){
	System.out.print(findfib(no)+" ");
}
	}

	private static int findfib(int no) {
		// TODO Auto-generated method stub
		if(no==0)
			return no;
		else if(no==1)
			return no;
		else
			return findfib(no-1)+findfib(no-2);
	}

}
