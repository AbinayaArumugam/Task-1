package com.assignment.task;

public class LeaderInArray {
		public void findLeader(int[] arr15)  {
			for (int i=0;i<arr15.length;i++) {
				int j;
				for(j=i+1;j<arr15.length;j++)
					if(arr15[i]<=arr15[j])
						break;
			if(j==arr15.length)
				System.out.println(arr15[i] + " ");
		}
	  }
}
