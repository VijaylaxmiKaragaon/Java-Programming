package com.Arrays;

import java.util.Arrays;

public class RotatingArrayKTimes {
	    public static void anti_clock(int[] arr) {
	    	int temp=arr[0];
	    	for(int i=1; i<arr.length ; i++ ) {
	    	arr[i-1]=arr[i];	
	    	}
	    	arr[arr.length-1]=temp;
	    
	    	}
		public static void main(String[] args) {
			int [] arr= {10,20,30,40,50};
			int k =9;
			for(int i=1; i<=k; i++) {
				anti_clock(arr);
			}
			System.out.println(Arrays.toString(arr));
			
		}

}