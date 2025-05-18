package com.first;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindMobileNumber {

	public static void main(String[] args) {
	String input="My mobile number is 9234561789";
	Pattern pattern=Pattern.compile("[0-9]");
	Matcher matcher=pattern.matcher(input);
	while(matcher.find()) {
		System.out.print(matcher.group());
		
	}
	}

}
