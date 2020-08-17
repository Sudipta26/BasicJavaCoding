package com.simple.java.coding.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<>();
		name.add("Sudipta");
		name.add("Shyamal");
		name.add("Rajoshri");
		name.add("Dipika");
		name.add("Koley");

		/*
		 * for(String s1:name) {
		 * 
		 * 
		 * if(s1.length()>6) System.out.println(s1);
		 * 
		 * System.out.println(s1); }
		 * 
		 * System.out.println("List of name are- "+name);
		 * 
		 */
		
		Iterator itr=name.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
