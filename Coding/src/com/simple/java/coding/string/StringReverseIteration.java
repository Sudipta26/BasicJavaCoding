package com.simple.java.coding.string;

public class StringReverseIteration {
	public static String StringReverse(String s) {
		
		char[] ch=s.toCharArray();
		String rev="";
		for(int i=ch.length-1;i>=0;i--) {
			rev+=ch[i];
			
		}
		return rev;
	}

}
