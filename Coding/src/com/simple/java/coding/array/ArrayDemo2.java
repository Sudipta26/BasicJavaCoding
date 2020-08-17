package com.simple.java.coding.array;

public class ArrayDemo2 {

	public static void main(String[] args) {
		int[] a=new int[5];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
		/*
		 * for(int a1:a) { System.out.println(a1); }
		 */
      
		for(int i=a.length;i>=0;i--) {
			System.out.println(a[i]);
		}
	}

}
