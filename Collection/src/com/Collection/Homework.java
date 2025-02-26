package com.Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();

Scanner scanner= new Scanner(System.in); 
System.out.println("Enter a numbers to add in the arraylist");
int num=scanner.nextInt();
if(scanner.hasNextInt()) {
	System.out.println("Integer");
	while(true) {
		
		al.add(num);
		}
	//System.out.println("Arraylist "+al);
}
System.out.println("Arraylist "+al);
/*if(scanner.hasNext()){
	String str1 = scanner.nextLine();
	String str2="NO";
	 if (str1.equalsIgnoreCase(str2)) {
         System.out.println("User entered no");
         break
}
	}*/
scanner.close();
}
}