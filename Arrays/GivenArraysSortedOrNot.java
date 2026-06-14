package com.Arrays;

public class GivenArraysSortedOrNot {
       public static boolean is_sorted(int [] arr) {
    	   for(int i=0;i<arr.length-1;i++) {
    		   if(arr[i] > arr[i+1]) {
    			   return false;
    		   }
    	   }
    	   return true;
       }
	public static void main(String[] args) {
		int arr[]= {12,2,34,56};
		System.out.println(is_sorted(arr));

	}

}
