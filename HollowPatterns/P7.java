package com.HollowPatterns;

public class P7 {

	public static void main(String[] args) {
		int rows=5;
		for(int i=1;i<=rows;i++) {
			int k=rows;
			for(int j=1;j<=i;j++) {
				if(j==1 || i==j || i==rows) {
					System.out.print(k+" ");
					k--;
				} else {
					System.out.print(" "+" ");	
//                    k--;
				}
			}
			System.out.println();
		}
	}

}

//output
//
//5 
//5 4 
//5   4 
//5     4 
//5 4 3 2 1 
