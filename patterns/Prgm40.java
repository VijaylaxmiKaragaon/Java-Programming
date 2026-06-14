package com.patterns;

public class Prgm40 {

	public static void main(String[] args) {
		int rows = 5;
		int k = 1;
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
	            System.out.print((char)(k+96)+" ");
				k++;
			}
			System.out.println();
		}

	}

}

//output
//
//a 
//b c 
//d e f 
//g h i j 
//k l m n o 