package com.simple.java.coding.string;

public class StringImmutiablityTest {
	private int i;
	StringImmutiablityTest(int i){
		this.i=i;
	}
	public StringImmutiablityTest modify(int i) {
		
		if(this.i==i) {
			return this;
		}else {
			return (new StringImmutiablityTest(i));
		}
	}

	public static void main(String[] args) {
		
		StringImmutiablityTest t1=new StringImmutiablityTest(10);
		StringImmutiablityTest t2=t1.modify(100);
		StringImmutiablityTest t3 =t1.modify(10);
		
		System.out.println(t1==t2);
		System.out.println(t1==t3);
		

	}

}
