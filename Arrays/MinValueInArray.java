package com.Arrays;

public class MinValueInArray {

	public static void main(String[] args) {
		int [] arr= {-1,-2,-4,-7,-8,2,3};
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i] < min) {
				min=arr[i];
			}
		}
		System.out.println(min);

	}

}
