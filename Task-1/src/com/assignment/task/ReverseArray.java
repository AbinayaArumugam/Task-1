package com.assignment.task;

public class ReverseArray {
	public void reverse(int[] arr12)   {
		System.out.println("Original Array:");
		for (int i=0;i<arr12.length;i++) {
			System.out.print(arr12[i] + " ");
		}
		System.out.println();
		System.out.println("Reversed Array:");
		for(int i= arr12.length-1;i>=0;i--) 
			System.out.print(arr12[i] + " ");
	}
}
