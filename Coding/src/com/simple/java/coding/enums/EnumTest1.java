package com.simple.java.coding.enums;


/* enum Beer1{ //valid
	
	KF,BW,FO,RC
  } */

public class EnumTest1 {
	
 /*	public void ma() {
		enum y; //invalid inside method
	} */
	
	enum Beer1{ //valid
		
		KF,BW,FO,RC
	  } 

	public static void main(String[] args) {
		
	/*	enum Beer1{ //invalid 
			
			KF,BW,FO,RC
		  }  */
		
		
		Beer1 b1= Beer1.FO;
		System.out.println(b1);

	}

}
