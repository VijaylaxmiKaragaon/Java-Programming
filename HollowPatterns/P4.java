package com.HollowPatterns;

public class P4 {

	public static void main(String[] args) {
		int rows=5;
		for(int i=1;i<=rows;i++) {
			int k=1;
			for(int j=1;j<=i;j++) {
				if(j==1 || i==j || i==rows) {
					System.out.print(k+" ");
					k++;
				} else {
					System.out.print(" "+" ");				}
			}
			System.out.println();
		}

	}

}

//output
//
//1 
//1 2 
//1   2 
//1     2 
//1 2 3 4 5 