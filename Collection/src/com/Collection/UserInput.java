package com.Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      ArrayList al=new ArrayList();
        while (true) {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            if (input.equals("NO")) {
                break; // Exit the loop if the user enters "java"
            }

            // Do something with the input
            for(int i=0;i>0;i++) {
           
            al.add(input);
        }
            System.out.println("You entered: " + al);
        }
        System.out.println("Loop exited.");
        scanner.close();
    }

       // scanner.close();
    }
