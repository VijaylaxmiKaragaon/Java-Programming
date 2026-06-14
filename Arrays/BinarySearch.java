package com.Arrays;

public class BinarySearch {
    public static int b_search(int [] arr,int key) {
    	int low=0;
    	int high=arr.length-1;
    	while(low<=high) {
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
		
    int[] arr= {1,2,4,6,7,8,9,10};
    int key=887;
    int index=b_search(arr,key);
    System.out.println(index);
	}

}
