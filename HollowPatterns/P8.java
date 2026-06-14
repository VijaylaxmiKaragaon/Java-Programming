package com.HollowPatterns;

public class P8 {

	public static void main(String[] args) {
		int rows=5;
		int k=1;
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				if(j==1 || i==j || i==rows) {
					System.out.print(k+" ");
					k++;
				} else {
					System.out.print(" "+" ");	
//                    k++;
				}
			}
			System.out.println();
		}

	}

}

//output
//
//1 
//2 3 
//4   5 
//6     7 
//8 9 10 11 12 