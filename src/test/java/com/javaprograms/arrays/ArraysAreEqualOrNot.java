package com.javaprograms.arrays;

import java.util.Arrays;

public class ArraysAreEqualOrNot {
	int a[]= {1,2,3,4,5,6};
	int b[]= {1,2,3,4,5,6};
	static boolean status=false;

	public static void main(String[] args) {
		ArraysAreEqualOrNot obj=new ArraysAreEqualOrNot();
		obj.EqualOrNotUsingMethod();//Using arrays method
		obj.EqualOrNotUsingForLoop();//Using loop

	}
	public void EqualOrNotUsingMethod() {
		status=Arrays.equals(a, b);
		if(status==true) {
			System.out.println("Arrays are equal");
		}else {
			System.out.println("Arrays are not equal");
		}
	}
	public void EqualOrNotUsingForLoop() {
		if(a.length==b.length) {
			for(int i=0;i<a.length;i++) {
				if(a[i]==b[i]) {
					status=true;
				}else {
					System.out.println("Arrays are not equal");
				}
			}
			if(status=true) {
				System.out.println("Arrays are equal");
			}
		}else {
			System.out.println("Lenght of the arrays are not equal");
		}
	}
}
