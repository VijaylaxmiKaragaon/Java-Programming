 package com.HollowPatterns;

public class P9 {

	public static void main(String[] args) {
		int rows=5;
		int k=1;
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				if(j==1 || i==j || i==rows) {
					System.out.print((char)(k+64)+" ");
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
//A 
//B C 
//D   E 
//F     G 
//H I J K L 
