package com.simple.java.coding.flowcontrol;

public class ForEachLoopTest3 {

	public static void main(String[] args) {
		//we can't print reverse order using for-each loop
		//but we can print reverse order using for loop
		
		int[] x= {10,20,30,40,50,60,70,80,90,100};
		for(int i=x.length-1;i>=0;i--) {
			System.out.println(x[i]);
		}
		

	}

}
