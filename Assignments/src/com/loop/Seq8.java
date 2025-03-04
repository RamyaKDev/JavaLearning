package com.loop;
//1 2 3 4 5  
//10 9 8 7 6  
//1 2 3 4 5  
//10 9 8 7 6  
//1 2 3 4 5  
//10 9 8 7 6  

public class Seq8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=1,i=1;;
		while(count<=5) {
	for( i=1;i<=5;i++) {
		System.out.print(i+" ");
	}
	count=count+1;
//	if(count==25) 
//		break;
	//System.out.print("count "+count);
	System.out.println(" ");
	 int j=i+4;
	while(j>=6) {
		
		System.out.print(j+" ");
		j--;
	}
	count=count+1;
	System.out.println(" ");
//	if(count==25) 
//		break;
//}
	}
	}
}
