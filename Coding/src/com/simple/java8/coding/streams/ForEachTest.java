package com.simple.java8.coding.streams;

import java.util.ArrayList;

public class ForEachTest {
	public static void main(String[] args) {
		
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(50);
		l.add(20);
		l.add(60);
		l.add(80);
		l.add(25);
		
		System.out.println(l);
		l.stream().forEach(System.out::println);
	}

}
