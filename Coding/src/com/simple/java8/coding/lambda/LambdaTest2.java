package com.simple.java8.coding.lambda;

public class LambdaTest2 {

	public static void main(String[] args) {
		Interf1 i=(a,b)->System.out.println(a+b);
		i.add(10,20);
		i.add(100, 200);

		//i.add(100.75, 200.14);
	}

}
