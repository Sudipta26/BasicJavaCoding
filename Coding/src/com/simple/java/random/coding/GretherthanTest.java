//Take two int values from user and print greatest among them.
package com.simple.java.random.coding;

import java.util.Scanner;

public class GretherthanTest {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Number- ");
		int value1=sc.nextInt();
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter 2nd number- ");
		int value2=sc1.nextInt();
		
		if(value1>value2) {
			System.out.println("The gretest number among two number is- "+value1);
		}else {
			System.out.println("The gretest number among two number is- "+value2);
		}
	}
}
