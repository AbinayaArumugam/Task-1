package com.assignment.task;
import java.util.HashSet;
public class SumEqualToTarget {
	public void findValuesEqual(int[] arr11, int target)  {
		HashSet<Integer>set = new HashSet<Integer>();
		for(int i=0; i<=arr11.length-1;i++)  {
			int temp = target-arr11[i];
			if(set.contains(temp))  {
				System.out.println("(" + arr11[i] + "," + temp + ")");
			}
			set.add(arr11[i]);		
		}
	}

}
