package com.assignments;

public abstract  class FactoryDemo extends SmartPhone{
 //	Add the below abstract methods
//	– void verifyFingerPrint()
//	– void providePattern()
//	– Add non abstract method void browse()
//	– print ‘Factory Demo browsing’ inside browse() method definition
//	– Add variable boolean isOriginalPiece and assign ‘false’ as value.
//	– Add static variable int price and set value as 0.
	
	boolean isOriginalPiece=false;
	static int price=0;
	abstract void verifyFingerPrint();
	abstract void providePattern();
	
	void browse() {
		System.out.println("Factory Demo browsing");
	}
	

	@Override
	public int call(int seconds) {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	void sendMessage() {
		// TODO Auto-generated method stub
		System.out.println("Sending message");
	}

	@Override
	void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("Receiving call");
	}
	
}
