package com.assignment.task;

public class CommonElement {
	public void findCommonString(String[] arr1, String[] arr2)  {
		for(int i=0;i<arr1.length;i++)
			for(int j=0;j<arr2.length;j++)
				if(arr1[i].equals(arr2[j]))  {
					System.out.println(arr1[i]);
					break;
				}
					
	}
	public void findCommonNumber (int[] arr3, int[] arr4)  {
		for(int i=0;i<arr3.length;i++)
			for(int j=0;j<arr4.length;j++)
				if(arr3[i]==arr4[j])  {
					System.out.println(arr3[i]);
					break;
				}
	}
}
