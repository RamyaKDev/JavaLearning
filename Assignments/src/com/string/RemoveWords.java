package com.string;

import java.util.Scanner;

public class RemoveWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] stop_words = {"in", "at", "near", "around"}; 
		
		StringBuffer sb=new StringBuffer();
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter the sentence");
			String input = sc.nextLine(); 
			
			String[] inp= input.split(" ");
			
			for(String i : inp) {
				boolean flag=false;
				for(String s : stop_words) {
					if((i.equalsIgnoreCase(s)))				
						flag=true;									
			}
				if(flag==false)
				sb.append(i);
				sb.append(" ");
		}
			System.out.println(sb);
			
	}
		
	}
	


