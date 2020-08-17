package com.simple.java.coding.array;

public class ArrayTest4 {

	public static void main(String[] args) {
		
		sum(new int[] {10,20,30});
		
	}
		public static void sum(int[] x) {
			
			int total=0;
			for(int x1:x) {
				total=total+x1;
				System.out.println("the Sum is " +total);
			}
		}

	}


