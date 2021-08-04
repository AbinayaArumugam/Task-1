package com.assignment.task;
import java.util.LinkedHashSet;

public class RemoveDuplicate {
	public void removeDuplicate(int arr8[])   {
		LinkedHashSet<Integer>set = new LinkedHashSet<Integer>();
		for (int i = 0;i<arr8.length;i++) {
			set.add(arr8[i]);
		}
		System.out.println(set);
	}
}
