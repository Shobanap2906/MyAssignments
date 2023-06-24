package week1.day3;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		int[] arr = {3,2,11,4,6,7};
		for(int i=0;i<arr.length;i++){
			  for(int j=i+1;j<arr.length;j++){
			    int temp=0;
			    if(arr[i]>arr[j]){
			    temp=arr[i];
			    arr[i]=arr[j];
			    arr[j]=temp;
			    }
			  }
			   System.out.println("Array is sorted in Ascending : " +arr[i]);
			}

			  System.out.println(arr[arr.length-2]);
			  }
}


/*
 Pseudo Code:
 1) Arrange the array in ascending order
 2) Pick the 2nd element from the last and print it
 */