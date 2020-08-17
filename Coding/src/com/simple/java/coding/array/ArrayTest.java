package com.simple.java.coding.array;

public class ArrayTest {

	public static void main(String[] args) {
		//int[] a=new int[0];
		//int[] a1=new int[-3];  //java.lang.NegativeArraySizeException
	
	     int[] a2= {10,20,30};
	     
	     for(int i=0;i<a2.length;i++) {
	    	 System.out.println(a2[i]);
	     }
	     
	     for(int a3:a2) {
	    	 System.out.println(a3);
	     }
	
	}

}
