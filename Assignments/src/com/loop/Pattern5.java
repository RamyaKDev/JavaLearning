package com.loop;
//1   2   3   4   5
//5   4   3   2   1
//1   2   3   4   5
//5   4   3   2   1
//1   2   3   4   5

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=5;i++) {
			//System.out.print(i+" ");
			int no=5;
			for(int j=1;j<=5;j++) {
				
				if(i%2==0) {
					
					while(no>0) { 
					System.out.print(no+" ");
					no=no-1;
					}					
				}else {
					System.out.print(j+" ");
					//no=5;
				}
				
			}	
			System.out.println(" ");			
			}
	}

}
