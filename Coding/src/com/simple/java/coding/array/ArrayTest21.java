package com.simple.java.coding.array;

import java.util.HashSet;
import java.util.Set;

public class ArrayTest21 {

	public static void main(String[] args) {
		int[] a= {3,5,4,3,2,2,1,3,2};
		
		Set<Integer> s=new HashSet<>();
		
		for(int no:a) {
			
			//if(s.add(no)==false) {
			//	System.out.println("The duplicate value are "+no);
			//}
			
		boolean b=s.add(no);
		if(b==false) {
			System.out.println("The duplicate value are "+no);
			
		}
		}

	}

}
