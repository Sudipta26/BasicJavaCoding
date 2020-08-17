package com.simple.java.coding.array;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] a=new int[5];
		a[0]=10;
		a[1]=11;
		a[2]=12;
		a[3]=13;
		a[4]=14;
		//a[5]=15; //java.lang.ArrayIndexOutOfBoundsException
		
		
		for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
		}

	}

}
