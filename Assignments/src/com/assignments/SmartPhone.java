package com.assignments;

public abstract class SmartPhone {
	public abstract int call(int seconds);
	abstract void sendMessage();
	abstract void receiveCall();
	void browse() {
		System.out.println("SmartPhone browsing");
	}
	public SmartPhone()
	{
	System.out.println("Smartphone under development");
	}
}
