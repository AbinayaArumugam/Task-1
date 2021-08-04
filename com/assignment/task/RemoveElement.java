package com.assignment.task;

public class RemoveElement {
	 public int[] remove(int array3[],int elementToBeRemoved)  {
		 int[] newArray= new int[array3.length-1];
		  for(int i=0,k=0;i<array3.length;i++)  {
			  if(array3[i]==elementToBeRemoved)  {
				  continue;
			  }
			  newArray[k++]=array3[i];
		  }
		  return newArray;  
	  }    
}
