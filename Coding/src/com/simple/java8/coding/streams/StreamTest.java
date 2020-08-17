package com.simple.java8.coding.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList();
		l.add(10);
		l.add(15);
		l.add(20);
		l.add(25);
		l.add(16);
		l.add(12);
		
	//List<Integer> l1=l.stream().filter(i->i%2==0).collect(Collectors.toList());
	//List<Integer> l2=l.stream().filter(i->i%2==4).collect(Collectors.toList());

	//System.out.println(l1);
	//System.out.println(l2);
		l.stream().forEach(System.out::println);
		
	}

}
