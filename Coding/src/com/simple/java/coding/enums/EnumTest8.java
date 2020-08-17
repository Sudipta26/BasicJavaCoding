package com.simple.java.coding.enums;

enum Beer9{
	KF(100),KO(75),RC(90),FO;
	//KF,KO,RC,FO;
	int price;
	
	Beer9(int price){ 
		this.price=price;
	} 
	Beer9(){
		this.price=65;
	}
	public int getPrice() {
		return price;
	}
	
	
	//abstract void m1(); //not allowed
}



public class EnumTest8 {

	public static void main(String[] args) {
		
		Beer9[] b=Beer9.values();
		for(Beer9 b1:b) {
			System.out.println(b1+"...."+b1.getPrice());
		}
 		

	}

}
