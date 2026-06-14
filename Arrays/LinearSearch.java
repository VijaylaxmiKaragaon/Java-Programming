package com.Arrays;

public class LinearSearch {

	 public static int l_search(int[] arr,int target) {
	    	for(int i=0;i<arr.length;i++) {
	    		if(arr[i]==target) {
	    			return i;
	    		}
	    	}
	    	return -1;
	    }
		public static void main(String[] args) {
			int[] arr= {12,23,12,34,56,78};
			int target=3;
			int index=l_search(arr,target);
			System.out.println(index);
		}

	}
