package com.Arrays;

import java.util.Arrays;

public class PrintSubArrays {
    public static void printSubArrays(int numbers[]) {
    	
    	for(int i=0;i<numbers.length;i++) {
    		int start = i;
    		for(int j=0;j<numbers.length;j++) {
    			int end = j;
    			int sum=0;
    			for(int k=start;k<end;k++) {  //print
    				System.out.print(numbers[k]+" "); //subarray
    				sum=sum+numbers[k];
    				
    			}
    			System.out.println("->"+sum);
    			//System.out.println(sum);
    			
    		}
    		System.out.println();
    		
    	}
    }
	public static void main(String[] args) {
		int[] numbers= {2,4,5,6,7,89};
		printSubArrays(numbers);
	}

}
