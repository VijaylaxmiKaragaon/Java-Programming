package com.patterns;

public class Prgm16 {

	public static void main(String[] args) {
		int rows = 5;
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows-i;j++) {
				System.out.print(" "+" ");
			}
			for(int j=rows;j>=rows+1-i;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}

//output
//
//        5 
//      5 4 
//    5 4 3 
//  5 4 3 2 
//5 4 3 2 1 
