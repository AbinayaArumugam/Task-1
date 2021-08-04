package com.assignment.task;

public class MaximumAndMinimumValues {
	public int findMaxValue(int array6[])   {
		int maxValue = array6[0];
		for (int i=1;i<array6.length;i++)  {
			if(array6[i]>maxValue) {
				maxValue = array6[i];
			}
		}
		return maxValue;
	}
	public int findMinValue(int array6[])  {
	   int minValue = array6[0];
	   for(int i=1;i<array6.length;i++)  {
		   if(array6[i]<minValue) {
			   minValue = array6[i];
		   }
	   }
	   return minValue;
	}
}
