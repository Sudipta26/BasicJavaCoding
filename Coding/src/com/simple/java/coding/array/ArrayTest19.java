package com.simple.java.coding.array;

public class ArrayTest19 {

	public static void main(String[] args) {
		int[] a= {5,8,12,7,6,2,4};
		
		int k=2;
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
			if(i==k-1) {
				System.out.println("largest element is "+a[i]);
				break;
			}
		}
		System.out.println("............");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

	}

}
