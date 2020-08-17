package com.simple.java.coding.string;

public class StringTest3 {

	public static void main(String[] args) {
		String name="  ";
		//String name=null;
		
		
		System.out.println(name.length());
		System.out.println(name.isEmpty());
		/*
		 * int i=name.length(); if(i==0) { System.out.println("String is empty"); }
		 */
		
		/*
		 * if(name.isEmpty()==true) { System.out.println("name is empty"); }
		 */
		
		String s=name.trim();
		System.out.println(s);
		
		if(name.trim().length()==0) {
			System.out.println("string is empty");
		}
		
	}

}
