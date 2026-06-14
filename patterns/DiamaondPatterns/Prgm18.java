package com.patterns.DiamaondPatterns;

public class Prgm18 {
	public static void main(String[] args) {
		int rows=5;
		for(int i=rows;i>=1;i--) {
			for(int j=1;j<=rows-i;j++) {
				System.out.print(" "+" ");
			}
			for(int j=rows+1-i;j<=rows;j++) {
				System.out.print((char)(j+64)+" ");
			}
			for(int j=rows-1;j>=rows+1-i;j--) {
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}
        
		
		for(int i=2;i<=rows;i++) {
			for(int j=1;j<=rows-i;j++) {
				System.out.print(" "+" ");
			}
			for(int j=rows+1-i;j<=rows;j++) {
				System.out.print((char)(j+64)+" ");
			}
			for(int j=rows-1;j>=rows+1-i;j--) {
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}

	}

}

//output
//
//A B C D E D C B A 
//  B C D E D C B 
//    C D E D C 
//      D E D 
//        E 
//      D E D 
//    C D E D C 
//  B C D E D C B 
//A B C D E D C B A 
