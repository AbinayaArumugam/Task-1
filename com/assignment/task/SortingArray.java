package com.assignment.task;
import java.util.Arrays;
public class SortingArray {
	public void sort(int[] arr14)   {
		System.out.println("Array before sorting:");
		for(int i=0;i<arr14.length;i++) {
			System.out.print(arr14[i] + " ");
		}
		Arrays.sort(arr14);
		System.out.println();
		System.out.println("Array after sorting:");
		for(int i=0;i<arr14.length;i++) {
			System.out.print(arr14[i] + " ");
		}
	}
}
