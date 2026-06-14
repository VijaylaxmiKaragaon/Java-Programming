package com.Arrays;

import java.util.Arrays;

public class ClockWiseRotationOfArray {
    public static void clock(int [] arr) {
    	int temp=arr[arr.length-1];
    	for(int i=arr.length-2; i>=0; i--) {
    		arr[i+1]=arr[i];
    	}
    	arr[0]=temp;
    	System.out.println(Arrays.toString(arr));
    }
	public static void main(String[] args) {
		int [] arr= {12,23,34,45,56};
		clock(arr);
	}

}
