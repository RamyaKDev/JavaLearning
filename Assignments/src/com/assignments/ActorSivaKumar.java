package com.assignments;

public class ActorSivaKumar implements Actor {
	String address="Coimbatore";
	int age;
	String carModel;
	public ActorSivaKumar(int i, String string) {
		// TODO Auto-generated constructor stub
		age=i;
		carModel=string;
	}

	public ActorSivaKumar() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		System.out.println("Acting");
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("Singing");
	}

	@Override
	public void dance() {
		// TODO Auto-generated method stub
		System.out.println("dancing");
	}
	public void speaking() {
		System.out.println("speaking");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ActorSivaKumar as = new ActorSivaKumar(65, "Audi Car");
		as.act();
		as.dance();
		as.speaking();
		as.sing();
		System.out.println("Sivakumar address "+as.address);
		Actor a=new ActorSivaKumar();
		System.out.println("Actor address "+Actor.address);
		a.act();
		a.dance();
		a.sing();

}
}