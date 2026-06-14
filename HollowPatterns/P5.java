package com.HollowPatterns;

public class P5 {

	public static void main(String[] args) {
		int rows=5;
		for(int i=1;i<=rows;i++) {
			int k=rows+1-i;
			for(int j=1;j<=i;j++) {
				if(j==1 || i==j || i==rows) {
					System.out.print(k+" ");
					k++;
				} else {
					System.out.print(" "+" ");	
                    k++;
				}
			}
			System.out.println();
		}

	}

}

//output
//
//5 
//4 5 
//3   5 
//2     5 
//1 2 3 4 5 