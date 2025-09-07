package com.first;

import java.util.Scanner;

public class ArrayPractise {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] names = new String[5];

		System.out.println("Enter 5 names");

		for (int i = 0; i < 5; i++) {
			names[i] = scanner.nextLine();
		}
		System.out.println("Names starting with 'R':");
		for (String name : names) {
			if (name.startsWith("R")) {
				System.out.println(name.toUpperCase());
			}
		}
		scanner.close();

	}

}
