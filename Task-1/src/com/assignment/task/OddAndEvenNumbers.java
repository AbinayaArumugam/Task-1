package com.assignment.task;

public class OddAndEvenNumbers {
	public void seperateEvenAndOdd(int[] arr13)   {
		 System.out.print("Even Numbers:");
		   for(int i=0;i<arr13.length;i++)   {
		     if(arr13[i]%2==0)
		       System.out.print(arr13[i] + " ");
		    }
		    System.out.println(" ");
		    System.out.print("Odd Numbers:");
		    for(int i=0;i<arr13.length;i++)   {
		     if(arr13[i]%2!=0)
		      System.out.print(arr13[i] + " ");
		    }
	  }
}
