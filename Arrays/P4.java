package com.Arrays;

public class P4 {

	public static void main(String[] args) {
		int arr[]= {10,2,3,4,5,6};
		int sum=0;
		int count=0;
		for(int i:arr) {
			if(i%2==0) {
				sum+=i;
				count++;
			}
			
		}
		double avg=(double)sum/count;
		System.out.println(avg);

	}

}
