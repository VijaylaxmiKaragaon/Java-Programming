package com.Arrays;

public class BMaxSubArraySum {
	
public static void maxSubArraySum(int numbers[]) {
    	int maxSum=0;
    	for(int i=0;i<numbers.length;i++) {
    		int start = i;
    		for(int j=i;j<numbers.length;j++) {
    			int end = j;
    			int currSum=0;
    			for(int k=start;k<=end;k++) {  //print
    			    //subarray
    				currSum=currSum+numbers[k];
    				
    			}
    			System.out.println(currSum);
    			if(maxSum < currSum) {
    				maxSum = currSum;
    			}
    		}
    	}
    	System.out.println("max sum = "+ maxSum);
    }
	public static void main(String[] args) {
		int[] numbers= {2,4,6,8,10};
		maxSubArraySum(numbers);
	}

}
