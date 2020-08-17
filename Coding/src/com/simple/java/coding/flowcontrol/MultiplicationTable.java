package com.simple.java.coding.flowcontrol;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number:- ");
		int no=sc.nextInt();
		for(int i=1;i<=10;i++) {
		 System.out.println(no+"*"+i+"="+no*i);
		}

	}

}
