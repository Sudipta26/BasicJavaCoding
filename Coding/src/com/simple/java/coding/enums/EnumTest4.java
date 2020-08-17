package com.simple.java.coding.enums;

enum Beer6{
	KF,KO,RC,FO;
}


public class EnumTest4 {

	public static void main(String[] args) {
		Beer6[] b = Beer6.values();
		for(Beer6 b1:b) {
			System.out.println(b1+"  "+b1.ordinal());
		}

	}

}
