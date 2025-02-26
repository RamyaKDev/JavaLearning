package com.Inheritance;


	class Inheritance111{
		public Inheritance111(){
			System.out.println("Parent 0 arg constructor");	
		}
	}
	
	public class Inheritance112  extends Inheritance111 {
		
		//Implicitly creates  default or empty implementation constructor
		//inside super() too
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritance112 i1=new Inheritance112();
	}

}
	