package genZ;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a String");
		String s=scanner.next();
		reverse(s);

	}

	private static void reverse(String s) {
//		for(int i=s.length()-1;i>=0;i--) {
//			System.out.println(s.charAt(i));
//		}
		
		char[] chars=s.toCharArray();
		int left=0;
		int right=s.length()-1;
		while(left<right) {
			char temp=chars[right];
			chars[right]=chars[left];
			chars[left]=temp;
			left++;
			right--;			
		}
		System.out.println(new String(chars));
	}
}
