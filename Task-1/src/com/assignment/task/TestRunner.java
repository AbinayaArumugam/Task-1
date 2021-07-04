package com.assignment.task;
import java.util.Arrays;
import java.util.Scanner;

public class TestRunner {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter question number:");
		 int questionNumber = input.nextInt();
		 switch(questionNumber) {
		 case 1:
		 System.out.println("Enter array length:");
		 int arrayLength = input.nextInt();
		 int arr[] = new int[arrayLength];
		 System.out.println("Enter array elements:");
		 for(int i=0; i<arrayLength; i++)
			arr[i]=input.nextInt();
		 System.out.println("Enter data:");
		 int data= input.nextInt();
		 Index object1 = new Index();
		 int output1 = object1.findIndex(arr,data);
		 System.out.println("Data present at the index:" + output1);
		 break;
		 case 2:
		 System.out.println("Enter array length:");
		 int arrLength = input.nextInt();
		 int array[] = new int[arrLength];
		 System.out.println("Enter array elements:");
		 for(int i=0; i<arrLength; i++)
			array[i]=input.nextInt();
		 SumValue object2=new SumValue();
		 int output2 = object2.sum(array);
		 System.out.println("Sum of the array :" + output2);
		 break;
		 case 3:
		 System.out.println("Enter array length:");
		 int array3Length = input.nextInt();
		 int array3[] = new int[array3Length];
		 System.out.println("Enter array elements:");
		 for(int i=0; i<array3Length; i++)
			array3[i]=input.nextInt();
		 System.out.println("Element to be removed");
		 int elementToBeRemoved = input.nextInt();
		 RemoveElement element=new RemoveElement();
		 int[] output3=element.remove(array3,elementToBeRemoved);
		 System.out.println("New Array is:"+ Arrays.toString(output3) );
		 break;
		 case 4:
		 System.out.println("Enter array length:");
		 int array4Length = input.nextInt();
		 int array4[] = new int[array4Length];
		 System.out.println("Enter array elements:");
		 for(int i=0; i<array4Length; i++)
			array4[i]=input.nextInt();
		 System.out.println("Position where the element to be inserted");
		 int position=input.nextInt();
		 System.out.println("Element to be inserted");
		 int elementToBeInsert = input.nextInt();
		 InsertElement object4 = new InsertElement();
		 int[] output4= object4.insert(array4Length,array4,elementToBeInsert,position);
		 System.out.println("New Array is:" + Arrays.toString(output4));
		 break;
		 case 5:
		 System.out.println("Enter array length:");
		 int array5Length = input.nextInt();
		 int array5[] = new int[array5Length];
		 System.out.println("Enter array elements:");
		 for(int i=0; i<array5Length; i++)
			array5[i]=input.nextInt();
		 System.out.println("Element to find");
		 int elementToFind = input.nextInt();
		 ArrayTest object5=new ArrayTest();
		 object5.check(array5, elementToFind);
		 break;
		 case 6:
		 System.out.println("Enter array length:");
		 int array6Length = input.nextInt();
		 int array6[] = new int[array6Length];
		 System.out.println("Enter array elements:");
		 for(int i=0; i<array6Length; i++)
			array6[i]=input.nextInt();	 
		 MaximumAndMinimumValues object6 = new MaximumAndMinimumValues();
		 int outputMax = object6.findMaxValue(array6);
		 int outputMin = object6.findMinValue(array6);
		 System.out.println("Maximum value in the given array is : " + outputMax);
		 System.out.println("Minimum value in the given array is : " + outputMin);
		 break;
		 case 7:
		 System.out.println("Enter 1 for CommonString or Enter 2 for CommonValue:");
		 int option = input.nextInt();
		 switch (option) {
		 case 1:
	     System.out.println("Enter array length");
	     int arr1Length = input.nextInt();
	     String arr1[] = new String[arr1Length];
		 System.out.println("Enter the Array1:");
		 for(int i=0;i<arr1Length;i++)
		     arr1[i] = input.nextLine();
		 System.out.println("Enter array length");
	     int arr2Length = input.nextInt();
	     String arr2[] = new String[arr2Length];
		 System.out.println("Enter the Array2:");
		 for(int i=0;i<arr2Length;i++)
		     arr2[i] = input.nextLine();
		 CommonElement object7 = new CommonElement();
		 object7.findCommonString(arr1,  arr2);
		 break;
		 case 2:
		 System.out.println("Enter the arraylength");
		 int arr3Length = input.nextInt();
		 int arr3[]=new int[arr3Length];
		 System.out.println("Enter the Array1:");
		 for(int i=0;i<arr3Length;i++)
			 arr3[i]=input.nextInt();
		 System.out.println("Enter the arraylength");
		 int arr4Length=input.nextInt();
		 int arr4[] = new int[arr4Length];
		 System.out.println("Enter the Array2");
		 for(int i=0;i<arr4Length;i++)
			 arr4[i]=input.nextInt();
		 CommonElement object7a = new CommonElement();
		 object7a.findCommonNumber(arr3,  arr4);
		 break;
	}
		 case 8:
		 System.out.println("Enter the arraylength");
		 int arr8Length = input.nextInt();
		 int arr8[]=new int[arr8Length];
		 System.out.println("Enter the Array:");
		 for(int i=0;i<arr8Length;i++)
			 arr8[i]=input.nextInt();
		 RemoveDuplicate object8 = new RemoveDuplicate();
		 object8.removeDuplicate(arr8); 
		 break;
		 case 9:
		 System.out.println("Enter the arraylength");
		 int arr9Length = input.nextInt();
		 int arr9[]=new int[arr9Length];
		 System.out.println("Enter the Array:");
		 for(int i=0;i<arr9Length;i++)
			 arr9[i]=input.nextInt();
		 NumberOfEvenAndOddInteger object9 = new NumberOfEvenAndOddInteger();
		 object9.EvenAndOdd(arr9);
		 break;
		 case 10:
		 System.out.println("Enter the arraylength");
		 int arr10Length = input.nextInt();
		 int arr10[]=new int[arr10Length];
		 System.out.println("Enter the Array:");
		 for(int i=0;i<arr10Length;i++)
			 arr10[i]=input.nextInt();
		 AverageValue object10 = new AverageValue();
		 object10.findAverage(arr10);
		 break;
		 case 11:
		 System.out.println("Enter the arraylength");
		 int arr11Length = input.nextInt();
		 int arr11[]=new int[arr11Length];
		 System.out.println("Enter the Array:");
		 for(int i=0;i<arr11Length;i++)
			 arr11[i]=input.nextInt(); 
		 System.out.println("Enter the target number:");
		 int target =input.nextInt();
		 SumEqualToTarget object11 = new SumEqualToTarget();
		 object11.findValuesEqual(arr11,target);
		 break;
		 case 12:
		 System.out.println("Enter the arraylength");
		 int arr12Length = input.nextInt();
		 int arr12[]=new int[arr12Length];
		 System.out.println("Enter the Array:");
		 for(int i=0;i<arr12Length;i++)
			 arr12[i]=input.nextInt();	
		 ReverseArray object12 = new ReverseArray();
		 object12.reverse(arr12);
		 break;
		 case 13:
	     System.out.println("Enter the arraylength");
		 int arr13Length = input.nextInt();
		 int arr13[]=new int[arr13Length];
		 System.out.println("Enter the Array:");
		 for(int i=0;i<arr13Length;i++)
			 arr13[i]=input.nextInt();
		 OddAndEvenNumbers object13 = new OddAndEvenNumbers();
		 object13.seperateEvenAndOdd(arr13);
		 break;
		 case 14:
	     System.out.println("Enter the arraylength");
		 int arr14Length = input.nextInt();
		 int arr14[]=new int[arr14Length];
		 System.out.println("Enter the Array:");
		 for(int i=0;i<arr14Length;i++)
			 arr14[i]=input.nextInt(); 
		 SortingArray object14 = new SortingArray();
		 object14.sort(arr14);
		 break;
		 case 15:
		 System.out.println("Enter the arraylength");
		 int arr15Length = input.nextInt();
		 int arr15[]=new int[arr15Length];
		 System.out.println("Enter the Array:");
		 for(int i=0;i<arr15Length;i++)
			 arr15[i]=input.nextInt();
		 LeaderInArray object15 = new LeaderInArray();
		 object15.findLeader(arr15);
		 break;
		 default :
			 System.out.println("Question not found");
		 break;	 
 }
		 input.close();
	}
}
