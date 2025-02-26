package com.Collection;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;
public class Homework_final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);
		  ArrayList al=new ArrayList();
	        System.out.print("Enter a value: ");
	        
	        
	        while(true){
	        	String input = scanner.next();
	        if(input.equals("no")){
	            break;
	        }
	        else {
	        	al.add(input);
	        	scanner.nextLine();
	        }
	        System.out.println("ArrayList "+al);
	        }
	       
	        //System.out.println("Loop exited.");
	        scanner.close();
	        System.out.println("Before sorting "+al);
	        TreeSet ts=new TreeSet(al);
	        System.out.println("After sorting "+ts);
	    }
	       
}


