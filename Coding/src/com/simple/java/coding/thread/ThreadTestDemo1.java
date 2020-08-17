package com.simple.java.coding.thread;

public class ThreadTestDemo1 implements Runnable{
	
	public void run() {
		
		System.out.println("Thread is running using runnable ");
	}

	public static void main(String[] args) {
		ThreadTestDemo1 t1=new ThreadTestDemo1();
		Thread t2=new  Thread(t1);
		t2.start();
	}

}
