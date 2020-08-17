package com.simple.java.coding.array;

import java.util.HashSet;

public class FirstDuplicateTest1 {

	public static void main(String[] args) {
		int[] a= {6,5,3,2,1,2,5,4};
		
		int temp=-1;
		HashSet<Integer> hs=new HashSet<>();
		
		for(int i=a.length-1;i>=0;i--) {
			if(hs.contains(a[i])) {
				temp=i;
			}else {
				hs.add(a[i]);
			}
		}
		if(temp!=-1) {
			System.out.println("First duplicate element is "+a[temp]);
		}else {
			System.out.println("There is no first duplicate element");
		}

	}

}
