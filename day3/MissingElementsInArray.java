package week1.day3;

import java.util.Arrays;

public class MissingElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {1,2,3,4,7,6,8};
		 for(int i=0;i<arr.length;i++){
			  for(int j=i+1;j<arr.length;j++){
			    int temp=0;
			    if(arr[i]>arr[j]){
			    temp=arr[i];
			    arr[i]=arr[j];
			    arr[j]=temp;
			    } }
		 }
		 
		 for(int i=1;i<arr.length;i++) {
			 if(i !=arr[i-1]) {
				 System.out.println("Missing element is " +i);
				 break;
			 }
		 }
			  
}
}


		
