package com.simple.java.coding.flowcontrol;

import java.util.Scanner;

public class SwitchTest7 {

	public static void main(String[] args) {
		
		String yn;
		do {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter first Number ");
			int no1=sc.nextInt();
			
			System.out.println("Enter second Number ");
			int no2=sc.nextInt();
			
			System.out.println("Select symbal: + - * / ");
			String sym=sc.next();
			int res;
			
			switch(sym) {
			
			case "+": res=no1+no2;
			          System.out.println("The Addition is "+res);
			          break;
			case "-": res=no1-no2;
	                  System.out.println("The Subtraction is "+res);
	                  break;
	        
			case "*": res=no1*no2;
	                  System.out.println("The Multipication is "+res);
	                  break;
	        
			case "/": res=no1/no2;
	                  System.out.println("The Divition is "+res);
	                  break;
	        
			default:
	                System.out.println("Invalid Symbal ");
	                break;
			}
			System.out.println("Do you want to continue (Press y for Yes and n for No)");
			yn=sc.next();
			
		}while(yn.equals("y")|yn.equals("Y"));

	}

}
