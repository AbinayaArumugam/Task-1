package com.assignment.task;

public class AverageValue {
	public void findAverage(int[] arr10)  {
		 int max = arr10[0];
		 int min = arr10[0];
		 float sum = arr10[0];
		 for(int i=1;i<arr10.length;i++)  {
			 sum += arr10[i];
			 if(arr10[i]>max)
				 max = arr10[i];
			 else if(arr10[i]<min)
				 min = arr10[i];
		 }
		 float average = ((sum-max-min)/(arr10.length-2));
		 System.out.println("Average value of an array except the largest ang smallest values:" + average);
		}
}
