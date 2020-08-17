package com.simple.java.coding.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListSortDemo1 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("Dipika");
		al.add("Shyamal");
		al.add("Raju");
		al.add("Sudipta");
		
		System.out.println(al);
		
		Collections.sort(al);
		
		/*for(String al1:al) {
			System.out.println(al1);
		}*/
		
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
