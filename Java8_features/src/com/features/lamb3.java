package com.features;

interface it2{
	String welcome();
}
public class lamb3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		it2 i= () -> {
			// TODO Auto-generated method stub
			return "Ramya";
		};
			String y=i.welcome();
			System.out.println(y);
	}

}
