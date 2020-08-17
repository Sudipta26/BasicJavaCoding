package com.simple.java.coding.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListSortDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
           al.add(20);
           al.add(10);
           al.add(200);
           al.add(300);
           al.add(50);
           al.add(100);
           al.add(40);
           al.add(60);
           al.add(15);
           
		
		/*
		 * System.out.println(al);
		 * 
		 * Collections.sort(al);
		 */
		  
		  for(int alSort:al) { 
			  System.out.println(alSort);
			  }
		/*
		 * Iterator itr=al.iterator(); while(itr.hasNext()) {
		 * System.out.println(itr.next()); }
		 * 
		 * 
		 * al.stream().forEach(System.out::println);
		 */
	}

}
