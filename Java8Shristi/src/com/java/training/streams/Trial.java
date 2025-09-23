package com.java.training.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Trial {

	public static void main(String[] args) {
		
	List<Double> dou=	Arrays.asList(10.0,20.0,33.3);
	Double sum=dou.stream().mapToDouble(d->d.doubleValue()).sum();
	System.out.println(sum);
	
	List<String> fruits=List.of("Apples","Mango","Papayaa");
	Map<Integer,String> fruit=fruits.stream()
			.collect(Collectors.toMap(
					str->str.length(), st->st.toUpperCase()));
	System.out.println(fruit);
	
	//using orElse()
	List<String> nfruits=List.of("Apples","Mango","Papayaa");
	String data=nfruits.stream()
	.filter(f->f.startsWith("A"))
	.findFirst()
	//.orElse("No data");
	.orElse(show());
	System.out.println(data);
	
	//using orElseGet()
	String data1=nfruits.stream()
			.filter(f->f.startsWith("M"))
			.findFirst()
		//	.orElseGet(()->"No data1");
			.orElseGet(()->show());
			System.out.println(data1);
	}
	public static String show() {
		System.out.println("welcome");
		return "Hello";
	}

}
