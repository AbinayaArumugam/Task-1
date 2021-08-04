package com.assignment.task;

public class ArrayTest {
	public void check(int[] array5, int elementToFind)   {
		  boolean test=false;
		  for(int i: array5)  {
			  if(i== elementToFind)  {
				  test = true;
				  break;
			  }
			 }
		  if(test) {
			  System.out.println("Array contains : " + elementToFind);
		  }
		  else {
			  System.out.println("Array does not contains : " + elementToFind);
		  }
		  }
}
