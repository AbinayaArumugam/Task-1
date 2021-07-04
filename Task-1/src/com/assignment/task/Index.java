package com.assignment.task;

public class Index {

	public int findIndex(int arr[],int data)  {
		if(arr==null)  {
			return -1;
		}
		int i =0;
			while(i<arr.length)  {
		        if(arr[i]==data)  
			        return i;
		        else
		        	i=i+1;
			  }
		return -1;
	}
}
