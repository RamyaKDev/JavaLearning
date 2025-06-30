package com.multithreading;

public class DemoThread extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Demo Thread "+i);
		}
	}
}
