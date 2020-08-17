package com.simple.java.coding.flowcontrol;

public class SwitchTest4 {

	public static void main(String[] args) {
		byte b=10;
		switch(b) {
		case 10: System.out.println(10);
		          break;
		case 100: System.out.println(100);
		          break;
		//case 1000: System.out.println(1000); //invalid 
		//every case level should be match with the switch argument type          
		}

	}

}
