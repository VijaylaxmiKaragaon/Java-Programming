package com.patterns;

public class Prgm43 {

	public static void main(String[] args) {
		int rows = 5;
		for(int i=1;i<=rows;i++) {
			int k= i;
			for(int j=1;j<=i;j++) {
				System.out.print(k+" ");
				k--;
			}
			System.out.println();
			
		}

	}

}
//output
//
//1 
//2 1 
//3 2 1 
//4 3 2 1 
//5 4 3 2 1 