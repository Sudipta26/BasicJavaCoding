package com.simple.java.coding.string;

import java.util.Scanner;

public class StringWordReverseDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Original String given by you- ");
		String os=sc.nextLine();
		sc.close();
		
		
		String[] words=os.split("\\s");
		String reverseString="";
		
		for(int i=0;i<words.length;i++) {
			if(i==words.length-1)
				reverseString=words[i] + reverseString;
			else
				reverseString=" "+ words[i] + reverseString;
		}
		System.out.println("Reverse String- " +reverseString);
		
		
	}

}
