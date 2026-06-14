package com.Arrays;

import java.util.Arrays;

public class DescendingOrderUsingBubbleSort {

	public static void main(String[] args) {
		int [] arr= {24,12,34,56,78,90,100};
		for(int k=0;k<arr.length-1;k++) {
			for(int i=0;i<arr.length-1;i++) {
				if(arr[i]<arr[i+1]) {
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
		
       System.out.println(Arrays.toString(arr));
	}

}
