package com.Arrays;

import java.util.Arrays;

public class KTimesClockWiseRotationOfArray {

	public static void clock(int [] arr) {
    	int temp=arr[arr.length-1];
    	for(int i=arr.length-2; i>=0; i--) {
    		arr[i+1]=arr[i];
    	}
    	arr[0]=temp;
    
    }
	public static void main(String[] args) {
		int [] arr= {12,23,34,45,56};
		int k = 4;
		for(int i=0;i<arr.length;i++) {
			clock(arr);	
		}
		System.out.println(Arrays.toString(arr));
	}

}
