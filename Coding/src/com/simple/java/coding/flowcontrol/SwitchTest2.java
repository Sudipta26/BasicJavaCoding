package com.simple.java.coding.flowcontrol;

public class SwitchTest2 {

	public static void main(String[] args) {
		int x=10;
		final int y=20;
	   // int y=20;
		switch(x) {
		
		case 10: System.out.println(10);
		          break;
	//case level should be constant not variable so invalid
	//but if y is final then valid because final is constant	          
	    case y: System.out.println(20);
		           break;
		}

	}

}
