package com.simple.java.coding.flowcontrol;

public class ForLoopTest4 {

	public static void main(String[] args) {
	/*	for(int i=0;true;i++) {
			System.out.println("Hello");
		}
		System.out.println("Hi");  */  //invalid
		
	/*	for(int i=0;false;i++) {
			System.out.println("Hello");
		}
		System.out.println("Hi"); */  //invalid
		
	/*	for(int i=0;;i++) {
			System.out.println("Hello");
		}
		System.out.println("Hi");  */   //invalid
		
	/*	int a=10,b=20;
		for(int i=0;a<b;i++) {
			System.out.println("Hello");
		}
		System.out.println("Hi");  */  //valid
		
	/*	int a=10,b=20;
		for(int i=0;a>b;i++) {
			System.out.println("Hello");
		}
		System.out.println("Hi"); */  //valid
		
		
	/*	final int a=10,b=20;
		for(int i=0;a<b;i++) {
			System.out.println("Hello");
		}
		System.out.println("Hi");  */  //invalid
		

	
	
	/* final int a=10,b=20;
	for(int i=0;a>b;i++) {
		System.out.println("Hello");
	} 
	System.out.println("Hi"); */ //invalid

}
}
