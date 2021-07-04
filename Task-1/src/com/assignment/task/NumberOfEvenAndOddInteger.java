package com.assignment.task;

public class NumberOfEvenAndOddInteger {
	public void EvenAndOdd(int[] arr9)  {
		   int numberOfOdd = 0;
		   int numberOfEven = 0;
		   for(int i=0;i<arr9.length;i++)   {
		     if(arr9[i]%2==0) 
		    	 numberOfEven++;
		    }
		   System.out.println();
		    for(int i=0;i<arr9.length;i++)  
		     if(arr9[i]%2!=0) {
		    	 numberOfOdd++;
		    }
		    System.out.println("Number of Even Integer:" + numberOfEven);
		    System.out.println("Number of Odd Integer:" + numberOfOdd);
		 }
}
