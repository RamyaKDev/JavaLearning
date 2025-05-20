package com.first;

import java.util.Random;
import java.util.Scanner;

public class Number_Guessing_Game {

	public static void main(String[] args) {
		int real_number=(int) Math.round(Math.random()*100);
		Scanner scanner=new Scanner(System.in);
		int no_of_attempts=10;
		while(no_of_attempts>0) {
			System.out.println("Enter the number from 1 to 100 to guess");
			int guess_number=scanner.nextInt();
			if(real_number==guess_number) {
				System.out.println("Hooray you found the number");
			break;
			}
			else if(real_number>guess_number) 
				System.out.println("Think higher number");
			
			else
				System.out.println("Think Lower number");
			no_of_attempts++;
			}
		
		
		if(no_of_attempts==10)
			System.out.println("You are Exhausted, the correct number is "+real_number);
	}
	
}

