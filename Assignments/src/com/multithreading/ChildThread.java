package com.multithreading;

public class ChildThread {

	public static void main(String[] args) {
		DemoThread dt=new DemoThread();
		dt.start();
		dt.start();
		ChildThread ct=new ChildThread();
		ct.display();
	}
	public void display() {
		for(int i=0;i<5;i++) {
			System.out.println("Child Thread "+i);
		}
	}

}
