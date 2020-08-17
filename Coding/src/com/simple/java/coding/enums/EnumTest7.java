package com.simple.java.coding.enums;

 enum Beer8 {
	KF,KO,RC,FO;
	
	 Beer8(){
		 System.out.println("Constructor");
	 }

}



public class EnumTest7 {

	public static void main(String[] args) {
		
		Beer8 b=Beer8.KF;
		System.out.println("Hello");
		

	}

}
