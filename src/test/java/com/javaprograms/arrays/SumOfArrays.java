package com.javaprograms.arrays;

public class SumOfArrays {
	int a[]= {1,2,3,4,5};
	int n=a.length;//size of the array

	public static void main(String[] args) {
		SumOfArrays arraySum=new SumOfArrays();
		arraySum.sumOfElementsUsingForLoop();//approach 1
		arraySum.sumOfElementsUsingEnhancedForLoop();//approach 2

	}
	private int sumOfElementsUsingForLoop() {
		 int sum=0;

		for(int i=0;i<n;i++) 
		{
			sum=sum+a[i];
		}
		System.out.println("Sum of elements in the array: "+sum);
		return sum;
	}
	
	private int sumOfElementsUsingEnhancedForLoop() {
		 int sum=0;

		for(int i:a)//enhanced for loop
		{
			sum=sum+i;	
		}
		System.out.println("Sum of elements in the array using enhanced for loop: "+sum);
		return sum;
	}
}
