package com.Arrays;

public class MaxSumOfSubArrays {
	public static void main(String[] args) {
		int arr[]= {-5,6,4,-3,-5,-2};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				int sum = 0;
				for(int k=i;k<=j;k++) {
					//System.out.print(arr[k]+" ");
					sum+=arr[k];
				}
			    if(sum > max) {
			    	max=sum;
			}
		}
	}
	System.out.println(max);

}


}
