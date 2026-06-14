package com.Arrays;

public class P1 {

	public static void main(String[] args) {
		int[] arr= {10,20,30,50,100};
		int max=arr[0];
		for(int i:arr) {
			if(i>max) {
				max=i;
			}
		}
		System.out.println(max);

	}

}
