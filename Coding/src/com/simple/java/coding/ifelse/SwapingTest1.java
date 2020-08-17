package com.simple.java.coding.ifelse;

public class SwapingTest1 {

	public static void main(String[] args) {
		int a=10,b=20;
		System.out.println("the original a is "+a);
        System.out.println("the original b is "+b);
        
        a=a+b;//30
        b=a-b;//30-20=10
        a=a-b;//30=10=20
        
        System.out.println("the swaping value of a is "+a);
        System.out.println("The swaping value of b is "+b);
        

	}

}
