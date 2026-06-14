package com.Arrays;

import java.util.Arrays;

public class DotEqualsMethodForArrays {
        public static boolean is_equals(int [] arr,int [] brr) {
        	if(arr.length != brr.length) {
        		return false;
        	} 
        	for(int i=0;i<arr.length;i++) {
        		if(arr[i] != brr[i]) {
        			return false;
        		}
        	}
        	return true;
        }
	public static void main(String[] args) {
		int [] arr= {12,23,34,45,56};
		int [] brr= {12,23,34,45,56};
		System.out.println(Arrays.equals(arr, brr));

	}

}
