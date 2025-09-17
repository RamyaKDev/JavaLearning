package com.java.training.inbuiltfunctionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerMain {

	public static void main(String[] args) {
		Consumer<String> con=(name)->System.out.println("Hello "+name);
		con.accept("Pranav");
		
		Consumer<Integer> square=(num)->System.out.println("Area "+num*num);
		square.accept(2);
		
		BiConsumer<Integer,Integer> add=(x,y)->System.out.println("Add of 2 numbers "+x+y);
		add.accept(5, 10);
		
		BiConsumer<List<String>,String> cons=(usernames,user)->{
			for(String username:usernames) {
				if(username.equals(user))
					System.out.println(username.toUpperCase());
			}
		};
		
		cons.accept(List.of("Pranav","Adhithi","Sarav","Ramya"), "Adhithi");
	}

}
