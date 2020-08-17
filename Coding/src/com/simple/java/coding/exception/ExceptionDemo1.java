package com.simple.java.coding.exception;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		try {
			int[] a= {1,2,3,4};
			System.out.println(a[12]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}finally {
			System.out.println("finally block always execute ");
		}

	}

}
