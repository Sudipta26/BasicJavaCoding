package com.simple.java.coding.array;

import java.util.ArrayList;

public class EvenOddFind {

	public static void main(String[] args) {
		int[] a= {8,5,10,12,3,1,4};
		
		ArrayList<Integer> al1=new ArrayList<>();
		ArrayList<Integer> al2=new ArrayList<>();
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				al1.add(a[i]);
			}else {
				al2.add(a[i]);
			}
		}
		int total1=0;
		System.out.println("Even no's are ");
		for(int no:al1) {
			total1=total1+no;
			System.out.println(no+" ");
		}
		System.out.println("\n");
		System.out.println("\nTotal number of even number are "+al1.size());
		System.out.println("Sum of all even number "+total1);
		System.out.println("...............................................................................");
		
		
		int total2=0;
		System.out.println("Odd number are ");
		
		for(int no1:al2) {
			total2=total2+no1;
			System.out.println(no1+" ");
		}
		System.out.println("\nTotal number of odd number are "+al2.size());
		System.out.println("Sum of all even number "+total2);
	}

}
