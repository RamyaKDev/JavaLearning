package com.java.training.functionalInterface;

@FunctionalInterface
public interface Greet {
void welcomeUser(String name);
}

class User implements Greet{

	@Override
	public void welcomeUser(String name) {
		System.out.println("Hello "+name);
		
	}
	
}