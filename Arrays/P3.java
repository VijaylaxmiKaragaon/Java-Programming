package com.Arrays;

public class P3 {

	public static void main(String[] args) {
		int arr[]= {10,30,12,23,50,100};
		int sum=0;
		for(int i:arr) {
			sum+=i;
		}
		System.out.println((double)sum/arr.length);

	}

}
