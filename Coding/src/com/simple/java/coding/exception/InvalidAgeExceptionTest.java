package com.simple.java.coding.exception;

import java.util.Scanner;

public class InvalidAgeExceptionTest {
	
	  static void validate(int age) throws InvalidAgeException {
		  if(age<18) 
			  throw new InvalidAgeException("Invalid for vote");
		  else
			  System.out.println("Welcome to vote");
		  
		  
	  }

	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the age- ");
			int ageGiven=sc.nextInt();
			validate(ageGiven);
		}catch(Exception e) {
			System.out.println(e);
		}
		

	}

}
