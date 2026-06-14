package com.Arrays;

import java.util.Arrays;

public class LeetcodeTwoSum {
        public static int[] TwoSum(int [] arr,int target) {
        	int [] res=new int[2];
        	for(int i=0;i<arr.length;i++) {
        		for(int j=i+1;j<arr.length;j++) {
        			if(arr[i]+arr[j]==target) {
        				res[0]=i;
        				res[1]=j;
        			}
        		}
        	}
        	return res;
        }
	public static void main(String[] args) {
		int [] arr = {2,7,11,15};
		int target=18;
		int[] index=TwoSum(arr,target);
        System.out.println(Arrays.toString(index));
	}

}
