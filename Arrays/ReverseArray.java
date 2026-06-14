package com.Arrays;

import java.util.Arrays;

public class ReverseArray {
	
	//1st approach
//    public static int[] reverse(int[] arr) {
//    	int res[]=new int[arr.length];
//    	int k=0;
//    	for(int i=arr.length-1;i>=0;i--) {
//    	   res[k]=arr[i];
//    	   k++;
//    	}
//    	return res;
//    }
//	public static void main(String[] args) {
//    int [] arr= {12,23,34,4,45};
//    int res[]=reverse(arr);
//    System.out.println(Arrays.toString(res));
//
//	}
	
	//2nd Approach
	public static void reverse(int num[]) {
		int first=0, last=num.length-1;
		
		while(first < last) {
			//swap
			int temp=num[last];
			num[last]=num[first];
			num[first]=temp;
			
			first++;
			last--;
			
		}
	}
	
	public static void main(String[] args) {
		int num[]= {2,3,4,67,78};
		
		reverse(num);
		System.out.println(Arrays.toString(num));
	}

}
