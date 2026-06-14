package com.Arrays;

import java.util.Arrays;

public class Leetcode3300 {
	 public static int minElement(int nums) {
	        int sum=0;
	        while(nums!=0){
	            int rem=nums%10;
	            sum=sum+rem;
	            nums/=10;
	        }
	        return sum;
	    }
	public static void main(String[] args) {
		int nums[]= {12,23,34,45,56};
        int [] res=new int[nums.length];
        for(int i=0;i<nums.length;i++) {
        	int sum=minElement(nums[i]);
        	res[i]=sum;
        }
        
        System.out.println(Arrays.toString(res));
	}

}
