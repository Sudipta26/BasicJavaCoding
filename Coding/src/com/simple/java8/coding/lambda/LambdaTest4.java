package com.simple.java8.coding.lambda;

public class LambdaTest4 {
	public static void main(String[] args) {
		Interf2 i=()->System.out.println("Hellow from lambda ");
		i.m1();
		  Interf3 i3= (a,b)-> System.out.println("The sum is " + (a+b));
	              i3.m1(20,30);
	}

}
