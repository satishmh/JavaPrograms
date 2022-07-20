package com.javaprograms.arrays;

public class EvenAndOddNumsInArray {
	int a[] = {1,2,3,4,5,6,7,8,9};
	int n=a.length;

	public static void main(String[] args) {
		EvenAndOddNumsInArray obj=new EvenAndOddNumsInArray();
		obj.EvenOddUsingForLoop();
		obj.EvenOddUsingEnhancedForLoop();

	}
	public void EvenOddUsingForLoop() {
		System.out.println("---Using For Loop---");
		System.out.println("Even numbers in the array are:");
		for(int i=0;i<a.length;i++) {
			if((a[i]%2)==0) {
				System.out.println(a[i]);
			}
		}
		System.out.println("Odd numbers in the array are:");
		for(int i=0;i<a.length;i++) {
			if((a[i]%2)!=0) {
				System.out.println(a[i]);
			}
		}
	}
	public void EvenOddUsingEnhancedForLoop() {
		System.out.println("---Using Enhanced For Loop---");
		System.out.println("Even numbers in the array are:");
		for(int i:a) {
			if((i%2)==0) {
				System.out.println(i);
			}
		}
		System.out.println("Odd numbers in the array are:");
		for(int i:a) {
			if((i%2)!=0) {
				System.out.println(i);
			}
		}
	}

}
