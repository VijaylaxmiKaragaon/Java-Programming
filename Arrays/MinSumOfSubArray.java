package com.Arrays;

public class MinSumOfSubArray {

	public static void main(String[] args) {
		int arr[]= {-5,0,5,2,-2};
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				int sum = 0;
				for(int k=i;k<=j;k++) {
					//System.out.print(arr[k]+" ");
					sum+=arr[k];
				}
			    if(sum==0) {
			    count++;
			}
		}
	}
	System.out.println(count);

}


}
