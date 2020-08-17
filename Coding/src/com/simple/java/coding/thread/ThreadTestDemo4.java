package com.simple.java.coding.thread;

public class ThreadTestDemo4 implements Runnable {
	public void run() {
		System.out.println("Runnable theread running");
	}

	public static void main(String[] args) {
		ThreadTestDemo4 t= new ThreadTestDemo4();
		Thread t1=new Thread(t);
		t1.start();
		
		

	}

}
