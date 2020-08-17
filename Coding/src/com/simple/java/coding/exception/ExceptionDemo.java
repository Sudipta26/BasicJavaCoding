package com.simple.java.coding.exception;

public class ExceptionDemo {
	

	public static void main(String[] args) {
		try{
			int a=100/0;
			System.out.println(a);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}finally {
			System.out.println("\n Finaly block always execute ");
		}

	}

}
