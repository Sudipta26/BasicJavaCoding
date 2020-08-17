package com.simple.java.coding.string;

public class StringTest {

	public static void main(String[] args) {
		String s=new String("Durga");
		s.concat("Software");
		System.out.println(s);
		
		
		StringBuffer sb=new StringBuffer("Durga");
		sb.append("Software");
		System.out.println(sb);
		
		StringBuilder sbu=new StringBuilder("Durga");
		sbu.append("Software");
		System.out.println(sbu);

	}

}
