package com.simple.java.coding.string;

public class StringReverseDemo {
	public static String reverseString(String s) {
		
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		return sb.toString();
	}

}
