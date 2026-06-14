package com.patterns;

public class Prgm33 {

	public static void main(String[] args) {
		int rows = 5;
		for(int i=1;i<=rows;i++) {
			int k=rows;
			for(int j=1;j<=rows+1-i;j++) {
				System.out.print(k+" ");
				k--;
			}
			System.out.println();
		}

	}

}

//output
//
//5 4 3 2 1 
//5 4 3 2 
//5 4 3 
//5 4 
//5 
