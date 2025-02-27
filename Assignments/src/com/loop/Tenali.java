package com.loop;

public class Tenali {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gift = 1024, count = 0;
		while (gift != 1) {
			gift = gift / 2;
			count = count + 1;
		}
		System.out.println("Tenali crossed " + count + " securities to meet Raja");
	}

}
