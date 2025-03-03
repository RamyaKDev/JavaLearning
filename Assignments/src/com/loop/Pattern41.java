package com.loop;
//1 0 1 0 1  
//0 1 0 1 0  
//1 0 1 0 1  
//0 1 0 1 0  
//1 0 1 0 1 
public class Pattern41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=1;
for(int i=1;i<=5;i++) {
	for(int j=1;j<=5;j++) {
		if(count%2==0) {
			System.out.print(0+" ");
		}
		else
			System.out.print(1+" ");
		count=count+1;
	}
	System.out.println(" ");
}
	}

}
