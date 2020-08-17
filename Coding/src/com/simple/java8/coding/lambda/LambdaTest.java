package com.simple.java8.coding.lambda;

public class LambdaTest{

	public static void main(String[] args) {
		int width=10;
		Drawable d=()-> {
			System.out.println("Drawing "+width);
	};
		d.draw();
		

	}

}
