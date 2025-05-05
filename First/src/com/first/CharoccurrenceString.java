package com.first;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharoccurrenceString {

	public static void main(String[] args) {
		System.out.println("Enter input");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		charOccur(str);

	}

	private static void charOccur(String str) {
		HashMap<Character,Integer> charCountMap=new HashMap<Character,Integer>();
		char[] CharArray=str.toCharArray();
		for(char c:CharArray) {
			if(charCountMap.containsKey(c)) {
				charCountMap.put(c,charCountMap.get(c)+1 );
			}
			else {
				charCountMap.put(c,1 );
			}
		}
		for(Map.Entry entry:charCountMap.entrySet()) {
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
	}

}
