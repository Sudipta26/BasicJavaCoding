package com.simple.java.coding.enums;

enum beer2{
	
	KF,KO,RC,FO
}


public class EnumTest2 {

	public static void main(String[] args) {
		
		beer2 b=beer2.KF;
		
		switch(b) {
		
		case KF:
			      System.out.println("This is KF ");
			      break;
		case KO:
			      System.out.println("This is KO ");
			      break;
		case RC:
			      System.out.println("This is RC ");
			      break;
			      
		case FO:
			      System.out.println("This is RC ");
			      break;
	//	case KL: //invalid , not a enum constant	      
		default: 
			      System.out.println("This is default ");
		}
		
		
		

	}

}
