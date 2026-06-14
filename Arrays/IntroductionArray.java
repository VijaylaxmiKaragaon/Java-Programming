package com.Arrays;

import java.util.Arrays;

//1) Arrays are not in dynamic
//2) Mutable
//3) Homogenous in data(same)
//4) Insertion order
// toString() is predefined 

public class IntroductionArray {

	public static void main(String[] args) {
		int [] arr = new int [5];
		System.out.println(Arrays.toString(arr));
        arr[0]=1;
        arr[1]=3;
        arr[2]=24;
        arr[3]=34;
        arr[4]=40;
        System.out.println(Arrays.toString(arr));
        
        int [] arr1 = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr1));
        
	}

}
