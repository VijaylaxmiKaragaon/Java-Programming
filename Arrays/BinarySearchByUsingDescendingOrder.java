package com.Arrays;

public class BinarySearchByUsingDescendingOrder {
	public static int b_search(int [] arr,int key) {
    	int low=arr.length-1;
    	int high=0;
    	while(low>=high) {
    		int mid=(low+high)/2;
    		if(arr[mid]==key) {
    			return mid;
    		} else if(key>arr[mid]) {
    			low=mid+1;
    		} else {
    			high=mid-1;
    		}
    	}
    	return -1;
    }
	public static void main(String[] args) {
		
    int[] arr= {10,9,8,7,6,5,4,3};
    int key=9;
    int index=b_search(arr,key);
    System.out.println(index);
	}

}
