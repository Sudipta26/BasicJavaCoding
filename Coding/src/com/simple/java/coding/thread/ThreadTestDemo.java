package com.simple.java.coding.thread;

public class ThreadTestDemo extends Thread {
	public void run() {
		for(int i=0;i<10;i++)
		System.out.println("The thread is running ");
	}

	public static void main(String[] args) {
		ThreadTestDemo t=new ThreadTestDemo();
		t.start();
		

	}

}
