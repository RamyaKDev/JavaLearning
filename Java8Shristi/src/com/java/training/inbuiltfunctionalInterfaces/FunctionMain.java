package com.java.training.inbuiltfunctionalInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionMain {
	public static void main(String[] args) {
		
		Function<String,Integer> strLength=str->str.length();
		System.out.println(strLength.apply("Welcome"));
		
		Function<Integer,Integer> intfun=num->num*5;
		System.out.println(intfun.apply(12));
		
		Function<List<String>,String> listfun=usernames->{
			for(String username:usernames) {
				if(username.startsWith("S"))
					return username;
			}
			return "wrong username";
		};
		System.out.println(listfun.apply(Arrays.asList("Sarav","Ramya")));
		
		BiFunction<List<String>,Integer,List<String>> listbifun=(usernames,num)->{
			List<String> newList=new ArrayList<String>();
			for(String username:usernames) {
				if(username.length()>=num)
					newList.add(username);
			}
			return newList ;
		};
		System.out.println(listbifun.apply(Arrays.asList("Saravanan","Ramya","Adhithishri","Pranavan"),5));
		
	}
}
