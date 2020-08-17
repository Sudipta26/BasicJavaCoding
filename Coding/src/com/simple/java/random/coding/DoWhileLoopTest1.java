package com.simple.java.random.coding;

import java.util.Scanner;

public class DoWhileLoopTest1 {

	public static void main(String[] args) {
		//int i=10;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a number- ");
		int num=sc.nextInt();
		do {
			System.out.println(num);
			num++;
			
		}while(num<20);

	}

}
