package com.patterns.DiamaondPatterns;

public class Prgm2 {

	public static void main(String[] args) {
		int rows = 5;
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows-i;j++) {
				System.out.print(" "+" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			for(int j=i-1;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		for(int i=rows-1;i>=1;i--) {
			for(int j=1;j<=rows-i;j++) {
				System.out.print(" "+" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			for(int j=i-1;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}

//output
//
//        1 
//      1 2 1 
//    1 2 3 2 1 
//  1 2 3 4 3 2 1 
//1 2 3 4 5 4 3 2 1 
//  1 2 3 4 3 2 1 
//    1 2 3 2 1 
//      1 2 1 
//        1 
