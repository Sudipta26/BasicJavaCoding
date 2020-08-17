package com.simple.java.coding.thread;

public class ThreadTestDemo3 extends Thread {
	
	public void run() {
		System.out.println("Thread is running");
	}

	public static void main(String[] args) {
		
		ThreadTestDemo3 t= new ThreadTestDemo3();
		t.start();
		//t.start(); // excetion java.lang.IllegalThreadStateException
		t.run();

	}

}
