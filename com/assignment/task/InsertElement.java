package com.assignment.task;

public class InsertElement {
	 public int[] insert(int array4Length,int array4[],int elementToBeInsert,int position)  {
	    	int anotherArray[] = new int[array4Length+1];
	    	for(int i=0;i<array4Length+1;i++) {
				if (i < position - 1) {
					anotherArray[i] = array4[i];
				} else if (i == position - 1) {
					anotherArray[i] = elementToBeInsert;
				} else  {
					anotherArray[i] = array4[i - 1];
			}
	    		}
	    	return anotherArray;
	    	}

}
