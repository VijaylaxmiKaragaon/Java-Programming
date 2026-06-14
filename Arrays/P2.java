package com.Arrays;

public class P2 {

	public static void main(String[] args) {
		int arr[] = {-1,2,3,-5,10,30};
//		int min=arr[0];
		int min=Integer.MAX_VALUE;
		for(int i:arr) {
			if(i<min) {
				min=i;
			}
		}
		System.out.println(min);
	}

}
