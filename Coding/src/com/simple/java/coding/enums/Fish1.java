package com.simple.java.coding.enums;

public enum Fish1 {
	 ;
	//STAR,GUPPY;  //in addition to constant if we take anything like method or variable then semicolon is mandatory
	
	/* public void m1() { //only method we can't take, constant is needed in firstline
		
	} */ 
   // STAR, GUPY
	
	public static void m2() { //at list semicolon needed to write method
		System.out.println("From m2 method ");
	}
	public static void main(String[] args) {
		m2();
	//	Fish1 f=new Fish1(); //we can't create object for enum
	}
}
