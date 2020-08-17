package com.simple.java.coding.enums;



enum Beer4{
	KF,KO,RC,FO;
}

public class EnumTest3 {

	public static void main(String[] args) {
		Beer4[] b = Beer4.values();
		for(Beer4 b1:b) {
			System.out.println(b1);
		}
		
        
	}

}
