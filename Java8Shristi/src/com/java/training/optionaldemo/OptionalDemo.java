package com.java.training.optionaldemo;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		String str=null;
		//System.out.println(str.toUpperCase());
		
		Optional<String> optstr=Optional.ofNullable(str);
		//System.out.println(optstr.get());
		
		String str1="Welcome";
		Optional<String> optstr1=Optional.of(str1);
		System.out.println(optstr1.get().toLowerCase());
		
		System.out.println();
		System.out.println("using isEmpty()");
		if(!optstr1.isEmpty())
			System.out.println(optstr1.get().toUpperCase());
		
		System.out.println();
		System.out.println("using isPresent(Consumer)");
		if(optstr1.isPresent())
			System.out.println(optstr1.get().toLowerCase());
		
		System.out.println();
		System.out.println("using ifPresent");
		optstr1.ifPresent(System.out::println);//it has value
		optstr.ifPresent(System.out::println);//it is empty
		
		System.out.println();
		System.out.println("using ifPresentorElse()");
		optstr1.ifPresentOrElse(st->System.out.println(st), ()->System.out.println("No data found"));
		optstr.ifPresentOrElse(st->System.out.println(st), ()->System.out.println("No data found"));
	}

}
