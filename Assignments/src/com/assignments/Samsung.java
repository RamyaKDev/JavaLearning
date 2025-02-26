package com.assignments;

public class Samsung extends FactoryDemo{
	int price=5000;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Samsung sam=new Samsung();
		sam.browse();
		System.out.println("sam.price :"+sam.price);
	}

	@Override
	void verifyFingerPrint() {
		// TODO Auto-generated method stub
		System.out.println("Verifying Finger print");
	}

	@Override
	void providePattern() {
		// TODO Auto-generated method stub
		System.out.println("Provide pattern");
	}

}
