package com.java.training.methodreference;

//firstway: class implements interface
class GreeterImpl implements Greeter{

	@Override
	public String greet(String username) {		
		return "welcome "+username;
	}
	
}
public class StaticRefMain {

	public static void main(String[] args) {
		Greeter classimpl=new GreeterImpl();
		System.out.println(classimpl.greet("Class"));
		
		//second way usimh annonymous inner class
		Greeter anno=new Greeter() {

			@Override
			public String greet(String username) {
				return "hi "+username;
			}
			
		};
		System.out.println(anno.greet("Annonymous inner class"));
		
		//thirdway: Lambda expression
		Greeter lam=username->"vanakkam "+username;
		System.out.println(lam.greet("Lambda"));
		
		//4th way: Method Reference
		Greeter meth=Trial::sayhello;
		System.out.println(meth.greet("Method Reference "));
	}

}
