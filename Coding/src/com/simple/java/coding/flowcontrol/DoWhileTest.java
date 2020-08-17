package com.simple.java.coding.flowcontrol;

public class DoWhileTest {

	public static void main(String[] args) {
	/*	do
			System.out.println("Hello");
		while(true); */  //Valid
		
	/*	do;
		while(true); */  //valid
		
	/*	do
		int x=10;
		while(true); */ //invalid
		
	/*	do
		{
			int x=10;
		}while(true); */  //valid
		
	/*	do
		while(true);	*/  //invalid
		
	/*	do while(true)
			System.out.println("Hello");
		while(false);  */  //valid

	}

}
