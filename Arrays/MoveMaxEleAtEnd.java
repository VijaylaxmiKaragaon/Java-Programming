package com.Arrays;

import java.util.Arrays;

public class MoveMaxEleAtEnd {

	public static void main(String[] args) {
		int [] arr= {10,90,45,56,78,87};
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]>arr[i+1]) {
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
    System.out.println(Arrays.toString(arr));
}
}
