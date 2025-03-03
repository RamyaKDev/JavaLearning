package com.loop;
//1 0 1 0 1 
//2 1 2 1 2 
//3 2 3 2 3  
//4 3 4 3 4 
//5 4 5 4 5  
 

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int no=0,count=0;
for(int i=1;i<=5;i++) {
	while(count<=25) {
		
		no=no+1;
		System.out.print(no+" ");
		count=count+1;
		if(count%5==0) {
			System.out.println(" ");
			
		}
		
		no=no-1;
		System.out.print(no+" ");
		count=count+1;
		if(count%5==0 ) {
			System.out.println(" ");
			
		}
		
	}
	
}
	}

}
